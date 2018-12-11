
import static org.junit.Assert.*;

import org.junit.Test;


public class test4 {
	@org.junit.Test
	public void test4() {

		Tour a = new Tour(21, 2, 1.34,1.6, 1000, 10000, 150);
		assertEquals(a.getResult(),"78880.0");
	}
}
