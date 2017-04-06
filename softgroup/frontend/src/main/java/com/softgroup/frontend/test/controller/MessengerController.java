package com.softgroup.frontend.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




/**
 * Created by User on 23.03.2017.
 */


@RestController
@RequestMapping(path = "/test")
public class MessengerController {


    @RequestMapping(path = "/message",
            method = RequestMethod.GET)
    public String publicMessage() {
        return "test" ;
    }


}
