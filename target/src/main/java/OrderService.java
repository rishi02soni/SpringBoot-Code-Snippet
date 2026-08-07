//package in.coderarmy;
//
//public class OrderService {
//
//    private PaymentService paymentService;
//
//    //order place hone se pehle payment ho to..
//
////    private PaymentService paymentService; aise method call ni hoga qki no object
////      private PaymentService paymentService = new PaymentService();
//    // but this won't work as dependenices should be provided from outside
//    //will use constructor
//
//    public OrderService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }
//
//    public void placeOrder(){
//
//        paymentService.pay(); //method call
//        System.out.println("Order Placed");
//    }
//}
package in.coderarmy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    private final PaymentService paymentService;

    // Constructor Injection
    @Autowired
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        paymentService.pay();
        System.out.println("Order Placed");
    }
}
