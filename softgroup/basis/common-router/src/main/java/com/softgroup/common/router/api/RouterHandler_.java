package com.softgroup.common.router.api;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.factory.Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RouterHandler_ implements Handler {


    @Override
    public String getName() {
        return "mainRouter";
    }


    @Autowired
    Factory<AbstractRouterHandler> routerHandlerFactory;

    @Override
    public Response<?> handle(Request<?> msg) {
        return routerHandlerFactory.getHandler(msg).handle(msg);
    }


}