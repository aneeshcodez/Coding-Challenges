package day8;

public class Main {
    public static void main(String[] args) {
        UserDto userDto = createUserDto();
        User user = Mapper.mapUserDto(userDto);
        printUser(user);
    }

    private static UserDto createUserDto() {
        UserDto userDto = new UserDto();
        userDto.setId(1);
        userDto.setName("Suresh");
        userDto.setHasEmail(false);
        return userDto;
    }
    public static void printUser(User user){
        System.out.println(user.getId());
        System.out.println(user.getName());

    }

}
