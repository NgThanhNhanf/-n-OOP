package User;

import java.time.LocalDate;

public class Person {
    private String name,address,phone,email;
    private LocalDate dob;
    public Person(){

    }

    public Person(String name, String address, String phone, String email, LocalDate dob) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public void  displayInformation(){
        System.out.println("name: " + getName() + " dob: " + getDob() + " address: " + getAddress());
        System.out.println("sdt: " + getPhone());
        System.out.println("email: " + getEmail());
    }
}
