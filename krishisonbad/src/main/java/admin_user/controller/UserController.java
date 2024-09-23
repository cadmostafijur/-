// package admin_user.controller;

// import java.security.Principal;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.ModelAttribute;
// import org.springframework.web.bind.annotation.PostMapping;

// import admin_user.dto.UserDto;
// import admin_user.service.UserService;


// @Controller
// public class UserController {
	
// 	@Autowired
// 	UserDetailsService userDetailsService;
	
// 	@Autowired
// 	private UserService userService;
	
// 	// @GetMapping("/home")
// 	// public String getRegistrationPage(@ModelAttribute("user") UserDto userDto) {
// 	// 	return "home";
// 	// }

// 	@GetMapping("/")
//     public String redirectToHome() {
//         return "redirect:/home";  // Redirects root URL to /home
//     }

//     @GetMapping("/home")
//     public String home() {
//         return "home";  // Loads the home page
//     }
// 	@GetMapping("/about")
//     public String about() {
//         return "about";  // Maps to about.html
//     }

//     @GetMapping("/services")
//     public String services() {
//         return "services";  // Maps to services.html
//     }

//     @GetMapping("/contact")
//     public String contact() {
//         return "contact";  // Maps to contact.html
//     }

// 	@GetMapping("/agroshop")
//     public String shop() {
//         return "agroshop";  // Maps to contact.html
//     }



	
// 	@GetMapping("/registration")
// 	public String getRegistrationPage(@ModelAttribute("user") UserDto userDto) {
// 		return "register";
// 	}


	

	
// 	@PostMapping("/registration")
// 	public String saveUser(@ModelAttribute("user") UserDto userDto, Model model) {
// 		userService.save(userDto);
// 		model.addAttribute("message", "Registered Successfuly!");
// 		return "register";
// 	}
	
// 	@GetMapping("/login")
// 	public String login() {
// 		return "login";
// 	}
	
// 	@GetMapping("/user-page")
// 	public String userPage (Model model, Principal principal) {
// 		UserDetails userDetails = userDetailsService.loadUserByUsername(principal.getName());
// 		model.addAttribute("user", userDetails);
// 		return "user";
// 	}
	
// 	@GetMapping("/admin-page")
// 	public String adminPage (Model model, Principal principal) {
// 		UserDetails userDetails = userDetailsService.loadUserByUsername(principal.getName());
// 		model.addAttribute("user", userDetails);
// 		return "admin";
// 	}
// 	@GetMapping("/profile")
// public String profile(Model model, Principal principal) {
//     UserDetails userDetails = userDetailsService.loadUserByUsername(principal.getName());
//     model.addAttribute("user", userDetails);
//     return "profile"; // This should match the name of your HTML template
// }
// @GetMapping("/chat-ai")
// public String chatAi() {
//     return "chat-ai";  // Ensure this matches the name of your HTML template
// }

// }


// package admin_user.controller;

// import java.security.Principal;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.ModelAttribute;
// import org.springframework.web.bind.annotation.PostMapping;

// import admin_user.dto.UserDto;
// import admin_user.service.UserService;

// @Controller
// public class UserController {

//     @Autowired
//     UserDetailsService userDetailsService;

//     @Autowired
//     private UserService userService;

//     @GetMapping("/")
//     public String redirectToHome() {
//         return "redirect:/home";  // Redirects root URL to /home
//     }

//     @GetMapping("/home")
//     public String home() {
//         return "home";  // Loads the home page
//     }

//     @GetMapping("/about")
//     public String about() {
//         return "about";  // Maps to about.html
//     }

//     @GetMapping("/services")
//     public String services() {
//         return "services";  // Maps to services.html
//     }

//     @GetMapping("/contact")
//     public String contact() {
//         return "contact";  // Maps to contact.html
//     }

//     @GetMapping("/agroshop")
//     public String shop() {
//         return "agroshop";  // Maps to agroshop.html
//     }

//     @GetMapping("/registration")
//     public String getRegistrationPage(@ModelAttribute("user") UserDto userDto) {
//         return "register";  // Maps to register.html
//     }

//     @PostMapping("/registration")
//     public String saveUser(@ModelAttribute("user") UserDto userDto, Model model) {
//         userService.save(userDto);
//         model.addAttribute("message", "Registered Successfully!");
//         return "register";
//     }

//     @GetMapping("/login")
//     public String login() {
//         return "login";  // Maps to login.html
//     }

//     @GetMapping("/user-page")
//     public String userPage(Model model, Principal principal) {
//         UserDetails userDetails = userDetailsService.loadUserByUsername(principal.getName());
//         model.addAttribute("user", userDetails);
//         return "user";  // Maps to user.html
//     }

//     @GetMapping("/admin-page")
//     public String adminPage(Model model, Principal principal) {
//         UserDetails userDetails = userDetailsService.loadUserByUsername(principal.getName());
//         model.addAttribute("admin", userDetails);
//         return "admin";  // Maps to admin.html
//     }

//     @GetMapping("/profile")
//     public String profile(Model model, Principal principal) {
//         UserDetails userDetails = userDetailsService.loadUserByUsername(principal.getName());
//         model.addAttribute("user", userDetails);
//         return "profile";  // Maps to profile.html
//     }

//     @GetMapping("/chat-ai")
//     public String chatAi() {
//         return "chat-ai";  // Maps to chat-ai.html
//     }
// }

package admin_user.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import admin_user.dto.UserDto;
import admin_user.service.UserService;

@Controller
public class UserController {

    @Autowired
    UserDetailsService userDetailsService;

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String redirectToHome() {
        return "redirect:/home";  // Redirects root URL to /home
    }

    @GetMapping("/home")
    public String home() {
        return "home";  // Loads the home page
    }

    @GetMapping("/about")
    public String about() {
        return "about";  // Maps to about.html
    }

    @GetMapping("/services")
    public String services() {
        return "services";  // Maps to services.html
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";  // Maps to contact.html
    }

    @GetMapping("/agroshop")
    public String shop() {
        return "agroshop";  // Maps to agroshop.html
    }

    @GetMapping("/registration")
    public String getRegistrationPage(@ModelAttribute("user") UserDto userDto) {
        return "register";
    }

    @PostMapping("/registration")
    public String saveUser(@ModelAttribute("user") UserDto userDto, Model model) {
        userService.save(userDto);
        model.addAttribute("message", "Registered Successfully!");
        return "register";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/user-page")
    public String userPage(Model model, Principal principal) {
        UserDetails userDetails = userDetailsService.loadUserByUsername(principal.getName());
        model.addAttribute("user", userDetails);
        return "user";  // Maps to user.html
    }

    @GetMapping("/admin-page")
    public String adminPage(Model model, Principal principal) {
        UserDetails userDetails = userDetailsService.loadUserByUsername(principal.getName());
        model.addAttribute("user", userDetails);
        return "admin";  // Maps to admin.html
    }

    @GetMapping("/profile")
    public String profile(Model model, Principal principal) {
        UserDetails userDetails = userDetailsService.loadUserByUsername(principal.getName());
        model.addAttribute("user", userDetails);
        return "profile";  // Maps to profile.html
    }

    @GetMapping("/chat-ai")
    public String chatAi() {
        return "chat-ai";  // Maps to chat-ai.html
    }
}
