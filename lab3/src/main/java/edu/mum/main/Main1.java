package edu.mum.main;

import edu.mum.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main1 {


    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "context/applicationContext.xml");
        UserService userService=(UserService) ctx.getBean("userServiceImpl");



    }
}
