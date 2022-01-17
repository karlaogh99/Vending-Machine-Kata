import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class CoinValidationSystemTest {
    private CoinValidationSystem coinValidationSystem;
    private Coin coinTest;
    @Before
    public void setup(){

        coinValidationSystem = new CoinValidationSystem();
    }
    @Test
    public void accept_5_cent_coin(){
        this.coinTest = new Coin(21.25, 3.9);

        boolean result = coinValidationSystem.validate(coinTest);

        assertTrue(result);
    }
    @Test
    public void accept_10_cent_coin(){
        this.coinTest = new Coin(19.75, 1.51);
        coinValidationSystem = new CoinValidationSystem();

        boolean result = coinValidationSystem.validate(coinTest);

        assertTrue(result);
    }
    @Test
    public void accept_20_cent_coin(){
        this.coinTest = new Coin(22.25, 1.63);
        coinValidationSystem = new CoinValidationSystem();

        boolean result = coinValidationSystem.validate(coinTest);

        assertTrue(result);
    }
    @Test
    public void accept_50_cent_coin(){
        this.coinTest = new Coin(24.25, 1.88);
        coinValidationSystem = new CoinValidationSystem();

        boolean result = coinValidationSystem.validate(coinTest);

        assertTrue(result);
    }
    @Test
    public void accept_1_euro_coin(){
        this.coinTest = new Coin(23.25, 2.125);
        coinValidationSystem = new CoinValidationSystem();

        boolean result = coinValidationSystem.validate(coinTest);

        assertTrue(result);
    }
    @Test
    public void accept_2_euro_coin(){
        this.coinTest = new Coin(25.75, 1.95);
        coinValidationSystem = new CoinValidationSystem();

        boolean result = coinValidationSystem.validate(coinTest);

        assertTrue(result);
    }

}
