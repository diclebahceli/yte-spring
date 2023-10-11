package yte.intern.springweb;

import java.time.LocalDate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.PastOrPresent;

public record User(
    @NotEmpty(message = "Name is mandatory")
    String name,
    @NotEmpty(message = "Surname is mandatory")
   String surname,
   @Min(value = 18, message = "Age should not be less than 18")
   @Max(value = 60, message = "Age should not be greater than 60")
   Integer age,
   @NotBlank(message = "Email is mandatory")
   @Email(message = "Email should be valid")
   String email,
   String tc,
   @PastOrPresent(message = "Birthdate should be past or present")
   LocalDate birthDate,
   @Max(250)
   String address,
   @NotBlank(message = "Username is mandatory")
   String userName
   ) {
   

}
