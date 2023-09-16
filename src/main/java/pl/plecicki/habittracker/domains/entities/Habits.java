package pl.plecicki.habittracker.domains.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "HABITS")
public class Habits {

    @Id
    @GeneratedValue
    @Column(name = "HABIT_ID", nullable = false, unique = true)
    private Long habitId;

    @Column(name = "MEDITATION")
    private Boolean meditation;

    @Column(name = "MEDITATION_TIME")
    private Integer meditationTime;

    @Column(name = "READING")
    private Boolean reading;

    @Column(name = "READING_TIME")
    private Integer readingTime;

    @Column(name = "READING_TITLE")
    private String readingTitle;

    @Column(name = "EXERCISING_NAME")
    private String exercisingName;

    @Column(name = "GRATITUDE_AMOUNT")
    private Short gratitudeAmount;

    @Column(name = "LEARNING")
    private Boolean learning;

    @Column(name = "LEARNING_TIME")
    private Integer learning_time;

    @Column(name = "COLD_SHOWER")
    private Boolean coldShower;

    @Column(name = "COLD_SHOWER_TIME")
    private Integer coldShowerTime;

    @Column(name = "OTHER_GOOD_HABITS")
    private String otherGoodHabits;

    @Column(name = "BAD_HABITS")
    private String badHabits;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;
}
