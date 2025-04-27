package com.mentalfrostbyte.jello.auth.agora;

import com.mentalfrostbyte.jello.auth.events.DeferredEventState;
import com.mentalfrostbyte.jello.auth.managers.AgoraManager;
import org.java_websocket.WebSocket;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.framing.PingFrame;
import org.java_websocket.handshake.ServerHandshake;
import totalcross.json.JSONObject;

import java.net.URISyntaxException;
import java.net.URI;
import java.util.HashMap;

public class AgoraWebSocket extends WebSocketClient {
    private final AgoraManager agoraManager;

    public AgoraWebSocket(AgoraManager agoraManager, String url, HashMap<String, String> headers) throws URISyntaxException {
        super(new URI(url), headers);
        this.agoraManager = agoraManager;
    }

    @Override
    public void onOpen(ServerHandshake handshake) {
        agoraManager.loadLicense();
    }

    @Override
    public void onMessage(String message) {
        JSONObject json = new JSONObject(message);
        if (json.has("action")) {
            switch (json.getInt("action")) {
                case 1:
                    agoraManager.setupDeferredState(DeferredEventState.fromString(String.valueOf(json.getBoolean("variation"))));
                    break;
                case 2:
                    agoraManager.killLicense();
                    break;
            }
        }
    }

    @Override
    public void onClose(int code, String reason, boolean remote) {
        agoraManager.scheduleReconnect();
    }

    @Override
    public void onError(Exception ex) {
        ex.printStackTrace();
        agoraManager.scheduleReconnect();
    }

    @Override
    public PingFrame onPreparePing(WebSocket conn) {
        return null;
    }
}