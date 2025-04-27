// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.auth;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.auth.events.DeferredEventState;
import com.mentalfrostbyte.jello.auth.events.DeferredFalseState;
import com.mentalfrostbyte.jello.auth.events.DeferredTrueState;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.ModuleWithSettings;
import com.mentalfrostbyte.jello.settings.Setting;
import mapped.*;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.net.URISyntaxException;
import javax.net.ssl.HttpsURLConnection;
import java.util.HashMap;

public class AgoraManager {
    private AgoraWebSocket agoraWebSocket;
    private static Thread reconnectThread = null;
    public DeferredEventState deferredState;

    public void connect() {
        this.createConnection();
    }

    public void createConnection() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("Cookie", "agoratk=00");
        headers.put("X-Forwarded-For", "1.1.1.1");
        headers.put("User-Agent", "Agora client");
        headers.put("Referer", "https://agora.sigmaclient.info");

        String token = Client.getInstance().getNetworkManager().getToken().replaceAll("-", "");
        try {
            agoraWebSocket = new AgoraWebSocket(this, "wss://wsprg.sigmaclient.info/ws/agora/" + token, headers);
            agoraWebSocket.setSocketFactory(HttpsURLConnection.getDefaultSSLSocketFactory());
            agoraWebSocket.connect();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    public void loadLicense() {
        IRCManager.loadLicense();
    }

    public synchronized void scheduleReconnect() {
        if (reconnectThread == null) {
            reconnectThread = new Thread(() -> {
                try {
                    Thread.sleep(10000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                createConnection();
                reconnectThread = null;
            });
            reconnectThread.start();
        }
    }

    public void setupDeferredState(DeferredEventState deferredState) {
        if (this.deferredState != null) {
            return;
        }

        while (!DeferredEventRegistry.modulesLoaded) {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.deferredState = deferredState;

        if (!(deferredState instanceof DeferredFalseState)) {
            if (deferredState instanceof DeferredTrueState) {
                for (Object object : DeferredEventRegistry.pendingRegistrations) {
                    for (Class<?> clazz = object.getClass(); clazz != null; clazz = clazz.getSuperclass()) {
                        for (Method method : clazz.getDeclaredMethods()) {
                            if (Client.getInstance().getEventBus().isValidEventHandler(method)) {
                                method.setAccessible(true);
                                EventPriority priority = Client.getInstance().getEventBus().getPriority(method);
                                Class<?> eventClass = method.getParameterTypes()[0];

                                EventHandler eventHandler = new EventHandler(object, clazz, method, priority);
                                Map<Class<? extends IEvent>, List<EventHandler>> handlerMap = Client.getInstance().getEventBus()
                                        .moduleHandlers
                                        .getOrDefault(clazz, new HashMap<>());

                                List<EventHandler> handlers = handlerMap.get(eventClass);
                                if (handlers == null) {
                                    handlers = new ArrayList<>();
                                    handlerMap.put((Class<? extends IEvent>) eventClass, handlers);
                                }
                                handlers.add(eventHandler);
                                handlerMap.put((Class<? extends IEvent>) eventClass, handlers);

                                Client.getInstance().getEventBus().moduleHandlers.put((Class<? extends Module>) clazz, handlerMap);
                            }
                        }
                    }
                }

                Client.getInstance().getEventBus().cleanEmptyHandlers();

                for (Module module : Client.getInstance().moduleManager().getModuleMap().values()) {
                    for (Setting setting : module.getSettingMap().values()) {
                        setting.syncState();
                    }

                    if (module instanceof ModuleWithSettings) {
                        ModuleWithSettings moduleWithSettings = (ModuleWithSettings) module;
                        for (Module subModule : moduleWithSettings.moduleArray) {
                            for (Setting setting : subModule.getSettingMap().values()) {
                                setting.syncState();
                            }
                        }
                    }

                    if (module.isEnabled()) {
                        Client.getInstance().getEventBus().register(module);

                        if (module instanceof ModuleWithSettings) {
                            ModuleWithSettings modWithSettings = (ModuleWithSettings) module;
                            if (modWithSettings.parentModule != null) {
                                Client.getInstance().getEventBus().register(modWithSettings.parentModule);
                            }
                        }
                    } else {
                        Client.getInstance().getEventBus().unregister(module);

                        if (module instanceof ModuleWithSettings) {
                            ModuleWithSettings modWithSettings = (ModuleWithSettings) module;
                            for (Module subModule : modWithSettings.moduleArray) {
                                Client.getInstance().getEventBus().unregister(subModule);
                            }
                        }
                    }
                }
            }
        }
    }

    public void killLicense() {
        LicenseManager.killLicenseAndExit();
    }
}
