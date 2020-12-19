package javer.restapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor //check isNeed
@NoArgsConstructor //check isNeed
public class AddressDto {

    private Integer id;
    private String state;
    private String zip;
    private String city;
    private String street;
    private Integer houseNumber;
    private Integer apartmentNumber;

}
