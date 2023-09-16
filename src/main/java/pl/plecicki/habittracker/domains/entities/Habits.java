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
    @Column(nullable = false, unique = true)
    private Long habitId;

    @Column
    private Boolean meditation;

    @Column
    private Integer meditationTime;

    @Column
    private Boolean reading;

    @Column
    private Integer readingTime;

    @Column
    private String readingTitle;

    @Column
    private String exercisingName;

    @Column
    private Short gratitudeAmount;

    @Column
    private Boolean learning;

    @Column
    private Integer learningTime;

    @Column
    private Boolean coldShower;

    @Column
    private Integer coldShowerTime;

    @Column
    private String otherGoodHabits;

    @Column
    private String badHabits;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;
}
