package com.softgroup.authorization.impl.handler;

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

    @Override
    public String getName() {
        return "login";
    }

    @Override
    public Response<LoginResponse> handle(Request<?> msg) {
        Response<LoginResponse> response = new Response<LoginResponse>();
        response.setHeader(msg.getHeader());
        response.setData(new LoginResponse());
        System.out.println("LoginResponseHandle");
        return response;
    }


}
