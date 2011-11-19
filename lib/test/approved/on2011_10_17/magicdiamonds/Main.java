package approved.on2011_10_17.magicdiamonds;

import net.egork.chelper.tester.TopCoderTester;
import org.junit.Assert;
import org.junit.Test;

public class Main {
	@Test
	public void test() throws Exception {
		if (!TopCoderTester.test("long minimalTransfer(long n)",
			"approved.on2011_10_17.magicdiamonds.MagicDiamonds",
			"2L;;2L;;true::4294967297L;;1L;;true::2147483647L;;2L;;true::1L;;1L;;true"))
		{
			Assert.fail();
		}
	}
}