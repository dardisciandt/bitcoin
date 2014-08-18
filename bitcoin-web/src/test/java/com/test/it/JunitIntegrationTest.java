package com.test.it;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.business.MyBusinessBean;
import com.mock.MockDao;
import com.mock.MockMainframe;
import com.test.IntegrationTest;

@Category(IntegrationTest.class)
public class JunitIntegrationTest {

	@Test
	public void testBusinessMethod() {
		MyBusinessBean bean = new MyBusinessBean();

		// comente a injeção para virar teste integrado
		bean.setDao(new MockDao());
		bean.setMainframe(new MockMainframe());

		bean.businessMethod();

		assertTrue(true);
		// fail();
	}

	@Test
	public void testBusinessOperation() {
		MyBusinessBean bean = new MyBusinessBean();

		// comente a inje��o para virar teste integrado
		bean.setDao(new MockDao());
		bean.setMainframe(new MockMainframe());

		bean.businessOperation(1);
		bean.businessOperation(2);
		bean.businessOperation(3);
		bean.businessOperation(4);
		bean.businessOperation(5);
		bean.businessOperation(6);
		bean.businessOperation(7);
		bean.businessOperation(8);
		bean.businessOperation(9);
		bean.businessOperation(10);

		assertTrue(true);
		// fail();
	}

	// @Test(expected = RuntimeException.class)
	// public void testRealDao() {
	// RealDao dao = new RealDao();
	//
	// dao.loadCustomers();
	//
	// assertTrue(true);
	// // fail();
	// }
	//
	// @Test(expected = RuntimeException.class)
	// public void testMainframe() {
	// RealMainframe m = new RealMainframe();
	//
	// m.sendMessage("testing");
	//
	// assertTrue(true);
	// // fail();
	// }
	//
	// @Test
	// public void testServiceLocator() {
	// ServiceLocator s = new ServiceLocator();
	//
	// assertNotNull(ServiceLocator.getDaoInstance());
	// assertNotNull(ServiceLocator.getMainframeInstance());
	// }
}
