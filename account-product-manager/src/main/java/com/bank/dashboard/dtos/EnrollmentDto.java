package com.bank.dashboard.dtos;

import java.time.LocalDate;

import com.bank.dashboard.models.Enrollment;
import com.bank.dashboard.models.enums.EnrollmentStatus;

import lombok.Builder;

// DTO simply removes "deleted" field
@Builder
public record EnrollmentDto(
        int id,
        int accountId,
        int productId,
        LocalDate enrollmentDate,
        EnrollmentStatus status,
        String notes) {

    public EnrollmentDto enrollmentToDto(Enrollment enrollment) {
        return EnrollmentDto.builder()
                .id(enrollment.getId())
                .accountId(enrollment.getAccountId())
                .productId(enrollment.getProductId())
                .enrollmentDate(enrollment.getEnrollmentDate())
                .status(enrollment.getStatus())
                .notes(enrollment.getNotes())
                .build();
    }

    public Enrollment dtoToEnrollment(EnrollmentDto enrollmentDto) {
        return Enrollment.builder()
                .id(enrollmentDto.id)
                .accountId(enrollmentDto.accountId)
                .productId(enrollmentDto.productId)
                .enrollmentDate(enrollmentDto.enrollmentDate)
                .status(enrollmentDto.status)
                .notes(enrollmentDto.notes)
                .deleted(false) // Default to false
                .build();
    }
}