import java.util.Collection;
import java.util.Iterator;

//Concrete strategy
public class SummaryPrinter implements OrderPrinter{

    @Override
    public void print(Collection<Order> orders) {
        System.out.println("printing stuff");
        Iterator<Order> iterator = orders.iterator();
        for (int i = 1; iterator.hasNext(); i++) {
            Order order  = iterator.next();
            System.out.println(i + ". " + order.getId() + "  " + order.getDate());
        }
    }
}
