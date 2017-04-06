package com.softgroup.common.jwt.api.service;


public interface DeviceTokenService {
    void validateDeviceToken(String token);
    String generateDeviceToken(String profileID, String deviceID);
}
