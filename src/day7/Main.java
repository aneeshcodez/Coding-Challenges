package day7;


public class Main {
    public static void main(String[] args) {
        User user = createUser();
        UserDto userDto = Mapper.mapUser(user);
        printDTO(userDto);

    }

    private static User createUser() {
        User user = new User();
        user.setPassword("pwd1");
        return user;
    }
    public static void printDTO(UserDto userDto1){
        System.out.println("ID:"+userDto1.getId());
        System.out.println("NAME:"+userDto1.getName());
        System.out.println("EMAIL:"+userDto1.isHasEmail());

    }

}

// Output of the program :
//ID:0
//NAME:null
//EMAIL:false

