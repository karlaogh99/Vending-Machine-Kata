import collaborator.ProductManger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ProductoManagerTest {

    ProductManger productManger;
    @Before
    public void setup(){
        this.productManger = new ProductManger();

    }
    @Test
    public void one_product_exis(){
        String productToTest= "A1";

        boolean result = productManger.isRegistered(productToTest);
        assertTrue(result);

    }
}
