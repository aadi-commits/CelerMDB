package com.celermdb;

import com.celermdb.server.CelerServer;

public class CelerMDB {
    public static void main(String[] args) throws Exception {

        CelerServer server = new CelerServer();

        server.start();
    }
}
