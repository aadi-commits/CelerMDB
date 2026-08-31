package com.celermdb.command;

import com.celermdb.storage.InMemoryStore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class DeleteCommandTest {

    @Test
    void shouldDeleteValue(){

        InMemoryStore store = new InMemoryStore();
        store.set("name", "Adit");

        DeleteCommand command = new DeleteCommand("name");

        String result = command.execute(store);

        assertEquals("1", result);
        assertFalse(store.exists("name"));

    }

    @Test
    
}
