package NamesApp.data.dao;

import NamesApp.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressDAO extends JpaRepository<Address, String>
{
	
}
