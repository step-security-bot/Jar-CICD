package com.codingprotocols.jarcicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

@SpringBootApplication
@RestController
public class JarCicdApplication {

    private static final Logger LOG = Logger.getLogger(JarCicdApplication.class.getName());


    @GetMapping(value = "/")
    public String helloWorld() {
        String response = "<H1> Hello World </H1>" + new Date();
        LOG.log(Level.INFO, response);

        return response;
    }

    @GetMapping(value = "/exception")
    public String exception() {
        String response;
        try {
            throw new Exception("Exception has occured....");
        } catch (Exception e) {
            e.printStackTrace();
            LOG.error(e);

            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);
            String stackTrace = sw.toString();
            LOG.error("Exception - " + stackTrace);
            response = stackTrace;
        }

        return response;
    }



    public static void main(String[] args) {
        SpringApplication.run(JarCicdApplication.class, args);
    }



}
