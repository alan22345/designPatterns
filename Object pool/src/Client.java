
public class Client {


    public static final ObjectPool<Bitmap> bitmapPool = new ObjectPool<>(()-> new Bitmap("Logo.bmp"),5);

    public static void main(String[] args) {
        Bitmap b1 = bitmapPool.get();
        b1.setLocation(new Point2D(10,10));
        Bitmap b2 = bitmapPool.get();
        b2.setLocation(new Point2D(11,11));
        Bitmap b3 = bitmapPool.get();
        b3.setLocation(new Point2D(13,13));
        Bitmap b4 = bitmapPool.get();
        b4.setLocation(new Point2D(14,14));
        Bitmap b5 = bitmapPool.get();
        b5.setLocation(new Point2D(15,15));


        b1.draw();
        b2.draw();
        b3.draw();
        b4.draw();
        b5.draw();

        bitmapPool.release(b1);
        bitmapPool.release(b2);

    }
}
