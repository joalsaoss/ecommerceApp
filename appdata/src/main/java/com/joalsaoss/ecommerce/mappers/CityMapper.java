/**
 * 
 */
package com.joalsaoss.ecommerce.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.joalsaoss.ecommerce.dtos.CityDTO;
import com.joalsaoss.ecommerce.models.City;

/**
 * @author Jose Alvaro
 *
 */
@Mapper()
public interface CityMapper {
	/**
	 * 
	 * @param city
	 * @return
	 */
	@Mapping(source = "city.idCity", target = "idCity")
	@Mapping(source = "city.cityName", target = "cityName")
	CityDTO cityEntityToDTO(City city);
	
	/**
	 * 
	 * @param city
	 * @return
	 */
	@Mapping(source = "city.idCity", target = "idCity")
	@Mapping(source = "city.cityName", target = "cityName")
	City cityDTOToEntity(CityDTO city);
	
	/**
	 * 
	 * @param city
	 * @return
	 */
	List<CityDTO> cityEntitiesToDTO(List<City> city);

	/**
	 * 
	 * @param cityDTO
	 * @return
	 */
	List<City> cityDTOToEntities(List<CityDTO> cityDTO);
}
