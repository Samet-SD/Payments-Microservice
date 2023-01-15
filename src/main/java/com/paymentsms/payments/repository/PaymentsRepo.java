package com.paymentsms.payments.repository;

import com.paymentsms.payments.entity.PaymentsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentsRepo extends JpaRepository<PaymentsEntity,Long> {
}
