package models;

import java.util.Objects;

public class volunteer1 {
    private String name;
    private String email;
    private String phone;
    private String message;
    private int id;


    public volunteer1(String name, String email, String phone, String message) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        volunteer1 volunteer1 = (volunteer1) o;
        return phone == volunteer1.phone &&
                Objects.equals(name, volunteer1.name) &&
                Objects.equals(email, volunteer1.email) &&
                Objects.equals(message, volunteer1.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, phone, message);
    }
}
