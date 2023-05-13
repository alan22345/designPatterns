public class Paid implements OrderState{
    @Override
    public double handleCancellation() {
        System.out.println("Been paid");
        return 10;
    }
}
