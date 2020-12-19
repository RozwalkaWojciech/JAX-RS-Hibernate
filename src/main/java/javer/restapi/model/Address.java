package javer.restapi.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class Address {

    @Id
    @GeneratedValue
    private Integer id;

    private String state;

    private String zip;

    private String city;

    private String street;

    private Integer houseNumber;

    private Integer apartmentNumber;

    @OneToMany(mappedBy = "address")
    private List<Person> personList;

}
