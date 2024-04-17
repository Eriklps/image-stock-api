package com.example.imageliteapi.application.jwt;

import com.example.imageliteapi.domain.AccessToken;
import com.example.imageliteapi.domain.entity.User;
import org.springframework.stereotype.Service;

@Service
public class JwtService {

    public AccessToken generateToken(User user) {
        return new AccessToken("");
    }
}
