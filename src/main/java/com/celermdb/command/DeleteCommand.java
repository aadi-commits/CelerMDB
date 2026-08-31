package com.celermdb.command;

import com.celermdb.storage.InMemoryStore;

public class DeleteCommand implements Command {

    private final String key;

    public DeleteCommand(String key){
        this.key = key;
    }

    @Override
    public String execute(InMemoryStore store) {

        return store.delete(key) ? "1" : "0";

    }
}
