import collaborator.AmountSystem;
import model.Coin;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AmountSystemTest {
    AmountSystem amountSystem;
    double totalAmount;
    Coin oneEuroCoin;
    Coin twentyCentCoin;
    Coin fiveCentCoin;
    Coin tenCentCoin;
    Coin twoEuroCoin;
    Coin fiftyCentCoin;

    @Before
    public void setup(){
        this.amountSystem = new AmountSystem();
        this.oneEuroCoin = new Coin(23.25, 7.5);
        this.twentyCentCoin = new Coin(22.25, 5.7);
        this.fiveCentCoin = new Coin(21.25, 3.9);
        this.tenCentCoin = new Coin(19.75, 4.1);
        this.twoEuroCoin = new Coin(25.75, 8.5);
        this.fiftyCentCoin = new Coin(24.25, 7.8);
    }
    @Test
    public void add_the_amount_of_a_coin_if_is_accept(){

        double expectedAmount = 1.00;
        amountSystem.addAmountFrom(oneEuroCoin);
        this.totalAmount = amountSystem.getCurrentAccount();
        assertEquals(totalAmount, expectedAmount);

    }
    @Test
    public void add_the_amount_of_several_coins_if_is_accept(){
        double expectedAmount = 1.25;
        amountSystem.addAmountFrom(oneEuroCoin);
        amountSystem.addAmountFrom(twentyCentCoin);
        amountSystem.addAmountFrom(fiveCentCoin);
        this.totalAmount = amountSystem.getCurrentAccount();
        assertEquals(totalAmount, expectedAmount);

    }
    @Test
    public void add_the_amount_of_all_coins_if_is_accept(){
        double expectedAmount = 3.85;
        amountSystem.addAmountFrom(oneEuroCoin);
        amountSystem.addAmountFrom(twentyCentCoin);
        amountSystem.addAmountFrom(fiveCentCoin);
        amountSystem.addAmountFrom(tenCentCoin);
        amountSystem.addAmountFrom(twoEuroCoin);
        amountSystem.addAmountFrom(fiftyCentCoin);
        this.totalAmount = amountSystem.getCurrentAccount();
        assertEquals(totalAmount, expectedAmount);

    }
}
