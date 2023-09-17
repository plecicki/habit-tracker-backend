package pl.plecicki.habittracker.mappers;

import org.springframework.stereotype.Service;
import pl.plecicki.habittracker.domains.dtos.UserCreateDto;
import pl.plecicki.habittracker.domains.dtos.UserEditDto;
import pl.plecicki.habittracker.domains.entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserMapper {

    public User mapToUserFromCreate(final UserCreateDto userCreateDto) {
        return new User(
                0L,
                userCreateDto.getUsername(),
                userCreateDto.getPassword(),
                userCreateDto.getRole(),
                userCreateDto.getNickname(),
                userCreateDto.getEmail(),
                userCreateDto.getPhotoFileName(),
                new ArrayList<>()
        );
    }

    public User mapToUserFromEdit(final UserEditDto userEditDto) {
        return new User(
                userEditDto.getUserId(),
                userEditDto.getUsername(),
                userEditDto.getPassword(),
                userEditDto.getRole(),
                userEditDto.getNickname(),
                userEditDto.getEmail(),
                userEditDto.getPhotoFileName(),
                new ArrayList<>()
        );
    }

    public UserCreateDto mapToUserCreateDto(final User user) {
        return new UserCreateDto(
                user.getUsername(),
                user.getPassword(),
                user.getRole(),
                user.getNickname(),
                user.getEmail(),
                user.getPhotoFileName()
        );
    }

    public UserEditDto mapToUserEditDto(final User user) {
        return new UserEditDto(
                user.getUserId(),
                user.getUsername(),
                user.getPassword(),
                user.getRole(),
                user.getNickname(),
                user.getEmail(),
                user.getPhotoFileName()
        );
    }

    public List<UserCreateDto> mapToUserCreateDtoList(final List<User> userList) {
        return userList.stream()
                .map(this::mapToUserCreateDto)
                .collect(Collectors.toList());
    }

    public List<UserEditDto> mapToUserEditDtoList(final List<User> userList) {
        return userList.stream()
                .map(this::mapToUserEditDto)
                .collect(Collectors.toList());
    }
}
