package day8;

public class Mapper {
    // User -> UserDto
    public static UserDto mapUser(User user){
        if(user == null){
            return new UserDto();
        }
        UserDto userDto = new UserDto();
        userDto.setId(checkId(user));
        userDto.setName(checkName(user));
        userDto.setHasEmail(checkMail(user));
        return userDto;
    }

    // UserDto -> User
    public static User mapUserDto(UserDto userDto){
        if(userDto==null){
            return null;
        }
        User user = new User();
        user.setId(userDto.getId());
        user.setName(userDto.getName());
        return user;
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

    public static int checkId(User user){
        int id = user.getId();
        if (id<0){
            return 0;
        }
        return id;
    }

    public static String checkName(User user){
        String name = user.getName();
        if (name==null){
            return null;
        }
        else {
            return name;
        }
    }

}