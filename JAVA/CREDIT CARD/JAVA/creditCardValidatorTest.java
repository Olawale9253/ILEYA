import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class creditCardValidatorTest {

    @Test
    public void testValidMasterCardSample() {
      
        String cardNumber = "5399831619690403";
        
        assertEquals("MasterCard", CreditCardValidator.getCardType(cardNumber));
        assertEquals(16, CreditCardValidator.getDigitLength(cardNumber));
        assertTrue(CreditCardValidator.isValid(cardNumber));
    }

    @Test
    public void testInvalidMasterCardSample() {
       
        String cardNumber = "5399831619690404";
        
        assertEquals("MasterCard", CreditCardValidator.getCardType(cardNumber));
        assertEquals(16, CreditCardValidator.getDigitLength(cardNumber));
        assertFalse(CreditCardValidator.isValid(cardNumber));
    }

    @Test
    public void testInvalidCardTypeAndLengthSample() {
     
        String cardNumber = "234319283049582";
        
        assertEquals("Invalid Card", CreditCardValidator.getCardType(cardNumber));
        assertEquals(15, CreditCardValidator.getDigitLength(cardNumber));
        assertFalse(CreditCardValidator.isValid(cardNumber));
    }

    @Test
    public void testVisaCardValidation() {
     
        String validVisa = "4388576018410707";
        String invalidVisa = "4388576018402626";
        
        assertEquals("Visa", CreditCardValidator.getCardType(validVisa));
        assertTrue(CreditCardValidator.isValid(validVisa));
        assertFalse(CreditCardValidator.isValid(invalidVisa));
    }
}

