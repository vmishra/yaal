package on2013_02.on2013_02_03_OpenCup_Onsite.TaskF;

import net.egork.chelper.tester.NewTester;

import org.junit.Assert;
import org.junit.Test;

public class Main {
	@Test
	public void test() throws Exception {
		if (!NewTester.test("lib/test/on2013_02/on2013_02_03_OpenCup_Onsite/TaskF/TaskF.task"))
			Assert.fail();
	}
}
