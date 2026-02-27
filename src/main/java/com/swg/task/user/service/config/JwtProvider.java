package com.swg.task.user.service.config;

import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import javax.crypto.SecretKey;
import java.util.Collection;

public class JwtProvider {

    SecretKey key = Keys.hmacShaKeyFor(JwtConstant.SECRET_KEY.getBytes());

    public static String generateToken(Authentication auth) {

        Collection<? extends GrantedAuthority> authorities = auth.getAuthorities();
        String roles = populateAuthorities(authorities);
            return null;
    }

    private static String populateAuthorities(Collection<? extends GrantedAuthority> collection) {
        return null;
    }
}
