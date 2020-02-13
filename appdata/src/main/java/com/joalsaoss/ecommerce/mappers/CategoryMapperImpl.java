package com.joalsaoss.ecommerce.mappers;

import com.joalsaoss.ecommerce.dtos.CategoryDTO;
import com.joalsaoss.ecommerce.models.Category;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-02-13T07:38:44-0500",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_231 (Oracle Corporation)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public CategoryDTO categoryEntityToDTO(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryDTO categoryDTO = new CategoryDTO();

        categoryDTO.setPhotoUrl( category.getPhotoUrl() );
        categoryDTO.setIdMainCategory( categoryIdMainCategoryIdCategory( category ) );
        if ( category.getDateModified() != null ) {
            categoryDTO.setDateModified( new SimpleDateFormat( "yyyy-MM-dd" ).format( category.getDateModified() ) );
        }
        categoryDTO.setCategoryName( category.getCategoryName() );
        categoryDTO.setIdCategory( category.getIdCategory() );
        if ( category.getDateAdded() != null ) {
            categoryDTO.setDateAdded( new SimpleDateFormat( "yyyy-MM-dd" ).format( category.getDateAdded() ) );
        }
        categoryDTO.setStatus( String.valueOf( category.getStatus() ) );

        return categoryDTO;
    }

    @Override
    public Category categoryDTOToEntity(CategoryDTO category) {
        if ( category == null ) {
            return null;
        }

        Category category1 = new Category();

        category1.setIdMainCategory( categoryDTOToCategory( category ) );
        category1.setPhotoUrl( category.getPhotoUrl() );
        try {
            if ( category.getDateModified() != null ) {
                category1.setDateModified( new SimpleDateFormat( "yyyy-MM-dd" ).parse( category.getDateModified() ) );
            }
        }
        catch ( ParseException e ) {
            throw new RuntimeException( e );
        }
        category1.setCategoryName( category.getCategoryName() );
        category1.setIdCategory( category.getIdCategory() );
        try {
            if ( category.getDateAdded() != null ) {
                category1.setDateAdded( new SimpleDateFormat( "yyyy-MM-dd" ).parse( category.getDateAdded() ) );
            }
        }
        catch ( ParseException e ) {
            throw new RuntimeException( e );
        }
        if ( category.getStatus() != null ) {
            category1.setStatus( Integer.parseInt( category.getStatus() ) );
        }

        return category1;
    }

    @Override
    public List<CategoryDTO> categoryEntitiesToDTO(List<Category> category) {
        if ( category == null ) {
            return null;
        }

        List<CategoryDTO> list = new ArrayList<CategoryDTO>( category.size() );
        for ( Category category1 : category ) {
            list.add( categoryEntityToDTO( category1 ) );
        }

        return list;
    }

    @Override
    public List<Category> categoryDTOToEntities(List<CategoryDTO> categoryDTO) {
        if ( categoryDTO == null ) {
            return null;
        }

        List<Category> list = new ArrayList<Category>( categoryDTO.size() );
        for ( CategoryDTO categoryDTO1 : categoryDTO ) {
            list.add( categoryDTOToEntity( categoryDTO1 ) );
        }

        return list;
    }

    private Long categoryIdMainCategoryIdCategory(Category category) {
        if ( category == null ) {
            return null;
        }
        Category idMainCategory = category.getIdMainCategory();
        if ( idMainCategory == null ) {
            return null;
        }
        Long idCategory = idMainCategory.getIdCategory();
        if ( idCategory == null ) {
            return null;
        }
        return idCategory;
    }

    protected Category categoryDTOToCategory(CategoryDTO categoryDTO) {
        if ( categoryDTO == null ) {
            return null;
        }

        Category category = new Category();

        category.setIdCategory( categoryDTO.getIdMainCategory() );

        return category;
    }
}
