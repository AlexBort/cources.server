package com.softgroup.common.router.api;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.factory.HandlerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FrouterHandler implements Handler {


    @Override
    public String getName() {
        return "mainRouter";
    }

    @Autowired
    HandlerFactory<AbstractRouterHandler> routerHandlerHandlerFactory;

    @Override
    public Response<?> handle(Request<?> msg) {
        return routerHandlerHandlerFactory.getHandler(msg).handle(msg);
    }



}