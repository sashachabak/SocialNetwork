package com.eviaal.socialnetworkv2.service;

import com.eviaal.socialnetworkv2.entity.User;
import com.eviaal.socialnetworkv2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void save(User user) {
        userRepository.save(user);
    }

    public void delete(User user) {
        userRepository.delete(user);
    }

    public void findById(Long id) {
        userRepository.findById(id);
    }

    public void findByEmail(String email) {
        userRepository.findUserByEmail(email);
    }
}
