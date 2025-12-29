package day4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Obj 1
        User user = new User();
        user.setName("Ram");
        user.setEmail("Ran@gmail.com");
        user.setPassword("pwd1");
        user.setId(4);
        //Obj 2
        User user1 = new User();
        user1.setName("Sam");
        user1.setEmail("Sam@gmail.com");
        user1.setPassword("pwd2");
        user1.setId(6);


        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user1);


        ListsMapper listsMapper = new ListsMapper();
        List<UserDto> resultList = listsMapper.toDtoList(users);

        //Printing the results
        for(UserDto userDto1 : resultList){
            System.out.println(userDto1.getId());
            System.out.println(userDto1.getName());
            System.out.println(userDto1.isHasEmail());


        }

    }
}
