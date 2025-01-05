/*
 * Copyright © 2025 Luc Tuan Kiet. All rights reserved.
 * Proprietary and confidential.
 */
package com.kahne.finance.exception;

import com.kahne.finance.component.constant.CommonMessage;
import com.kahne.finance.component.response.GenericResponse;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@Log4j2
@RestControllerAdvice
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class RestExceptionHandler {

	final private Map<CommonMessage, String> commonMessages;

	@ExceptionHandler(RuntimeException.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public GenericResponse<Object> handleRuntimeErrorException(RuntimeException runtimeException) {
		log.error("Internal server error", runtimeException);

		CommonMessage error = CommonMessage.MESSAGE_INTERNAL_ERROR;
		return GenericResponse.builder()
				.code(error.getCode())
				.message(commonMessages.get(error))
				.build();
	}
}