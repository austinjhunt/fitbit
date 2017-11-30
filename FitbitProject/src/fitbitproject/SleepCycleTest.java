package fitbitproject;

import static org.junit.Assert.*;

import java.time.Instant;

import org.junit.*;
import java.time.*;
import java.util.concurrent.TimeUnit;
import java.time.temporal.ChronoUnit;

public class SleepCycleTest {
	private SleepCycle as;
	
	@Before
	public void setUp() throws Exception{
		as = new SleepCycle();
	}
	
	@Test
	public void testStartSleepCycle(){
		Instant instant = Instant.now();
		as.startSleepCycle();
		assertEquals(instant, as.getStartTime());
		as.startSleepCycle();
		assertEquals(instant, as.getStartTime());
	}
	
	@Test
	public void testEndSleepCycle(){
		Instant instant = Instant.now();
		as.endSleepCycle();
		assertEquals(instant, as.getEndTime());
		as.startSleepCycle();
		assertEquals(instant, as.getEndTime());
	}
	
	@Test
	public void testCalculateSleepDuration() {
		as.startSleepCycle();
		as.endSleepCycle();
		assertEquals("0:0:0", as.calculateSleepDuration(), 0.01);
		as.startSleepCycle();
		as.endSleepCycle();
		assertEquals("0:0:0", as.calculateSleepDuration(), 0.01);
	}
	public static void main(String[] args){
		SleepCycleTest st = new SleepCycleTest();
		st.testStartSleepCycle();
	}
}