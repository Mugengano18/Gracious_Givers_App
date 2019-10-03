package models;

import java.util.Objects;

public class volunteer {
    private String name;
    private String email;
    private String phone;
    private String message;
    private int id;


    public volunteer(String name, String email, String phone, String message) {
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
        volunteer volunteer = (volunteer) o;
        return phone == volunteer.phone &&
                Objects.equals(name, volunteer.name) &&
                Objects.equals(email, volunteer.email) &&
                Objects.equals(message, volunteer.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, phone, message);
    }
}
