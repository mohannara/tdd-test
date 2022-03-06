package lk.example.tddhelloproj;



import static org.springframework.test.util.AssertionErrors.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TddHelloProjApplicationTests {


    @Test
     void main() {
        TddHelloProjApplication.main(new String[] {});
    }


    @Test
     void checkValidISBN(){
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("0140449116");
        assertTrue("First Value",result);
    }

    @Test
     void checkInvalidISBN(){
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("0140449117");
        assertFalse("Second Value",result);

    }

    @Test
    void checkInvalidLengthISBN(){
        ValidateISBN validator = new ValidateISBN();
        Assertions.assertThrows(StringIndexOutOfBoundsException.class, () -> {
            boolean result = validator.checkISBN("140449117");
        });
    }

    @Test
    void checkInvalidNumericISBN(){
        ValidateISBN validator = new ValidateISBN();
        Assertions.assertThrows(NumberFormatException.class, () -> {
            boolean result = validator.checkISBN("bbnnmmggkk");
        });
    }

}
