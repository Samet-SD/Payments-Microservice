package com.paymentsms.payments.service.impl;

import com.paymentsms.payments.entity.PaymentsEntity;
import com.paymentsms.payments.repository.PaymentsRepo;
import com.paymentsms.payments.service.PaymentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class PaymentsServiceImpl implements PaymentsService {

    private final PaymentsRepo paymentsRepo;

    public PaymentsServiceImpl(PaymentsRepo paymentsRepo) {
        this.paymentsRepo = paymentsRepo;
    }


    public List<PaymentsEntity> findAllPayments() {
        return paymentsRepo.findAll();
    }

    public Optional<PaymentsEntity> findbyId(Long id) {
        return paymentsRepo.findById(id);
    }

    public PaymentsEntity savePayments(PaymentsEntity payments) {
        return paymentsRepo.save(payments);
    }

    public PaymentsEntity updatePayments(PaymentsEntity payments) {
                return paymentsRepo.save(payments);

    }

    public void deletePayments(Long id) {
    paymentsRepo.deleteAllById(Collections.singleton(id));
    }

}
