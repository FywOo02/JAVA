package com.cho.controller;

import com.cho.utils.Constants;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author: Cho
 * @Date: 2022/04/23/18:56
 * @Description:
 * Used to centrally handle method calls
 * Processing of return values
 * And the default page corresponding method
 */
public class BaseServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1. receive request identifier
        String methodStr = req.getParameter(Constants.TAG);
        // 2. if method without value, the page go to homepage
        if(methodStr == null && methodStr.equals("")){
            methodStr = Constants.INDEX;
        }
        // 3. get class object
        Class aClass = this.getClass();
        try {
            Method method = aClass.getMethod(methodStr, HttpServletRequest.class, HttpServletResponse.class);

            Object result = method.invoke(this,req,resp);

            //4. Centralized processing of return value responses
            if(result != null){
                String str = (String) result;
                String substring = str.substring(str.indexOf(Constants.FLAG) + 1);
                if (str.startsWith(Constants.FORWARD)){
                    String path = substring;
                    req.getRequestDispatcher(path).forward(req,resp);
                }else if(str.startsWith(Constants.REDIRECT)){
                    String path = substring;
                    resp.sendRedirect(path);
                }else{
                    resp.getWriter().println(str);
                }
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * when method is null or "", we default to
     * @param req
     * @param resp
     * @return
     * @throws IOException
     */
    public String index(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        return Constants.FORWARD+"/index.jsp";
    }
}
