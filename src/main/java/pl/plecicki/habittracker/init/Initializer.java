package pl.plecicki.habittracker.init;

import com.fasterxml.jackson.databind.ObjectMapper;
import javax.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.plecicki.habittracker.domains.entities.Reward;
import pl.plecicki.habittracker.domains.entities.User;
import pl.plecicki.habittracker.enums.Role;
import pl.plecicki.habittracker.repositories.RewardRepository;
import pl.plecicki.habittracker.repositories.UserRepository;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class Initializer {

    private final RewardRepository rewardRepository;
    //TODO Delete
    private final UserRepository userRepository;

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

        User user1 = new User(0L, "aaa", "$2a$12$BFUoL/MHbuOSUoBnIuti/.Y8inIG84wQlmTFK9Z9Ih4SqtGwCqv1O", Role.USER, new ArrayList<>());
        User user2 = new User(0L, "bbb", "$2a$12$8yE5Kd1WPlvdsTRiA2ul4OD1M1ZIhKQvYZO1TZrbcH3yrVxEja8/m", Role.ADMIN, new ArrayList<>());
        userRepository.save(user1);
        userRepository.save(user2);
        System.out.println(user1.getRole().name());
        System.out.println(user2.getRole().name());
    }
}
