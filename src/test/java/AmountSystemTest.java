import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class AmountSystemTest {
    AmountSystem amountSystem;
    double totalAmount;
    Coin oneEuroCoin;
    @Before
    public void setup(){
        this.amountSystem = new AmountSystem();
        this.oneEuroCoin = new Coin(23.25, 7.5);

    }
    @Test
    public void add_the_amount_of_a_coin_if_is_accept(){

        double expectedAmount = 1.00;
        amountSystem.addAmountFrom(oneEuroCoin);
        this.totalAmount = amountSystem.getCurrentAccount();
        assertEquals(totalAmount, expectedAmount);

    }
    @Test
    public void add(){

    }
}
