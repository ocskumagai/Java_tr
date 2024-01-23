package com.example.demo.controller;

import com.example.demo.dto.UserRequest;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    @Autowired
    UserService userService;

    @Autowired
    PasswordEncoder passwordEncoder;

    @GetMapping("/")
    public String displayLogin(@ModelAttribute UserRequest userRequest) {
        return "login";
    }

    @GetMapping("/register")
    public String displayRegister(@ModelAttribute UserRequest userRequest) {
        return "register";
    }

    /*Todo
     *       1　直リンクを禁止する処理
     */
    @PostMapping("/login")
    public String login(UserRequest userRequest, Model model) {
        var userInfo = userService.searchId(userRequest.getUserid());
        //ユーザー情報が取得できなかった場合
        if (userInfo == null) {
            String error = "ユーザー情報が見つかりません";
            model.addAttribute("error" , error);
            return "login";

            //入力値とデータベースの情報が一致した場合、トップ画面に遷移する
        } else if (passwordEncoder.matches(userRequest.getPassword(), userInfo.getPassword())) {
            return "redirect:/top";
        } else {
            String error = "パスワードが間違っています";
            model.addAttribute("error", error);
            return "login";
        }
    }
}