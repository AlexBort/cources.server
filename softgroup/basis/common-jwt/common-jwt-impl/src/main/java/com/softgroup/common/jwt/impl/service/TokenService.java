package com.softgroup.common.jwt.impl.service;

import com.openpojo.log.Logger;
import com.openpojo.log.LoggerFactory;
import com.softgroup.common.jwt.api.service.TokenType;
import com.softgroup.common.jwt.api.service.UniversalTokenService;
import io.jsonwebtoken.Jwts;


import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Date;


@Component
public class TokenService implements UniversalTokenService {


    private final String KEY = "g94wri5j3j653jih3og";
    private final TokenType SESSION_TOKEN = TokenType.SESSION_TOKEN;
    private final TokenType DEVICE_TOKEN = TokenType.DEVICE_TOKEN;
    private final Long YEAR_UNIX_TMS = 31536000000L;
    private final Long TEN_MINUTES_UNIX_TMS = 600000L;

    static Logger log = LoggerFactory.getLogger(TokenService.class);

    @Override
    public void validateDeviceToken(String token) {
        validateToken(DEVICE_TOKEN, token);
    }

    @Override
    public String generateDeviceToken(String profileID, String deviceID) {

        return  Jwts.builder()
                .claim("profileID", profileID)
                .claim("deviceID", deviceID)
                .claim("type", DEVICE_TOKEN)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + TEN_MINUTES_UNIX_TMS))
                .signWith(SignatureAlgorithm.HS256, KEY)
                .compact();
    }

    @Override
    public void validateSessionToken(String token) {
       validateToken(SESSION_TOKEN, token);
    }

    @Override
    public String generateSessionToken(String profileID, String deviceID){
        return  Jwts.builder()
                .claim("profileID", profileID)
                .claim("deviceID", deviceID)
                .claim("type", SESSION_TOKEN)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + YEAR_UNIX_TMS))
                .signWith(SignatureAlgorithm.HS256, KEY)
                .compact();
    }

    @Override
    public Long getTimeOfCreation(String token) {
            return Jwts.parser()
                    .setSigningKey(KEY)
                    .parseClaimsJws(token)
                    .getBody().getIssuedAt().getTime();
    }

    @Override
    public TokenType getTokenType(String token)  {
            return (TokenType) getParameter(token, "type");
    }

    @Override
    public String getDeviceID(String token)  {
            return (String) getParameter(token, "deviceID");
    }

    @Override
    public String getProfileID(String token)  {

            return (String) getParameter(token, "profileID");

    }

    public Object getParameter(String token, String key) {
        return  Jwts.parser()
                .setSigningKey(KEY)
                .parseClaimsJws(token)
                .getBody()
                .get(key);
    }

    private void validateToken(TokenType tokenType, String token) {

            Jwts.parser()
                    .require("tokenType", tokenType)
                    .setSigningKey(KEY)
                    .parseClaimsJws(token);
    }
}
