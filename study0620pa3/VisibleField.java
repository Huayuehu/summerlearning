package study0620pa3;

/**
  VisibleField class
  This is the data that's being displayed at any one point in the game (i.e., visible field, because it's what the
  user can see about the minefield), Client can call getStatus(row, col) for any square.
  It actually has data about the whole current state of the game, including  
  the underlying mine field (getMineField()).  Other accessors related to game status: numMinesLeft(), isGameOver().
  It also has mutators related to moves the player could do (resetGameDisplay(), cycleGuess(), uncover()),
  and changes the game state accordingly.
  
  It, along with the MineField (accessible in mineField instance variable), forms
  the Model for the game application, whereas GameBoardPanel is the View and Controller, in the MVC design pattern.
  It contains the MineField that it's partially displaying.  That MineField can be accessed (or modified) from 
  outside this class via the getMineField accessor.  
 */
public class VisibleField {
   // ----------------------------------------------------------   
   // The following public constants (plus numbers mentioned in comments below) are the possible states of one
   // location (a "square") in the visible field (all are values that can be returned by public method 
   // getStatus(row, col)).
   
   // Covered states (all negative values):
   public static final int COVERED = -1;   // initial value of all squares
   public static final int MINE_GUESS = -2;
   public static final int QUESTION = -3;

   // Uncovered states (all non-negative values):
   
   // values in the range [0,8] corresponds to number of mines adjacent to this square
   
   public static final int MINE = 9;      // this loc is a mine that hasn't been guessed already (end of losing game)
   public static final int INCORRECT_GUESS = 10;  // is displayed a specific way at the end of losing game
   public static final int EXPLODED_MINE = 11;   // the one you uncovered by mistake (that caused you to lose)
   // ----------------------------------------------------------   
  
   // <put instance variables here>
   private MineField mineField;
   private int[][] status;
   private int rows;
   private int cols;
   private int numMines;
   private int minesLeft;

