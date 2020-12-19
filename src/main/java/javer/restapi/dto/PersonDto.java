package javer.restapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonDto {

    private Integer id;
    private String name;
    private String lastName;
    private String pesel;
    private AddressDto address;

}
