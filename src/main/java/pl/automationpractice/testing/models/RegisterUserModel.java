package pl.automationpractice.testing.models;

public class RegisterUserModel {

    String email, firstName, lastName, password, day, month, year, company, address, address2, city, state, zipCode, country, homePhone, mobilePhone;

    public RegisterUserModel(String email, String firstName, String lastName, String password, String day, String month, String year, String company, String address, String address2, String city, String state, String zipCode, String country, String homePhone, String mobilePhone) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.day = day;
        this.month = month;
        this.year = year;
        this.company = company;
        this.address = address;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getAddress2() {
        return address2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCountry() {
        return country;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }
}
