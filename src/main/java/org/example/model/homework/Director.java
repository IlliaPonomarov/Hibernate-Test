package org.example.model.homework;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity
@Table(name = "director")
public class Director {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int director_id;

    @OneToOne
    @JoinColumn(name = "school_id",
    referencedColumnName = "id")
    private School school;

    @Column(name = "director_name")
    private String director_name;

    public Director(){}

    public Director( String director_name) {

        this.director_name = director_name;
    }

    public String getDirector_name() {
        return director_name;
    }

    public void setDirector_name(String director_name) {
        this.director_name = director_name;
    }

    public int getDirector_id() {
        return director_id;
    }

    public void setDirector_id(int director_id) {
        this.director_id = director_id;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
