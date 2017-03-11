package com.webConvertation.controller;

import com.webConvertation.managers.LoginManager;
import org.json.simple.JSONObject;
import org.json.simple.JSONStreamAware;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by Nataliya on 28.02.2017.
 */
public class LoginServlet extends APIHandlerServlet.APIRequestHandler {

    public static final LoginServlet instance = new LoginServlet();


    public static LoginServlet getInstance() {
        return instance;
    }

    private LoginServlet() {
    }

    @Override
    protected JSONStreamAware processRequest(HttpServletRequest request) {
        Map<String, String[]> map = request.getParameterMap();
        LoginManager loginManager = new LoginManager();
        String[] param = new String [2];
        JSONObject jsonObject = new JSONObject();
        try {
            param = loginManager.loginController(map);
        }catch(Exception e){
            jsonObject.put("login","error");
            jsonObject.put("password","not_exist");
            return jsonObject;
        }

        jsonObject.put("login", param[0]);
        jsonObject.put("password", param[0]);
        return jsonObject;
    }
}
