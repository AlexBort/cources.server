package com.softgroup.authorithation.impl.handler;

import com.openpojo.log.Logger;
import com.openpojo.log.LoggerFactory;
import com.softgroup.authorization.api.message.SmsConfirmRequest;
import com.softgroup.authorization.api.message.SmsConfirmResponse;
import com.softgroup.authorization.api.router.AuthorizationRequestHandler;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.AbstractRequestHandler;

/**
 * Created by User on 21.03.2017.
 */
public class SmsConfirmHandler extends AbstractRequestHandler<SmsConfirmRequest, SmsConfirmResponse>
        implements AuthorizationRequestHandler {

    static Logger log = LoggerFactory.getLogger(SmsConfirmHandler.class);

    @Override
    public String getName() {
        return "smsConfirm";
    }

    @Override
    public Response handle(Request messageRequest) {
        Response<SmsConfirmResponse> smsConfirmResponse = new Response<SmsConfirmResponse>();
        smsConfirmResponse.setHeader(messageRequest.getHeader());
        smsConfirmResponse.setData(new SmsConfirmResponse());
        log.info("SmsConfirmResponse");
        return smsConfirmResponse;
    }
}
