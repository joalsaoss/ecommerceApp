package com.joalsaoss.ecommerce.mappers;

import com.joalsaoss.ecommerce.dtos.CityDTO;
import com.joalsaoss.ecommerce.models.City;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-02-12T09:40:29-0500",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_212 (Oracle Corporation)"
)
@Component
public class CityMapperImpl implements CityMapper {

    @Override
    public CityDTO cityEntityToDTO(City city) {
        if ( city == null ) {
            return null;
        }

        CityDTO cityDTO = new CityDTO();

        cityDTO.setCityName( city.getCityName() );
        cityDTO.setIdCity( city.getIdCity() );

        return cityDTO;
    }

    @Override
    public City cityDTOToEntity(CityDTO city) {
        if ( city == null ) {
            return null;
        }

        City city1 = new City();

        city1.setCityName( city.getCityName() );
        city1.setIdCity( city.getIdCity() );

        return city1;
    }

    @Override
    public List<CityDTO> cityEntitiesToDTO(List<City> city) {
        if ( city == null ) {
            return null;
        }

        List<CityDTO> list = new ArrayList<CityDTO>( city.size() );
        for ( City city1 : city ) {
            list.add( cityEntityToDTO( city1 ) );
        }

        return list;
    }

    @Override
    public List<City> cityDTOToEntities(List<CityDTO> cityDTO) {
        if ( cityDTO == null ) {
            return null;
        }

        List<City> list = new ArrayList<City>( cityDTO.size() );
        for ( CityDTO cityDTO1 : cityDTO ) {
            list.add( cityDTOToEntity( cityDTO1 ) );
        }

        return list;
    }
}
