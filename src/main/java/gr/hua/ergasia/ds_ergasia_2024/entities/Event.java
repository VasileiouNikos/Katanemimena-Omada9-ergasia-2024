package gr.hua.ergasia.ds_ergasia_2024.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity  // Η κλάση αυτή αντιστοιχεί σε πίνακα στην βάση δεδομένων
public class Event {

    // Δηλώνει το πρωτεύον κλειδί για αυτήν την οντότητα
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Η τιμή του ID θα δημιουργείται αυτόματα από την βάση
    private Long id;

    private String eventName;  // Τίτλος της εκδήλωσης
    private String eventType;  // Περιγραφή της εκδήλωσης
    private LocalDateTime Date;  // Ημερομηνία και ώρα της εκδήλωσης
    private boolean approved;  // Αν η εκδήλωση έχει εγκριθεί από τον Admin

    @ManyToOne  // Σχέση many-to-one με την οργάνωση που δημοσιεύει την εκδήλωση
    private Organization organization;  // Η οργάνωση που δημοσιεύει την εκδήλωση

    // Getters and Setters
    // Μέθοδοι για να διαβάσουμε και να τροποποιήσουμε τα πεδία αυτής της οντότητας

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return eventName;
    }

    public void setTitle(String title) {
        this.eventName = title;
    }

    public String getDescription() {return eventType;}

    public void setDescription(String description) {
        this.eventType = description;
    }

    public LocalDateTime getEventDate() {
        return Date;
    }

    public void setEventDate(LocalDateTime eventDate) {
        this.Date = eventDate;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

}
