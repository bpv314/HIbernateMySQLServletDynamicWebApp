
package com.belen.registration.bean;

import org.junit.Assert;
import org.junit.Test;


public class MainTest {
	
	@Test
	public void testMember(){
		Member member=new Member();
		member.setCity("Mandaluyong");
		Assert.assertEquals("Mandaluyong", member.getCity());
	}

}