   /**
      Create a visible field that has the given underlying mineField.
      The initial state will have all the mines covered up, no mines guessed, and the game
      not over.
      @param mineField  the minefield to use for for this VisibleField
    */
   public VisibleField(MineField mineField) {
      this.mineField = mineField;
      rows = mineField.numRows();
      cols = mineField.numCols();
      numMines = mineField.numMines();
      minesLeft = numMines;
      status = new int[rows][cols];

      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < cols; j++) {
            status[i][j] = COVERED;
         }
      }
   }
   
   
   /**
      Reset the object to its initial state (see constructor comments), using the same underlying MineField. 
   */     
   public void resetGameDisplay() {
      numMines = mineField.numMines();
      minesLeft = numMines;
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < cols; j++) {
            status[i][j] = COVERED;
         }
      }
   }
  
   
   /**
      Returns a reference to the mineField that this VisibleField "covers"
      @return the minefield
    */
   public MineField getMineField() {
      return mineField;
   }
   
   
   /**
      get the visible status of the square indicated.
      @param row  row of the square
      @param col  col of the square
      @return the status of the square at location (row, col).  See the public constants at the beginning of the class
      for the possible values that may be returned, and their meanings.
      PRE: getMineField().inRange(row, col)
    */
   public int getStatus(int row, int col) {
      return status[row][col];
   }

   
   /**
      Return the the number of mines left to guess.  This has nothing to do with whether the mines guessed are correct
      or not.  Just gives the user an indication of how many more mines the user might want to guess.  So the value can
      be negative, if they have guessed more than the number of mines in the minefield.     
      @return the number of mines left to guess.
    */
   public int numMinesLeft() {
      return minesLeft;
   }
 
   
   /**
      Cycles through covered states for a square, updating number of guesses as necessary.  Call on a COVERED square
      changes its status to MINE_GUESS; call on a MINE_GUESS square changes it to QUESTION;  call on a QUESTION square
      changes it to COVERED again; call on an uncovered square has no effect.  
      @param row  row of the square
      @param col  col of the square
      PRE: getMineField().inRange(row, col)
    */
   public void cycleGuess(int row, int col) {
      if (status[row][col] == COVERED) {
         status[row][col] = MINE_GUESS;
         minesLeft--;
      }
      if (status[row][col] == MINE_GUESS) {
         status[row][col] = QUESTION;
         minesLeft++;
      }
      if (status[row][col] == QUESTION) {
         status[row][col] = COVERED;
      }
   }

   
   /**
      Uncovers this square and returns false iff you uncover a mine here.
      If the square wasn't a mine or adjacent to a mine it also uncovers all the squares in 
      the neighboring area that are also not next to any mines, possibly uncovering a large region.
      Any mine-adjacent squares you reach will also be uncovered, and form 
      (possibly along with parts of the edge of the whole field) the boundary of this region.
      Does not uncover, or keep searching through, squares that have the status MINE_GUESS. 
      @param row  of the square
      @param col  of the square
      @return false   iff you uncover a mine at (row, col)
      PRE: getMineField().inRange(row, col)
    */
   public boolean uncover(int row, int col) {
      if (mineField.hasMine(row, col)) {
         status[row][col] = EXPLODED_MINE;

         //When the player lose the game, set all the positions with mines that has not been uncovered to MINE
         //and all positions without mines but set to MINE_GUESS to INCORRECT_GUESS
         for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
               if (mineField.hasMine(i, j)) {
                  if (status[i][j] == COVERED || status[i][j] == QUESTION) {
                     status[i][j] = MINE;
                  }
               } else {
                  if (status[i][j] == MINE_GUESS) {
                     status[i][j] = INCORRECT_GUESS;
                  }
               }
            }
         }
         return false;
      } else {
         if (status[row][col] != MINE_GUESS) {
            int minesAdjacent = mineField.numAdjacentMines(row, col);
            if (minesAdjacent != 0) {
               status[row][col] = minesAdjacent;
            } else {
               dfs(row, col);
            }
         }
         return true;
      }

   }



   /**
      Returns whether the game is over.
      @return whether game over
    */
   public boolean isGameOver() {
      boolean gameOver = true;
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < cols; j++) {
            if (status[i][j] == EXPLODED_MINE) {
               return true;
            }
         }
      }
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < cols; j++) {
            if (!mineField.hasMine(i, j)) {
               if (status[i][j] < 9 && status[i][j] >= 0) {
                  continue;
               } else {
                  gameOver = false;
                  break;
               }
            }
         }
      }
      /**
       * When the player win the game, set all the positions with mines to MINE_GUESS
       */
      if (gameOver) {
         for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
               if (mineField.hasMine(i, j)) {
                  status[i][j] = MINE_GUESS;
               }
            }
         }
      }
      return gameOver;
   }
 
   
   /**
      Return whether this square has been uncovered.  (i.e., is in any one of the uncovered states, 
      vs. any one of the covered states).
      @param row of the square
      @param col of the square
      @return whether the square is uncovered
      PRE: getMineField().inRange(row, col)
    */
   public boolean isUncovered(int row, int col) {
      return status[row][col] >= 0;
   }
   
 
   // <put private methods here>

   /**
    * search for those locations without mine adjacent util reaching the end of border or locations where mines are nearby
    * @param row current row
    * @param col current col
    */
   private void dfs(int row, int col) {
      int[][] coord = {{-1, -1},
                       {-1, 0},
                       {-1, 1},
                       {0, -1},
                       {0, 1},
                       {1, -1},
                       {1, 0},
                       {1, 1}};
      //if this (row, col) has already been visited, then stop searching
      if (status[row][col] != COVERED) {
         return;
      }

      //for unvisited location
      //if there is mine nearby mark the status and stop searching
      if (mineField.numAdjacentMines(row, col) != 0) {
         status[row][col] = mineField.numAdjacentMines(row, col);
         return;
      }
      //make the location visited
      status[row][col] = 0;
      //search nearby locations one by one until meeting STOP situation
      for (int i = 0; i < coord.length; i++) {
         int newX = row + coord[i][0];
         int newY = col + coord[i][1];
         if ((newX >= 0 && newX < rows) && (newY >= 0 && newY < cols)) {
            dfs(newX, newY);
         }
      }

   }

}
