import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import taxes.TaxSystemFirst;
import taxes.TaxSystemSecond;

import javax.lang.model.type.NullType;
import java.lang.reflect.Executable;
import java.util.random.RandomGenerator;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class CompanyShiftMoneyTests {

    Company companyTaxSystemFirst = new Company("test1", new TaxSystemFirst());
    Company companyTaxSystemSecond = new Company("test2", new TaxSystemSecond());


    @AfterEach
    public void afterEachSetZero() {
        companyTaxSystemFirst.setCredit(0);
        companyTaxSystemFirst.setDebit(0);

        companyTaxSystemFirst.setCredit(0);
        companyTaxSystemSecond.setDebit(0);

    }

    @MethodSource("testShiftMoneyParams")//arrange
    @ParameterizedTest
    public void testShiftMoney(int param) {

        //assert
        assertDoesNotThrow(() ->/*act*/companyTaxSystemFirst.shiftMoney(param));
        assertDoesNotThrow(() ->/*act*/companyTaxSystemSecond.shiftMoney(param));
    }

    public static Stream<Integer> testShiftMoneyParams() {
        return Stream.of(-1,
                0,
                1,
                4000000,
                -40000000,
                200000,
                300000000);
    }


}
