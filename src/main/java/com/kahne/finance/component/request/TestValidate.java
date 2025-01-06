/*
 * Copyright © 2025 Luc Tuan Kiet. All rights reserved.
 * Proprietary and confidential.
 */
package com.kahne.finance.component.request;

import com.kahne.finance.anotation.SizeCollection;
import jakarta.validation.Valid;
import lombok.Data;

import java.util.List;

@Data
public class TestValidate {

	@Valid
	@SizeCollection(min = 1, max = 3)
	private List<String> name;
}