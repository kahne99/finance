/*
 * Copyright © 2025 Luc Tuan Kiet. All rights reserved.
 * Proprietary and confidential.
 */
package com.kahne.finance.anotation;

import com.kahne.finance.validator.SizeCollectionValidator;
import jakarta.validation.Constraint;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

// Retain at runtime
@Retention(RetentionPolicy.RUNTIME)
// Where to apply the annotation
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE})
// Just a marker for generate documentation
@Documented
// Declare the class to handle validate
@Constraint(validatedBy = SizeCollectionValidator.class)
public @interface SizeCollection {

	// Message when validate fail
	String message() default "{jakarta.validation.constraints.Size.message}";

	Class<?>[] groups() default {};

	Class<?>[] payload() default {};

	int min() default 0;

	int max() default Integer.MAX_VALUE;
}