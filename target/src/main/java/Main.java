package in.coderarmy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    public static void main(String[] args) {

       ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
       //is line ka meaning hai ki ek spring container ko start kro using annotation based config.
       // rules batane hoge container ko sare rules batane honge , how to config , kaun kaun se class ko monitor
       // ye rule alag class mein batayenge aur us class ki reflection ko pass krenge applicationcontetx ke paramnte rmein..

        OrderService order = context.getBean(OrderService.class);
        order.placeOrder();



    }
}
