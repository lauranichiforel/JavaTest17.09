package org.example.javatest.repository;

import org.example.javatest.api.model.Event;
import org.example.javatest.interfaces.IEventRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

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

}
