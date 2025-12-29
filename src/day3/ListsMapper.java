package day3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListsMapper {
    List<UserDto> toDtoList(List<User> users){
        if(users==null){
            List<UserDto> emptyList = new ArrayList<>();
            return emptyList;
        }
        List<UserDto> finalList = users.stream().map(this::toDto).collect(Collectors.toList());
        return finalList;

    }

    // Mapping logic must stay inside toDto
    UserDto toDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        return userDto;
    }
    }

