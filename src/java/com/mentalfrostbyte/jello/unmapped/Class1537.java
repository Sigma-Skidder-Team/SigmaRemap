package com.mentalfrostbyte.jello.unmapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.module.Module;
import mapped.Class5325;
import mapped.Minecraft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Class1537 implements Runnable {
    public static Thread field8341 = new Thread(new Class1537());
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
            try {
                Thread.sleep(150000L);
                if (Thread.currentThread().isInterrupted()) {
                    break;
                }

                if (Minecraft.getInstance().world != null) {
                    boolean var3 = false;
                    boolean var4 = false;
                    if (Client.getInstance().getModuleManager() != null) {
                        List<Module> var5 = new ArrayList<>(Client.getInstance().getModuleManager().method14664().values());

                        for (Module var7 : Client.getInstance().getModuleManager().method14664().values()) {
                            if (var7 instanceof Class5325) {
                                var5.addAll(Arrays.asList(((Class5325) var7).field23878));
                            }
                        }

                        for (Module var10 : var5) {
                            if (var10.getClass().getSuperclass() != Module.class && var10.getClass().getSuperclass() != Class5325.class) {
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
            } catch (InterruptedException var8) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
