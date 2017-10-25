import org.junit.Assert;
import java.math.BigDecimal;
import java.math.BigInteger;

public class squareNumbersTest {
    squareNumbers test = new squareNumbers();
    double squareLong = (long) Math.sqrt(Long.MAX_VALUE);
    BigDecimal object = new BigDecimal(squareLong);
    BigDecimal answer = new BigDecimal("3037000510");

    @org.junit.Test
    public void firstTenNum() throws Exception {
        Assert.assertEquals("Test did not succeed", answer, test.firstTenNum(object));
    }

}