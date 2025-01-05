/*
 * Copyright © 2025 Luc Tuan Kiet. All rights reserved.
 * Proprietary and confidential.
 */
package com.kahne.finance.component.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.With;

import java.time.Instant;

@Builder
@With
@JsonInclude(JsonInclude.Include.NON_NULL)
public record GenericResponse<T>(
		String code,
		String message,
		Instant timeStamp,
		T data
) {
}