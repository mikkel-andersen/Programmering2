package opgave3Teater;

public class TheaterFloorApp {

	public static void main(String[] args) {
		TheaterFloor theater = new TheaterFloor();
		theater.printTheaterFloor();

		theater.buySeat(50);

		theater.printTheaterFloor();
	}
}
