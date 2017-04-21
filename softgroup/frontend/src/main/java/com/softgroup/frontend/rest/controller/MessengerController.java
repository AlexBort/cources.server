package com.softgroup.frontend.rest.controller;
import com.softgroup.common.datamapper.DataMapper;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.Handler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by User on 23.03.2017.
 */


@RestController
@RequestMapping(path = "/rest")
public class MessengerController {


    @RequestMapping(path = "/message",
            method = RequestMethod.GET)
    public String publicMessage() {
        return "rest" ;
    }


}
