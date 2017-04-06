package com.softgroup.common.router.api;

import com.softgroup.common.protocol.Request;

/**
 * Created by User on 21.03.2017.
 */
public abstract class AbstractCommandRouterHandler<T extends Handler> extends AbstractRouterHandler<T> {


    public abstract String getName();

    @Override
    public String getRouteKey(Request request) {
        return request.getHeader().getCommand();

    }


}
