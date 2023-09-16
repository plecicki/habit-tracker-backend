package pl.plecicki.habittracker.domains.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "User")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "USER_ID", nullable = false, unique = true)
    private Long userId;

    @OneToMany
    private List<Habits> habits;

}
