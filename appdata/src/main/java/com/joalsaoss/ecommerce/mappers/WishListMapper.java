/**
 * 
 */
package com.joalsaoss.ecommerce.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.joalsaoss.ecommerce.dtos.WishListDTO;
import com.joalsaoss.ecommerce.models.Customer;
import com.joalsaoss.ecommerce.models.Product;
import com.joalsaoss.ecommerce.models.WishList;
import com.joalsaoss.ecommerce.utils.EcommConstants;

/**
 * @author Jose Alvaro
 *
 */
@Mapper(uses = { Customer.class, Product.class })
public interface WishListMapper {

	/**
	 * 
	 * @param wishList
	 * @return
	 */
	@Mapping(source = "wishList.idWishList", target = "idWishList")
	@Mapping(source = "wishList.idCustomer.idCustomer", target = "idCustomer")
	@Mapping(source = "wishList.idCustomer.firstName" + " " + "product.idCustomer.lastName", target = "customerName")
	@Mapping(source = "wishList.idProduct.idProduct", target = "idProduct")
	@Mapping(source = "wishList.idProduct.description", target = "description")
	@Mapping(source = "wishList.dateAdded", target = "dateAdded", dateFormat = EcommConstants.FORMAT_DATE_SHORT_WITH_DASH)
	@Mapping(source = "wishList.dateModified", target = "dateModified", dateFormat = EcommConstants.FORMAT_DATE_SHORT_WITH_DASH)
	@Mapping(source = "wishList.status", target = "status")
	WishListDTO wishListEntityToDTO(WishList wishList);

	/**
	 * 
	 * @param wishList
	 * @return
	 */
	@Mapping(source = "wishList.idShoppingCart", target = "idWishList")
	@Mapping(source = "wishList.idCustomer.idCustomer", target = "idCustomer")
	@Mapping(source = "wishList.idProduct.idProduct", target = "idProduct")
	@Mapping(source = "wishList.dateAdded", target = "dateAdded", dateFormat = EcommConstants.FORMAT_DATE_SHORT_WITH_DASH)
	@Mapping(source = "wishList.dateModified", target = "dateModified", dateFormat = EcommConstants.FORMAT_DATE_SHORT_WITH_DASH)
	@Mapping(source = "wishList.status", target = "status")
	WishList wishListDTOToEntity(WishListDTO wishList);

	/**
	 * 
	 * @param wishList
	 * @return
	 */
	List<WishListDTO> wishListEntitiesToDTO(List<WishList> wishList);

	/**
	 * 
	 * @param wishListDTO
	 * @return
	 */
	List<WishList> wishListDTOToEntities(List<WishListDTO> wishListDTO);
}
