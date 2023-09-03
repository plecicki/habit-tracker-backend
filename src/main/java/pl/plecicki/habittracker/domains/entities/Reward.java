package pl.plecicki.habittracker.domains.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "REWARDS")
public class Reward {

    @Id
    @GeneratedValue
    @Column(name = "REWARD_ID", nullable = false, unique = true)
    private Long rewardId;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "PRIORITY_POINTS")
    private Integer priorityPoints;

    @Column(name = "IMAGE_FILE")
    private String imageFile;
}
