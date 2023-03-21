package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Entity
public class Employer extends AbstractEntity {
    @Size(max = 75, message = "Location name should not be longer than 75 characters")
    @NotBlank(message = "Location is required")
    @NotNull(message = "Location is required")
    private String location;

    public Employer(String location){
        this.location = location;
    }
    public Employer() {}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
