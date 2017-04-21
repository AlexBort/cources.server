package com.softgroup.common.jwt.api.service;


public interface SessionTokenService {
    void validateSessionToken(String token);
    String generateSessionToken(String profileID, String deviceID);
}
