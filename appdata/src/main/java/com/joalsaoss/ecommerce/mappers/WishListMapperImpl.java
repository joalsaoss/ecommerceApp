package com.joalsaoss.ecommerce.mappers;

import com.joalsaoss.ecommerce.dtos.WishListDTO;
import com.joalsaoss.ecommerce.models.Customer;
import com.joalsaoss.ecommerce.models.Product;
import com.joalsaoss.ecommerce.models.WishList;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-02-14T14:36:20-0500",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_212 (Oracle Corporation)"
)
@Component
public class WishListMapperImpl implements WishListMapper {

    @Override
    public WishListDTO wishListEntityToDTO(WishList wishList) {
        if ( wishList == null ) {
            return null;
        }

        WishListDTO wishListDTO = new WishListDTO();

        wishListDTO.setIdProduct( wishListIdProductIdProduct( wishList ) );
        wishListDTO.setIdWishList( wishList.getIdWishList() );
        if ( wishList.getDateModified() != null ) {
            wishListDTO.setDateModified( new SimpleDateFormat( "yyyy-MM-dd" ).format( wishList.getDateModified() ) );
        }
        wishListDTO.setCustomerName( wishListIdCustomerFirstName( wishList ) );
        wishListDTO.setProductName( wishListIdProductDescription( wishList ) );
        if ( wishList.getDateAdded() != null ) {
            wishListDTO.setDateAdded( new SimpleDateFormat( "yyyy-MM-dd" ).format( wishList.getDateAdded() ) );
        }
        wishListDTO.setIdCustomer( wishListIdCustomerIdCustomer( wishList ) );
        wishListDTO.setStatus( wishList.getStatus() );

        return wishListDTO;
    }

    @Override
    public WishList wishListDTOToEntity(WishListDTO wishList) {
        if ( wishList == null ) {
            return null;
        }

        WishList wishList1 = new WishList();

        wishList1.setIdCustomer( wishListDTOToCustomer( wishList ) );
        wishList1.setIdProduct( wishListDTOToProduct( wishList ) );
        wishList1.setIdWishList( wishList.getIdWishList() );
        try {
            if ( wishList.getDateModified() != null ) {
                wishList1.setDateModified( new SimpleDateFormat( "yyyy-MM-dd" ).parse( wishList.getDateModified() ) );
            }
        }
        catch ( ParseException e ) {
            throw new RuntimeException( e );
        }
        try {
            if ( wishList.getDateAdded() != null ) {
                wishList1.setDateAdded( new SimpleDateFormat( "yyyy-MM-dd" ).parse( wishList.getDateAdded() ) );
            }
        }
        catch ( ParseException e ) {
            throw new RuntimeException( e );
        }
        wishList1.setStatus( wishList.getStatus() );

        return wishList1;
    }

    @Override
    public List<WishListDTO> wishListEntitiesToDTO(List<WishList> wishList) {
        if ( wishList == null ) {
            return null;
        }

        List<WishListDTO> list = new ArrayList<WishListDTO>( wishList.size() );
        for ( WishList wishList1 : wishList ) {
            list.add( wishListEntityToDTO( wishList1 ) );
        }

        return list;
    }

    @Override
    public List<WishList> wishListDTOToEntities(List<WishListDTO> wishListDTO) {
        if ( wishListDTO == null ) {
            return null;
        }

        List<WishList> list = new ArrayList<WishList>( wishListDTO.size() );
        for ( WishListDTO wishListDTO1 : wishListDTO ) {
            list.add( wishListDTOToEntity( wishListDTO1 ) );
        }

        return list;
    }

    private Long wishListIdProductIdProduct(WishList wishList) {
        if ( wishList == null ) {
            return null;
        }
        Product idProduct = wishList.getIdProduct();
        if ( idProduct == null ) {
            return null;
        }
        Long idProduct1 = idProduct.getIdProduct();
        if ( idProduct1 == null ) {
            return null;
        }
        return idProduct1;
    }

    private String wishListIdCustomerFirstName(WishList wishList) {
        if ( wishList == null ) {
            return null;
        }
        Customer idCustomer = wishList.getIdCustomer();
        if ( idCustomer == null ) {
            return null;
        }
        String firstName = idCustomer.getFirstName();
        if ( firstName == null ) {
            return null;
        }
        return firstName;
    }

    private String wishListIdProductDescription(WishList wishList) {
        if ( wishList == null ) {
            return null;
        }
        Product idProduct = wishList.getIdProduct();
        if ( idProduct == null ) {
            return null;
        }
        String description = idProduct.getDescription();
        if ( description == null ) {
            return null;
        }
        return description;
    }

    private Long wishListIdCustomerIdCustomer(WishList wishList) {
        if ( wishList == null ) {
            return null;
        }
        Customer idCustomer = wishList.getIdCustomer();
        if ( idCustomer == null ) {
            return null;
        }
        Long idCustomer1 = idCustomer.getIdCustomer();
        if ( idCustomer1 == null ) {
            return null;
        }
        return idCustomer1;
    }

    protected Customer wishListDTOToCustomer(WishListDTO wishListDTO) {
        if ( wishListDTO == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setIdCustomer( wishListDTO.getIdCustomer() );

        return customer;
    }

    protected Product wishListDTOToProduct(WishListDTO wishListDTO) {
        if ( wishListDTO == null ) {
            return null;
        }

        Product product = new Product();

        product.setIdProduct( wishListDTO.getIdProduct() );

        return product;
    }
}
