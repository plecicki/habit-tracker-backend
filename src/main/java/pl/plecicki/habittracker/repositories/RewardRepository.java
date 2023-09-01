package pl.plecicki.habittracker.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.plecicki.habittracker.domains.entities.Reward;

public interface RewardRepository extends CrudRepository<Reward, Long> {
}
