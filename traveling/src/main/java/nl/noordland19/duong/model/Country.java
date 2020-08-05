package nl.noordland19.duong.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Country {

    private String name;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;




    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

