package fitbitproject;

import static org.junit.Assert.*;

import java.time.Instant;

import org.junit.*;
import java.time.*;
import java.util.concurrent.TimeUnit;
import java.time.temporal.ChronoUnit;

public class UserDescriptionTest {
	private UserDescription as;
	
	@Before
	public void setUp() throws Exception{
		as = new UserDescription();
	}
	
	@Test
	public void testCalculateCalorieConversionFactor(){
		as.calculateCalorieConversionFactor();
		assertEquals(1.66125, as.getCalorieConversionFactor(), 0.00000000001);
		as.setWeight(50);
		assertEquals(1.41125, as.getCalorieConversionFactor(), 0.00000000001);
	}
}
