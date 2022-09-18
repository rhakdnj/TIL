package com.example.thymeleafstudy.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/study")
public class StudyController {

    @GetMapping("/text-basic")
    public String text(Model model) {
        model.addAttribute("data", "Hello <b>Spring!</b>");
        return "study/text-basic";
    }

    @GetMapping("/text-unescaped")
    public String textUnescaped(Model model) {
        model.addAttribute("data", "Hello <b>Spring!</b>");
        return "study/text-unescaped";
    }

    @GetMapping("/variable")
    public String variable(Model model) {
        User userA = new User("userA", 119);
        User userB = new User("userA", 112);

        List<User> users = List.of(userA, userB);

        HashMap<String, User> userMap = new HashMap<>();
        userMap.put("userA", userA);
        userMap.put("userB", userB);

        model.addAttribute("user", userA);
        model.addAttribute("users", users);
        model.addAttribute("userMap", userMap);

        return "study/variable";
    }

    @GetMapping("/basic-objects")
    public String basicObjects(HttpSession session) {
        session.setAttribute("sessionData", "Session");
        return "study/basic-objects";
    }

    @Component("helloBean")
    static class helloBean {
        public String hello(String data) {
            return "Hello " + data;
        }
    }

    @GetMapping("/date")
    public String date(Model model) {
        model.addAttribute("localDate", LocalDate.now());
        model.addAttribute("localDateTime", LocalDateTime.now());
        return "study/date";
    }

    @GetMapping("/link")
    public String link(Model model) {
        model.addAttribute("param1", "data1");
        model.addAttribute("param2", "data2");
        return "study/link";
    }

    @GetMapping("/literal")
    public String literal(Model model) {
        model.addAttribute("data", "Hello Spring!");
        return "study/literal";
    }

    @GetMapping("/operation")
    public String operation(Model model) {
        model.addAttribute("nullData", null);
        model.addAttribute("data", "Spring!");
        return "study/operation";
    }

    @Data
    @AllArgsConstructor
    static class User {
        private String name;
        private int age;
    }
}
