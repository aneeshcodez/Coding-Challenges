package day1;

//User Class
public class User {
    int id;
    String name;
    String email;
    String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



// To convert User object to UserDto object

    public static void main(String[] args) {
        User user = new User();
        user.setName("Ram");
        user.setEmail("Ran@gmail.com");
        user.setPassword("pwd1");
        user.setId(4);
        UserDto userDto = new UserDto();
        UserDto userDto1 = userDto.toDto(user);
        System.out.println("ID :" + userDto1.getId());
        System.out.println("Name:" + userDto1.getName());

    }
}
