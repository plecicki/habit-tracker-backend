package pl.plecicki.habittracker.init;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import pl.plecicki.habittracker.domains.dtos.RewardCreateDto;
import pl.plecicki.habittracker.domains.entities.Reward;
import pl.plecicki.habittracker.mappers.RewardMapper;
import pl.plecicki.habittracker.repositories.RewardRepository;

@Service
@RequiredArgsConstructor
public class Initializer {

    private final RewardRepository rewardRepository;

    private static Logger logger = LoggerFactory.getLogger(Initializer.class);

    @PostConstruct
    public void init() {
        if (!rewardRepository.existsById(1L)) rewardRepository.save(new Reward(1L, "CCC","AAA",1,"AAA"));
    }
}
