package pl.plecicki.habittracker.mappers;

import org.springframework.stereotype.Service;
import pl.plecicki.habittracker.domains.dtos.HabitsCreateDto;
import pl.plecicki.habittracker.domains.dtos.HabitsEditDto;
import pl.plecicki.habittracker.domains.entities.Habits;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HabitsMapper {

    public Habits mapToHabitsFromCreate(final HabitsCreateDto habitsCreateDto) {
        return new Habits(
                0L,
                habitsCreateDto.getMeditation(),
                habitsCreateDto.getMeditationTime(),
                habitsCreateDto.getReading(),
                habitsCreateDto.getReadingTime(),
                habitsCreateDto.getReadingTitle(),
                habitsCreateDto.getExercisingName(),
                habitsCreateDto.getGratitudeAmount(),
                habitsCreateDto.getLearning(),
                habitsCreateDto.getLearningTime(),
                habitsCreateDto.getColdShower(),
                habitsCreateDto.getColdShowerTime(),
                habitsCreateDto.getOtherGoodHabits(),
                habitsCreateDto.getBadHabits(),
                habitsCreateDto.getUser()
        );
    }

    public Habits mapToHabitsFromEdit(final HabitsEditDto habitsEditDto) {
        return new Habits(
                habitsEditDto.getHabitId(),
                habitsEditDto.getMeditation(),
                habitsEditDto.getMeditationTime(),
                habitsEditDto.getReading(),
                habitsEditDto.getReadingTime(),
                habitsEditDto.getReadingTitle(),
                habitsEditDto.getExercisingName(),
                habitsEditDto.getGratitudeAmount(),
                habitsEditDto.getLearning(),
                habitsEditDto.getLearningTime(),
                habitsEditDto.getColdShower(),
                habitsEditDto.getColdShowerTime(),
                habitsEditDto.getOtherGoodHabits(),
                habitsEditDto.getBadHabits(),
                habitsEditDto.getUser()
        );
    }

    public HabitsCreateDto mapToHabitsCreateDto(final Habits habits) {
        return new HabitsCreateDto(
                habits.getMeditation(),
                habits.getMeditationTime(),
                habits.getReading(),
                habits.getReadingTime(),
                habits.getReadingTitle(),
                habits.getExercisingName(),
                habits.getGratitudeAmount(),
                habits.getLearning(),
                habits.getLearningTime(),
                habits.getColdShower(),
                habits.getColdShowerTime(),
                habits.getOtherGoodHabits(),
                habits.getBadHabits(),
                habits.getUser()
        );
    }

    public HabitsEditDto mapToHabitsEditDto(final Habits habits) {
        return new HabitsEditDto(
                habits.getHabitId(),
                habits.getMeditation(),
                habits.getMeditationTime(),
                habits.getReading(),
                habits.getReadingTime(),
                habits.getReadingTitle(),
                habits.getExercisingName(),
                habits.getGratitudeAmount(),
                habits.getLearning(),
                habits.getLearningTime(),
                habits.getColdShower(),
                habits.getColdShowerTime(),
                habits.getOtherGoodHabits(),
                habits.getBadHabits(),
                habits.getUser()
        );
    }

    public List<HabitsCreateDto> mapToHabitsCreateDtoList(final List<Habits> habitsList) {
        return habitsList.stream()
                .map(this::mapToHabitsCreateDto)
                .collect(Collectors.toList());
    }

    public List<HabitsEditDto> mapToHabitsEditDtoList(final List<Habits> habitsList) {
        return habitsList.stream()
                .map(this::mapToHabitsEditDto)
                .collect(Collectors.toList());
    }
}
