package com.softgroup.frontend.test.controller;
import com.softgroup.common.datamapper.DataMapper;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.Handler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;



/**
 * Created by User on 23.03.2017.
 */


@RestController
/*@RequestMapping(path = "/messenger")*/
@RequestMapping(path = "/test"/*,
        method = RequestMethod.POST,
        consumes = MediaType.TEXT_PLAIN_VALUE,
        produces = MediaType.TEXT_PLAIN_VALUE*/)
public class MessengerController {

/*
    @Autowired
    Handler firstRouterHandler;

    @Autowired
    DataMapper jacksonDataMapper;*/

   /* @RequestMapping(path = "/registration",
            method = RequestMethod.POST)
    public Response publicMessage(@RequestBody final String requestStr) {
        CommonRequest request = jacksonDataMapper.mapData(requestStr.getBytes(StandardCharsets.UTF_8),CommonRequest.class);
        return firstRouterHandler.handle(request);
    }*/

    @RequestMapping(path = "/message",
            method = RequestMethod.GET)
    public String publicMessage() {
        return "test" ;
    }


}
