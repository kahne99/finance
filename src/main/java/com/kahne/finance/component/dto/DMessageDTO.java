/*
 * Copyright © 2025 Luc Tuan Kiet. All rights reserved.
 * Proprietary and confidential.
 */
package com.kahne.finance.component.dto;

import com.kahne.finance.locale.Locale;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DMessageDTO {
	private String code;

	private String message;

	private Locale locale;
}