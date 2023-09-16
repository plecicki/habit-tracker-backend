package pl.plecicki.habittracker.repositories;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.plecicki.habittracker.domains.entities.Habits;

@Repository
public interface HabitTableRepository extends CrudRepository<Habits, Long> {

    @Transactional
    @Modifying
    @Query(value = "ALTER TABLE HABITS?1 ADD READING VARCHAR(255)",
    nativeQuery = true)
    void addReadingColumn(Long userId);

    @Transactional
    @Modifying
    @Query(value = "CREATE TABLE IF NOT EXISTS HABITS?1 (HabitId bigint)",
            nativeQuery = true)
    void createTable(Long userId);
}
