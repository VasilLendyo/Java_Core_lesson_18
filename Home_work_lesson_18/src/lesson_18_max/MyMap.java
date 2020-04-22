package lesson_18_max;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MyMap<K, V> {

	private Map<K, V> map = new HashMap<>();

	public void addObject(K ob1, V ob2) {
		MyEntry<K, V> myEntry = new MyEntry<>(ob1, ob2);
		map.put(myEntry.getOb1(), myEntry.getOb2());
	}

	public void removeObjectByKey(K ob1) {
		Iterator<Entry<K, V>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<K, V> next = iterator.next();
			if (next.getKey().equals(ob1)) {
				iterator.remove();
			}
		}
	}

	public void removeObjectByValue(V ob2) {
		Iterator<Entry<K, V>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<K, V> next = iterator.next();
			if (next.getValue().equals(ob2)) {
				iterator.remove();
			}
		}
	}

	public void printSetOfKeys() {
		Set<K> keys = new HashSet<>();
		Iterator<Entry<K, V>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<K, V> next = iterator.next();
			keys.add(next.getKey());
		}
		System.out.println("Set of keys: " + keys);
	}

	public void printListOfValues() {
		List<V> values = new ArrayList<>();
		Iterator<Entry<K, V>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<K, V> next = iterator.next();
			values.add(next.getValue());
		}
		System.out.println("List of values: " + values);
	}

	public void printMap() {
		System.out.println("Map: " + map);
	}
}
