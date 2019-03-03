package com.granovskiy;

import com.granovskiy.model.Category;
import com.granovskiy.model.Product;
import com.granovskiy.model.User;

import java.util.ArrayList;
import java.util.List;

public class DBEmulator {

    private static List<Category> categories = new ArrayList<>();

    private static List<User> users = new ArrayList<>();

    static {
        Product product = new Product("iPhone", "Apple product", 999.99);
        Product product2 = new Product("samsung", "korean product", 700.99);
        List<Product> products = new ArrayList<>();
        products.add(product);
        products.add(product2);
        Category category = new Category(1L, "Mobile Phones", "Best ever phones");
        category.setProducts(products);
        categories.add(category);
        categories.add(new Category(2L, "Shoes", "Italian shoes"));
        categories.add(new Category(3L, "TVs", "Chines TVs"));

        users.add(new User(
                "anton777",
                "96cae35ce8a9b0244178bf28e4966c2ce1b8385723a96a6b838858cdd6ca0a1e", // 123123
                "d0d95eb2-0a4c-4517-9744-297b3566178b",
                "Anton",
                "LastName"));
    }

    public static List<Category> getCategories() {
        return categories;
    }

    public static List<User> getUsers() {
        return users;
    }

    public static void addUser(User user) {
        users.add(user);
    }
}
