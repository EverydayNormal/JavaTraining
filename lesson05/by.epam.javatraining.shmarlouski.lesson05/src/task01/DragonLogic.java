package task01;

public class DragonLogic {

	public static int getNumberOfHeads(int dragonYears) {

		int heads = 3;

		if (dragonYears < 0) {
			Printer.print("The dragon cannot live backward so number of years must be positive.");
			return 0;
		} else if (dragonYears > Integer.MAX_VALUE / 2) {
			Printer.print("There's no way that dragon could live that long.");
			return 0;
		}

		for (int i = 0; i < dragonYears; i++) {
			if (i < 200) {
				heads += 3;
			} else if (i < 300) {
				heads += 2;
			} else {
				heads += 1;
			}
		}
		return heads;
	}

	public static int getNumberOfEyes(int heads) {
		if (heads > 0) {
			return heads * 2;
		}
		return heads;
	}
}
