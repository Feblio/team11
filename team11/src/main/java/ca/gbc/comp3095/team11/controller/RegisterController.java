package ca.gbc.comp3095.team11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ca.gbc.comp3095.team11.model.User;

@Controller
public class RegisterController {

    @GetMapping("/registration_form")
    public String showRegistrationForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "registration_form";
    }

    @PostMapping("/save")
    public String saveRegister(@ModelAttribute User user, Model model) {
        model.addAttribute("user", user);
        return "display_form";
    }

}