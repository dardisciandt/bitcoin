package com.test.ut;

import static org.easymock.EasyMock.expectLastCall;
import static org.junit.Assert.assertTrue;
import static org.powermock.api.easymock.PowerMock.mockStatic;
import static org.powermock.api.easymock.PowerMock.replay;
import static org.powermock.api.easymock.PowerMock.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.business.MyBusinessBeanStatic;
import com.util.JmsService;

@RunWith(PowerMockRunner.class)
@PrepareForTest(JmsService.class)
public class JunitStaticTest {

//	@Test
//	public void testBusinessMethod() {
//		MyBusinessBeanStatic bean = new MyBusinessBeanStatic();
//
//		bean.businessMethod();
//
//		assertTrue(true);
//	}

	@Test
	public void testBusinessMethod2() {
		MyBusinessBeanStatic bean = new MyBusinessBeanStatic();

		mockStatic(JmsService.class);

		JmsService.enviarMensagem("msg");
		expectLastCall().once();
		
		replay(JmsService.class);
		
		bean.businessMethod();
		
		verify(JmsService.class);

		assertTrue(true);
	}

}
