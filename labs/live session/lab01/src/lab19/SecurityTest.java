/**
 * 
 */
package lab19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */
class SecurityTest {

	Security s;
	String userId;
	String password;
	boolean actual;
	boolean expected;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		s = new Security();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		s = null;
	}

	@Test
	public void testLogonEmptyUserId() {
		userId = "";
		password = "Freddy99";
		actual = s.logon(userId, password);
		expected = false;

		assertEquals(expected, actual);
		// assertFalse(actual); // can also use this assert
	}

	@Test
	public void testPasswordIsNotNull() {
		userId = "Freddy99";
		password = "";
		actual = s.logon(userId, password);
		expected = false;

		assertEquals(expected, actual);
		// assertFalse(actual); // can also use this assert
	}

	@Test
	public void testValidatePasswordMustHaveUpperCase() {
		userId = "Freddy99";
		password = "helloworld9";
		actual = s.logon(userId, password);
		expected = false;

		assertEquals(expected, actual);
		// assertFalse(actual); // can also use this assert
	}

	@Test
	public void testValidatePasswordMustBeLongEnough() {
		userId = "Freddy99";
		password = "Hello9";
		actual = s.logon(userId, password);
		expected = false;

		assertEquals(expected, actual);
		// assertFalse(actual); // can also use this assert
	}

	@Test
	public void testValidatePasswordMustHaveNumber() {
		userId = "Freddy99";
		password = "HelloWorld";
		actual = s.logon(userId, password);
		expected = false;

		assertEquals(expected, actual);
		// assertFalse(actual); // can also use this assert
	}

	@Test
	public void testLoginWorking() {
		userId = "Freddy99";
		password = "HelloWorld9";
		actual = s.logon(userId, password);
		expected = true;

		assertEquals(expected, actual);
		// assertFalse(actual); // can also use this assert
	}
}
