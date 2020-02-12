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
	@Mapping(source = "shoppingCart.idShoppingCart", target = "idShoppingCart")
	@Mapping(source = "shoppingCart.idCustomer.idCustomer", target = "idCustomer")
	@Mapping(source = "shoppingCart.idCustomer.firstName", target = "customerName")
	@Mapping(source = "shoppingCart.idProduct.idProduct", target = "idProduct")
	@Mapping(source = "shoppingCart.idProduct.description", target = "productName")
	@Mapping(source = "shoppingCart.dateAdded", target = "dateAdded", dateFormat = EcommConstants.FORMAT_DATE_SHORT_WITH_DASH)
	@Mapping(source = "shoppingCart.dateModified", target = "dateModified", dateFormat = EcommConstants.FORMAT_DATE_SHORT_WITH_DASH)
	@Mapping(source = "shoppingCart.status", target = "status")
	ShoppingCartDTO shoppingCartEntityToDTO(ShoppingCart shoppingCart);

	/**
	 * 
	 * @param shoppingCart
	 * @return
	 */
	@Mapping(source = "shoppingCart.idShoppingCart", target = "idShoppingCart")
	@Mapping(source = "shoppingCart.idCustomer", target = "idCustomer.idCustomer")
	@Mapping(source = "shoppingCart.idProduct", target = "idProduct.idProduct")
	@Mapping(source = "shoppingCart.dateAdded", target = "dateAdded", dateFormat = EcommConstants.FORMAT_DATE_SHORT_WITH_DASH)
	@Mapping(source = "shoppingCart.dateModified", target = "dateModified", dateFormat = EcommConstants.FORMAT_DATE_SHORT_WITH_DASH)
	@Mapping(source = "shoppingCart.status", target = "status")
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
