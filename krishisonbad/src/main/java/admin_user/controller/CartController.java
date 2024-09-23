// package admin_user.controller;

// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.GetMapping;

// @Controller
// public class CartController {

//     @GetMapping("/cart")
//     public String getCartPage() {
//         return "agroshop"; // This maps to agroshop.html in src/main/resources/templates
//     }
// }
package admin_user.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import admin_user.model.Product;
import admin_user.repositories.ProductRepository;

@Controller
public class CartController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/cart")
    public String getCartPage(Model model) {
        // Fetch products from the database
        Iterable<Product> products = productRepository.findAll();
        model.addAttribute("products", products);
        return "agroshop"; // This maps to agroshop.html in src/main/resources/templates
    }
}
