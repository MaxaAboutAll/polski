import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CalculateClassTest {

    @Test
    void calculate() {
        CalculateClass myCalc = new CalculateClass();
        rightTest(myCalc, "3 4 +", "7.0");
        rightTest(myCalc, "5 4 + 7 *", "63.0");
        rightTest(myCalc, "2 1 + 3 - 15 *", "0.0");
        rightTest(myCalc, "3 4 - 27 *", "-27.0");
        rightTest(myCalc, "3 4 + -", "Не верная строка");
        rightTest(myCalc, "3 4 + hah", "Невозможный символ");
    }

    void rightTest(CalculateClass myCalc, String input, String result){
        Assert.assertEquals(myCalc.calculate(input), result);
    }

}