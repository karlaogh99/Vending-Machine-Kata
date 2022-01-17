import collaborator.ProductManger;
import model.Product;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ProductoManagerTest {


    @Before
    public void setup(){

    }
    @Test
    public void one_product_exis(){
        ProductManger productManger = new ProductManger();
        String productToTest= "A1";

        boolean result = productManger.isRegistered(productToTest);
        assertTrue(result);

    }
}
