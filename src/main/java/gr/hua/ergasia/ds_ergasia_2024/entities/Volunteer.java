package gr.hua.ergasia.ds_ergasia_2024.entities;

import javax.persistence.*;
import java.util.Set;

@Entity  // Η κλάση αυτή αντιστοιχεί σε πίνακα στην βάση δεδομένων
public class Volunteer {

    // Δηλώνει το πρωτεύον κλειδί για αυτήν την οντότητα
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Η τιμή του ID θα δημιουργείται αυτόματα από την βάση
    private Long id;

    private String name;
    private String email;
    private String password;
    private boolean confirmed;

    @ManyToMany  // Δηλώνει σχέση many-to-many με τις εκδηλώσεις
    private Set<Event> events;  // Εκδηλώσεις στις οποίες συμμετέχει ο εθελοντής


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    public Set<Event> getEvents() {
        return events;
    }

    public void setEvents(Set<Event> events) {
        this.events = events;
    }
}

