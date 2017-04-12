package com.softgroup.frontend.configuration;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by Javier on 30.03.2017.
 */


@RestController
@RequestMapping(path = "/test",
        method = RequestMethod.POST,
        consumes = MediaType.TEXT_PLAIN_VALUE,
        produces = MediaType.TEXT_PLAIN_VALUE)
public class TestController {

    @RequestMapping(path = "/message")
    public String publicMessage(@RequestBody final String request) {
        return "test " + request;
    }

}
