package GrandKidsFestival;

public class userClass {
    private String firstName;
    private String middleInitial;
    private String lastName;
    private String userAddress;
    private String userCity;
    private String state;
    private String zipcode;
    private String phoneNum;
    private String userEmail;
    private String username;
    private String userPassword;

    public userClass (String fName, String MI, String lName, String address, String city, String st, String zip, String phone, String email, String userid, String password)
    {
        firstName = fName;
        middleInitial = MI;
        lastName = lName;
        userAddress = address;
        userCity = city;
        state = st;
        zipcode = zip;
        phoneNum = phone;
        userEmail = email;
        username = userid;
        userPassword = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String finalString() {
        return firstName + "," + middleInitial + "," + lastName + "," + userAddress + "," + userCity + "," + state + "," + zipcode + "," + phoneNum + "," + userEmail + "," + username + "," + userPassword;
    }
}