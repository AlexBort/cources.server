package com.softgroup.common.router.api.factory;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.router.api.Handler;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;

/**
 * Created by User on 21.03.2017.
 */
public abstract class Factory<T extends Handler> {


    @Autowired
    List<T> handlerList;

    HashMap<String, T> handlerMap = new HashMap<>();


    @PostConstruct
    public void init() {
        for (T handler : handlerList) {
            handlerMap.put(handler.getName(), handler);
        }
    }

    public T getHandler(Request<?> msg) {
        return handlerMap.get(getRouteKey(msg));
    }

    protected abstract String getRouteKey(Request<?> msg);


}
