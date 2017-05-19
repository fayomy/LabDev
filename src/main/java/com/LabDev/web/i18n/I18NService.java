package com.LabDev.web.i18n;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

@Service
public class I18NService {
private static final org.slf4j.Logger LOG=org.slf4j.LoggerFactory.getLogger(I18NService.class);
	@Autowired
	private MessageSource messageSource;

	public String getMessage(String messageId) {
		Locale locale = LocaleContextHolder.getLocale();
		LOG.info("The Selected Message ID is {}",messageId);
		return getMessage(messageId, locale);
	}

	public String getMessage(String messageId, Locale locale) {
		return messageSource.getMessage(messageId, null, locale);
	}

}
