package com.prachi.wa;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App
{
    public static void main( String[] args ) throws LifecycleException {

        System.out.println( "Hello World!");
        Tomcat tomcat = new Tomcat();


        Context context = tomcat.addContext("", null);
        Tomcat.addServlet(context, "HelloServlet", new HelloServlet());
        context.addServletMappingDecoded("/hello", "HelloServlet");

//
//        Context context2 = tomcat.addContext("/base", null);
//        Tomcat.addServlet(context2, "h2", new HelloServlet());
//        context2.addServletMappingDecoded("/bye", "h2");

        tomcat.start();
        tomcat.getServer().await();


    }
}
