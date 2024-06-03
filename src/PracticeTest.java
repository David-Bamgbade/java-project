import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PracticeTest {

    @Test
    void createAccountTest() {
        Practice myAccount = new Practice();
       String name = "John Doe";
       String pin = "1234";
       myAccount.createAccount(name, pin);
       assertEquals(name, myAccount.getName("john doe"));
       assertEquals(pin, myAccount.getPin("1234"));


    }


}