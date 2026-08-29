package com.celermdb.command;

import com.celermdb.storage.InMemoryStore;

public interface Command {

    String execute(InMemoryStore store);
}
