package com.webConvertation.controller;

import com.webConvertation.controller.APIHandlerServlet;
import com.webConvertation.managers.LoginManager;
import com.webConvertation.managers.RegistrationManager;
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
        Map<String, String[]> map = request.getParameterMap();
        RegistrationManager registrationManager = new RegistrationManager();
        String[] param = new String [3];
        JSONObject jsonObject = new JSONObject();
        try {
            param = RegistrationManager.registrationController(map);
        }catch(Exception e){
            jsonObject.put("login","error");
            jsonObject.put("password","not_exist");
            jsonObject.put("email", "not_exist");
            return jsonObject;
        }

        jsonObject.put("login", param[0]);
        jsonObject.put("password", param[0]);
        jsonObject.put("email", param[0]);

        return jsonObject;

    }
}