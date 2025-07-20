package sum25.SE180470.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import sum25.SE180470.pojo.Computer;
import sum25.SE180470.pojo.User;
import sum25.SE180470.repository.UserRepository;
import sum25.SE180470.service.ComputerService;
import sum25.SE180470.service.ManufacturerService;
import sum25.SE180470.service.UserService;

import java.util.List;

@Controller
public class ComputerController {
    @Autowired
    private UserService userService;
    @Autowired
    private ManufacturerService manufacturerService;
    @Autowired
    private ComputerService computerService;

    @GetMapping("/home")
    public String home(HttpSession session, Model model){
        User user = (User)session.getAttribute("user");
        if (user!=null && (user.getRole()=="Admin") ) {
            List<Computer>  computers= computerService.getAllComputers();
            model.addAttribute("computers",computers);
            return "home";
        }
        return "redirect:/error";

    }

}

