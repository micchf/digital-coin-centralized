package me.micch;

import me.micch.server.Server;

public class Main extends Server {

    @Override
    public void onStart() {
        System.out.println("Avvio del server");
    }

    @Override
    public void onStop() {
        System.out.println("Stop del server");
    }
}
