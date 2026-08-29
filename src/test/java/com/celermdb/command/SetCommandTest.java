package com.celermdb.command;

import com.celermdb.storage.InMemoryStore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetCommandTest {

    @Test
    void shouldSetValue(){
        InMemoryStore store = new InMemoryStore();

        SetCommand command = new SetCommand("name", "Adit");

        String result = command.execute(store);

        assertEquals("OK", result);
        assertEquals("Adit", store.get("name"));
    }
}
