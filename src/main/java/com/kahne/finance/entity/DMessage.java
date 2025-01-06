/*
 * Copyright © 2025 Luc Tuan Kiet. All rights reserved.
 * Proprietary and confidential.
 */
package com.kahne.finance.entity;

import com.kahne.finance.locale.Locale;
import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "d_message")
public class DMessage {

	@Id
	@Column(name = "code")
	private String code;

	@Column(name = "message")
	private String message;

	@Column(name = "locale")
	@Enumerated(EnumType.STRING)
	private Locale locale;
}