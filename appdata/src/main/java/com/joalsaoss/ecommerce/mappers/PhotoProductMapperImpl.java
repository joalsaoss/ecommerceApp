package com.joalsaoss.ecommerce.mappers;

import com.joalsaoss.ecommerce.dtos.PhotoProductsDTO;
import com.joalsaoss.ecommerce.models.PhotoProducts;
import com.joalsaoss.ecommerce.models.Product;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-02-13T22:40:50-0500",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_131 (Oracle Corporation)"
)
@Component
public class PhotoProductMapperImpl implements PhotoProductMapper {

    @Override
    public PhotoProductsDTO photoProductsEntityToDTO(PhotoProducts photoProducts) {
        if ( photoProducts == null ) {
            return null;
        }

        PhotoProductsDTO photoProductsDTO = new PhotoProductsDTO();

        photoProductsDTO.setIdProduct( photoProductsIdProductIdProduct( photoProducts ) );
        photoProductsDTO.setPhotoName( photoProducts.getPhotoName() );
        photoProductsDTO.setPhotoPath( photoProducts.getPhotoPath() );
        photoProductsDTO.setIdPhotoProduct( photoProducts.getIdPhotoProduct() );

        return photoProductsDTO;
    }

    @Override
    public PhotoProducts photoProductsDTOToEntity(PhotoProductsDTO photoProducts) {
        if ( photoProducts == null ) {
            return null;
        }

        PhotoProducts photoProducts1 = new PhotoProducts();

        photoProducts1.setIdProduct( photoProductsDTOToProduct( photoProducts ) );
        photoProducts1.setPhotoName( photoProducts.getPhotoName() );
        photoProducts1.setPhotoPath( photoProducts.getPhotoPath() );
        photoProducts1.setIdPhotoProduct( photoProducts.getIdPhotoProduct() );

        return photoProducts1;
    }

    @Override
    public List<PhotoProductsDTO> photoProductsEntitiesToDTO(List<PhotoProducts> photoProducts) {
        if ( photoProducts == null ) {
            return null;
        }

        List<PhotoProductsDTO> list = new ArrayList<PhotoProductsDTO>( photoProducts.size() );
        for ( PhotoProducts photoProducts1 : photoProducts ) {
            list.add( photoProductsEntityToDTO( photoProducts1 ) );
        }

        return list;
    }

    @Override
    public List<PhotoProducts> photoProductsDTOToEntities(List<PhotoProductsDTO> photoProductsDTO) {
        if ( photoProductsDTO == null ) {
            return null;
        }

        List<PhotoProducts> list = new ArrayList<PhotoProducts>( photoProductsDTO.size() );
        for ( PhotoProductsDTO photoProductsDTO1 : photoProductsDTO ) {
            list.add( photoProductsDTOToEntity( photoProductsDTO1 ) );
        }

        return list;
    }

    private Long photoProductsIdProductIdProduct(PhotoProducts photoProducts) {
        if ( photoProducts == null ) {
            return null;
        }
        Product idProduct = photoProducts.getIdProduct();
        if ( idProduct == null ) {
            return null;
        }
        Long idProduct1 = idProduct.getIdProduct();
        if ( idProduct1 == null ) {
            return null;
        }
        return idProduct1;
    }

    protected Product photoProductsDTOToProduct(PhotoProductsDTO photoProductsDTO) {
        if ( photoProductsDTO == null ) {
            return null;
        }

        Product product = new Product();

        product.setIdProduct( photoProductsDTO.getIdProduct() );

        return product;
    }
}
