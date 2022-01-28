package example.demo.service;

import example.demo.model.Client;
import example.demo.repo.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepo clientRepo;

    @Override
    public void create(Client client) {
        clientRepo.save(client);
    }

    @Override
    public Client gettingClientById(Long id) {
        return clientRepo.findById(id).orElse(null);
    }

    @Override
    public List<Client> getClientsByFirstNameAndLastName(String firstName, String lastName) {
        return clientRepo.findAllByFirstNameAndLastName(firstName, lastName);
    }

    @Override
    public List<Client> getClientsByFirstName(String firstName) {
        return clientRepo.findAllByFirstName(firstName);
    }

    @Override
    public List<Client> getClientsByMail(String mail) {
        return clientRepo.findBooksByMail(mail);
    }

    @Override
    public List<Client> gettingClientsByNumber(Integer number) {
        return clientRepo.findByNumber(number);
    }


    @Override
    public boolean deleteClient(Long id) {
        if (clientRepo.existsById(id)) {
            clientRepo.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public boolean updateClient(Client client, Long id) {
        if (clientRepo.existsById(id)) {
            client.setId(id);
            clientRepo.save(client);
            return true;
        }
        return false;
    }
}
