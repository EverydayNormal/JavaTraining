package lesson03.task03;

import static lesson03.task01.Printer.print;

public class Main {

	public static void main(String[] args) {

		double dinoWeingt = 2234.23d;

		double weightInGramms = DinoMassConverter.convertInGramms(dinoWeingt);
		double weightInMilligramms = DinoMassConverter.convertInMilligramms(dinoWeingt);
		double weightInTons = DinoMassConverter.convertInTons(dinoWeingt);

		print("Dinosaur weight is " + weightInGramms + " gramms");
		print("Dinosaur weight is " + weightInMilligramms + " milligramms");
		print("Dinosaur weight is " + weightInTons + " tons");
	}
}
