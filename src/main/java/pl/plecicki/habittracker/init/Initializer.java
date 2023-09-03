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

    private final int FIRST_REWARD_ID = 1;
    private final String REWARD_FILE_IN_RESOURCES_NAME = "/rewards.json";

    @PostConstruct
    public void init() throws IOException {
        InputStream inJson = Reward.class.getResourceAsStream(REWARD_FILE_IN_RESOURCES_NAME);
        Reward[] rewards = new ObjectMapper().readValue(inJson, Reward[].class);

        for (int rewardId = FIRST_REWARD_ID; rewardId <= rewards.length; rewardId++) {
            boolean rewardDoesntExist = !rewardRepository.existsById((long) rewardId);
            if (rewardDoesntExist) {
                rewardRepository.save(rewards[rewardId - 1]);
            }
        }
    }
}
