package com.mycomp.admin_userregistr_codingtechniquesyt.admin_user.service;

import com.mycomp.admin_userregistr_codingtechniquesyt.admin_user.dto.UserDto;
import com.mycomp.admin_userregistr_codingtechniquesyt.admin_user.model.User;

public interface UserService {

    User save(UserDto userDto);
}
