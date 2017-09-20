package business;

import java.io.Serializable;

public class User implements Serializable {

    private String firstName;
    private String lastName;
    private String email;
    private String num;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String username;
    private String password;

    public User() {
        firstName = "";
        lastName = "";
        email = "";
        num = "";
        address = "";
        city = "";
        state = "";
        zipCode = "";
        username = "";
        password = "";
    }

    public User(String firstName, String lastName, String email, String num,
            String address, String city, String state, String zipCode,
            String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.num = num;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhone(String num){
        this.num = num;
    }
    
    public String getNum(){
        return num;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

