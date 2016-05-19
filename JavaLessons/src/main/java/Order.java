import org.apache.log4j.Logger;

/**
 * Created by student on 4/14/2016.
 */

//class which include using log4j
public class Order {

    public static final Logger LOG = Logger.getLogger(Order.class);

    public static void doOrder() {
        LOG.info("Method do Order was called");
        addCard();
        System.out.println("Order is ready");
    }
    public static void addCard() {
        System.out.println("Card is selected");
        LOG.error("Card is invalid");
    }

}
