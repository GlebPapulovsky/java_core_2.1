import com.sun.jdi.connect.Connector;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import taxes.TaxSystem;
import taxes.TaxSystemFirst;
import taxes.TaxSystemSecond;

import javax.lang.model.type.NullType;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class CompanySetTaxSystemTests {


    @Test
    public void testSetTaxSystem(){

        //arrange
        Company companyForTest1=new Company("test1",new TaxSystemFirst());
        Company companyForTest2=new Company("test2",new TaxSystemSecond());

        Company company1=new Company("test1", new TaxSystemFirst());
        Company company2=new Company("test2", new TaxSystemFirst());

        TaxSystem taxSystemFirst=new TaxSystemFirst();
        TaxSystem taxSystemSecond=new TaxSystemSecond();

        //act
        company1.setTaxSystem(taxSystemFirst);
        company2.setTaxSystem(taxSystemSecond);
        //assert
        assertEquals(companyForTest1.getTaxSystem(),company1.getTaxSystem());
        assertEquals(companyForTest2.getTaxSystem(),company2.getTaxSystem());





    }






}
