// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.ModuleWithSettings;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ModuleSettingInitializr implements Runnable {
    public static Thread thread;
    public static boolean field8977;
    public static HashMap<Object, Integer> field8978;

    @Override
    public void run() {
        ModuleSettingInitializr.field8978 = new HashMap<>();
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Thread.sleep(150000L);
                if (!Thread.currentThread().isInterrupted()) {
                    if (Minecraft.getInstance().world == null) {
                        continue;
                    }
                    boolean b = false;
                    boolean b2 = false;
                    if (Client.getInstance().moduleManager() == null) {
                        continue;
                    }
                    final List<Module> list = new ArrayList<>(Client.getInstance().moduleManager().getModuleMap().values());
                    for (final Module mod : Client.getInstance().moduleManager().getModuleMap().values()) {
                        if (mod instanceof ModuleWithSettings) {
                            list.addAll(Arrays.asList(((ModuleWithSettings) mod).moduleArray));
                        }
                    }
                    for (final Module key : list) {
                        if (key.getClass().getSuperclass() != Module.class && key.getClass().getSuperclass() != ModuleWithSettings.class) {
                            b = true;
                            if (ModuleSettingInitializr.field8978.containsKey(key) && ModuleSettingInitializr.field8978.get(key) != key.getRandomAssOffset()) {
                                System.out.println(key.getName() + " DIFFER!");
                                b2 = true;
                            }
                            ModuleSettingInitializr.field8978.put(key, key.getRandomAssOffset());
                        }
                    }
                    if (!b2 && b) {
                        continue;
                    }
                    ModuleSettingInitializr.field8977 = true;
                    continue;
                }
            } catch (final InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            break;
        }
    }

    static {
        ModuleSettingInitializr.thread = new Thread(new ModuleSettingInitializr());
        ModuleSettingInitializr.field8977 = false;
        ModuleSettingInitializr.thread.start();
    }
}
