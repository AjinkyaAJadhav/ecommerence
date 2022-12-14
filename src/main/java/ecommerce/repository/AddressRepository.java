package ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ecommerce.entities.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
