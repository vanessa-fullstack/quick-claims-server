package com.allstate.quickclaimsserver.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;
import java.util.Objects;

@Entity
public class QuickClaim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String customerName;
    private String insuranceType;
    private Double amount;
    private String reason;
    private String description;

    public QuickClaim(String customerName, String insuranceType, Double amount, String reason, String description) {
        this.customerName = customerName;
        this.insuranceType = insuranceType;
        this.amount = amount;
        this.reason = reason;
        this.description = description;
    }

    public QuickClaim() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }


    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "QuickClaim{" +
                "customerName='" + customerName + '\'' +
                ", insuranceType='" + insuranceType + '\'' +
                ", amount=" + amount +
                ", reason='" + reason + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuickClaim that = (QuickClaim) o;
        return Objects.equals(customerName, that.customerName) && Objects.equals(insuranceType, that.insuranceType) && Objects.equals(amount, that.amount) && Objects.equals(reason, that.reason) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerName, insuranceType, amount, reason, description);
    }
}