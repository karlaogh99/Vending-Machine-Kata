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
        Product productToTest= new Product("Botella 50cl", 0.65);

        boolean result = productManger.isRegistered(productToTest);
        assertTrue(result);

    }
}
