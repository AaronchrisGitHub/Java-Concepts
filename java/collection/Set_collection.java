package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

import org.checkerframework.common.value.qual.StaticallyExecutable;

import com.google.common.base.MoreObjects.ToStringHelper;

public class Set_collection {

	static char[][] storeString;

	private static char[][] store() {

		Scanner scann = new Scanner(System.in);

		System.out.println("enter start");

		String ss = scann.nextLine();

		System.out.println(ss);

		char[][] array = { { 'a', 'b', 'c' }, { 'd', 'e', 'f', 'a' } };
		return array;

	}

	private static void LinkedHashSet() {

		storeString = store();

		Set<Character> set = new LinkedHashSet<Character>();

		int i = 0;

		for (char c[] : storeString) {

			for (char s : c) {
				set.add(s);

			}

		}

		System.out.println(set);

	}

	private static void Linked_Hash_Set() {

		Set<Float> set = new LinkedHashSet<Float>();

		set.add(1.1F);
		set.add(1.3F);
		set.add(1.1F);
		set.add(0.1F);

		set.remove(1);
		set.size();
		System.out.println(set);

	}

	private static void HashSet(String ss) {

		Set<String> setTreeEs = new HashSet<String>();
		
		setTreeEs.add(ss);
		
		System.out.println(setTreeEs);

	}

	public static void main(String[] args) {

		LinkedHashSet();
		HashSet("abcd");

	}

}
