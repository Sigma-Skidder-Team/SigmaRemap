package com.mentalfrostbyte.jello.network;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.Event;
import com.mentalfrostbyte.jello.event.MethodWrapper;
import com.mentalfrostbyte.jello.event.priority.Priority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.settings.Setting;
import com.mentalfrostbyte.jello.module.ModuleWithModuleSettings;
import mapped.Class6715;
import mapped.Handler;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PacketHandler {

    private boolean thing = false;

    @Handler
    private void method35031(boolean var1, Class7232 var2, boolean var3, boolean var4) {
        if (!thing) {

            while (!Class6715.field29434) {
                try {
                    Thread.sleep(999L);
                } catch (InterruptedException interruptedException) {
                    throw new RuntimeException(interruptedException);
                }
            }

            thing = true;

            if (var2 instanceof Class7234) {
                for (Object object : Class6715.field29433) {
                    boolean var10 = false;

                    for (Class declaredMethods = object.getClass(); declaredMethods != null; declaredMethods = declaredMethods.getSuperclass()) {
                        for (Method method : declaredMethods.getDeclaredMethods()) {
                            if (Client.getInstance().getEventManager().isEventMethod(method)) {
                                method.setAccessible(true);
                                Priority methodPriority = Client.getInstance().getEventManager().getMethodPriority(method);
                                Class parameterType = method.getParameterTypes()[0];
                                MethodWrapper methodWrapper = new MethodWrapper(object, declaredMethods, method, methodPriority);
                                Map<Class<? extends Event>, List<MethodWrapper>> var19 = Client.getInstance()
                                        .getEventManager()
                                        .field31402
                                        .getOrDefault(declaredMethods, new HashMap<>());

                                List<MethodWrapper> var20 = var19.get(parameterType);
                                if (var20 == null) {
                                    var19.put(parameterType, var20 = new ArrayList());
                                }

                                var20.add(methodWrapper);
                                var19.put(parameterType, var20);
                                Client.getInstance().getEventManager().field31402.put(declaredMethods, var19);
                            }
                        }
                    }
                }

                Client.getInstance().getEventManager().method23217();

                for (Module var23 : Client.getInstance().getModuleManager().getModuleMap().values()) {
                    for (Setting var28 : var23.getSettingMap().values()) {
                        var28.clearPremiumModes();
                    }

                    if (var23 instanceof ModuleWithModuleSettings) {
                        for (Module var33 : ((ModuleWithModuleSettings) var23).moduleArray) {
                            for (Setting var37 : var33.getSettingMap().values()) {
                                var37.clearPremiumModes();
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
