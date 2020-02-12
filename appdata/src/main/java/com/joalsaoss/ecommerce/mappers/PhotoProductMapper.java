/**
 * 
 */
package com.joalsaoss.ecommerce.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.joalsaoss.ecommerce.dtos.AddressDTO;
import com.joalsaoss.ecommerce.dtos.PhotoProductsDTO;
import com.joalsaoss.ecommerce.models.Address;
import com.joalsaoss.ecommerce.models.PhotoProducts;
import com.joalsaoss.ecommerce.models.Product;

/**
 * @author Jose Alvaro
 *
 */
@Mapper(uses = { Product.class })
public interface PhotoProductMapper {
	
	/**
	 * 
	 * @param photoProducts
	 * @return
	 */
	@Mapping(source = "photoProducts.idPhotoProduct", target = "idPhotoProduct")
	@Mapping(source = "photoProducts.photoName", target = "photoName")
	@Mapping(source = "photoProducts.photoPath", target = "photoPath")
	@Mapping(source = "photoProducts.idProduct.idProduct", target = "idProduct")
	PhotoProductsDTO photoProductsEntityToDTO(PhotoProducts photoProducts);

	/**
	 * 
	 * @param photoProducts
	 * @return
	 */
	@Mapping(source = "photoProducts.idPhotoProduct", target = "idPhotoProduct")
	@Mapping(source = "photoProducts.photoName", target = "photoName")
	@Mapping(source = "photoProducts.photoPath", target = "photoPath")
	@Mapping(source = "photoProducts.idProduct", target = "idProduct.idProduct")
	PhotoProducts photoProductsDTOToEntity(PhotoProductsDTO photoProducts);

	/**
	 * 
	 * @param photoProducts
	 * @return
	 */
	List<PhotoProductsDTO> photoProductsEntitiesToDTO(List<PhotoProducts> photoProducts);

	/**
	 * 
	 * @param photoProductsDTO
	 * @return
	 */
	List<PhotoProducts> photoProductsDTOToEntities(List<PhotoProductsDTO> photoProductsDTO);
}
