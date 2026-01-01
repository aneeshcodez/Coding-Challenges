package day6;


public class Main {
    public static void main(String[] args) {
        User user = createUser();
        UserDto userDto = Mapper.mapUser(user);
        printDTO(userDto);

    }

    private static User createUser() {
        User user = new User();
        user.setName("Ram");
        user.setEmail("Ran@gmail.com");
        user.setPassword("pwd1");
        user.setId(4);
        return user;
    }
    public static void printDTO(UserDto userDto1){
        System.out.println(userDto1.getId());
        System.out.println(userDto1.getName());
        System.out.println(userDto1.isHasEmail());

    }

}