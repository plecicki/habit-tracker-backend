package pl.plecicki.habittracker.repositories;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import pl.plecicki.habittracker.domains.entities.HabitTable;

import java.sql.SQLSyntaxErrorException;

public interface HabitTableFactory extends CrudRepository<HabitTable, Long> {

    @Transactional
    @Modifying
    @Query(value = "ALTER TABLE :userId ADD 'READING1' VARCHAR(255)",
    nativeQuery = true)
    void addReadingColumn(int userId);

    @Transactional
    @Modifying
    @Query(value = "CREATE TABLE :userId (HabitId bigint)",
            nativeQuery = true)
    void createTable(int userId);
}
