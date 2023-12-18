//import jakarta.enterprise.context.RequestScoped;
//import jakarta.faces.bean.ManagedBean;
//import jakarta.faces.bean.SessionScoped;
//
//import java.io.Serializable;
//
//@ManagedBean(name="helloBean")
//@RequestScoped

import java.io.Serializable;

public class HelloBean implements Serializable {

    private String userName = "no name";
    public HelloBean() {
        // Initialize any default values or perform setup if needed
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGreeting() {
        return "Hello, " + userName + "!";
    }
}


//
//public class HelloBean {
//
//    public String message = "Hello, JSF!";
//
//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }
//}



//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.SessionScoped;
//
//import java.io.Serializable;
//
//@ManagedBean(name="helloBean")
//@SessionScoped
//public class HelloBean {
//    private static final long serialVersion= 1L;
//    private String name;
//    public String getName(){
//        return name;
//    }
//    public void setName(String name){
//        this.name = name;
//    }
//    public String getSayWelcome(){
//        if("".equals(name)||name==null){
//            return "";
//        }
//        else{
//            return "Ajax message: Welcome " + name;
//        }
//    }
//}
//

