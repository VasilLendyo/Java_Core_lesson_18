package lesson_18_max;

public class Application {

	public static void main(String[] args) {

		MyMap<Integer, String> myMap = new MyMap<>();
		myMap.addObject(93, "Java");
		myMap.addObject(44, "Sun");
		myMap.addObject(74, "Back");
		myMap.printMap();
		myMap.printSetOfKeys();
		myMap.printListOfValues();

		System.out.println();

		myMap.removeObjectByKey(74);
		myMap.printMap();

		System.out.println();

		myMap.removeObjectByValue("Sun");
		myMap.printMap();

	}
}
