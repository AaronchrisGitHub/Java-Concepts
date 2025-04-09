package loops;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class forLoops {

	@Test(dependsOnGroups = "SingleForloop")
	private void SingleForloop() {

		int number = 12345;

		// 0,1,2,3,

		String s = String.valueOf(number);

		for (int i = 0; i < s.length(); i++) {

			System.out.println(s.charAt(i));
		}
	}

	@Test(groups = "enhancedforLoop")
	private void enhancedforLoop() {

		// collections or arrays

		List list = new ArrayList();

		list.add(1);
		list.add(2);
		list.add(3);

		char[] ch = { 'a', 'b', 'c', 'd' };

		for (int j = 1; j < ch.length; j++) {

			System.out.println(ch[j]);
		}

	}

	@Test
	void LabeledForLoop() {

		// also nested forloop

		int count = 0;

		brk: for (int i = 0; i < 10; i++) {

			for (int j = 0; j < i + 1; j++) {

				count++;

				if (i == 1 && j == 1) {
					System.out.println("now the i value is" + i + "j value is " + j);
				}

				System.out.println("count value is " + count);

				break brk;

			}
		}

	}

	@Test
	void infiniteForLoop() {

		for (;;) {

			System.out.println("print inifinte");
		}

	}

}
