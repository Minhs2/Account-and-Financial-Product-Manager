package com.bank.dashboard.dtos;

import java.math.BigDecimal;
import java.time.LocalTime;

import com.bank.dashboard.models.Product;
import com.bank.dashboard.models.enums.ProductType;

import lombok.Builder;

// DTO simply removes "deleted" field
@Builder
public record ProductDto(
        int id,
        String name,
        ProductType type,
        BigDecimal annualFee,
        boolean statusAvailable,
        String description,
        LocalTime creationTime) {

    public ProductDto productToDto(Product product) {
        return ProductDto.builder()
                .id(product.getId())
                .name(product.getName())
                .type(product.getType())
                .annualFee(product.getAnnualFee())
                .statusAvailable(product.isStatusAvailable())
                .description(product.getDescription())
                .creationTime(product.getCreationTime())
                .build();
    }

    public Product dtoToProduct(ProductDto productDto) {
        return Product.builder()
                .id(productDto.id)
                .name(productDto.name)
                .type(productDto.type)
                .annualFee(productDto.annualFee)
                .statusAvailable(productDto.statusAvailable)
                .description(productDto.description)
                .creationTime(productDto.creationTime)
                .deleted(false) // Default to false
                .build();
    }
}