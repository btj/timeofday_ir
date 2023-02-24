package timeofday_ir;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeOfDayTest {

	@Test
	void test() {
		TimeOfDay ogpStart = new TimeOfDay(16, 05);
		assertEquals(16, ogpStart.getHours());
		assertEquals(05, ogpStart.getMinutes());
		
		ogpStart.setHours(8);
		assertEquals(8, ogpStart.getHours());
		assertEquals(05, ogpStart.getMinutes());

		ogpStart.setMinutes(0);
		assertEquals(8, ogpStart.getHours());
		assertEquals(0, ogpStart.getMinutes());
	}

}
