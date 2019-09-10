package study0620pa3;

import static study0620pa3.MineSweeperFixed.smallMineField;

public class MineFieldTester {
    public static void main(String args[]) {
        //constructor
        MineField mf = new MineField(8,5,5);
        //MineField mf = new MineField(smallMineField);
        System.out.println("row: " + mf.numRows());//numRows()
        System.out.println("col: " + mf.numCols());//numCols()
        System.out.println("num of mines: " + mf.numMines());//numMines()
        System.out.println("(4, 3) in range? " + mf.inRange(4,3));//inRange(row, col)
        System.out.println("(8, 3) in range? " + mf.inRange(8,3));
        System.out.println("(4, 7) in range? " + mf.inRange(4,7));
        mf.populateMineField(0,0);

        System.out.println(mf);
        //System.out.println(mf.numAdjacentMines(2,2));

/*
        for (int i = 0; i < mf.numRows(); i++) {
            for (int j = 0; j < mf.numCols(); j++) {
                //hasMine(row, col);
                System.out.println("row " + i + ", col " + j + ": " + mf.hasMine(i, j));
            }
        }

        System.out.println("------------------------------");

        //resetEmpty();
        mf.resetEmpty();
        for (int i = 0; i < mf.numRows(); i++) {
            for (int j = 0; j < mf.numCols(); j++) {
                System.out.println("row " + i + ", col " + j + ": " + mf.hasMine(i, j));
            }
        }*/
    }


}
