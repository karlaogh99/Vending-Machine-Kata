package collaborator;


import model.Product;

import java.util.HashMap;

public class ProductManger {

    HashMap<String , Product> productCatalog;

    public ProductManger() {
        this.productCatalog = loadProductCalalog();
    }

    private HashMap<String , Product> loadProductCalalog(){
        HashMap<String , Product> resproductCatalog = new HashMap<>();
        resproductCatalog.put("A1",new Product("Botella 50cl", 0.65));

        return resproductCatalog;

    }
    public boolean isRegistered(String productToCheck){
        return (productCatalog.get(productToCheck) != null);
    }
}
