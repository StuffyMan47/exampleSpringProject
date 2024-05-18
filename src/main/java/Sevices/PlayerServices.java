package Sevices;

import com.example.example.FootballCommand;
import com.example.example.FootballPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CommandRepository;
import repository.PlayerRepository;

import java.util.List;

@Service
public class PlayerServices {

    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerServices(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<FootballPlayer> getAllOwners() {
        return playerRepository.findAll();
    }

    public FootballPlayer getOwnerById(Long id) {
        return playerRepository.findById(id).orElse(null);
    }

    public FootballPlayer createOwner(FootballPlayer player) {
        return playerRepository.save(player);
    }

    public FootballPlayer updateOwner(FootballPlayer player) {
        return playerRepository.save(player);
    }

    public void deleteOwner(Long id) {
        playerRepository.deleteById(id);
    }
}
