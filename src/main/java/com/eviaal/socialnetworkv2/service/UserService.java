package com.eviaal.socialnetworkv2.service;

import com.eviaal.socialnetworkv2.entity.User;
import com.eviaal.socialnetworkv2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
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

    public User findById(Long id) {
        return userRepository.getById(id);
    }

    public User findByEmail(String email) {
       return userRepository.findUserByEmail(email).orElseThrow(() ->
               new UsernameNotFoundException("User " + email + " doesn't exist"));
    }

    public boolean isExist(String email) {
        return userRepository.existsUserByEmail(email);
    }
}
