package pl.plecicki.habittracker.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.plecicki.habittracker.domains.entities.HabitTable;

import java.sql.SQLSyntaxErrorException;
import java.util.List;

@Repository
public interface HabitTableFactory extends CrudRepository<HabitTable, Long> {

//    @Query(value = "SELECT COUNT(*) " +
//            "FROM information_schema.columns " +
//            "WHERE table_name = :tableName " +
//            "AND column_name = :columnName", nativeQuery = true)
//    List<Object[]> checkIfColumnExists(String tableName, String columnName);

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
