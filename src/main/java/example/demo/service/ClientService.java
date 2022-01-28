package example.demo.service;

import example.demo.model.Client;
import java.util.List;

public interface ClientService {

    void create(Client client);
    Client gettingClientById (Long id);
    List<Client> getClientsByFirstNameAndLastName(String firstName, String lastName);
    List<Client> getClientsByFirstName(String firstName);
    List<Client> getClientsByMail(String mail);
    List<Client> gettingClientsByNumber(Integer number);
    boolean deleteClient(Long id);
    boolean updateClient(Client client, Long id);
}
