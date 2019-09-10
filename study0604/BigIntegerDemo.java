package study0604;

import java.math.BigInteger;

public class BigIntegerDemo {
    public static void main(String args[]) {
        //constructor format: BigInteger(String val)
        BigInteger bi1 = new BigInteger("1000");
        BigInteger bi2 = new BigInteger("2");

        //public BigInteger add(BigInteger val)
        System.out.println("add: " + bi1.add(bi2));

        //public BigInteger subtract(BigInteger val)
        System.out.println("subtract: " + bi1.subtract(bi2));

        //public BigInteger multiply(BigInteger val)
        System.out.println("multiply: " + bi1.multiply(bi2));

        //public BigInteger divide(BigInteger val)
        System.out.println("divide: " + bi1.divide(bi2));

        //public BigInteger[] divideAndRemainder(BigInteger val)
        //返回包含(this / val)后跟(this % val)的两个BigInteger的数组
        BigInteger[] bia = bi1.divideAndRemainder(bi2);
        for (int i = 0; i < bia.length ; i++) {
            System.out.println("divideAndRemainder: " + bia[i]);
        }

    }
}
