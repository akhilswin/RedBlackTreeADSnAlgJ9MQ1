package yaksha;

import static yaksha.TestUtils.businessTestFile;
import static yaksha.TestUtils.currentTest;
import static yaksha.TestUtils.yakshaAssert;
import org.junit.jupiter.api.Test;

public class TestMainClass {

	@Test
	public void testExceptionConditon() throws Exception {

		TestUtils.yakshaAssert(TestUtils.currentTest(), true, TestUtils.boundaryTestFile);
	}

	@Test
	public void testBoundaryCondition() throws Exception {

		TestUtils.yakshaAssert(TestUtils.currentTest(), true, TestUtils.exceptionTestFile);
	}

	@Test
	public void testCountNodes() throws Exception {
		RBTree rbt = new RBTree(Integer.MIN_VALUE);
		rbt.insert(8);
		rbt.insert(5);
		rbt.insert(3);
		rbt.insert(7);
		rbt.insert(10);
		rbt.insert(15);
		rbt.insert(2);
		yakshaAssert(currentTest(), (rbt.countNodes() == 7 ? "true" : "false"), businessTestFile);
	}

	@Test
	public void testSearch() throws Exception {
		RBTree rbt = new RBTree(Integer.MIN_VALUE);
		rbt.insert(8);
		rbt.insert(5);
		rbt.insert(3);
		rbt.insert(7);
		rbt.insert(10);
		rbt.insert(15);
		rbt.insert(2);
		yakshaAssert(currentTest(), (rbt.search(7) == true ? "true" : "false"), businessTestFile);
	}
}