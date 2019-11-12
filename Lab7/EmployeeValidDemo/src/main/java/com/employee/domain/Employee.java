package com.employee.domain;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.Date;

public class Employee {
    @NotNull
    private Integer id;

    @NotEmpty
    @Size(min = 4, max = 50, message = "{Size.name.validation}")
    private String firstName = null;

    @NotEmpty
    private String lastName  = null;

    @Email
    private String email = null;

    @NotBlank
    private String gender = null;

    @DateTimeFormat(pattern = "MM-dd-YYYY")
    private Date birthday;

    private MultipartFile profileImage;

    @Valid
    private Phone phone;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public Phone getPhone() {
        return phone;
    }
    public void setPhone(Phone phone) {
        this.phone = phone;
    }
    public MultipartFile getProfileImage() {
        return profileImage;
    }
    public void setProfileImage(MultipartFile profileImage) {
        this.profileImage = profileImage;
    }
}
