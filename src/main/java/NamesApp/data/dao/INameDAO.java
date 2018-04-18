package NamesApp.data.dao;

import NamesApp.model.Name;
import org.springframework.data.jpa.repository.JpaRepository;

public interface INameDAO extends JpaRepository<Name, String>
{
	
}
