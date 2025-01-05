/*
 * Copyright © 2025 Luc Tuan Kiet. All rights reserved.
 * Proprietary and confidential.
 */
package com.kahne.finance.constant;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

@Getter
@RequiredArgsConstructor
public enum CommonMessage {
	MESSAGE_SUCCESS("M0000", HttpStatus.OK),
	MESSAGE_INVALID_CREDENTIALS("M00401", HttpStatus.UNAUTHORIZED),
	MESSAGE_INVALID_AUTHORIZATION("M0403", HttpStatus.FORBIDDEN),
	MESSAGE_CREDENTIALS_EXPIRED("M0404", HttpStatus.UNAUTHORIZED),
	MESSAGE_INTERNAL_ERROR("M9999", HttpStatus.INTERNAL_SERVER_ERROR);

	private final String code;
	private final HttpStatusCode httpStatus;
}