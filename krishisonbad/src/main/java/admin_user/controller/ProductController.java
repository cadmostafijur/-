package admin_user.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import admin_user.model.Product;
import admin_user.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    // Directory where uploaded files will be saved
    private static final String UPLOAD_DIR = System.getProperty("user.dir") + "/src/main/resources/static/uploads";

    @GetMapping("/upload")
    public String showUploadForm(Model model) {
        model.addAttribute("product", new Product());
        return "upload_product"; // Ensure this matches the HTML file name
    }

    @PostMapping("/upload")
    public String uploadProduct(@RequestParam("name") String name,
                                @RequestParam("description") String description,
                                @RequestParam("price") double price,
                                @RequestParam("image") MultipartFile file,
                                Model model) {
        String fileName = saveFile(file);
        if (fileName != null) {
            Product product = new Product();
            product.setName(name);
            product.setDescription(description);
            product.setPrice(price);
            product.setImageUrl("/uploads/" + fileName);
            productService.saveProduct(product);

            model.addAttribute("message", "Product uploaded successfully.");
        } else {
            model.addAttribute("message", "Failed to upload product image.");
        }

        return "upload_result"; // Ensure this matches the HTML file name
    }

    private String saveFile(MultipartFile file) {
        try {
            if (file.isEmpty()) {
                return null;
            }

            Path uploadPath = Paths.get(UPLOAD_DIR);
            if (!Files.exists(uploadPath)) {
                Files.createDirectories(uploadPath);
            }

            String fileName = file.getOriginalFilename();
            Path filePath = uploadPath.resolve(fileName);
            file.transferTo(filePath.toFile());

            return fileName;
        } catch (IOException e) {
            e.printStackTrace(); // Log the error to the console
            return null; // Return null to indicate failure
        }
    }
}
