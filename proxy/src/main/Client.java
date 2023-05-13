package main;


public class Client {

	public static void main(String[] args) {


		Image img = ImageFactory.getImage("Image.image");

		img.setLocation( new Point2D(10,10));
		System.out.println("Image location : " + img.getLocation());

		img.render();

	}

}
