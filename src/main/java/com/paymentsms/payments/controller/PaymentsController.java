package com.paymentsms.payments.controller;
import com.paymentsms.payments.entity.PaymentsEntity;
import com.paymentsms.payments.service.PaymentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000", allowedHeaders = "*")
@RestController
@RequestMapping("/payments")
public class PaymentsController {

    public final PaymentsService paymentsService;

    public PaymentsController(PaymentsService paymentsService) {
        this.paymentsService = paymentsService;
    }


    @GetMapping
    public List<PaymentsEntity> findAllTransactions(){
        return paymentsService.findAllPayments();
    }

    @GetMapping("/{id}")
    public Optional<PaymentsEntity> findTransactionById(@PathVariable("id")Long id){
        return paymentsService.findbyId(id);
    }

    @PostMapping
    public PaymentsEntity savePayments(@RequestBody PaymentsEntity payments){
        return paymentsService.savePayments(payments);
    }

    @PutMapping
    public PaymentsEntity updatePayments(@RequestBody PaymentsEntity payments){
        return paymentsService.updatePayments(payments);
    }

    @DeleteMapping
    public void deleteTransaction(@PathVariable("id") Long id){
       paymentsService.deletePayments(id);
    }
}
