package lesson_18_min;

import java.util.ArrayList;
import java.util.List;

public class Main {

	static List<Integer> mylist = new ArrayList<>();

	public static void main(String[] args) {

//		List<Integer> il = new ArrayList<>();
//		Gen gen = new Gen(il);
//		gen.getList().add(123);
//		gen.getList().add("Java");
//		il.add(Integer.parseInt("10"));
//		System.out.println(il);

		addToList(mylist);
		System.out.println(mylist);
	}

	public static <T> void addToList(List<T> list) {
		list.add((T) (Integer) 123);
		list.add((T) "Java");
	}
}
