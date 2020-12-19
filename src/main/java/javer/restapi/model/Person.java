package javer.restapi.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Person {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String lastName;

    private String pesel;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;
}
