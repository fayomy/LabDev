package com.LabDev;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.LabDev.web.i18n.I18NService;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LabDevApplicationTests {
	@Autowired
	private I18NService i18NService;

	@Test
	public void testLocalMessageService() {
		String messageId="index.main.callout";
		String expectedContent="index.main.callout";
		String actualValue=i18NService.getMessage(messageId);
		Assert.assertEquals(expectedContent, actualValue);
		
	}

}
