// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.misc;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.*;

import java.util.Iterator;
import java.util.HashMap;

public class StaffRepealer extends Module
{
    private HashMap<Integer, Integer> field16102;
    
    public StaffRepealer() {
        super(Category.MISC, "StaffRepealer", "Repeals hypixel's staff ban laws with a simple rage quit!");
        this.field16102 = new HashMap<Integer, Integer>();
    }
    
    @EventListener
    private void method10812(final EventPlayerTick eventPlayerTick) {
        if (!this.isEnabled()) {
            return;
        }
        if (ColorUtils.method19146()) {
            StaffRepealer.mc.gameSettings.method17124();
        }
    }
    
    @EventListener
    private void method10813(final Class5723 class5726) {
        if (this.isEnabled()) {
            if (class5726.method16998() instanceof SEntityPacket) {
                final SEntityPacket class5724 = (SEntityPacket)class5726.method16998();
            }
            if (class5726.method16998() instanceof Class4330) {
                new Thread(() -> {
                    final Object o = class5726.method16998();
                    try {
                        Thread.sleep(2000L);
                    }
                    catch (final InterruptedException ex) {
                        ex.printStackTrace();
                    }
                    class5725.method13001().iterator();
                    final Iterator iterator;
                    while (iterator.hasNext()) {
                        final Class4646 class5727 = iterator.next();
                        if (StaffRepealer.mc.world.method7143(class5727.method13869().getId()) == null && class5727.method13871() != null) {
                            ColorUtils.method19106("Detected an anomaly " + class5727 + class5727.method13869());
                        }
                        else {
                            System.out.println("all seems good " + class5727 + class5727.method13869());
                        }
                        int n = 0;
                        ++n;
                    }
                }).start();
            }
        }
    }
}
