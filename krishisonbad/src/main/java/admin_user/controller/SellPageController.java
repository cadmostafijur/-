package admin_user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SellPageController {

    @GetMapping("/sell")
    public String getSellPage() {
        return "sell"; // This maps to sell.html in src/main/resources/templates
    }
}
