/*
 * Copyright © 2025 Luc Tuan Kiet. All rights reserved.
 * Proprietary and confidential.
 */
package com.kahne.finance.component.configuration;

import com.kahne.finance.component.constant.CommonMessage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.i18n.LocaleContextHolder;

import java.util.Arrays;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@Configuration
public class MessageBundleConfig {
	private static final String MESSAGE_BUNDLE = "i18n/messages";

	@Bean
	public Map<CommonMessage, String> commonMessages() {
		var locale = LocaleContextHolder.getLocale();
		var resourceBundle = ResourceBundle.getBundle(MESSAGE_BUNDLE, locale);

		return Arrays.stream(CommonMessage.values()).collect(Collectors.toMap(
				Function.identity(),
				e -> nullSafeGet(resourceBundle, e.getCode())
		));
	}

	private String nullSafeGet(ResourceBundle resourceBundle, String key) {
		Supplier<String> valueMapperDB = () -> {
			// get data from DB
			return "DATA FORM DB";
		};

		try {
			return resourceBundle.getString(key);
		} catch (MissingResourceException ex) {
			return valueMapperDB.get();
		}
	}
}