/*
 * Copyright © 2025 Luc Tuan Kiet. All rights reserved.
 * Proprietary and confidential.
 */
package com.kahne.finance.repo;

import com.kahne.finance.entity.DMessage;
import com.kahne.finance.repo.base.BaseRepo;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepo extends BaseRepo<DMessage, String> {
}