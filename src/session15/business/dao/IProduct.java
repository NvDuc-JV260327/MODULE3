package session15.business.dao;

import session15.business.model.Product;
import session15.business.model.ProductTotalByCatalog;

import java.util.List;

public interface IProduct {
    List<Product> getAllProduct();
    void addProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(Integer index);
    List<Product> findProduct(String name);
    List<Product> sortProduct();
    List<ProductTotalByCatalog> quantityByCatalog();

}
