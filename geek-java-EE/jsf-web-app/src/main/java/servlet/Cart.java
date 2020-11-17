package servlet;

import entity.Product;

import javax.enterprise.context.ApplicationScoped;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;


@ApplicationScoped
public class Cart {
    private List<Product> products = new LinkedList<>();

    public void add(Product product) {
        products.add(product);
    }

    public Collection<Product> getAll() {
        return products;
    }

    public void delete(Product product) {
        products.remove(product);
    }
}
