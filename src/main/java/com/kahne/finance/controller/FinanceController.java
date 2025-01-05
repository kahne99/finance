/*
 * Copyright © 2025 Luc Tuan Kiet. All rights reserved.
 * Proprietary and confidential.
 */
package com.kahne.finance.controller;

import com.kahne.finance.constant.CommonMessage;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class FinanceController {
	final Map<CommonMessage, String> commonMessages;

	@GetMapping("/hello")
	public String hello() {
		commonMessages.forEach((key, value) -> System.out.println(key + " : " + value));
		return "Hello, World!";
	}
}