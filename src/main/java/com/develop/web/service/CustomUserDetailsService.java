package com.develop.web.service;

import com.develop.web.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private Mapper adminRepository;

    @Override
    public UserDetails loadUserByUsername(String userid) throws UsernameNotFoundException {

        UserDetails userDetails = adminRepository.getUserDetails(userid);

        if(userDetails == null) {
            throw new UsernameNotFoundException("유효하지 않는 로그인 정보입니다.");
        }

        return userDetails;
    }

}
