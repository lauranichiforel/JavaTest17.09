package org.example.javatest.api.model;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class Event {

    private Long id;

    private String title;

    private String description;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private List<Attendee> attendees;

    public Event(final Long id, final String title, final String description, final LocalDateTime startTime, final LocalDateTime endTime) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
