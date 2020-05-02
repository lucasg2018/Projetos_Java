package service;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

	List<T> list = new ArrayList<>();

	public void addValue(T value) {
		list.add(value);
	}

	public Object first() {
		if (list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}

		return list.get(0);
	}

	public void print() {
		System.out.print("[");
		if (!list.isEmpty()) {
			

			for (T l : list) {
				System.out.print(l + " ");
			}
		}
		System.out.print("]");
	}
}
