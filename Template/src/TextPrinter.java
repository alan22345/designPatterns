import java.util.Map;

//Concrete implementation. Implements steps needed..
//..by template method
public class TextPrinter extends OrderPrinter {
    @Override
    protected String start() {
        return "order details";
    }

    @Override
    protected String formatOrderNumber(Order order) {
        return "poop";
    }

    @Override
    protected String formatItems(Order order) {
        return "poop 2";
    }

    @Override
    protected String formatTotal(Order order) {
        return "poops";
    }

    @Override
    protected String end(Order order) {
        return "last poo";
    }
}
