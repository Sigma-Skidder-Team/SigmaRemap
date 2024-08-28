package com.mentalfrostbyte.jello.network;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.unmapped.Class8402;
import mapped.Class7324;

import javax.net.ssl.HttpsURLConnection;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class WebsocketManager {
    private static Thread field29205 = null;
    public ClientWebsocket field29204;
    public Class7232 field29206;

    public void method20281() {
        this.method20282();
    }

    public void method20282() {
       /* Map<String, String> header = new HashMap<>();
        header.put("Cookie", "agoratk=00");
        header.put("X-Forwarded-For", "1.1.1.1");
        header.put("User-Agent", "Agora client");
        header.put("Referer", "https://agora.sigmaclient.info");
        String var4 = Client.getInstance().getNetworkManager().method30459().replaceAll("-", "");

        try {
            this.field29204 = new ClientWebsocket(this, "wss://wsprg.sigmaclient.info/ws/agora/" + var4, header);
            this.field29204.method1765(HttpsURLConnection.getDefaultSSLSocketFactory());
            this.field29204.method1742();
        } catch (URISyntaxException var6) {
            var6.printStackTrace();
        }*/
    }

    public void method20283() {
        Class8402.method29517();
    }

    public synchronized void method20284() {
        if (field29205 == null) {
            field29205 = new Thread(() -> {
                try {
                    Thread.sleep(10000L);
                } catch (InterruptedException var4) {
                    var4.printStackTrace();
                }

                this.method20282();
                field29205 = null;
            });
            field29205.start();
        }
    }

    public void method20285() {
        Class7324.method23219();
    }
}
