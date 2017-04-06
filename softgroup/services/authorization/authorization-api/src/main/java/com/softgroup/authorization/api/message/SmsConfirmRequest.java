package com.softgroup.authorization.api.message;

import com.softgroup.common.protocol.RequestData;

/**
 * Created by User on 21.03.2017.
 */
public class SmsConfirmRequest  implements RequestData{

    private String authCode;
    private String registrationRequestUuid;

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public String getRegistrationRequestUuid() {
        return registrationRequestUuid;
    }

    public void setRegistrationRequestUuid(String registrationRequestUuid) {
        this.registrationRequestUuid = registrationRequestUuid;
    }

}
