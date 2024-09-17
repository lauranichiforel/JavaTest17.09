package org.example.javatest.repository;

import org.example.javatest.api.model.Event;
import org.example.javatest.interfaces.IEventRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class EventRepository implements IEventRepository {

    private final List<Event> events = new ArrayList<>();
    private Long nextId = 1L;

    @Override
    public Event save(Event event) {
        event.setId(nextId++);
        events.add(event);
        return event;
    }

    @Override
    public Optional<Event> findById(Long id) {
        return events.stream().filter(e -> e.getId().equals(id)).findFirst();
    }

    @Override
    public Event update(Long id, Event updatedEvent) {
        Optional<Event> existingEvent = findById(id);
        if (existingEvent.isPresent()) {
            Event event = existingEvent.get();
            event.setTitle(updatedEvent.getTitle());
            event.setDescription(updatedEvent.getDescription());
            event.setStartTime(updatedEvent.getStartTime());
            event.setEndTime(updatedEvent.getEndTime());
            event.setAttendees(updatedEvent.getAttendees());
            return event;
        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
        events.removeIf(event -> event.getId().equals(id));
    }
}
