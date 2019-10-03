package models;

import java.util.Objects;

public class donator1 {
    private String name;
    private String email;
    private String phone;
    private String donations;
    private int id;

    public donator1(String name, String email, String phone, String donations) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.donations = donations;
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

    public String getDonations() {
        return donations;
    }

    public void setDonations(String donations) {
        this.donations = donations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        donator1 donator1 = (donator1) o;
        return Objects.equals(name, donator1.name) &&
                Objects.equals(email, donator1.email) &&
                Objects.equals(phone, donator1.phone) &&
                Objects.equals(donations, donator1.donations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, phone, donations);
    }
}
