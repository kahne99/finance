/*
 * Copyright © 2025 Luc Tuan Kiet. All rights reserved.
 * Proprietary and confidential.
 */
package com.kahne.finance.component.constant;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

@Getter
@RequiredArgsConstructor
public enum CommonMessage {
	MESSAGE_SUCCESS("M00000", HttpStatus.OK),
	MESSAGE_INTERNAL_ERROR("M99999", HttpStatus.INTERNAL_SERVER_ERROR),
	MESSAGE_INVALID_CREDENTIALS("M00401", HttpStatus.UNAUTHORIZED);

	private final String code;
	private final HttpStatusCode httpStatus;
}