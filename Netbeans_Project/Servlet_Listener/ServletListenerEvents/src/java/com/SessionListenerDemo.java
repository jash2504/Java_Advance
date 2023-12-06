/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextAttributeListener;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.http.HttpSessionAttributeListener;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

/**
 *
 * @author Administrator
 */
public class SessionListenerDemo implements HttpSessionListener{
    
    public static int count;
    
    ServletContext context=null;
    
    public void sessionCreated(HttpSessionEvent se) {
        count++;
        context=se.getSession().getServletContext();
        context.setAttribute("sessionCount", count);
        System.out.println("=====Session Object Created============================");
    }

    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("=====Session Object Created============================"); 
        count--;
    }
}
