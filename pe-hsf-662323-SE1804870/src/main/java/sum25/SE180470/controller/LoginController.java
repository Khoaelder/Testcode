package sum25.SE180470.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sum25.SE180470.pojo.User;
import sum25.SE180470.service.UserService;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;
    @GetMapping("/login")
    public  String login(){
        return "login";
    }
    @PostMapping("/login")
    public String login(HttpSession session, String email,  String password, Model model){
        User user = userService.findUserByEmail(email,password);
        if(user!=null){
            model.addAttribute("user",user);
            return "redirect:/home";
        }
        return "redirect:/login";
    }
}
//






