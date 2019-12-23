package com.github.wendao76.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * 获取用户详情服务
 * @author wendao76
 */
@Component
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        String encodePassword = passwordEncoder.encode("admin123");
        System.out.println(encodePassword);
        return new User("admin", encodePassword, AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
    }
}
