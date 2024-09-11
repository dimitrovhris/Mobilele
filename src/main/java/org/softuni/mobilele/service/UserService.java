package org.softuni.mobilele.service;

import org.softuni.mobilele.model.dto.UserRegistrationDTO;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    void register(UserRegistrationDTO userRegistrationDTO);
}
