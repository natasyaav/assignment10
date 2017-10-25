/**
 * @author Natasya Virgichalia
 * Date: 10/06/2017
 * CSC-201
 * Professor Tanes Kanchanawanchai
 * Assignment 10.17
 * Find the first ten square numbers that are greater than Long.MAX_VALUE
 */

import java.math.BigDecimal;

public class squareNumbers {
    public static void main(String[] args) {

        double squareLong = (long) Math.sqrt(Long.MAX_VALUE);
        BigDecimal longNum = new BigDecimal(squareLong);
        BigDecimal square = firstTenNum(longNum);
    }

    /**
     * This method find the first ten square numbers that are greater than Long.MAX_VALUE
     * @param longNum is Long.MAX_VALUE from BigDecimal
     * @return
     */
    public static BigDecimal firstTenNum(BigDecimal longNum) {
        int count = 0;
        while (count < 10) {
            BigDecimal squaredNum = longNum.multiply(longNum);
            BigDecimal numValue = new BigDecimal(Long.MAX_VALUE);
            if (squaredNum.compareTo(numValue) > 0) {
                count++;
                System.out.println(count +  ". square: " + squaredNum);
            }
            longNum = longNum.add(BigDecimal.ONE);
        }
        return longNum;
    }
}
