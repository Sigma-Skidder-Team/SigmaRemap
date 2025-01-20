package com.mentalfrostbyte.jello.unmapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleWithModuleSettings;
import net.minecraft.client.Minecraft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class RandomModuleThread implements Runnable {
    public static Thread field8341 = new Thread(new RandomModuleThread());
    public static boolean field8342 = false;
    public static HashMap<Object, Integer> field8343;
    private static String[] field8340;

    static {
        field8341.start();
    }

    @Override
    public void run() {
        field8343 = new HashMap<Object, Integer>();

        while (!Thread.currentThread().isInterrupted()) {
            if (Thread.currentThread().isInterrupted()) {
                break;
            }

            if (Minecraft.getInstance().world != null) {
                boolean var3 = false;
                boolean var4 = false;
                if (Client.getInstance().getModuleManager() != null) {
                    List<Module> var5 = new ArrayList<>(Client.getInstance().getModuleManager().getModuleMap().values());

                    for (Module var7 : Client.getInstance().getModuleManager().getModuleMap().values()) {
                        if (var7 instanceof ModuleWithModuleSettings) {
                            var5.addAll(Arrays.asList(((ModuleWithModuleSettings) var7).moduleArray));
                        }
                    }

                    for (Module var10 : var5) {
                        if (var10.getClass().getSuperclass() != Module.class && var10.getClass().getSuperclass() != ModuleWithModuleSettings.class) {
                            var3 = true;
                            if (field8343.containsKey(var10) && field8343.get(var10) != var10.method15994()) {
                                var4 = true;
                            }

                            field8343.put(var10, var10.method15994());
                        }
                    }

                    if (var4 || !var3) {
                        field8342 = true;
                    }
                }
            }
        }
    }
}
