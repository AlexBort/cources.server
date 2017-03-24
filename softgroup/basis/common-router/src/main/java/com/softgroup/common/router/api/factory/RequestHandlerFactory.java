package com.softgroup.common.router.api.factory;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.router.api.AbstractRequestHandler;
import org.springframework.stereotype.Component;

/**
 * Created by User on 21.03.2017.
 */


@Component
public class RequestHandlerFactory<T extends AbstractRequestHandler> extends Factory<T> {


    protected String getRouteKey(Request<?> msg) {
        return msg.getHeader().getCommand();
    }


}
