package hash1;

import static org.junit.Assert.*;

import org.junit.Test;

public class stringhashingTest {
    stringhashing count = new stringhashing();
	@Test
	public void test() {
		count.tableInput();
		count.counter();
		count.print();
		
	}

}
