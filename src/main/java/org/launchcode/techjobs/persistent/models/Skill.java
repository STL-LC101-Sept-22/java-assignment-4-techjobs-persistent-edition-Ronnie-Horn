package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Skill extends AbstractEntity {
    @ManyToMany(mappedBy="skills")
    private final List<Job> jobs = new ArrayList<>();

    private String description;

    public Skill(String description){
        this.description = description;
    }
    public Skill() {}

    public List<Job> getJobs() {
        return jobs;
    }

public void addJob(Job job) {
        this.jobs.add(job);
}
    public String getDescription() {
        return description;


    }

    public void setDescription(String description) {
        this.description = description;
    }
}
