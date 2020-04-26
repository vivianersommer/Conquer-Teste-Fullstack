package com.conquer.desafio.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
    public boolean validateUser(String userName, String password) {
        // conquer, conquer123
        return (userName.equalsIgnoreCase("conquer") && password.equalsIgnoreCase("conquer123"));
    }
}
