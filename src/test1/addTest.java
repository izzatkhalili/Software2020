package test1;

import static org.junit.Assert.*;
import org.junit.Test;

public class addTest {

	@Test
	public void test() {
		add d=new add();
		int result=d.adds1(3, 5);
		
		assertEquals(8,result);
	}

}
