package com.softgroup.common.jwt.api.service;


public interface UniversalTokenService extends DeviceTokenService, SessionTokenService {

    Long getTimeOfCreation(String token);
    TokenType getTokenType(String token);
    String getDeviceID(String token);
    String getProfileID(String token);
}
