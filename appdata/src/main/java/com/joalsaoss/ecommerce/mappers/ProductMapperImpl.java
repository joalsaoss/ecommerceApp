package com.joalsaoss.ecommerce.mappers;

import com.joalsaoss.ecommerce.dtos.ProductDTO;
import com.joalsaoss.ecommerce.models.Category;
import com.joalsaoss.ecommerce.models.Product;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-02-12T17:37:25-0500",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_212 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductDTO productEntityToDTO(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductDTO productDTO = new ProductDTO();

        productDTO.setPrice( product.getPrice() );
        productDTO.setIdProduct( product.getIdProduct() );
        productDTO.setDescription( product.getDescription() );
        productDTO.setWeight( product.getWeight() );
        if ( product.getDateModified() != null ) {
            productDTO.setDateModified( new SimpleDateFormat( "yyyy-MM-dd" ).format( product.getDateModified() ) );
        }
        if ( product.getDateAdded() != null ) {
            productDTO.setDateAdded( new SimpleDateFormat( "yyyy-MM-dd" ).format( product.getDateAdded() ) );
        }
        productDTO.setIdCategory( productIdCategoryIdCategory( product ) );

        return productDTO;
    }

    @Override
    public Product productDTOToEntity(ProductDTO product) {
        if ( product == null ) {
            return null;
        }

        Product product1 = new Product();

        product1.setIdCategory( productDTOToCategory( product ) );
        product1.setPrice( product.getPrice() );
        product1.setIdProduct( product.getIdProduct() );
        product1.setDescription( product.getDescription() );
        product1.setWeight( product.getWeight() );
        try {
            if ( product.getDateModified() != null ) {
                product1.setDateModified( new SimpleDateFormat( "yyyy-MM-dd" ).parse( product.getDateModified() ) );
            }
        }
        catch ( ParseException e ) {
            throw new RuntimeException( e );
        }
        try {
            if ( product.getDateAdded() != null ) {
                product1.setDateAdded( new SimpleDateFormat( "yyyy-MM-dd" ).parse( product.getDateAdded() ) );
            }
        }
        catch ( ParseException e ) {
            throw new RuntimeException( e );
        }

        return product1;
    }

    @Override
    public List<ProductDTO> productEntitiesToDTO(List<Product> product) {
        if ( product == null ) {
            return null;
        }

        List<ProductDTO> list = new ArrayList<ProductDTO>( product.size() );
        for ( Product product1 : product ) {
            list.add( productEntityToDTO( product1 ) );
        }

        return list;
    }

    @Override
    public List<Product> productDTOToEntities(List<ProductDTO> productDTO) {
        if ( productDTO == null ) {
            return null;
        }

        List<Product> list = new ArrayList<Product>( productDTO.size() );
        for ( ProductDTO productDTO1 : productDTO ) {
            list.add( productDTOToEntity( productDTO1 ) );
        }

        return list;
    }

    private Long productIdCategoryIdCategory(Product product) {
        if ( product == null ) {
            return null;
        }
        Category idCategory = product.getIdCategory();
        if ( idCategory == null ) {
            return null;
        }
        Long idCategory1 = idCategory.getIdCategory();
        if ( idCategory1 == null ) {
            return null;
        }
        return idCategory1;
    }

    protected Category productDTOToCategory(ProductDTO productDTO) {
        if ( productDTO == null ) {
            return null;
        }

        Category category = new Category();

        category.setIdCategory( productDTO.getIdCategory() );

        return category;
    }
}
