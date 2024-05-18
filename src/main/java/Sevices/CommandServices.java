package Sevices;

import com.example.example.FootballCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CommandRepository;

import java.util.List;

@Service
public class CommandServices {
    private final CommandRepository commandRepository;

    @Autowired
    public CommandServices(CommandRepository commandRepository) {
        this.commandRepository = commandRepository;
    }

    public List<FootballCommand> getAllOwners() {
        return commandRepository.findAll();
    }

    public FootballCommand getOwnerById(Long id) {
        return commandRepository.findById(id).orElse(null);
    }

    public FootballCommand createOwner(FootballCommand command) {
        return commandRepository.save(command);
    }

    public FootballCommand updateOwner(FootballCommand command) {
        return commandRepository.save(command);
    }

    public void deleteOwner(Long id) {
        commandRepository.deleteById(id);
    }
}
