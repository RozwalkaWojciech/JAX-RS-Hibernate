package javer.restapi.service;

import javer.restapi.dao.AddressDaoInterface;
import javer.restapi.dao.Dao;
import javer.restapi.dto.AddressDto;
import javer.restapi.mapper.AddressMapper;
import javer.restapi.model.Address;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RequestScoped
@Transactional
public class AddressService {

    @Inject
    Dao<Address> addressDao;
    @Inject
    AddressDaoInterface<Address> addressDaoInterface;

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
        return addressDaoInterface
                .getByState(state)
                .stream()
                .map(AddressMapper::addressToDto)
                .collect(Collectors.toList());
    }

    public List<AddressDto> getByCity(String city) {
        return addressDaoInterface
                .getByCity(city)
                .stream()
                .map(AddressMapper::addressToDto)
                .collect(Collectors.toList());
    }

    public List<AddressDto> getByZip(String zip) {
        return addressDaoInterface
                .getByZip(zip)
                .stream()
                .map(AddressMapper::addressToDto)
                .collect(Collectors.toList());
    }

    public List<AddressDto> getByStreet(String street) {
        return addressDaoInterface
                .getByStreet(street)
                .stream()
                .map(AddressMapper::addressToDto)
                .collect(Collectors.toList());
    }
}
