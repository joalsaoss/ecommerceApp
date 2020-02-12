/**
 * 
 */
package com.joalsaoss.ecommerce.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.joalsaoss.ecommerce.dtos.ShoppingCartDTO;
import com.joalsaoss.ecommerce.models.Customer;
import com.joalsaoss.ecommerce.models.Product;
import com.joalsaoss.ecommerce.models.ShoppingCart;
import com.joalsaoss.ecommerce.utils.EcommConstants;

/**
 * @author Jose Alvaro
 *
 */
@Mapper(uses = { Customer.class, Product.class })
public interface ShoppingCartMapper {
	/**
	 * 
	 * @param shoppingCart
	 * @return
	 */
	@Mapping(source = "product.idShoppingCart", target = "idShoppingCart")
	@Mapping(source = "product.idCustomer.idCustomer", target = "idCustomer")
	@Mapping(source = "product.idCustomer.firstName" + " " + "product.idCustomer.lastName", target = "customerName")
	@Mapping(source = "product.idProduct.idProduct", target = "idProduct")
	@Mapping(source = "product.idProduct.description", target = "description")
	@Mapping(source = "product.dateAdded", target = "dateAdded", dateFormat = EcommConstants.FORMAT_DATE_SHORT_WITH_DASH)
	@Mapping(source = "product.dateModified", target = "dateModified", dateFormat = EcommConstants.FORMAT_DATE_SHORT_WITH_DASH)
	@Mapping(source = "product.status", target = "status")
	ShoppingCartDTO shoppingCartEntityToDTO(ShoppingCart shoppingCart);

	/**
	 * 
	 * @param shoppingCart
	 * @return
	 */
	@Mapping(source = "product.idShoppingCart", target = "idShoppingCart")
	@Mapping(source = "product.idCustomer.idCustomer", target = "idCustomer")
	@Mapping(source = "product.idProduct.idProduct", target = "idProduct")
	@Mapping(source = "product.dateAdded", target = "dateAdded", dateFormat = EcommConstants.FORMAT_DATE_SHORT_WITH_DASH)
	@Mapping(source = "product.dateModified", target = "dateModified", dateFormat = EcommConstants.FORMAT_DATE_SHORT_WITH_DASH)
	@Mapping(source = "product.status", target = "status")
	ShoppingCart shoppingCartDTOToEntity(ShoppingCartDTO shoppingCart);

	/**
	 * 
	 * @param shoppingCart
	 * @return
	 */
	List<ShoppingCartDTO> shoppingCartEntitiesToDTO(List<ShoppingCart> shoppingCart);

	/**
	 * 
	 * @param shoppingCartDTO
	 * @return
	 */
	List<ShoppingCart> shoppingCartDTOToEntities(List<ShoppingCartDTO> shoppingCartDTO);
}
