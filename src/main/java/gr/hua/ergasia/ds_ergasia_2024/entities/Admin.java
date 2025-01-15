package gr.hua.ergasia.ds_ergasia_2024.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity  // Η κλάση αυτή αντιστοιχεί σε πίνακα στην βάση δεδομένων
public class Admin {

    // Δηλώνει το πρωτεύον κλειδί για αυτήν την οντότητα
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Η τιμή του ID θα δημιουργείται αυτόματα από την βάση
    private Long id;

    private String name;
    private String email;
    private String password;

    // Μέθοδοι για να διαβάσουμε και να τροποποιήσουμε τα πεδία αυτής της οντότητας

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
}

