package com.softgroup.common.router.api;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractRouterHandler<T extends Handler> implements RouterHandler {


	@Autowired
	private List<T> handlers;

	private Map<String, T> handlerMap = new HashMap<String, T>();



	@PostConstruct
	public void init() {
		for (T handler : handlers) {
			handlerMap.put(handler.getName(), handler);
		}
	}



	public Response  handle(Request request) {
		return handlerMap.get(getRouteKey(request)).handle(request);
	}

}