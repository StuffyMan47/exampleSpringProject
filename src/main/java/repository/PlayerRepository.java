package repository;

import com.example.example.FootballPlayer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  PlayerRepository extends JpaRepository<FootballPlayer, Long> {
}
