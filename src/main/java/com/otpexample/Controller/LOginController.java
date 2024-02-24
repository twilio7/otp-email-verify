package com.otpexample.Controller;

import com.otpexample.service.EmailVerificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
@RestController
@RequestMapping("/api")

public class LOginController {
@Autowired
    private EmailVerificationService emailVerificationService;

    @PostMapping("/send-otp-for-login")
    public Map<String , String > sendOtpForLogin(@RequestParam String email){
        return emailVerificationService.sendOtpForLogin(email);
    }

    @PostMapping("/verify-otp-for-login")
    public Map<String , String >verifyOtpForLOgin(@RequestParam String email, @RequestParam String otp) {
        return emailVerificationService.verifyOtpForLogin(email,otp);
    }
}
