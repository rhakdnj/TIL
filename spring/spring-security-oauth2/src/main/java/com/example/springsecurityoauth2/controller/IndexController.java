package com.example.springsecurityoauth2.controller;

import com.example.springsecurityoauth2.config.auth.LoginUser;
import com.example.springsecurityoauth2.config.auth.dto.SessionUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final HttpSession httpSession;

    @GetMapping("/")
    public String index(Model model, @LoginUser SessionUser user) {

        if (user != null) {
            model.addAttribute("userName", user.getName());
            model.addAttribute("user", user);
        }

        return "index";
    }
}
