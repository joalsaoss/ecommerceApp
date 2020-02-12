/**
 * 
 */
package com.joalsaoss.ecommerce.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.joalsaoss.ecommerce.dtos.CategoryDTO;
import com.joalsaoss.ecommerce.models.Category;
import com.joalsaoss.ecommerce.utils.EcommConstants;

/**
 * @author Jose Alvaro
 *
 */
@Mapper
public interface CategoryMapper {
	/**
	 * 
	 * @param category
	 * @return
	 */
	@Mapping(source = "category.idCategory", target = "idCategory")
	@Mapping(source = "category.idMainCategory.idCategory", target = "idMainCategory")
	@Mapping(source = "category.categoryName", target = "categoryName")
	@Mapping(source = "category.dateAdded", target = "dateAdded", dateFormat = EcommConstants.FORMAT_DATE_SHORT_WITH_DASH)
	@Mapping(source = "category.dateModified", target = "dateModified", dateFormat = EcommConstants.FORMAT_DATE_SHORT_WITH_DASH)
	@Mapping(source = "category.status", target = "status")
	@Mapping(source = "category.photoUrl", target = "photoUrl")
	CategoryDTO categoryEntityToDTO(Category category);

	/**
	 * 
	 * @param category
	 * @return
	 */
	@Mapping(source = "category.idCategory", target = "idCategory")
	@Mapping(source = "category.idMainCategory", target = "idMainCategory.idCategory")
	@Mapping(source = "category.categoryName", target = "categoryName")
	@Mapping(source = "category.dateAdded", target = "dateAdded", dateFormat = EcommConstants.FORMAT_DATE_SHORT_WITH_DASH)
	@Mapping(source = "category.dateModified", target = "dateModified", dateFormat = EcommConstants.FORMAT_DATE_SHORT_WITH_DASH)
	@Mapping(source = "category.status", target = "status")
	@Mapping(source = "category.photoUrl", target = "photoUrl")
	Category categoryDTOToEntity(CategoryDTO category);

	/**
	 * 
	 * @param category
	 * @return
	 */
	List<CategoryDTO> categoryEntitiesToDTO(List<Category> category);

	/**
	 * 
	 * @param categoryDTO
	 * @return
	 */
	List<Category> categoryDTOToEntities(List<CategoryDTO> categoryDTO);
}
