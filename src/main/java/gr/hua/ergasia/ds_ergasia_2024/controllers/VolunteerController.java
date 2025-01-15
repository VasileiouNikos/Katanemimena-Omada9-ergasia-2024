package gr.hua.ergasia.ds_ergasia_2024.controllers;

import gr.hua.ergasia.ds_ergasia_2024.entities.Volunteer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/volunteers")
public class VolunteerController {

    @Autowired
    private VolunteerService volunteerService;

    // Εγγραφή εθελοντή για εκδήλωση
    @PostMapping("/{volunteerId}/events/{eventId}/register")
    public Volunteer registerForEvent(@PathVariable Long volunteerId, @PathVariable Long eventId) {
        return volunteerService.registerForEvent(volunteerId, eventId);
    }

    // Ανάκτηση των εκδηλώσεων στις οποίες συμμετέχει ο εθελοντής
    @GetMapping("/{volunteerId}/events")
    public List<Event> getVolunteerEvents(@PathVariable Long volunteerId) {
        return volunteerService.getVolunteerEvents(volunteerId);
    }

    // Check-in εθελοντή σε εκδήλωση
    @PutMapping("/{volunteerId}/events/{eventId}/check-in")
    public Volunteer checkIn(@PathVariable Long volunteerId, @PathVariable Long eventId) {
        return volunteerService.checkIn(volunteerId, eventId);
    }
}

