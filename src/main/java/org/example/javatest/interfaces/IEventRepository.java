package org.example.javatest.interfaces;

import org.example.javatest.api.model.Event;

public interface IEventRepository {
    Event save(Event event);
}
