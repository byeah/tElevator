package Hello

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

@RunWith(classOf[JUnitRunner])
class helloFunSuite extends FunSuite
{
	test("hello")
	{
		assert(1+1==2)
		assert(add.add(1, 1)==2)
		assert(add.add(1, 2)==3)
	}
}
