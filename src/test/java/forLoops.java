import org.testng.annotations.Test;

public class forLoops {

	@Test(dependsOnGroups = "enhancedforLoop")
	private void SingleForloop() {

		int number = 12345;

		String s = String.valueOf(number);

		for (int i = 0; i < s.length(); i++) {

			System.out.println(s.charAt(i));
		}
	}

	@Test(groups  = "enhancedforLoop")
	private void enhancedforLoop() {

		char[] ch = { 'a', 'b', 'c', 'd' };

		for (int j = 0; j < ch.length; j++) {

			System.out.println(ch[j]);
		}

	}

}
