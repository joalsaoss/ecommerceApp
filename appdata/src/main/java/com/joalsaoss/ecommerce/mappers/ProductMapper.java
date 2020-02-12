/**
 * 
 */
package com.joalsaoss.ecommerce.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.joalsaoss.ecommerce.dtos.ProductDTO;
import com.joalsaoss.ecommerce.models.Product;
import com.joalsaoss.ecommerce.utils.EcommConstants;

/**
 * @author Jose Alvaro
 *
 */
@Mapper
public interface ProductMapper {
	@Mapping(source = "product.idProduct", target = "idProduct")
	@Mapping(source = "product.description", target = "description")
	@Mapping(source = "product.dateAdded", target = "dateAdded", dateFormat = EcommConstants.FORMAT_DATE_SHORT_WITH_DASH)
	@Mapping(source = "product.dateModified", target = "dateModified", dateFormat = EcommConstants.FORMAT_DATE_SHORT_WITH_DASH)
	@Mapping(source = "product.price", target = "price")
	@Mapping(source = "product.weight", target = "weight")
	@Mapping(source = "product.idCategory.idCategory", target = "idCategory")
	ProductDTO productEntityToDTO(Product product);

	@Mapping(source = "product.idProduct", target = "idProduct")
	@Mapping(source = "product.description", target = "description")
	@Mapping(source = "product.dateAdded", target = "dateAdded", dateFormat = EcommConstants.FORMAT_DATE_SHORT_WITH_DASH)
	@Mapping(source = "product.dateModified", target = "dateModified", dateFormat = EcommConstants.FORMAT_DATE_SHORT_WITH_DASH)
	@Mapping(source = "product.price", target = "price")
	@Mapping(source = "product.weight", target = "weight")
	@Mapping(source = "product.idCategory", target = "idCategory.idCategory")
	Product productDTOToEntity(ProductDTO product);

	List<ProductDTO> productEntitiesToDTO(List<Product> product);

	List<Product> productDTOToEntities(List<ProductDTO> productDTO);
}
