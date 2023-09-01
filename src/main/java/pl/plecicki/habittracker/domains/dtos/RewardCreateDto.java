package pl.plecicki.habittracker.domains.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class RewardCreateDto {
    private String title;
    private String description;
    private Integer priorityPoints;
    private String imageAddress;
}
