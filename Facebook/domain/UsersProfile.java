package LLD.Facebook.domain;

import java.time.LocalDateTime;
import java.util.List;

public class UsersProfile {
    String id;
    String name;
    String email;
    String contact;
    String schoolName;
    String bachelorCollageName;
    LocalDateTime birthDay;
    String mastersCollageName;



    public String getName() {
        return name;
    }
}
