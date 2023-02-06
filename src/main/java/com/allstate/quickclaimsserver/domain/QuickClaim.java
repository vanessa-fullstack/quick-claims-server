package com.allstate.quickclaimsserver.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
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
    private String status;
    private LocalDate date;
    private String policyNumber;
    private String address;
    private String makeOfVehicle;
    private String modelOfVehicle;
    private String yearOfManufacture;
    private String animal;
    private String breed;


    public QuickClaim(Integer id, String customerName, String insuranceType, Double amount, String reason, String description, String status, LocalDate date, String policyNumber, String address, String makeOfVehicle, String modelOfVehicle, String yearOfManufacture, String animal, String breed) {
        this.id = id;
        this.customerName = customerName;
        this.insuranceType = insuranceType;
        this.amount = amount;
        this.reason = reason;
        this.description = description;
        this.status = status;
        this.date = date;
        this.policyNumber = policyNumber;
        this.address = address;
        this.makeOfVehicle = makeOfVehicle;
        this.modelOfVehicle = modelOfVehicle;
        this.yearOfManufacture = yearOfManufacture;
        this.animal = animal;
        this.breed = breed;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) { this.address = address; }

    public String getMakeOfVehicle() {
        return makeOfVehicle;
    }

    public void setMakeOfVehicle(String makeOfVehicle) { this.address = makeOfVehicle; }

    public String getModelOfVehicle() {
        return modelOfVehicle;
    }

    public void setModelOfVehicle(String modelOfVehicle) {
        this.modelOfVehicle = modelOfVehicle;
    }

    public String getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(String yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "QuickClaim{" +
                "id=" + id +
                "customerName='" + customerName + '\'' +
                ", insuranceType='" + insuranceType + '\'' +
                ", amount=" + amount +
                ", reason='" + reason + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", date='" + date + '\'' +
                ", policyNumber='" + policyNumber + '\'' +
                ", address='" + address + '\'' +
                ", makeOfVehicle='" + makeOfVehicle + '\'' +
                ", modelOfVehicle='" + modelOfVehicle + '\'' +
                ", yearOfManufacture='" + yearOfManufacture + '\'' +
                ", animal='" + animal + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuickClaim that = (QuickClaim) o;
        return Objects.equals(id, that.id) && Objects.equals(customerName, that.customerName) && Objects.equals(insuranceType, that.insuranceType) && Objects.equals(amount, that.amount) && Objects.equals(reason, that.reason) && Objects.equals(description, that.description) && Objects.equals(status, that.status) && Objects.equals(date, that.date) && Objects.equals(policyNumber, that.policyNumber) && Objects.equals(address, that.address )
                && Objects.equals(makeOfVehicle, that.makeOfVehicle) && Objects.equals(modelOfVehicle, that.modelOfVehicle) && Objects.equals(yearOfManufacture, that.yearOfManufacture) && Objects.equals(animal, that.animal) && Objects.equals(breed, that.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customerName, insuranceType, amount, reason, description, status, date, policyNumber, address, makeOfVehicle, modelOfVehicle, yearOfManufacture, animal, breed);
    }
}
