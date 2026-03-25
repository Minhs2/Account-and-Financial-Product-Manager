package com.bank.dashboard.models;

import java.time.LocalDate;

import com.bank.dashboard.models.enums.EnrollmentStatus;

import lombok.Builder;

// Use lombok @Builder annotation to help with DTO generation
@Builder
public class Enrollment {
    private int id;
    private int accountId;
    private int productId;
    private LocalDate enrollmentDate;
    private EnrollmentStatus status;
    private String notes;
    private boolean deleted;
   
    public Enrollment() {
    }

    public Enrollment(int id, int accountId, int productId, LocalDate enrollmentDate, EnrollmentStatus status,
            String notes, boolean deleted) {
        this.id = id;
        this.accountId = accountId;
        this.productId = productId;
        this.enrollmentDate = enrollmentDate;
        this.status = status;
        this.notes = notes;
        this.deleted = deleted;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public EnrollmentStatus getStatus() {
        return status;
    }

    public void setStatus(EnrollmentStatus status) {
        this.status = status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + accountId;
        result = prime * result + productId;
        result = prime * result + ((enrollmentDate == null) ? 0 : enrollmentDate.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        result = prime * result + ((notes == null) ? 0 : notes.hashCode());
        result = prime * result + (deleted ? 1231 : 1237);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Enrollment other = (Enrollment) obj;
        if (id != other.id)
            return false;
        if (accountId != other.accountId)
            return false;
        if (productId != other.productId)
            return false;
        if (enrollmentDate == null) {
            if (other.enrollmentDate != null)
                return false;
        } else if (!enrollmentDate.equals(other.enrollmentDate))
            return false;
        if (status != other.status)
            return false;
        if (notes == null) {
            if (other.notes != null)
                return false;
        } else if (!notes.equals(other.notes))
            return false;
        if (deleted != other.deleted)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Enrollment [id=" + id + ", accountId=" + accountId + ", productId=" + productId + ", enrollmentDate="
                + enrollmentDate + ", status=" + status + ", notes=" + notes + ", deleted=" + deleted + "]";
    }

    
}