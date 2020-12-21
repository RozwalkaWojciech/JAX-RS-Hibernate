package javer.restapi.dto;

import lombok.Data;

@Data
public class PersonDto {

    private Integer id;
    private String name;
    private String lastName;
    private String pesel;
    private AddressDto address;

}
