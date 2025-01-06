/*
 Copyright © 2025 Luc Tuan Kiet. All rights reserved.
 Proprietary and confidential.
 */
CREATE TABLE d_message
(
    code       VARCHAR(255) NOT NULL,
    message    VARCHAR(255) NULL,
    message_en VARCHAR(255) NULL,
    CONSTRAINT pk_d_message PRIMARY KEY (code)
);