package com.mycomp.admin_userregistr_codingtechniquesyt.admin_user.repositories;

import com.mycomp.admin_userregistr_codingtechniquesyt.admin_user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail (String email);
}

