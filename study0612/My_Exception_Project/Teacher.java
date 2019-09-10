package study0612.My_Exception_Project;

public class Teacher {
    public void check(int score) throws MyException {
        if (score > 100 || score < 0) {
            throw new MyException("Score must between 0-100. ");
        } else {
            System.out.println("The score is fine. ");
        }
    }
}
