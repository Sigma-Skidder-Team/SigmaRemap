package com.mentalfrostbyte.jello.network;

import com.mentalfrostbyte.jello.util.tracker.CombatTracker;
import mapped.Class8499;
import net.minecraft.client.Minecraft;

import java.util.HashMap;

public class Class8930 {
    private static String[] field40410;
    private final Minecraft field40411 = Minecraft.getInstance();
    private final CombatTracker field40412;
    private final HashMap<String, Class8499> field40413 = new HashMap<String, Class8499>();

    public Class8930(CombatTracker var1) {
        this.field40412 = var1;
    }

    public void method32651(String var1, String var2, long var3) {
        this.field40413.computeIfAbsent(var1, var0 -> new Class8499()).method30090(var3, var2);
        System.out.println(this.field40413.get(var1).field37176);
    }

    public Class8499 method32652(String var1) {
        return this.field40413.computeIfAbsent(var1, var0 -> new Class8499());
    }
}
