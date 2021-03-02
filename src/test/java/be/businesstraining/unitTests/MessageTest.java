package be.businesstraining.unitTests;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

import be.businesstraining.domain.Message;

public class MessageTest {

	private Message message = new Message();  // Object Under Test

	@Test
	public void sayHelloTest() {

		// ARRANGE
		// String expected = "Hello World";
		String expected = "Bonjour le monde";

		//ACT
		String actual = message.sayHello();

		//ASSERT
		assertEquals(expected, actual);
	}

}
