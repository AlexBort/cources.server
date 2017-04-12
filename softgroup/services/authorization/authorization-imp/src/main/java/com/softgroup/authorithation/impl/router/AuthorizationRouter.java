package com.softgroup.authorithation.impl.router;

import com.softgroup.authorization.api.router.AuthorizationRequestHandler;
import com.softgroup.common.router.api.AbstractCommandRouterHandler;
import com.softgroup.common.router.api.CommandTypeRouter;



public class AuthorizationRouter extends AbstractCommandRouterHandler<AuthorizationRequestHandler> implements CommandTypeRouter {

    @Override
    public String getName() {
        return "authorization";
    }

}
