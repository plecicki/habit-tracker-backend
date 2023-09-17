package pl.plecicki.habittracker.domains.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import pl.plecicki.habittracker.domains.entities.Habits;
import pl.plecicki.habittracker.enums.Role;

import java.util.List;

@Getter
@AllArgsConstructor
public class UserEditDto {
    private Long userId;
    private String username;
    private String password;
    private Role role;
    private String nickname;
    private String email;
    private String photoFileName;
}
