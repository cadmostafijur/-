package admin_user.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import admin_user.model.Subscription;
import admin_user.service.SubscriptionService;

@Controller
@RequestMapping("/subscribe")
public class SubscriptionController {

    @Autowired
    private SubscriptionService subscriptionService;

    @GetMapping
    public String showSubscriptionForm() {
        return "subscription"; // This should match the name of your HTML file
    }
    @PostMapping
    public String handleSubscription(@RequestParam("name") String name,
                                      @RequestParam("email") String email,
                                      @RequestParam("service") String service,
                                      @RequestParam("payment") String payment) {
        Subscription subscription = new Subscription(name, email, service, payment);
        subscriptionService.saveSubscription(subscription);
        return "subscription-success"; // Redirect to the success page
    }
    
}
