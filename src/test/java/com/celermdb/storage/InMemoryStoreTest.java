package com.celermdb.storage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InMemoryStoreTest {

    @Test
    void shouldSetAndGetValue(){
        InMemoryStore store = new InMemoryStore();

        store.set("name", "Adit");

        assertEquals("Adit", store.get("name"));
    }

    @Test
    void shouldReturnTrueWhenKeyExists(){
        InMemoryStore store = new InMemoryStore();

        store.set("name", "Adit");

        assertTrue(store.exists("name"));
    }

    @Test
    void shouldReturnFalseWhenKeyDoesNotExist(){
        InMemoryStore store = new InMemoryStore();

        assertFalse(store.exists("name"));
    }

    @Test
    void shouldDeleteValue(){
        InMemoryStore store = new InMemoryStore();
        store.set("name", "Adit");

        assertTrue(store.delete("name"));
        assertFalse(store.exists("name"));
        assertNull(store.get("name"));
    }
}
