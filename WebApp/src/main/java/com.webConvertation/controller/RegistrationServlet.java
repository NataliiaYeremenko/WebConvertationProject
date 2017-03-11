package com.webConvertation.controller;

import com.webConvertation.controller.APIHandlerServlet;
import org.json.simple.JSONStreamAware;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Nataliya on 28.02.2017.
 */
public class RegistrationServlet extends APIHandlerServlet.APIRequestHandler {

    public static final RegistrationServlet instance = new RegistrationServlet();


    public static RegistrationServlet getInstance() {
        return instance;
    }

    private RegistrationServlet() {
    }

    @Override
    protected JSONStreamAware processRequest(HttpServletRequest request) throws Exception {
        System.out.println("work");
        return null;
    }
}