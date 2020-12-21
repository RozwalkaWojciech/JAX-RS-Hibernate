package javer.restapi.dto;

import lombok.Data;

@Data
public class AddressDto {

    private Integer id;
    private String state;
    private String zip;
    private String city;
    private String street;
    private Integer houseNumber;
    private Integer apartmentNumber;

}
