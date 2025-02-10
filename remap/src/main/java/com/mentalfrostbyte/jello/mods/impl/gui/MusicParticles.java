// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.gui;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.PremiumModule;
import mapped.Class5740;
import mapped.Class7386;
import mapped.EventListener;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class MusicParticles extends PremiumModule
{
    public long field16021;
    private List<Class7386> field16022;
    
    public MusicParticles() {
        super("MusicParticles", "Shows nice particles when music is playing", Category.GUI);
        this.field16021 = 0L;
        this.field16022 = new ArrayList<Class7386>();
        this.method9915(false);
    }
    
    @EventListener
    private void method10683(final Class5740 class5740) {
        if (this.isEnabled() && MusicParticles.mc.player != null) {
            if (Client.getInstance().method35199().method24184()) {
                if (Client.getInstance().method35199().visualizerData.size() != 0) {
                    final float min = Math.min(10.0f, Math.max(0.0f, (System.nanoTime() - this.field16021) / 1.810361E7f));
                    double max = 0.0;
                    final int n = 4750;
                    for (int i = 0; i < 3; ++i) {
                        max = Math.max(max, Math.sqrt(Client.getInstance().method35199().field30354.get(i)) - 1000.0);
                    }
                    final float n2 = (0.7f + (float)(max / (n - 1000)) * 8.14f) * min;
                    int n3 = 0;
                    while (this.field16022.size() < 40) {
                        this.method10684();
                        if (n3++ <= n2) {
                            continue;
                        }
                        break;
                    }
                    this.method10685(n2);
                    final Iterator<Class7386> iterator = this.field16022.iterator();
                    while (iterator.hasNext()) {
                        iterator.next().method22685();
                    }
                }
            }
            this.field16021 = System.nanoTime();
        }
    }
    
    @Override
    public void onEnable() {
        this.field16021 = System.nanoTime();
    }
    
    private void method10684() {
        this.field16022.add(new Class7386());
    }
    
    private void method10685(final float n) {
        final Iterator<Class7386> iterator = this.field16022.iterator();
        while (iterator.hasNext()) {
            final Class7386 class7386 = iterator.next();
            class7386.method22684(n);
            if (!class7386.method22686()) {
                continue;
            }
            iterator.remove();
        }
    }
}
