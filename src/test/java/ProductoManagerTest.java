import collaborator.ProductManger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ProductoManagerTest {

    ProductManger productManger;
    String productToTest;
    private final String DEFAULT_PRODUCT = "A1";

    @Before
    public void setup(){
        this.productManger = new ProductManger();

    }
    @Test
    public void one_product_exis(){

        this.productToTest = DEFAULT_PRODUCT;
        boolean result = productManger.isRegistered(productToTest);
        assertTrue(result);

    }
    @Test
    public void product_price_is_retrived(){
        double priceOfProductTest = 0.65;
        this.productToTest = DEFAULT_PRODUCT;
        double result = productManger.getPriceOf(productToTest);
        assertEquals(result, priceOfProductTest, 0);

    }
}
