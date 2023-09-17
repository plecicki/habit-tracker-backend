package pl.plecicki.habittracker.domains.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import pl.plecicki.habittracker.domains.entities.User;

@Getter
@AllArgsConstructor
public class HabitsCreateDto {
    private Boolean meditation;
    private Integer meditationTime;
    private Boolean reading;
    private Integer readingTime;
    private String readingTitle;
    private String exercisingName;
    private Short gratitudeAmount;
    private Boolean learning;
    private Integer learningTime;
    private Boolean coldShower;
    private Integer coldShowerTime;
    private String otherGoodHabits;
    private String badHabits;
    private User user;
}
