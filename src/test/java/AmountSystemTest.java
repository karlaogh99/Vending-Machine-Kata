import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class AmountSystemTest {

    @Before
    public void setup(){


    }
    @Test
    public void add_the_amount_of_a_coin_if_is_accept(){
        AmountSystem amountSystem = new AmountSystem();
        Coin oneEuroCoin = new Coin(23.25, 7.5);

        double expectedAmount = 1.00;
        amountSystem.addAmountFrom(oneEuroCoin);
        double totalAmount = amountSystem.getCurrentAccount();
        assertTrue(totalAmount == expectedAmount);

    }
    @Test
    public void add(){

    }
}
