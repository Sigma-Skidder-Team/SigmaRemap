package com.mentalfrostbyte.jello.network;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.Event;
import com.mentalfrostbyte.jello.event.MethodWrapper;
import com.mentalfrostbyte.jello.event.priority.Priority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.unmapped.Setting;
import mapped.ModuleWithModuleSettings;
import mapped.Class6715;
import mapped.Handler;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PacketHandler {
    @Handler
    private void method35031(boolean var1, Class7232 var2, boolean var3, boolean var4) {
        WebsocketManager var7 = Client.getInstance().getWebsocketManager();
        if (var7.field29206 == null) {
            while (!Class6715.field29434) {
                try {
                    Thread.sleep(999L);
                } catch (InterruptedException var21) {
                    var21.printStackTrace();
                }
            }

            var7.field29206 = var2;
            if (var2 instanceof Class7234) {
                for (Object var9 : Class6715.field29433) {
                    boolean var10 = false;

                    for (Class var11 = var9.getClass(); var11 != null; var11 = var11.getSuperclass()) {
                        for (Method var15 : var11.getDeclaredMethods()) {
                            if (Client.getInstance().getEventManager().isEventMethod(var15)) {
                                var15.setAccessible(true);
                                Priority var16 = Client.getInstance().getEventManager().getMethodPriority(var15);
                                Class var17 = var15.getParameterTypes()[0];
                                MethodWrapper var18 = new MethodWrapper(var9, var11, var15, var16);
                                Map<Class<? extends Event>, List<MethodWrapper>> var19 = Client.getInstance()
                                        .getEventManager()
                                        .field31402
                                        .getOrDefault(var11, new HashMap<>());

                                List<MethodWrapper> var20 = var19.get(var17);
                                if (var20 == null) {
                                    var19.put(var17, var20 = new ArrayList());
                                }

                                var20.add(var18);
                                var19.put(var17, var20);
                                Client.getInstance().getEventManager().field31402.put(var11, var19);
                            }
                        }
                    }
                }

                Client.getInstance().getEventManager().method23217();

                for (Module var23 : Client.getInstance().getModuleManager().getModuleMap().values()) {
                    for (Setting var28 : var23.method15989().values()) {
                        var28.method18622();
                    }

                    if (var23 instanceof ModuleWithModuleSettings) {
                        for (Module var33 : ((ModuleWithModuleSettings) var23).moduleArray) {
                            for (Setting var37 : var33.method15989().values()) {
                                var37.method18622();
                            }
                        }
                    }

                    if (var23.isEnabled()) {
                        Client.getInstance().getEventManager().subscribe(var23);
                        if (var23 instanceof ModuleWithModuleSettings) {
                            ModuleWithModuleSettings var27 = (ModuleWithModuleSettings) var23;
                            if (var27.module != null) {
                                Client.getInstance().getEventManager().subscribe(var27.module);
                            }
                        }
                    } else {
                        Client.getInstance().getEventManager().unsubscribe(var23);
                        if (var23 instanceof ModuleWithModuleSettings) {
                            ModuleWithModuleSettings var26 = (ModuleWithModuleSettings) var23;

                            for (Module var36 : var26.moduleArray) {
                                Client.getInstance().getEventManager().unsubscribe(var36);
                            }
                        }
                    }
                }
            }
        }
    }
}
