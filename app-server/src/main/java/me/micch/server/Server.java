package me.micch.server;

import lombok.Getter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Getter
public abstract class Server {
    final Logger logger;
    boolean running;

    public Server() {
        this.logger = LogManager.getLogger(getClass());
        startServer();
    }

    public void stopServer() {
        onStop();
        this.running = false;
    }

    private void startServer() {
        this.running = true;
        onStart();
    }

    public abstract void onStart();
    public abstract void onStop();
}
