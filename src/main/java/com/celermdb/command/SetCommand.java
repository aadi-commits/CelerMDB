package com.celermdb.command;

import com.celermdb.storage.InMemoryStore;

public class SetCommand implements Command {

    private final String key;
    private final String value;

    public SetCommand(String key, String value){
        this.key = key;
        this.value = value;
    }

    @Override
    public String execute(InMemoryStore store) {
        store.set(key, value);
        return "OK";
    }
}
