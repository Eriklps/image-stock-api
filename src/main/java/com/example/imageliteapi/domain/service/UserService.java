package com.example.imageliteapi.domain.service;

import com.example.imageliteapi.domain.AccessToken;
import com.example.imageliteapi.domain.entity.User;

public interface UserService {
    User getByEmail(String email);
    User save(User user);
    AccessToken autheticate(String email, String password);
}