package task03;

public class Main {

	public static void main(String[] args) {

		double dinoWeingt = 2234.23d;

		double weightInGramms = DinoMassConverter.convertInGramms(dinoWeingt);
		double weightInMilligramms = DinoMassConverter.convertInMilligramms(dinoWeingt);
		double weightInTons = DinoMassConverter.convertInTons(dinoWeingt);

		System.out.printf("Dinosaur weight is %f gramms", weightInGramms);
		System.out.printf("Dinosaur weight is %f milligramms", weightInMilligramms);
		System.out.printf("Dinosaur weight is %f tons", weightInTons);
	}
}
