package loopsConcept;

import org.testng.annotations.Test;

public class forLoops {

	private String value = "ABCDE";
	private byte num = 123;

	// for each concept
	@Test(description = "forEach")
	private void foreach() {

		// separating the string into character array
		for (char print : value.toCharArray()) {

			System.out.println("print each word: " + print);
		}

		// separating the byte into character array
		String number = Integer.toString(num);
		// we cant simply iterate integer values , we need to convert as string
		for (char numbers : number.toCharArray()) {

			System.out.println("printing the word : " + numbers);

			

		}
		String chnagetoString = String.valueOf(num);
		StringBuffer buff = new StringBuffer(chnagetoString);

		System.out.println("reversing the value " + buff.reverse());
	}

	@Test
	private void nestedforLoops() {

	}

}
