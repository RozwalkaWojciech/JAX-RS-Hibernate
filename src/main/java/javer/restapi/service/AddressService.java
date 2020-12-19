package javer.restapi.service;

import javer.restapi.dao.AddressDaoInterface;
import javer.restapi.dao.Dao;
import javer.restapi.dto.AddressDto;
import javer.restapi.mapper.AddressMapper;
import javer.restapi.model.Address;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<AddressDto> getByState() {
        return addressDaoInterface
                .getByState()
                .stream()
                .map(AddressMapper::addressToDto)
                .collect(Collectors.toList());
    }

    public List<AddressDto> getByCity() {
        return addressDaoInterface
                .getByCity()
                .stream()
                .map(AddressMapper::addressToDto)
                .collect(Collectors.toList());
    }

    public List<AddressDto> getByZip() {
        return addressDaoInterface
                .getByZip()
                .stream()
                .map(AddressMapper::addressToDto)
                .collect(Collectors.toList());
    }

    public List<AddressDto> getByStreet() {
        return addressDaoInterface
                .getByStreet()
                .stream()
                .map(AddressMapper::addressToDto)
                .collect(Collectors.toList());
    }
}
