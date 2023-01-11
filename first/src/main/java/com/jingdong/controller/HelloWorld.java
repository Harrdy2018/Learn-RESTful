package com.jingdong.controller;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path(value = "/hello")
public class HelloWorld {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String display1(){
        // http://localhost:8080/NoppoService/rest/hello
        System.out.println("enter display1");
        return "HelloWorld get";
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String display2(){
        // http://localhost:8080/NoppoService/rest/hello
        System.out.println("enter display2");
        return "HelloWorld post";
    }
}
