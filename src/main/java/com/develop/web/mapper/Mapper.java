package com.develop.web.mapper;

import org.springframework.security.core.userdetails.UserDetails;

@org.apache.ibatis.annotations.Mapper
public interface Mapper {
    UserDetails getUserDetails(String userid);
}


