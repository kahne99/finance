/*
 * Copyright © 2025 Luc Tuan Kiet. All rights reserved.
 * Proprietary and confidential.
 */
package com.kahne.finance.validator;

import com.kahne.finance.anotation.SizeCollection;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.util.CollectionUtils;

import java.util.Collection;

public class SizeCollectionValidator implements ConstraintValidator<SizeCollection, Collection<?>> {
	private int minSize;
	private int maxSize;

	@Override
	public void initialize(SizeCollection annotation) {
		this.minSize = annotation.min();
		this.maxSize = annotation.max();
	}

	@Override
	public boolean isValid(Collection<?> collection, ConstraintValidatorContext context) {
		if (CollectionUtils.isEmpty(collection)) return false;

		int size = collection.size();
		return size >= minSize && size <= maxSize;
	}
}