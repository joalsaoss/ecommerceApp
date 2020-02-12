package com.joalsaoss.ecommerce.mappers;

import com.joalsaoss.ecommerce.dtos.CustomerDTO;
import com.joalsaoss.ecommerce.models.Customer;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-02-12T15:29:19-0500",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_212 (Oracle Corporation)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public CustomerDTO customerEntityToDTO(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerDTO customerDTO = new CustomerDTO();

        customerDTO.setFirstName( customer.getFirstName() );
        customerDTO.setLastName( customer.getLastName() );
        customerDTO.setPhone( customer.getPhone() );
        customerDTO.setEmail( customer.getEmail() );
        customerDTO.setIdCustomer( customer.getIdCustomer() );

        return customerDTO;
    }

    @Override
    public Customer customerDTOToEntity(CustomerDTO customer) {
        if ( customer == null ) {
            return null;
        }

        Customer customer1 = new Customer();

        customer1.setFirstName( customer.getFirstName() );
        customer1.setLastName( customer.getLastName() );
        customer1.setPhone( customer.getPhone() );
        customer1.setEmail( customer.getEmail() );
        customer1.setIdCustomer( customer.getIdCustomer() );

        return customer1;
    }

    @Override
    public List<CustomerDTO> customerEntitiesToDTO(List<Customer> customer) {
        if ( customer == null ) {
            return null;
        }

        List<CustomerDTO> list = new ArrayList<CustomerDTO>( customer.size() );
        for ( Customer customer1 : customer ) {
            list.add( customerEntityToDTO( customer1 ) );
        }

        return list;
    }

    @Override
    public List<Customer> customerDTOToEntities(List<CustomerDTO> customerDTO) {
        if ( customerDTO == null ) {
            return null;
        }

        List<Customer> list = new ArrayList<Customer>( customerDTO.size() );
        for ( CustomerDTO customerDTO1 : customerDTO ) {
            list.add( customerDTOToEntity( customerDTO1 ) );
        }

        return list;
    }
}
