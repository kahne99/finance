/*
 * Copyright © 2025 Luc Tuan Kiet. All rights reserved.
 * Proprietary and confidential.
 */
package com.kahne.finance.mapper;

import com.kahne.finance.component.dto.DMessageDTO;
import com.kahne.finance.entity.DMessage;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MessageMapper {
	DMessageDTO toDto(DMessage message);
}