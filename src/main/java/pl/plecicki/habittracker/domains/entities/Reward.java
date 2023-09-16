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
    @Column(nullable = false, unique = true)
    private Long rewardId;

    @Column
    private String title;

    @Column
    private String description;

    @Column
    private Integer priorityPoints;

    @Column
    private String imageFile;
}
