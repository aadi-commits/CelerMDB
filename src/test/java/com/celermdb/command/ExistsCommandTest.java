package com.celermdb.command;

import com.celermdb.storage.InMemoryStore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExistsCommandTest {

    @Test
    void shouldExistsValue(){

        InMemoryStore store = new InMemoryStore();
        store.set("name", "Adit");

        ExistsCommand command = new ExistsCommand("name");

        String result = command.execute(store);

        assertEquals("1", result);

        assertTrue(store.exists("name"));

    }

    @Test
    void shouldReturnZeroOnNotFound(){

        InMemoryStore store = new InMemoryStore();

        ExistsCommand command = new ExistsCommand("unknown");

        String result = command.execute(store);

        assertEquals("0", result);
    }
}
