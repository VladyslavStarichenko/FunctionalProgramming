package model;

import java.util.List;

public class Laureate {
    private Integer id;
    private String firstname;
    private String surname;
    private String born;
    private String died;
    private String bornCountry;
    private String bornCountryCode;
    private String bornCity;
    private String diedCountry;
    private String diedCountryCode;
    private String diedCity;
    private String gender;
    private List<Prize> prizes;

    @Override
    public String toString() {
        return "Laureate{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", born='" + born + '\'' +
                ", died='" + died + '\'' +
                ", bornCountry='" + bornCountry + '\'' +
                ", bornCountryCode='" + bornCountryCode + '\'' +
                ", bornCity='" + bornCity + '\'' +
                ", diedCountry='" + diedCountry + '\'' +
                ", diedCountryCode='" + diedCountryCode + '\'' +
                ", diedCity='" + diedCity + '\'' +
                ", gender='" + gender + '\'' +
                ", prizes=" + prizes +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBorn() {
        return born;
    }

    public void setBorn(String born) {
        this.born = born;
    }

    public String getDied() {
        return died;
    }

    public void setDied(String died) {
        this.died = died;
    }

    public String getBornCountry() {
        return bornCountry;
    }

    public void setBornCountry(String bornCountry) {
        this.bornCountry = bornCountry;
    }

    public String getBornCountryCode() {
        return bornCountryCode;
    }

    public void setBornCountryCode(String bornCountryCode) {
        this.bornCountryCode = bornCountryCode;
    }

    public String getBornCity() {
        return bornCity;
    }

    public void setBornCity(String bornCity) {
        this.bornCity = bornCity;
    }

    public String getDiedCountry() {
        return diedCountry;
    }

    public void setDiedCountry(String diedCountry) {
        this.diedCountry = diedCountry;
    }

    public String getDiedCountryCode() {
        return diedCountryCode;
    }

    public void setDiedCountryCode(String diedCountryCode) {
        this.diedCountryCode = diedCountryCode;
    }

    public String getDiedCity() {
        return diedCity;
    }

    public void setDiedCity(String diedCity) {
        this.diedCity = diedCity;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Prize> getPrizes() {
        return prizes;
    }

    public void setPrizes(List<Prize> prizes) {
        this.prizes = prizes;
    }
}
