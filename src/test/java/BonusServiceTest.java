import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")
    public void TestingBonusCalc(int expected, int amount, boolean registered) {
        BonusService bonus = new BonusService();

        int actual = bonus.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);

    }
}