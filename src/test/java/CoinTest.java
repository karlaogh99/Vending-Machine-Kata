import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class CoinTest {
    @Before
    public void setup(){

    }
    @Test
    public void accept_5_cent_coin(){
        Coin fiveCentCoin = new Coin(21.25, 3.9);
        CoinValidationSystem coinValidationSystem = new CoinValidationSystem();

        boolean result = coinValidationSystem.validate(fiveCentCoin);

        assertTrue(result);
    }
    
}
