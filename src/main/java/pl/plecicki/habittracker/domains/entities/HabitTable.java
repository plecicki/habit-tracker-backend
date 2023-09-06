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
@Entity(name = "HABIT_TABLE")
public class HabitTable {

    @Id
    @GeneratedValue
    @Column(name = "HABIT_ID", nullable = false, unique = true)
    private Long rewardId;
}
