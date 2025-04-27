// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.ModuleWithSettings;
import com.mentalfrostbyte.jello.settings.Setting;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.net.URISyntaxException;
import javax.net.ssl.HttpsURLConnection;
import java.util.HashMap;

public class AgoraManager {
    private Class959 field23930;
    private static Thread field23931;
    public DeferredEventState deferredState;

    public void method17548() {
        this.method17549();
    }

    public void method17549() {
        HashMap<String, String> neaders = new HashMap<>();
        neaders.put("Cookie", "agoratk=00");
        neaders.put("X-Forwarded-For", "1.1.1.1");
        neaders.put("User-Agent", "Agora client");
        neaders.put("Referer", "https://agora.sigmaclient.info");
        final String replaceAll = Client.getInstance().getNetworkManager().getToken().replaceAll("-", "");
        try {
            (this.field23930 = new Class959(this, "wss://wsprg.sigmaclient.info/ws/agora/" + replaceAll, neaders)).setSocketFactory(HttpsURLConnection.getDefaultSSLSocketFactory());
            this.field23930.connect();
        } catch (final URISyntaxException exc) {
            exc.printStackTrace();
        }
    }

    public void method17550() {
        IRCManager.method33654();
    }

    public synchronized void method17551() {
        if (AgoraManager.field23931 == null) {
            (AgoraManager.field23931 = new Thread(() -> {
                try {
                    Thread.sleep(10000L);
                } catch (final InterruptedException ex) {
                    ex.printStackTrace();
                }
                this.method17549();
                AgoraManager.field23931 = null;
            })).start();
        }
    }

    public void setupDeferredState(final DeferredEventState deferredState) {
        if (this.deferredState != null) {
            return;
        }
        while (!DeferredEventRegistry.modulesLoaded) {
            try {
                Thread.sleep(1000L);
            } catch (final InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        this.deferredState = deferredState;
        if (!(deferredState instanceof DeferredFalseState)) {
            if (deferredState instanceof DeferredTrueState) {
                for (final Object next : DeferredEventRegistry.pendingRegistrations) {
                    for (Class<?> key = next.getClass(); key != null; key = key.getSuperclass()) {
                        for (final Method method : key.getDeclaredMethods()) {
                            if (Client.getInstance().getEventBus().isValidEventHandler(method)) {
                                method.setAccessible(true);
                                final EventPriority method2 = Client.getInstance().getEventBus().getPriority(method);
                                final Class<?> clazz = method.getParameterTypes()[0];
                                final EventHandler eventHandler = new EventHandler(next, key, method, method2);
                                final Map<Class<? extends CancellableEvent>, List<EventHandler>> map = Client.getInstance().getEventBus().moduleHandlers.getOrDefault(key, new HashMap<Class<? extends CancellableEvent>, List<EventHandler>>());
                                List<EventHandler> list = map.get(clazz);
                                if (list == null) {
                                    map.put((Class<? extends CancellableEvent>) clazz, (ArrayList) (list = new ArrayList<EventHandler>()));
                                }
                                list.add(eventHandler);
                                map.put((Class<? extends CancellableEvent>) clazz, (ArrayList) list);
                                Client.getInstance().getEventBus().moduleHandlers.put((Class) key, map);
                            }
                        }
                    }
                }

                Client.getInstance().getEventBus().cleanEmptyHandlers();

                for (final Module mod : Client.getInstance().moduleManager().getModuleMap().values()) {
                    final Iterator<Setting> settingIterator = mod.getSettingMap().values().iterator();
                    while (settingIterator.hasNext()) {
                        settingIterator.next().method15201();
                    }
                    if (mod instanceof ModuleWithSettings) {
                        final Module[] field23933 = ((ModuleWithSettings) mod).moduleArray;
                        for (int length2 = field23933.length, j = 0; j < length2; ++j) {
                            final Iterator<Setting> iterator4 = field23933[j].getSettingMap().values().iterator();
                            while (iterator4.hasNext()) {
                                iterator4.next().method15201();
                            }
                        }
                    }

                    if (mod.isEnabled()) {
                        Client.getInstance().getEventBus().register(mod);
                        if (!(mod instanceof ModuleWithSettings)) {
                            continue;
                        }
                        final ModuleWithSettings modWithSettings = (ModuleWithSettings) mod;
                        if (modWithSettings.parentModule == null) {
                            continue;
                        }
                        Client.getInstance().getEventBus().register(modWithSettings.parentModule);
                    } else {
                        Client.getInstance().getEventBus().unregister(mod);
                        if (!(mod instanceof ModuleWithSettings)) {
                            continue;
                        }

                        final Module[] modArray = ((ModuleWithSettings) mod).moduleArray;
                        for (int length3 = modArray.length, k = 0; k < length3; ++k) {
                            Client.getInstance().getEventBus().unregister(modArray[k]);
                        }
                    }
                }
            }
        }
    }

    public void method17553() {
        Class8250.method27359();
    }

    static {
        AgoraManager.field23931 = null;
    }
}
