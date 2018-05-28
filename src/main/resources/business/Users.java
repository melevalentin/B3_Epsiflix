package business;

import java.util.Collection;

public class Users {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String phone;
    private String password;
    private String ccInfos;
    private byte isAdmin;
    private Collection<Favoris> favorisesById;
    private Subscription subscriptionByIdSubscription;

    public Users() {
    }

    public Users(int id, String firstName, String lastName, String email, String address, String phone, String password, String ccInfos, byte isAdmin, Collection<Favoris> favorisesById, Subscription subscriptionByIdSubscription) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.password = password;
        this.ccInfos = ccInfos;
        this.isAdmin = isAdmin;
        this.favorisesById = favorisesById;
        this.subscriptionByIdSubscription = subscriptionByIdSubscription;
    }

    public Users(int id, String firstName, String lastName, String email, String address, String phone, String password, String ccInfos, byte isAdmin, Subscription subscriptionByIdSubscription) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.password = password;
        this.ccInfos = ccInfos;
        this.isAdmin = isAdmin;
        this.subscriptionByIdSubscription = subscriptionByIdSubscription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCcInfos() {
        return ccInfos;
    }

    public void setCcInfos(String ccInfos) {
        this.ccInfos = ccInfos;
    }

    public byte getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(byte isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Collection<Favoris> getFavorisesById() {
        return favorisesById;
    }

    public void setFavorisesById(Collection<Favoris> favorisesById) {
        this.favorisesById = favorisesById;
    }

    public Subscription getSubscriptionByIdSubscription() {
        return subscriptionByIdSubscription;
    }

    public void setSubscriptionByIdSubscription(Subscription subscriptionByIdSubscription) {
        this.subscriptionByIdSubscription = subscriptionByIdSubscription;
    }
}
