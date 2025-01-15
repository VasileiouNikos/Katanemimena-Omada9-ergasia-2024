package gr.hua.ergasia.ds_ergasia_2024.controllers;

import gr.hua.ergasia.ds_ergasia_2024.entities.Event;
import gr.hua.ergasia.ds_ergasia_2024.entities.Volunteer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/organizations")
public class OrganizationController {

    @Autowired
    private OrganizationService organizationService;

    // Δημιουργία εκδήλωσης
    @PostMapping("/events")
    public Event createEvent(@RequestBody Event event) {
        return organizationService.createEvent(event);
    }

    // Ανάκτηση εκδηλώσεων της οργάνωσης
    @GetMapping("/{orgId}/events")
    public List<Event> getOrganizationEvents(@PathVariable Long orgId) {
        return organizationService.getOrganizationEvents(orgId);
    }

    // Εξετάζει τις συμμετοχές των εθελοντών και επιβεβαιώνει
    @PutMapping("/events/{eventId}/volunteers/{volunteerId}/confirm")
    public Volunteer confirmVolunteerForEvent(@PathVariable Long eventId, @PathVariable Long volunteerId) {
        return organizationService.confirmVolunteerForEvent(eventId, volunteerId);
    }
}
