package contact.model;

import java.util.Iterator;

public class Contact {
    private String name;
    private String surName;
    private String company;
    private String email;
    private String phoneNumber;
    private String birthday;
    private String addreess;

    public Contact(){

    }
    public Contact(String name, String surName, String company, String email, String phoneNumber, String birthday, String addreess){
        this.name = name;
        this.surName = surName;
        this.company = company;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
        this.addreess = addreess;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddreess() {
        return addreess;
    }

    public void setAddreess(String addreess) {
        this.addreess = addreess;
    }



    @Override
    public String toString() {
        return "Kontakt ma'lumotlar:[" +
                "Ism='" + name + '\'' +
                ", Familya='" + surName + '\'' +
                ", Company='" + company + '\'' +
                ", Email='" + email + '\'' +
                ", Telefon raqam='" + phoneNumber + '\'' +
                ", tug'ilgan sana='" + birthday + '\'' +
                ", Yashash manzil='" + addreess + '\'' +
                ']';
    }



}
