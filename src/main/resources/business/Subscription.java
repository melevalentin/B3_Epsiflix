package business;

import java.math.BigDecimal;
import java.util.Collection;

public class Subscription {
    private int id;
    private String label;
    private BigDecimal price;
    private String description;
    private Collection<Users> usersById;

    public Subscription() {
    }

    public Subscription(int id, String label, BigDecimal price, String description) {
        this.id = id;
        this.label = label;
        this.price = price;
        this.description = description;
    }

    public Subscription(int id, String label, BigDecimal price, String description, Collection<Users> usersById) {
        this.id = id;
        this.label = label;
        this.price = price;
        this.description = description;
        this.usersById = usersById;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<Users> getUsersById() {
        return usersById;
    }

    public void setUsersById(Collection<Users> usersById) {
        this.usersById = usersById;
    }
}
