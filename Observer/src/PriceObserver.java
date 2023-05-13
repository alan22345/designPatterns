//Concrete observer
public class PriceObserver implements OrderObserver {
    @Override
    public void updated(Order order) {
        double total = order.getItemCost();
        if(total >= 200){
            //discount
            order.setDiscount(20);
        } else if (total >=100) {
            order.setDiscount(10);
        }
    }
}
