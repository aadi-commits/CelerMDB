package com.celermdb.command;

import com.celermdb.storage.InMemoryStore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class GetCommandTest {

    @Test
    void shouldGetValue(){
        InMemoryStore store = new InMemoryStore();

        store.set("name", "Adit");

        GetCommand command = new GetCommand("name");

        String result = command.execute(store);

        assertEquals("Adit", result);
    }

    @Test
    void shouldReturnNullForMissingKey(){
        InMemoryStore store = new InMemoryStore();

        GetCommand command = new GetCommand("unknown");

        String result = command.execute(store);

        assertNull(result);
    }
}
