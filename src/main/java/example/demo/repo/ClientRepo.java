package example.demo.repo;

import example.demo.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ClientRepo extends JpaRepository<Client, Long>{

    List<Client> findByNumber(Integer number);
    List<Client> findAllByFirstNameAndLastName(String firstName, String lastName);
    List<Client> findAllByFirstName(String firstName);
    List<Client> findBooksByMail(String mail);
}
