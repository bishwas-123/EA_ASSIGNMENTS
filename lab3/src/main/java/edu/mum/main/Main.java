package edu.mum.main;



import edu.mum.domain.User;
import edu.mum.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


  public static void main(String[] args) {
      ApplicationContext ctx = new ClassPathXmlApplicationContext(
              "context/applicationContext.xml");
      UserService userService=(UserService) ctx.getBean("userServiceImpl");
//      (MemberService) ctx.getBean("memberServiceImpl");
java.util.Date date=new java.util.Date();

      User user=new User("Jim","Turner","jim@gmail.com",true,date);
      userService.save(user);

      User user1=userService.findByEmail("jim@gmail.com");
      System.out.println("**************************  User ************************");
      System.out.println(user1.getFirstName()+" "+user1.getLastName());

  }  
  
 }