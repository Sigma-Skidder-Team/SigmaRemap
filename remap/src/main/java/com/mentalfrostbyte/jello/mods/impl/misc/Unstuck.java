// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.misc;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import mapped.*;

public class Unstuck extends Module
{
    private int field15927;
    private int field15928;
    
    public Unstuck() {
        super(Category.MISC, "Unstuck", "Toggle this when an anticheat freeze you mid-air");
        this.addSetting(new NumberSetting("Flags", "Maximum flag before trying to unstuck", 5.0f, Float.class, 2.0f, 20.0f, 1.0f));
    }
    
    @Override
    public void method9879() {
        this.field15927 = 0;
    }
    
    @EventListener
    public void method10542(final Class5717 class5717) {
        if (this.method9906()) {
            if (this.field15927 >= this.getNumberSettingValueByName("Flags")) {
                Class7482.method23149(class5717, 0.0);
                class5717.method16975(0.0);
                Unstuck.mc.player.setMotion(0.0, 0.0, 0.0);
            }
        }
    }
    
    @EventListener
    public void method10543(final Class5732 class5732) {
        if (this.method9906()) {
            this.field15927 = 0;
        }
    }
    
    @EventListener
    public void method10544(final Class5744 class5744) {
        if (this.method9906() && class5744.method17046()) {
            if (!Unstuck.mc.player.onGround && !Class6430.method19160(Unstuck.mc.player, 0.001f)) {
                if (this.field15927 >= this.getNumberSettingValueByName("Flags")) {
                    if (this.field15928 == 0) {
                        this.field15928 = 60;
                        Client.method35173().method35197().method25776(new Class6224("Unstuck", "Trying to unstuck you.."));
                    }
                }
                if (this.field15928 > 0) {
                    --this.field15928;
                    if (this.field15928 == 0) {
                        this.field15927 = 0;
                    }
                    class5744.method16961(true);
                }
            }
            else {
                this.field15927 = 0;
            }
        }
    }
    
    @EventListener
    public void method10545(final Class5723 class5723) {
        if (!this.method9906()) {
            return;
        }
        if (Unstuck.mc.player != null) {
            if (class5723.method16998() instanceof Class4328) {
                if (!Class6430.method19160(Unstuck.mc.player, 0.3f)) {
                    if (Unstuck.mc.player.ticksExisted > 10) {
                        ++this.field15927;
                        if (this.field15927 > this.getNumberSettingValueByName("Flags")) {
                            class5723.method16961(true);
                        }
                    }
                }
            }
        }
    }
}