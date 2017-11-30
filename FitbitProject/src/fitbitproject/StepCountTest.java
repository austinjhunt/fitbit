package fitbitproject;

import static org.junit.Assert.*;

import java.time.Instant;

import org.junit.*;
import java.time.*;
import java.util.concurrent.TimeUnit;
import java.time.temporal.ChronoUnit;

public class StepCountTest {
	private StepCount as;
	
	@Before
	public void setUp() throws Exception{
		as = new StepCount();
	}
	
	@Test
	public void testSetStepCountValue(){
		as.setStepCountValue(1);
		assertEquals(2, as.getStepCountValue());
		as.setStepCountValue(1);
		assertEquals(3, as.getStepCountValue());
	}
	
	@Test
	public void testReset(){
		as.reset();
		assertEquals(0, as.getStepCountValue());
		as.setStepCountValue(1);
		as.reset();
		assertEquals(0, as.getStepCountValue());
	}
	
	@Test
	public void testCalculateCalories() {
		assertEquals(1.66125, as.calculateCalories(), 0.01);
		as.reset();
		assertEquals(0, as.calculateCalories(), 0.01);
	}
}