package com.celermdb.command;

import com.celermdb.storage.InMemoryStore;

public class ExistsCommand implements Command {

    private final String key;

    public ExistsCommand(String key){
        this.key = key;
    }

    @Override
    public String execute(InMemoryStore store) {

        return store.exists(key) ? "1" : "0";
    }
}
