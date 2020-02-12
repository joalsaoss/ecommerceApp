/**
 * 
 */
package com.joalsaoss.ecommerce.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.joalsaoss.ecommerce.dtos.AddressDTO;
import com.joalsaoss.ecommerce.models.Address;
import com.joalsaoss.ecommerce.models.City;

/**
 * @author Jose Alvaro
 *
 */
@Mapper(uses = {City.class})
public interface AddressMapper {
	
	/**
	 * 
	 * @param address
	 * @return
	 */
	@Mapping(source = "address.idAddress", target = "idAddress")
	@Mapping(source = "address.address", target = "address")
	@Mapping(source = "address.idCity.idCity", target = "idCity")
	@Mapping(source = "address.idCity.cityName", target = "cityName")
	AddressDTO addressEntityToDTO(Address address);
	
	/**
	 * 
	 * @param address
	 * @return
	 */
	@Mapping(source = "address.idAddress", target = "idAddress")
	@Mapping(source = "address.address", target = "address")
	@Mapping(source = "address.idCity", target = "idCity")
	Address addressDTOToEntity(AddressDTO address);
	
	/**
	 * 
	 * @param address
	 * @return
	 */
	List<AddressDTO> addressEntitiesToDTO(List<Address> address);

	/**
	 * 
	 * @param buzonNotificacionesDTO
	 * @return
	 */
	List<Address> addressDTOToEntities(List<AddressDTO> addressDTO);

	
}
