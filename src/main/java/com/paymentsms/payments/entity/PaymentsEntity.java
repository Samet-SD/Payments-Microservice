package com.paymentsms.payments.entity;
import jakarta.persistence.*;

import java.sql.Date;
import java.text.DateFormat;
import java.time.LocalDateTime;
@Entity
@Table(name="Payments")
public class PaymentsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Payments_id")
    private Long id;

    @Column(name="Payment_Type")
    private String PaymentType;

    @Column(name="date")
    private Date Date;

    @Column(name="No_Transactions")
    private Integer No_Transactions;

    @Column(name="PaymentAmount")
    private Double PaymentAmount;

    @Column(name="Currency")
    private String Currency;

    @Column(name="status")
    private Boolean Status;

    public PaymentsEntity() {
    }


    public PaymentsEntity(Long id, String paymentType, java.sql.Date date, Integer no_Transactions, Double paymentAmount, String currency, Boolean status) {
        this.id = id;
        PaymentType = paymentType;
        Date = date;
        No_Transactions = no_Transactions;
        PaymentAmount = paymentAmount;
        Currency = currency;
        Status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPaymentType() {
        return PaymentType;
    }

    public void setPaymentType(String paymentType) {
        PaymentType = paymentType;
    }

    public java.sql.Date getDate() {
        return Date;
    }

    public void setDate(java.sql.Date date) {
        Date = date;
    }

    public Integer getNo_Transactions() {
        return No_Transactions;
    }

    public void setNo_Transactions(Integer no_Transactions) {
        No_Transactions = no_Transactions;
    }

    public Double getPaymentAmount() {
        return PaymentAmount;
    }

    public void setPaymentAmount(Double paymentAmount) {
        PaymentAmount = paymentAmount;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }

    public Boolean getStatus() {
        return Status;
    }

    public void setStatus(Boolean status) {
        Status = status;
    }
}
