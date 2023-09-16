package pl.plecicki.habittracker.domains.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.plecicki.habittracker.enums.Role;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "User")
public class User {

    @Id
    @GeneratedValue
    @Column(nullable = false, unique = true)
    private Long userId;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private Role role;

    @OneToMany
    private List<Habits> habits;

}
