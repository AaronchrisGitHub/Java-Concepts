package collection;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import bsh.This;

public class List_collection {

	public static String g_values[];

	public static String[] inputs() {
		String values[] = { "Apple", "Banana", "Cherry", "orange", "jackfruit" };
		return values;

	}

	private static void ARRAY_List() {

		g_values = inputs();

		Boolean bool = false;

		List<String> list = new ArrayList<String>();

		for (String storeString : g_values) {

			if (storeString.contains("orange")) {

				bool = true;
			}
			list.add(storeString);

		}

		list.add(0, "watermelon");

		System.out.println(list + "bool value is" + bool);

	}

	private void Linked_List() {

		LinkedList<String> lists = new LinkedList<String>();

		lists.add("Apple");
		lists.add("Banana");
		lists.add("Cherry");

		lists.addFirst(null);
		lists.addLast(null);
		lists.addFirst(null);
		lists.peek();
		lists.poll();
		lists.peek();
		lists.getFirst();
		lists.getLast();
		lists.removeFirst();

	}

	public static void main(String[] args) {

		ARRAY_List();
	}

}
