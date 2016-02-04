package com.basak.sample.firstejb;

import java.net.MalformedURLException;

import javax.ejb.EJB;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class CalculatorIntegrationTestCase {
	
	@EJB(mappedName = "java:app/firstejb/CalculatorBeanNoInterfaceView")
	private static CalculatorBeanNoInterfaceView calculatorBean;
	
	@Deployment
	public static JavaArchive createDeployment() throws MalformedURLException {
		final JavaArchive archive = ShrinkWrap.create(JavaArchive.class, "firstejb.jar")
				.addPackage(CalculatorBean.class.getPackage());

		return archive;
	}
	
	/**
	 * Delegate for ensuring that the obtained Calculators are working as
	 * expected
	 */
	private static CalculatorAssertionDelegate assertionDelegate;
	

	@Before
	public void beforeClass() throws Throwable {
		// Create Assertion Delegate
		assertionDelegate = new CalculatorAssertionDelegate();
	}
	
	@Test
	public void testAdditionUsingBusinessReference() throws Throwable {
		// Test
		System.out.println("###");
		assertionDelegate.assertAdditionSucceeds(calculatorBean);
	}
	
}
