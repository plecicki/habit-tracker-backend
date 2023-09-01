package pl.plecicki.habittracker.mappers;

import pl.plecicki.habittracker.domains.dtos.RewardCreateDto;
import pl.plecicki.habittracker.domains.entities.Reward;

public class RewardMapper {

    public static Reward mapToRewardFromCreateDto(final RewardCreateDto rewardCreateDto) {
        return new Reward(
                0L,
                rewardCreateDto.getTitle(),
                rewardCreateDto.getDescription(),
                rewardCreateDto.getPriorityPoints(),
                rewardCreateDto.getImageAddress()
        );
    }
}
