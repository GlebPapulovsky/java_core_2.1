import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import taxes.TaxSystem;
import taxes.TaxSystemFirst;

import java.util.Arrays;
import java.util.stream.Stream;

public class CompanyPayTaxesTests {
    Company company = new Company("test", new TaxSystem());

    @AfterEach
    public void afterEachSetZero() {
        company.setCredit(0);
        company.setCredit(0);
    }

    @MethodSource("testPayTaxesParam")
    @ParameterizedTest
    public void testPayTaxes(int debit, int credit) {

        //act
        company.setDebit(debit);
        company.setCredit(credit);
        //assert
        Assertions.assertDoesNotThrow(() -> company.payTaxes());
    }

    public static Stream<Arguments> testPayTaxesParam() {
        return Stream.of(
                Arguments.of(12, 2),
                Arguments.of(0, 2),
                Arguments.of(-1, 2),
                Arguments.of(2, -1),
                Arguments.of(0, 0),
                Arguments.of(2, 5),
                Arguments.of(-100, 100),
                Arguments.of(-100, -100),
                Arguments.of(44, 0),
                Arguments.of(-132, 0),
                Arguments.of(0, -44));
    }
}
