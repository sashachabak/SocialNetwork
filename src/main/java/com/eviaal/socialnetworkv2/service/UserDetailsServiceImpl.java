package com.eviaal.socialnetworkv2.service;

import com.eviaal.socialnetworkv2.dto.UserDetailsDto;
import com.eviaal.socialnetworkv2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private final UserRepository userRepository;
    @Autowired
    public UserDetailsServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return UserDetailsDto.fromUser(userRepository.findUserByEmail(email).orElseThrow( () ->
                new UsernameNotFoundException("User with email " + email + " doesn't exist")));
    }
}
