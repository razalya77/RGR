
import static org.junit.Assert.*;

import org.junit.Test;


public class test3 {
	@org.junit.Test
	public void test3() {

		Tour a = new Tour(7, 5, 1.28,1.4, 1000, 5000, 100);
		assertEquals(a.getResult(),"71900.0");
	}
}
