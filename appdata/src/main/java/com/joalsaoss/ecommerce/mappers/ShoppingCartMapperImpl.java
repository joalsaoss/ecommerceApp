package com.joalsaoss.ecommerce.mappers;

import com.joalsaoss.ecommerce.dtos.ShoppingCartDTO;
import com.joalsaoss.ecommerce.models.Customer;
import com.joalsaoss.ecommerce.models.Product;
import com.joalsaoss.ecommerce.models.ShoppingCart;
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
public class ShoppingCartMapperImpl implements ShoppingCartMapper {

    @Override
    public ShoppingCartDTO shoppingCartEntityToDTO(ShoppingCart shoppingCart) {
        if ( shoppingCart == null ) {
            return null;
        }

        ShoppingCartDTO shoppingCartDTO = new ShoppingCartDTO();

        shoppingCartDTO.setIdShoppingCart( shoppingCart.getIdShoppingCart() );
        shoppingCartDTO.setIdProduct( shoppingCartIdProductIdProduct( shoppingCart ) );
        if ( shoppingCart.getDateModified() != null ) {
            shoppingCartDTO.setDateModified( new SimpleDateFormat( "yyyy-MM-dd" ).format( shoppingCart.getDateModified() ) );
        }
        shoppingCartDTO.setCustomerName( shoppingCartIdCustomerFirstName( shoppingCart ) );
        shoppingCartDTO.setProductName( shoppingCartIdProductDescription( shoppingCart ) );
        if ( shoppingCart.getDateAdded() != null ) {
            shoppingCartDTO.setDateAdded( new SimpleDateFormat( "yyyy-MM-dd" ).format( shoppingCart.getDateAdded() ) );
        }
        shoppingCartDTO.setIdCustomer( shoppingCartIdCustomerIdCustomer( shoppingCart ) );
        shoppingCartDTO.setStatus( shoppingCart.getStatus() );

        return shoppingCartDTO;
    }

    @Override
    public ShoppingCart shoppingCartDTOToEntity(ShoppingCartDTO shoppingCart) {
        if ( shoppingCart == null ) {
            return null;
        }

        ShoppingCart shoppingCart1 = new ShoppingCart();

        shoppingCart1.setIdCustomer( shoppingCartDTOToCustomer( shoppingCart ) );
        shoppingCart1.setIdProduct( shoppingCartDTOToProduct( shoppingCart ) );
        shoppingCart1.setIdShoppingCart( shoppingCart.getIdShoppingCart() );
        try {
            if ( shoppingCart.getDateModified() != null ) {
                shoppingCart1.setDateModified( new SimpleDateFormat( "yyyy-MM-dd" ).parse( shoppingCart.getDateModified() ) );
            }
        }
        catch ( ParseException e ) {
            throw new RuntimeException( e );
        }
        try {
            if ( shoppingCart.getDateAdded() != null ) {
                shoppingCart1.setDateAdded( new SimpleDateFormat( "yyyy-MM-dd" ).parse( shoppingCart.getDateAdded() ) );
            }
        }
        catch ( ParseException e ) {
            throw new RuntimeException( e );
        }
        shoppingCart1.setStatus( shoppingCart.getStatus() );

        return shoppingCart1;
    }

    @Override
    public List<ShoppingCartDTO> shoppingCartEntitiesToDTO(List<ShoppingCart> shoppingCart) {
        if ( shoppingCart == null ) {
            return null;
        }

        List<ShoppingCartDTO> list = new ArrayList<ShoppingCartDTO>( shoppingCart.size() );
        for ( ShoppingCart shoppingCart1 : shoppingCart ) {
            list.add( shoppingCartEntityToDTO( shoppingCart1 ) );
        }

        return list;
    }

    @Override
    public List<ShoppingCart> shoppingCartDTOToEntities(List<ShoppingCartDTO> shoppingCartDTO) {
        if ( shoppingCartDTO == null ) {
            return null;
        }

        List<ShoppingCart> list = new ArrayList<ShoppingCart>( shoppingCartDTO.size() );
        for ( ShoppingCartDTO shoppingCartDTO1 : shoppingCartDTO ) {
            list.add( shoppingCartDTOToEntity( shoppingCartDTO1 ) );
        }

        return list;
    }

    private Long shoppingCartIdProductIdProduct(ShoppingCart shoppingCart) {
        if ( shoppingCart == null ) {
            return null;
        }
        Product idProduct = shoppingCart.getIdProduct();
        if ( idProduct == null ) {
            return null;
        }
        Long idProduct1 = idProduct.getIdProduct();
        if ( idProduct1 == null ) {
            return null;
        }
        return idProduct1;
    }

    private String shoppingCartIdCustomerFirstName(ShoppingCart shoppingCart) {
        if ( shoppingCart == null ) {
            return null;
        }
        Customer idCustomer = shoppingCart.getIdCustomer();
        if ( idCustomer == null ) {
            return null;
        }
        String firstName = idCustomer.getFirstName();
        if ( firstName == null ) {
            return null;
        }
        return firstName;
    }

    private String shoppingCartIdProductDescription(ShoppingCart shoppingCart) {
        if ( shoppingCart == null ) {
            return null;
        }
        Product idProduct = shoppingCart.getIdProduct();
        if ( idProduct == null ) {
            return null;
        }
        String description = idProduct.getDescription();
        if ( description == null ) {
            return null;
        }
        return description;
    }

    private Long shoppingCartIdCustomerIdCustomer(ShoppingCart shoppingCart) {
        if ( shoppingCart == null ) {
            return null;
        }
        Customer idCustomer = shoppingCart.getIdCustomer();
        if ( idCustomer == null ) {
            return null;
        }
        Long idCustomer1 = idCustomer.getIdCustomer();
        if ( idCustomer1 == null ) {
            return null;
        }
        return idCustomer1;
    }

    protected Customer shoppingCartDTOToCustomer(ShoppingCartDTO shoppingCartDTO) {
        if ( shoppingCartDTO == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setIdCustomer( shoppingCartDTO.getIdCustomer() );

        return customer;
    }

    protected Product shoppingCartDTOToProduct(ShoppingCartDTO shoppingCartDTO) {
        if ( shoppingCartDTO == null ) {
            return null;
        }

        Product product = new Product();

        product.setIdProduct( shoppingCartDTO.getIdProduct() );

        return product;
    }
}
