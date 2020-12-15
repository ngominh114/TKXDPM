import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import controller.PlaceOrderController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ValidatePhoneNumberTest {
	private PlaceOrderController placeOrderController;
	@BeforeEach
	void setUp() throws Exception {
		placeOrderController = new PlaceOrderController();
	}
	@ParameterizedTest
	@CsvSource({
			"0123456789,true",
			"013,false",
			"1234567890,false",
			"abcxyz1234,false"
	})
	@Test
	public void test(String phone, boolean expect) {
		boolean isValided = placeOrderController.validatePhoneNumber(phone);
		assertEquals(expect,isValided);
		//fail("Not yet implemented");
	}

}
