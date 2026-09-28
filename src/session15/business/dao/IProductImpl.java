package session15.business.dao;

import session15.business.model.Product;
import session15.business.model.ProductTotalByCatalog;
import session15.utils.ConnectionDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class IProductImpl implements IProduct {
    @Override
    public List<Product> getAllProduct() {
        List<Product> products = new ArrayList<>();
        Connection connection = ConnectionDB.openConnection();

        try {
            CallableStatement call = connection.prepareCall("{call get_all_products}");
            ResultSet rs = call.executeQuery();
            while (rs.next()) {
                Product product = new Product(
                        rs.getInt("product_id"),
                        rs.getString("product_name"),
                        rs.getFloat("product_price"),
                        rs.getString("product_title"),
                        rs.getDate("product_created").toLocalDate(),
                        rs.getString("product_catalog"),
                        rs.getBoolean("product_status")
                );
                products.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(connection);
        }
        return products;
    }

    @Override
    public void addProduct(Product product) {
        Connection connection = ConnectionDB.openConnection();

        try {
            CallableStatement call = connection.prepareCall("{call add_product(?,?,?,?,?,?)}");
            call.setString(1, product.getName());
            call.setFloat(2, product.getPrice());
            call.setString(3, product.getTitle());
            call.setDate(4, Date.valueOf(product.getCreated()));
            call.setString(5, product.getCatalog());
            call.setBoolean(6, product.getStatus());
            call.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(connection);
        }
    }

    @Override
    public void updateProduct(Product product) {
        Connection connection = ConnectionDB.openConnection();

        try {
            CallableStatement call = connection.prepareCall("{call update_product(?,?,?,?,?,?,?)}");
            call.setInt(1, product.getId());
            call.setString(2, product.getName());
            call.setFloat(3, product.getPrice());
            call.setString(4, product.getTitle());
            call.setDate(5, Date.valueOf(product.getCreated()));
            call.setString(6, product.getCatalog());
            call.setBoolean(7, product.getStatus());
            call.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(connection);
        }
    }

    @Override
    public void deleteProduct(Integer index) {
        Connection connection = ConnectionDB.openConnection();

        try {
            CallableStatement call = connection.prepareCall("{call delete_product(?)}");
            call.setInt(1, index);
            call.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(connection);
        }
    }

    @Override
    public List<Product> findProduct(String name) {
        List<Product> findProducts = new ArrayList<>();
        Connection connection = ConnectionDB.openConnection();

        try {
            CallableStatement call = connection.prepareCall("{call find_by_name(?)}");
            call.setString(1, name);
            ResultSet rs = call.executeQuery();
            while (rs.next()) {
                Product product = new Product(
                        rs.getInt("product_id"),
                        rs.getString("product_name"),
                        rs.getFloat("product_price"),
                        rs.getString("product_title"),
                        rs.getDate("product_created").toLocalDate(),
                        rs.getString("product_catalog"),
                        rs.getBoolean("product_status")
                );
                findProducts.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(connection);
        }
        return findProducts;
    }

    @Override
    public List<Product> sortProduct() {
        List<Product> sortedList = getAllProduct().stream().sorted(Comparator.comparingDouble(Product::getPrice)).collect(Collectors.toList());
        return sortedList;
    }

    @Override
    public List<ProductTotalByCatalog> quantityByCatalog() {
        List<ProductTotalByCatalog> productTotalByCatalogList = new ArrayList<>();
        Connection connection = ConnectionDB.openConnection();

        try {
            CallableStatement call = connection.prepareCall("{call product_by_catalog}");
            ResultSet rs = call.executeQuery();
            while (rs.next()) {
                ProductTotalByCatalog totalByCatalog = new ProductTotalByCatalog(
                        rs.getString("Catalog"),
                        rs.getInt("Total")
                );
                productTotalByCatalogList.add(totalByCatalog);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(connection);
        }
        return productTotalByCatalogList;
    }
}
