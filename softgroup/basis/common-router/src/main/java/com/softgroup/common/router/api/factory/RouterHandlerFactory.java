package com.softgroup.common.router.api.factory;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.router.api.AbstractRouterHandler;
import org.springframework.stereotype.Component;

/**
 * Created by User on 21.03.2017.
 */
@Component
public class RouterHandlerFactory<T extends AbstractRouterHandler> extends HandlerFactory<T> {


    @Override
    protected String getRouteKey(Request<?> msg) {
        return msg.getHeader().getType();
    }
}
