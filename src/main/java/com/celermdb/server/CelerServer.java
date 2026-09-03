package com.celermdb.server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class CelerServer {

    public void start() throws IOException {
        ServerSocketChannel serverChannel1 = ServerSocketChannel.open();

        serverChannel1.bind(
                new InetSocketAddress(6380)
        );

        System.out.println("CelerMDB listening on port 6380");

        while (true){
            SocketChannel client = serverChannel1.accept();

            System.out.println(
                    "Client connected: " + client.getRemoteAddress()
            );
        }
    }

}
