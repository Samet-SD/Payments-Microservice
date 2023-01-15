package com.paymentsms.payments.service;

import com.paymentsms.payments.entity.PaymentsEntity;


import java.util.List;
import java.util.Optional;

public interface PaymentsService {
    List<PaymentsEntity> findAllPayments();
    Optional<PaymentsEntity> findbyId (Long id);
    PaymentsEntity savePayments(PaymentsEntity payments);
    PaymentsEntity updatePayments(PaymentsEntity payments);
    void deletePayments(Long id);

}
