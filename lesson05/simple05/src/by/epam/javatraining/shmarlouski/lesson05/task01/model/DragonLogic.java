package by.epam.javatraining.shmarlouski.lesson05.task01.model;

import by.epam.javatraining.shmarlouski.lesson05.task01.model.DragonLogic;

public class DragonLogic {

	private static final int FIRST_PERIOD = 200;
	private static final int SECOND_PERIOD = 300;
	private static final int HEADS_AT_BIRTH = 3;
	private static final int NUMBER_OF_EYES = 2;
	private static int dragonHeads = 0;

	public static int getNumberOfHeads(int dragonYears) {

		if (dragonYears < 0) {
			return 0;
		}

		dragonHeads = HEADS_AT_BIRTH;
		for (int i = 0; i < dragonYears; i++) {
			if (i < FIRST_PERIOD) {
				dragonHeads += 3;
			} else if (i < SECOND_PERIOD) {
				dragonHeads += 2;
			} else {
				dragonHeads += 1;
			}
		}
		return dragonHeads;
	}

	public static int getNumberOfEyes(int dragonYears) {

		int dragonHeads = getNumberOfHeads(dragonYears);

		if (dragonHeads > 0) {
			return dragonHeads * NUMBER_OF_EYES;
		}
		return 0;
	}
}
