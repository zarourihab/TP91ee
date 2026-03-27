package ma.fstg.security.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "Bienvenue ! Vous êtes connecté avec succès.";
    }

    @GetMapping("/user/dashboard")
    @ResponseBody
    public String userDashboard() {
        return "Zone utilisateur accessible selon le rôle USER ou ADMIN.";
    }

    @GetMapping("/admin/dashboard")
    @ResponseBody
    public String adminDashboard() {
        return "Zone admin sécurisée pour ADMIN فقط.";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
}