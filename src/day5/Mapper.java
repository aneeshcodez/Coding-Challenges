package day5;


public class Mapper {
    public static UserDto mapUser(User user){
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        String mailID = user.getEmail();
        if(mailID != null){
            userDto.setHasEmail(true);
        }
        else {
            userDto.setHasEmail(false);
        }
        return userDto;

    }
}