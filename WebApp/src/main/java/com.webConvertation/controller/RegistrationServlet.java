package com.webConvertation.controller;

import org.json.simple.JSONObject;
import org.json.simple.JSONStreamAware;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

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