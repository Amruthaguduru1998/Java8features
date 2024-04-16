package java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class User{
    private int id;
    private String username;
    private String passowrd;
    private String email;

    public User(int id, String username, String passowrd, String email) {
        this.id = id;
        this.username = username;
        this.passowrd = passowrd;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", passowrd='" + passowrd + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassowrd() {
        return passowrd;
    }

    public void setPassowrd(String passowrd) {
        this.passowrd = passowrd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
class UserDto{
    private int id;
    private String username;
    private String email;

    public UserDto(int id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
public class StreamMapDemo {
    public static void main(String[] args) {
        List<User> userList=new ArrayList<>();
        userList.add(new User(1,"ammu","secrete","ammu@gamil.com"));
        userList.add(new User(2,"veera","secrete","veera@gamil.com"));
        userList.add(new User(3,"monu","secrete","monu@gamil.com"));

        List<UserDto> userDtos=new ArrayList<>();

        for (User user:userList) {
            userDtos.add(new UserDto(user.getId(),user.getUsername(),user.getEmail()));
        }

        for (UserDto dto: userDtos) {
            System.out.println(dto);
        }
        System.out.println("-------------------------------");
        userList.stream().map((User user)->new UserDto(user.getId(),user.getUsername(),user.getEmail())).forEach(x-> System.out.println(x));

        System.out.println("-------------------------------------");
        List<UserDto>userDtoList=userList.stream().map((User user)->new UserDto(user.getId(),user.getUsername(),user.getEmail())).collect(Collectors.toList());
        System.out.println(userDtoList);
    }

}
