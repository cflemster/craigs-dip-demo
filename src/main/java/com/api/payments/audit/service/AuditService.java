package com.api.payments.audit.service;

import org.springframework.stereotype.Service;

import com.api.payments.audit.AuditLog;

@Service
public class AuditService {

	public void execute(AuditLog bean) {
            //TODO: Save the audit data to audit repository
	}
}
