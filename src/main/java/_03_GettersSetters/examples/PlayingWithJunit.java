package _03_GettersSetters.examples;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PlayingWithJunit {

	@Test
	void testName() throws Exception {
		assertEquals(4, examples.Calculator.add(2,2));
	}
}
