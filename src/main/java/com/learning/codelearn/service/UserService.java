package com.learning.codelearn.service;

import com.learning.codelearn.dto.RegistrationDto;
import com.learning.codelearn.models.Course;
import com.learning.codelearn.models.User;

import com.learning.codelearn.service.impl.UserNotFoundException;

import java.util.List;

public interface UserService {
    void save(RegistrationDto registrationDto);
    User findByEmail(String email);
    User findByUsername(String username);
    User authenticate(String username, String password);

    void saveCourse(User user, long courseId);
    void updateResetPasswordToken(String token, String email) throws UserNotFoundException;
    User get(String resetPasswordToken) throws UserNotFoundException;
    void updatePassword(User user, String newPassword) ;
}
