package pl.plecicki.habittracker.init;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.plecicki.habittracker.domains.entities.Reward;
import pl.plecicki.habittracker.repositories.RewardRepository;

import java.io.IOException;
import java.io.InputStream;

@Service
@RequiredArgsConstructor
public class Initializer {

    private final RewardRepository rewardRepository;

    @PostConstruct
    public void init() throws IOException {
        InputStream inJson = Reward.class.getResourceAsStream("/rewards.json");
        Reward[] rewards = new ObjectMapper().readValue(inJson, Reward[].class);

        for (int rewardId=1; rewardId<=rewards.length; rewardId++) {
            if (!rewardRepository.existsById((long) rewardId)) rewardRepository.save(rewards[rewardId - 1]);
        }
    }
}
