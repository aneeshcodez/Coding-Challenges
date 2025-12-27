package day2;

import java.util.ArrayList;
import java.util.List;

public class ListsMapper {
    List<UserDto> toDtoList(List<User> users){
        if(users==null){
            List<UserDto> emptyList = new ArrayList<>();
            return emptyList;
        }
        List<UserDto> finalList = new ArrayList<>();
        for (User eachUser : users) {
            UserDto userDto = new UserDto();
            userDto.setId(eachUser.getId());
            userDto.setName(eachUser.getName());
            finalList.add(userDto);
        }
        return finalList;

    }
}
