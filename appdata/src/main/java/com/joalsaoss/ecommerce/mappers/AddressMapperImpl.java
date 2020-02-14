package com.joalsaoss.ecommerce.mappers;

import com.joalsaoss.ecommerce.dtos.AddressDTO;
import com.joalsaoss.ecommerce.models.Address;
import com.joalsaoss.ecommerce.models.City;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-02-13T22:40:50-0500",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_131 (Oracle Corporation)"
)
@Component
public class AddressMapperImpl implements AddressMapper {

    @Override
    public AddressDTO addressEntityToDTO(Address address) {
        if ( address == null ) {
            return null;
        }

        AddressDTO addressDTO = new AddressDTO();

        addressDTO.setIdCity( addressIdCityIdCity( address ) );
        addressDTO.setAddress( address.getAddress() );
        addressDTO.setCityName( addressIdCityCityName( address ) );
        addressDTO.setIdAddress( address.getIdAddress() );

        return addressDTO;
    }

    @Override
    public Address addressDTOToEntity(AddressDTO address) {
        if ( address == null ) {
            return null;
        }

        Address address1 = new Address();

        address1.setIdCity( addressDTOToCity( address ) );
        address1.setAddress( address.getAddress() );
        address1.setIdAddress( address.getIdAddress() );

        return address1;
    }

    @Override
    public List<AddressDTO> addressEntitiesToDTO(List<Address> address) {
        if ( address == null ) {
            return null;
        }

        List<AddressDTO> list = new ArrayList<AddressDTO>( address.size() );
        for ( Address address1 : address ) {
            list.add( addressEntityToDTO( address1 ) );
        }

        return list;
    }

    @Override
    public List<Address> addressDTOToEntities(List<AddressDTO> addressDTO) {
        if ( addressDTO == null ) {
            return null;
        }

        List<Address> list = new ArrayList<Address>( addressDTO.size() );
        for ( AddressDTO addressDTO1 : addressDTO ) {
            list.add( addressDTOToEntity( addressDTO1 ) );
        }

        return list;
    }

    private Long addressIdCityIdCity(Address address) {
        if ( address == null ) {
            return null;
        }
        City idCity = address.getIdCity();
        if ( idCity == null ) {
            return null;
        }
        Long idCity1 = idCity.getIdCity();
        if ( idCity1 == null ) {
            return null;
        }
        return idCity1;
    }

    private String addressIdCityCityName(Address address) {
        if ( address == null ) {
            return null;
        }
        City idCity = address.getIdCity();
        if ( idCity == null ) {
            return null;
        }
        String cityName = idCity.getCityName();
        if ( cityName == null ) {
            return null;
        }
        return cityName;
    }

    protected City addressDTOToCity(AddressDTO addressDTO) {
        if ( addressDTO == null ) {
            return null;
        }

        City city = new City();

        city.setIdCity( addressDTO.getIdCity() );

        return city;
    }
}
