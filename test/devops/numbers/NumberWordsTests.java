package devops.numbers;

import devops.numbers.NumberWordsApplication;
import org.junit.*;

import devops.numbers.NumberWords;

public class NumberWordsTests {
	private NumberWordsApplication numberWords ;
	
	@Before
	public void setup() {
		numberWords = new NumberWordsApplication() ;
	}

	@Test
	public void numberOutOfRangeReturnsError() {
		Assert.assertEquals( "Error", "Number out of range", numberWords.toWords( -1 ) ) ;
	}
	



	@Test

	public void test1() {

	int input = 1;

	String output = numberWords.convert(input);

	Assert.assertEquals("One", output);

	}


	@Test

	public void test20() {

	int input = 20;

	String output = numberWords.convert(input);

	Assert.assertEquals("Twenty", output);

	}


	@Test

	public void test99() {

	int input = 99;

	String output = numberWords.convert(input);

	Assert.assertEquals("Ninety Nine", output);

	}

	@Test

	public void test256() {
	    int input = 256;
	    String output = numberWords.convert(input);
	    Assert.assertEquals("two Hundred Fifty Six", output);
	}


}
