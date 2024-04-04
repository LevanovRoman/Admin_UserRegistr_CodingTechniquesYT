package com.mycomp.admin_userregistr_codingtechniquesyt.admin_user.service;

import com.mycomp.admin_userregistr_codingtechniquesyt.admin_user.dto.UserDto;
import com.mycomp.admin_userregistr_codingtechniquesyt.admin_user.model.User;
import com.mycomp.admin_userregistr_codingtechniquesyt.admin_user.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(UserDto userDto) {
        User user = new User(userDto.getEmail(), passwordEncoder.encode(userDto.getPassword()), userDto.getRole(), userDto.getFullname());
        return userRepository.save(user);
    }
}
