package org.example.model.homework;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity
@Table(name = "school")
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @OneToOne(mappedBy = "school")
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private Director director;

    @Column(name = "school_name")
    private String school_name;

    public School(){}

    public School(String school_name) {
        this.school_name = school_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
        this.director.setSchool(this);
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }
}
