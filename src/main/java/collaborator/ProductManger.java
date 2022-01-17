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


        return resproductCatalog;

    }
    public boolean isRegistered(Product productToCheck){
        return false;
    }
}
