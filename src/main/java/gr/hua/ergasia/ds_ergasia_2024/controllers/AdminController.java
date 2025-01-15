package gr.hua.ergasia.ds_ergasia_2024.controllers;


import gr.hua.ergasia.ds_ergasia_2024.entities.Event;
import gr.hua.ergasia.ds_ergasia_2024.entities.Volunteer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    // Εγκεκριμένες εκδηλώσεις
    @PutMapping("/events/{eventId}/approve")
    public Event approveEvent(@PathVariable Long eventId) {
        return adminService.approveEvent(eventId);
    }

    // Επιβεβαίωση εθελοντή
    @PutMapping("/volunteers/{volunteerId}/confirm")
    public Volunteer confirmVolunteer(@PathVariable Long volunteerId) {
        return adminService.confirmVolunteer(volunteerId);
    }

    // Ανάκτηση όλων των εκδηλώσεων σε εκκρεμότητα
    @GetMapping("/events/pending")
    public List<Event> getPendingEvents() {
        return adminService.getPendingEvents();
    }

    // Ανάκτηση όλων των εθελοντών σε εκκρεμότητα
    @GetMapping("/volunteers/pending")
    public List<Volunteer> getPendingVolunteers() {
        return adminService.getPendingVolunteers();
    }
}
