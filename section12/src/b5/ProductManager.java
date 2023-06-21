package b5;

import java.util.ArrayList;

public class ProductManager {
    private ArrayList<Product> list;

    public ProductManager() {
        list = new ArrayList<>();
    }

    public void addProduct(Product product) {
        list.add(product);
    }

    public void editProduct(int id, Product newProduct) {
        int index = findIndexById(id);
        if (index != -1)
            list.set(index, newProduct);
    }

    public int findIndexById(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) return i;
        }
        return -1;
    }

    public void deleteProduct(int id) {
        int index = findIndexById(id);
        if (index != -1)
            list.remove(index);
    }
}
