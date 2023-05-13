public class New implements OrderState {
    @Override
    public double handleCancellation() {
        System.out.println("new order created nothing happens");
        return 0;
    }
}
