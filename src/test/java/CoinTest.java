import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class CoinTest {
    private CoinValidationSystem coinValidationSystem;
    @Before
    public void setup(){

        coinValidationSystem = new CoinValidationSystem();
    }
    @Test
    public void accept_5_cent_coin(){
        Coin fiveCentCoin = new Coin(21.25, 3.9);

        boolean result = coinValidationSystem.validate(fiveCentCoin);

        assertTrue(result);
    }
    @Test
    public void accept_10_cent_coin(){
        Coin tenCentCoin = new Coin(19.75, 1.51);
        coinValidationSystem = new CoinValidationSystem();

        boolean result = coinValidationSystem.validate(tenCentCoin);

        assertTrue(result);
    }
    @Test
    public void accept_20_cent_coin(){
        Coin twentyCentCoin = new Coin(22.25, 1.63);
        coinValidationSystem = new CoinValidationSystem();

        boolean result = coinValidationSystem.validate(twentyCentCoin);

        assertTrue(result);
    }

}
