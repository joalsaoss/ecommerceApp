package com.joalsaoss.ecommerce.mappers;

import com.joalsaoss.ecommerce.dtos.ProductDTO;
import com.joalsaoss.ecommerce.models.Product;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-02-12T09:40:29-0500",
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

        productDTO.setRating( product.getRating() );
        productDTO.setIdProduct( product.getIdProduct() );
        productDTO.setDescription( product.getDescription() );
        productDTO.setDateModified( product.getDateModified() );
        productDTO.setDateAdded( product.getDateAdded() );

        return productDTO;
    }

    @Override
    public Product productDTOToEntity(ProductDTO product) {
        if ( product == null ) {
            return null;
        }

        Product product1 = new Product();

        product1.setRating( product.getRating() );
        product1.setIdProduct( product.getIdProduct() );
        product1.setDescription( product.getDescription() );
        product1.setDateModified( product.getDateModified() );
        product1.setDateAdded( product.getDateAdded() );

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
}
