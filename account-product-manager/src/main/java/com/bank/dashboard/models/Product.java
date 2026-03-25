package com.bank.dashboard.models;

import java.math.BigDecimal;
import java.time.LocalTime;

import com.bank.dashboard.models.enums.ProductType;

import lombok.Builder;

// Use lombok @Builder annotation to help with DTO generation
@Builder
public class Product {
    private int id;
    private String name;
    private ProductType type;
    private BigDecimal annualFee;
    private boolean statusAvailable;
    private String description;
    private LocalTime creationTime;
    private boolean deleted;
    
    public Product() {
    }

    public Product(int id, String name, ProductType type, BigDecimal annualFee, boolean statusAvailable,
            String description, LocalTime creationTime, boolean deleted) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.annualFee = annualFee;
        this.statusAvailable = statusAvailable;
        this.description = description;
        this.creationTime = creationTime;
        this.deleted = deleted;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public BigDecimal getAnnualFee() {
        return annualFee;
    }

    public void setAnnualFee(BigDecimal annualFee) {
        this.annualFee = annualFee;
    }

    public boolean isStatusAvailable() {
        return statusAvailable;
    }

    public void setStatusAvailable(boolean statusAvailable) {
        this.statusAvailable = statusAvailable;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalTime creationTime) {
        this.creationTime = creationTime;
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
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((annualFee == null) ? 0 : annualFee.hashCode());
        result = prime * result + (statusAvailable ? 1231 : 1237);
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((creationTime == null) ? 0 : creationTime.hashCode());
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
        Product other = (Product) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (type != other.type)
            return false;
        if (annualFee == null) {
            if (other.annualFee != null)
                return false;
        } else if (!annualFee.equals(other.annualFee))
            return false;
        if (statusAvailable != other.statusAvailable)
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        if (creationTime == null) {
            if (other.creationTime != null)
                return false;
        } else if (!creationTime.equals(other.creationTime))
            return false;
        if (deleted != other.deleted)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", type=" + type + ", annualFee=" + annualFee
                + ", statusAvailable=" + statusAvailable + ", description=" + description + ", creationTime="
                + creationTime + ", deleted=" + deleted + "]";
    }

    
}