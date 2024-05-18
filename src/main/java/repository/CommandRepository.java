package repository;

import com.example.example.FootballCommand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  CommandRepository extends JpaRepository<FootballCommand, Long> {
}
