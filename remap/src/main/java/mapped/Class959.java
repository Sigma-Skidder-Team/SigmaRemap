package mapped;

import org.java_websocket.WebSocket;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.framing.PingFrame;
import org.java_websocket.handshake.ServerHandshake;
import totalcross.json.JSONObject;

import java.net.URISyntaxException;
import java.net.URI;
import java.util.HashMap;

public class Class959 extends WebSocketClient {
    private AgoraManager field5102;

    public Class959(final AgoraManager field5102, final String str, final HashMap<String, String> hashMap) throws URISyntaxException {
        super(new URI(str), hashMap);
        this.field5102 = field5102;
    }

    @Override
    public void onOpen(final ServerHandshake serverHandshake) {
        this.field5102.method17550();
    }

    @Override
    public void onMessage(final String s) {
        final JSONObject JSONObject = new JSONObject(s);
        if (JSONObject.has("action")) {
            switch (JSONObject.getInt("action")) {
                case 1: {
                    this.field5102.method17552(Class7679.method24379(String.valueOf(JSONObject.getBoolean("variation"))));
                    break;
                }
                case 2: {
                    this.field5102.method17553();
                    break;
                }
            }
        }
    }

    @Override
    public void onClose(final int n, final String s, final boolean b) {
        this.field5102.method17551();
    }

    @Override
    public void onError(final Exception ex) {
        ex.printStackTrace();
        this.field5102.method17551();
    }

    @Override
    public PingFrame onPreparePing(WebSocket conn) {
        return null;
    }
}
