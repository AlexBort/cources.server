package com.softgroup.authorithation.impl.handler;

import com.openpojo.log.Logger;
import com.openpojo.log.LoggerFactory;
import com.softgroup.authorization.api.message.LoginRequest;
import com.softgroup.authorization.api.message.LoginResponse;
import com.softgroup.authorization.api.router.AuthorizationRequestHandler;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.AbstractRequestHandler;

/**
 * Created by User on 21.03.2017.
 */
public class LoginHandler extends AbstractRequestHandler<LoginRequest, LoginResponse>
        implements AuthorizationRequestHandler {


    static Logger log = LoggerFactory.getLogger(LoginHandler.class);

    @Override
    public String getName() {
        return "login";
    }

    @Override
    public Response<LoginResponse> handle(Request<?> requestMessage) {
        Response<LoginResponse> response = new Response<LoginResponse>();
        response.setHeader(requestMessage.getHeader());
        response.setData(new LoginResponse());
        log.info("LoginResponse");
        return response;
    }
}
