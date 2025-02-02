package opal_labs.de.opal_labs.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "users")
public class User {
    @Id
    private String id;
    private String username;
    private String email;
    private String password;
    private boolean isTeacher;
    private int teacherId;
    private List<String> classes;
    private String date;

    // Getter und Setter für 'id'
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Getter und Setter für 'username'
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Getter und Setter für 'email'
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter und Setter für 'password'
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Getter und Setter für 'isTeacher'
    public boolean isTeacher() {
        return isTeacher;
    }

    public void setTeacher(boolean teacher) {
        isTeacher = teacher;
    }

    // Getter und Setter für 'teacherId'
    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    // Getter und Setter für 'classes'
    public List<String> getClasses() {
        return classes;
    }

    public void setClasses(List<String> classes) {
        this.classes = classes;
    }

    // Getter und Setter für 'date'
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
