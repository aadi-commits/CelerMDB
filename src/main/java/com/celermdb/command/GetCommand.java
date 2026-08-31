package com.celermdb.command;

import com.celermdb.storage.InMemoryStore;

public class GetCommand implements Command {

    private final String key;

    public GetCommand(String key){
        this.key = key;
    }

    @Override
    public String execute(InMemoryStore store) {
        return store.get(key);
    }
}
