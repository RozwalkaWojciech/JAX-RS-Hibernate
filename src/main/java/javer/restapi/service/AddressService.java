package javer.restapi.service;

import javer.restapi.dao.AddressDaoInterface;
import javer.restapi.dto.AddressDto;
import javer.restapi.mapper.AddressMapper;
import javer.restapi.model.Address;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RequestScoped
@Transactional
public class AddressService {

    @EJB
    AddressDaoInterface<Address> addressDao;

    public AddressDto save(AddressDto addressDto) {
        return AddressMapper.addressToDto(addressDao.save(AddressMapper.dtoToAddress(addressDto)));
    }

    public AddressDto get(Integer id) {
        return AddressMapper.addressToDto(addressDao.get(id));
    }

    public AddressDto update(Integer id, AddressDto addressDto) {
        return AddressMapper.addressToDto(addressDao.update(id, AddressMapper.dtoToAddress(addressDto)));
    }

    public void delete(Integer id) {
        addressDao.delete(id);
    }

    public List<AddressDto> getAll() {
        return addressDao
                .getAll()
                .stream()
                .map(AddressMapper::addressToDto)
                .collect(Collectors.toList());
    }

    public List<AddressDto> getByState(String state) {
        return addressDao
                .getByState(state)
                .stream()
                .map(AddressMapper::addressToDto)
                .collect(Collectors.toList());
    }

    public List<AddressDto> getByCity(String city) {
        return addressDao
                .getByCity(city)
                .stream()
                .map(AddressMapper::addressToDto)
                .collect(Collectors.toList());
    }

    public List<AddressDto> getByZip(String zip) {
        return addressDao
                .getByZip(zip)
                .stream()
                .map(AddressMapper::addressToDto)
                .collect(Collectors.toList());
    }

    public List<AddressDto> getByStreet(String street) {
        return addressDao
                .getByStreet(street)
                .stream()
                .map(AddressMapper::addressToDto)
                .collect(Collectors.toList());
    }
}
