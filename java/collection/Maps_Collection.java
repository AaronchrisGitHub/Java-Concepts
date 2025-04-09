package collection;

import java.util.HashMap;
import java.util.Map;

public class Maps_Collection {

	private static void map_collection() {

		
		//only allows one key values
		
		Map<Integer, String> mapsMap = new HashMap<Integer, String>();

		mapsMap.put(01, "aaronn");
		mapsMap.put(02, "kewin");
		mapsMap.put(03, "bewinn");
		mapsMap.put(04, "aaronn");

		for (Integer keyInteger : mapsMap.keySet()) {

			System.out.println("only print keys " + keyInteger);
		}

		for (String values : mapsMap.values()) {

			System.out.println("only print keys " + values);
		}

		// to print both

		for (Map.Entry<Integer, String> entryMap : mapsMap.entrySet())

		{
			entryMap.getValue();
			entryMap.getKey();
			
			System.out.println(entryMap);
		}
		
		

	}

	public static void main(String[] args) {

		map_collection();

	}
}
