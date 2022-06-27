package org.example.model;

import jdk.internal.dynalink.linker.LinkerServices;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "director")
public class Director {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "director_id")
    private int id;

    @Column(name = "name")
    private String name;


    @OneToMany(mappedBy = "director")
    private List<Film> filmList;

    public Director(){}

    public Director(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Film> getFilmList() {
        return filmList;
    }

    public void setFilmList(List<Film> filmList) {
        this.filmList = filmList;
    }
}
