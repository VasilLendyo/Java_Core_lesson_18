package lesson_18_min;

import java.util.ArrayList;
import java.util.List;

public class Gen<T> {

	List<T> list = new ArrayList<T>();

	public Gen(List<T> list) {
		super();
		this.list = list;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
}