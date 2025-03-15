package com.pm.patientservice.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class PatientRequestDTO {
    @NotBlank(message = "Name is mandatory")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String name;

    @NotBlank(message = "Email is mandatory")
    @Size(min = 3, max = 50, message = "Email must be between 3 and 50 characters")
    private String email;

    @NotBlank(message = "Address is mandatory")
    @Size(min = 3, max = 50, message = "Address must be between 3 and 50 characters")
    private String address;

    @NotBlank(message = "Date of birth is mandatory")
    private String dateOfBirth;

    @NotNull(message = "Registered date is mandatory")
    private String registeredDate;

    public @NotBlank(message = "Name is mandatory") @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "Name is mandatory") @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters") String name) {
        this.name = name;
    }

    public @NotBlank(message = "Email is mandatory") @Size(min = 3, max = 50, message = "Email must be between 3 and 50 characters") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Email is mandatory") @Size(min = 3, max = 50, message = "Email must be between 3 and 50 characters") String email) {
        this.email = email;
    }

    public @NotBlank(message = "Address is mandatory") @Size(min = 3, max = 50, message = "Address must be between 3 and 50 characters") String getAddress() {
        return address;
    }

    public void setAddress(@NotBlank(message = "Address is mandatory") @Size(min = 3, max = 50, message = "Address must be between 3 and 50 characters") String address) {
        this.address = address;
    }

    public @NotBlank(message = "Date of birth is mandatory") String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(@NotBlank(message = "Date of birth is mandatory") String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public @NotNull(message = "Registered date is mandatory") String getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(@NotNull(message = "Registered date is mandatory") String registeredDate) {
        this.registeredDate = registeredDate;
    }
}
