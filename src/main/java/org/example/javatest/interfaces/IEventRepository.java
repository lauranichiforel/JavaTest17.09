package org.example.javatest.interfaces;

import org.example.javatest.api.model.Event;

import java.util.Optional;

public interface IEventRepository {
    Event save(Event event);
    Optional<Event> findById(Long id);
    Event update(Long id, Event updatedEvent);
    void deleteById(Long id);
}
