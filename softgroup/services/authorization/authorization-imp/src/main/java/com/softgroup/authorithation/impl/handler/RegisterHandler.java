package com.softgroup.authorithation.impl.handler;

import com.openpojo.log.Logger;
import com.openpojo.log.LoggerFactory;
import com.softgroup.authorization.api.message.RegisterRequest;
import com.softgroup.authorization.api.message.RegisterResponse;
import com.softgroup.authorization.api.router.AuthorizationRequestHandler;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.AbstractRequestHandler;

/**
 * Created by User on 21.03.2017.
 */
public class RegisterHandler extends AbstractRequestHandler<RegisterRequest,RegisterResponse>
        implements AuthorizationRequestHandler {

    static Logger log = LoggerFactory.getLogger(RegisterHandler.class);

    @Override
    public String getName() {
        return "register";
    }

    @Override
    public Response<RegisterResponse> handle(Request messageRequest) {

        Response<RegisterResponse> response = new Response<RegisterResponse>();
        response.setHeader(messageRequest.getHeader());
        response.setData(new RegisterResponse());
        log.info("RegisterResponse");
        return response;

    }
}
