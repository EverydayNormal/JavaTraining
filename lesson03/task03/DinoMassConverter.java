package task03;

public class DinoMassConverter {

	public static double convertInMilligramms(double weight) {
		return weight / 1000;
	}

	public static double convertInGramms(double weight) {
		return weight * 1000;
	}

	public static double convertInTons(double weight) {
		return weight * 1000_000;
	}
}
