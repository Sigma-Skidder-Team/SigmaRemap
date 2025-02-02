// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.flys;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import mapped.*;
import net.minecraft.util.Direction;

public class SpartanFly extends Module
{
    private double field15946;
    private boolean field15947;
    private boolean field15948;
    
    public SpartanFly() {
        super(Category.MOVEMENT, "Spartan", "A fly for Spartan anticheat");
        this.addSetting(new BooleanSetting("Ground Spoof", "Send on ground packets", true));
    }
    
    @Override
    public void onEnable() {
        this.field15947 = false;
        this.field15946 = -10.0;
        if (!SpartanFly.mc.gameSettings.field23440.method1056()) {
            this.field15948 = false;
        }
        else {
            SpartanFly.mc.gameSettings.field23440.field2162 = false;
            this.field15948 = true;
        }
    }
    
    @EventListener
    private void method10575(final Class5752 class5752) {
        if (this.isEnabled()) {
            if (class5752.method17061() == SpartanFly.mc.gameSettings.field23440.field2161.field32860) {
                class5752.setCancelled(true);
                this.field15948 = true;
            }
        }
    }
    
    @EventListener
    private void method10576(final Class5715 class5715) {
        if (this.isEnabled()) {
            if (class5715.method16963() == SpartanFly.mc.gameSettings.field23440.field2161.field32860) {
                class5715.setCancelled(true);
                this.field15948 = false;
            }
        }
    }
    
    @EventListener
    public void method10577(final Class5744 class5744) {
        if (this.isEnabled()) {
            if (class5744.method17046()) {
                if (this.method9883("Ground Spoof")) {
                    if (this.field15947) {
                        this.field15947 = !this.field15947;
                        class5744.method17045(true);
                    }
                }
            }
        }
    }
    
    @EventListener
    public void method10578(final Class5717 class5717) {
        if (this.isEnabled()) {
            if (!SpartanFly.mc.player.onGround && !ColorUtils.method19160(SpartanFly.mc.player, 0.001f)) {
                if (class5717.method16974() < 0.0) {
                    if (this.field15946 != SpartanFly.mc.player.posY) {
                        if (SpartanFly.mc.player.posY + class5717.method16974() < this.field15946) {
                            this.field15947 = true;
                            final int method10579 = this.method10579();
                            if (method10579 >= 0) {
                                SpartanFly.mc.method5269().method17292(new Class4321(method10579));
                            }
                            if (method10579 >= 0 || SpartanFly.mc.player.method2715(Class316.field1877).getItem() instanceof Class4036) {
                                SpartanFly.mc.method5269().method17292(new Class4329(Class316.field1877, new BlockRayTraceResult(SpartanFly.mc.player.method1934().add(0.0, -2.0, 0.0), Direction.UP, SpartanFly.mc.player.method1894().add(0, -2, 0), false)));
                            }
                            if (method10579 >= 0) {
                                SpartanFly.mc.method5269().method17292(new Class4321(SpartanFly.mc.player.inventory.field2743));
                            }
                            class5717.method16975(this.field15946 - SpartanFly.mc.player.posY);
                        }
                    }
                    else {
                        SpartanFly.mc.player.method2725();
                        class5717.method16975(SpartanFly.mc.player.getMotion().y);
                        this.field15946 = (SpartanFly.mc.gameSettings.field23439.method1056() ? (this.field15948 ? SpartanFly.mc.player.posY : (SpartanFly.mc.player.posY + 1.0)) : (this.field15948 ? (SpartanFly.mc.player.posY - 1.0) : SpartanFly.mc.player.posY));
                        Class7482.method23149(class5717, 0.35);
                    }
                }
            }
            else {
                SpartanFly.mc.player.method2725();
                class5717.method16975(SpartanFly.mc.player.getMotion().y);
                Class7482.method23149(class5717, 0.35);
                this.field15946 = (SpartanFly.mc.gameSettings.field23439.method1056() ? (this.field15948 ? SpartanFly.mc.player.posY : (SpartanFly.mc.player.posY + 1.0)) : (this.field15948 ? (SpartanFly.mc.player.posY - 1.0) : SpartanFly.mc.player.posY));
            }
            ColorUtils.method19154(class5717.method16972());
            ColorUtils.method19155(class5717.method16974());
            ColorUtils.method19156(class5717.method16976());
        }
    }
    
    public int method10579() {
        for (int i = 36; i < 45; ++i) {
            if (SpartanFly.mc.player.container.getSlot(i).method20054() && SpartanFly.mc.player.container.getSlot(i).method20053().getItem() instanceof Class4036) {
                if (i - 36 == SpartanFly.mc.player.inventory.field2743) {
                    i = 34;
                }
                return i - 36;
            }
        }
        return -1;
    }
}
