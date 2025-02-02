// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.flys;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.PremiumModule;
import mapped.*;

public class Cubecraft2Fly extends PremiumModule
{
    private int field16023;
    private Class7617 field16024;
    private boolean field16025;
    
    public Cubecraft2Fly() {
        super("Cubecraft2", "A fly for 1.9+ cubecraft", Category.MOVEMENT);
        this.field16024 = new Class7617();
    }
    
    @Override
    public void onEnable() {
        this.field16023 = 0;
        if (!Cubecraft2Fly.mc.gameSettings.field23440.method1056()) {
            this.field16025 = false;
        }
        else {
            Cubecraft2Fly.mc.gameSettings.field23440.field2162 = false;
            this.field16025 = true;
        }
        if (ColorUtils.method19148()) {
            if (Class9367.method34762() == Class7906.field32452.method25613()) {
                Client.getInstance().method35197().method25776(new Class6224("Cubecraft2 fly", "This fly was made for 1.9+ only"));
            }
        }
    }
    
    @Override
    public void onDisable() {
        Class7482.method23151(0.2);
        ColorUtils.method19155(-0.0789);
        if (ColorUtils.method19160(Cubecraft2Fly.mc.player, 0.001f)) {
            Class7482.method23151(0.0);
            ColorUtils.method19155(-0.0789);
        }
        else {
            final double field2395 = Cubecraft2Fly.mc.player.posX;
            final double field2396 = Cubecraft2Fly.mc.player.posY;
            Cubecraft2Fly.mc.method5269().method17292(new Class4354(field2395, -150.0, Cubecraft2Fly.mc.player.posZ, false));
            Class7482.method23151(0.0);
            ColorUtils.method19155(0.0);
            this.field16023 = -3;
            this.field16024.method23934();
            this.field16024.method23932();
        }
    }
    
    @EventListener
    private void method10692(final Class5752 class5752) {
        if (this.isEnabled()) {
            if (class5752.method17061() == Cubecraft2Fly.mc.gameSettings.field23440.field2161.field32860) {
                class5752.setCancelled(true);
                this.field16025 = true;
            }
        }
    }
    
    @EventListener
    private void method10693(final Class5715 class5715) {
        if (this.isEnabled()) {
            if (class5715.method16963() == Cubecraft2Fly.mc.gameSettings.field23440.field2161.field32860) {
                class5715.setCancelled(true);
                this.field16025 = false;
            }
        }
    }
    
    @EventListener
    @Class6759
    public void method10694(final Class5717 class5717) {
        if (this.isEnabled()) {
            ++this.field16023;
            if (this.field16023 != 1) {
                if (this.field16023 != 2) {
                    class5717.method16975(0.0);
                    Class7482.method23149(class5717, 0.0);
                }
                else {
                    class5717.method16975(-9.999999999E-5);
                    Class7482.method23149(class5717, 0.28);
                }
            }
            else {
                class5717.method16975(Cubecraft2Fly.mc.gameSettings.field23439.method1056() ? (this.field16025 ? 1.0E-4 : 0.99) : (this.field16025 ? -0.99 : 1.0E-4));
                Class7482.method23149(class5717, 2.4);
            }
            ColorUtils.method19155(class5717.method16974());
            return;
        }
        if (this.field16023 < 0) {
            if (this.field16023 != -3) {
                if (this.field16023 != -2) {
                    if (this.field16023 == -1) {
                        ++this.field16023;
                        class5717.method16975(-0.4);
                        Class7482.method23149(class5717, 0.0);
                    }
                }
                else {
                    class5717.method16975(0.4);
                    ++this.field16023;
                    Class7482.method23149(class5717, 0.0);
                }
            }
            else {
                if (this.field16024.method23935() > 1000L) {
                    ++this.field16023;
                    this.field16024.method23934();
                    this.field16024.method23933();
                }
                class5717.method16975(0.0);
                Class7482.method23149(class5717, 0.0);
            }
        }
    }
    
    @EventListener
    public void method10695(final UpdateWalkingEvent updateWalkingEvent) {
        if (this.field16023 == -3) {
            updateWalkingEvent.setCancelled(true);
        }
        if (this.isEnabled() && updateWalkingEvent.method17046()) {
            updateWalkingEvent.method17033(true);
            updateWalkingEvent.method17045(true);
            if (this.field16023 != 3) {
                if (this.field16023 > 3) {
                    updateWalkingEvent.setCancelled(true);
                }
            }
            else {
                updateWalkingEvent.method17037(-150.0);
            }
        }
    }
    
    @EventListener
    public void method10696(final Class5723 class5723) {
        if (!this.isEnabled() && this.field16023 >= 0) {
            return;
        }
        final IPacket method16998 = class5723.method16998();
        if (method16998 instanceof Class4328) {
            final Class4328 class5724 = (Class4328)method16998;
            class5724.field19380 = Cubecraft2Fly.mc.player.rotationYaw;
            class5724.field19381 = Cubecraft2Fly.mc.player.rotationPitch;
            if (this.field16023 != -3) {
                this.field16023 = 0;
            }
            else {
                ++this.field16023;
            }
        }
    }
}
