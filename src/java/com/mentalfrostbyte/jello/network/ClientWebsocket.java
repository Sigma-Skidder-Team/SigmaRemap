package com.mentalfrostbyte.jello.network;

import mapped.Class344;
import mapped.Class7296;
import mapped.Handler;
import org.json.JSONObject;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

public class ClientWebsocket extends Class344 {
    private final WebsocketManager field1543;

    public ClientWebsocket(WebsocketManager var1, String var2, Map<String, String> var3) throws URISyntaxException {
        super(new URI(var2), var3);
        this.field1543 = var1;
    }

    @Override
    public void method1758(Class7296 var1) {

    }

    @Override
    public void handleIncomingAction(String var1) {
        JSONObject var4 = new JSONObject(var1);

        if (var4.has("action")) {
            switch (var4.getInt("action")) {
                case 1:
                    for (Method var8 : Handler.packetHandler.getClass().getDeclaredMethods()) {
                        if (var8.getParameterCount() == 4) {
                            var8.setAccessible(true);

                            try {
                                var8.invoke(Handler.packetHandler, false, Class7232.method22709(String.valueOf(var4.getBoolean("variation"))), true, true);
                            } catch (IllegalAccessException | IllegalArgumentException |
                                     InvocationTargetException var10) {
                                var10.printStackTrace();
                            }
                        }
                    }
                    break;
                case 2:
                    this.field1543.method20285();
            }
        }
    }

    @Override
    public void method1760(int var1, String var2, boolean var3) {
        this.field1543.method20284();
    }

    @Override
    public void method1761(Exception var1) {
        var1.printStackTrace();
        this.field1543.method20284();
    }
}
