package day6;

public class Mapper {
    public static UserDto mapUser(User user){
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        userDto.setHasEmail(checkMail(user));
        return userDto;
    }
    public static boolean checkMail(User user){
        String mailID = user.getEmail();
        if(mailID != null){
            return true;
        }
        else {
            return false;
        }
    }

}
