package opgave3Teater;

public class TheaterFloor {
	int[][] seats = { { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }, { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
			{ 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }, { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
			{ 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 }, { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
			{ 20, 20, 30, 30, 40, 40, 30, 30, 20, 20 }, { 20, 30, 30, 40, 50, 50, 40, 30, 30, 20 },
			{ 30, 40, 50, 50, 50, 50, 50, 50, 40, 30 } };

	/**
	 * Hvis plads seat på række row er ledig reserveres pladsen og prisen på pladsen
	 * returneres. Der returneres 0 hvis pladsen er optaget.
	 *
	 * @param row
	 * @param seat
	 * @return
	 */

	public int buySeat(int row, int seat) {
		int pris = 0;
		if (seats[row][seat] == 0) {
			return pris;
		} else {
			pris = seats[row][seat];
			seats[row][seat] = 0;
			return pris;
		}
	}

	/**
	 * Hvis der er en plads ledig med den pågældende pris, reserveres pladsen og
	 * prisen returneres. Der returneres 0, hvis der ikke er nogen pladser ledige
	 * til den pågældende pris.
	 *

	 * @return
	 */
	public int buySeat(int price) {
		int pris = 0;
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats.length; j++) {
				if (price == seats[i][j]) {
					pris = seats[i][j];
					seats[i][j] = 0;
					return pris;
				}
			}

		}
		return pris;
	}

	public void printTheaterFloor() {
			for (int row = 0; row < seats.length; row++) {
				for (int col = 0; col < seats[row].length; col++) {
					System.out.print(seats[row][col] + "  ");
				}
				System.out.println();
			}
	}
}
