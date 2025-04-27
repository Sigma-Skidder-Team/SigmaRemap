// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.flys;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import mapped.*;

public class VeltPvPFly extends Module
{
    private int field15795;
    private int field15796;
    private double field15797;
    private double field15798;
    private boolean field15799;
    
    public VeltPvPFly() {
        super(Category.MOVEMENT, "VeltPvP", "A fly for VeltPvP");
        this.addSetting(new NumberSetting("Speed", "Fly speed", 4.0f, Float.class, 0.2f, 5.0f, 0.1f));
    }
    
    @Override
    public void onEnable() {
        this.field15797 = VeltPvPFly.mc.player.posY;
        this.field15795 = 0;
        if (!VeltPvPFly.mc.gameSettings.field23440.method1056()) {
            if (!VeltPvPFly.mc.gameSettings.field23440.method1056()) {
                this.field15799 = false;
            }
        }
        else {
            VeltPvPFly.mc.gameSettings.field23440.field2162 = false;
            this.field15799 = true;
        }
    }
    
    @Override
    public void onDisable() {
        MovementUtil.method23151(0.0);
        if (VeltPvPFly.mc.player.getMotion().y > 0.0) {
            ColorUtils.method19155(-0.0789);
        }
    }
    
    @EventListener
    private void method10381(final Class5752 class5752) {
        if (this.isEnabled()) {
            if (class5752.method17061() == VeltPvPFly.mc.gameSettings.field23440.field2161.field32860) {
                class5752.setCancelled(true);
                this.field15799 = true;
            }
        }
    }
    
    @EventListener
    private void method10382(final Class5715 class5715) {
        if (this.isEnabled()) {
            if (class5715.method16963() == VeltPvPFly.mc.gameSettings.field23440.field2161.field32860) {
                class5715.setCancelled(true);
                this.field15799 = false;
            }
        }
    }
    
    @EventListener
    @LowerPriority
    public void method10383(final Class5717 class5717) {
        if (this.isEnabled()) {
            final double n = this.getNumberSettingValueByName("Speed");
            if (this.field15795 <= 0) {
                if (this.field15795 != -1) {
                    if (this.field15795 == 0) {
                        if (!VeltPvPFly.mc.gameSettings.field23439.method1056()) {
                            if (class5717.method16974() > 0.0) {
                                class5717.method16975(-MovementUtil.method23141());
                            }
                        }
                        ColorUtils.method19155(class5717.method16974());
                        MovementUtil.method23149(class5717, n - 0.1);
                    }
                }
                else {
                    if (!VeltPvPFly.mc.gameSettings.field23439.method1056()) {
                        class5717.method16975(this.field15799 ? (-n / 2.0) : MovementUtil.method23141());
                    }
                    else {
                        class5717.method16975(this.field15799 ? MovementUtil.method23141() : (n / 2.0));
                        this.field15798 = this.field15797;
                        this.field15797 = (this.field15799 ? this.field15797 : (VeltPvPFly.mc.player.posY + class5717.method16974()));
                    }
                    ColorUtils.method19155(class5717.method16974());
                    MovementUtil.method23149(class5717, n);
                }
            }
            else {
                class5717.method16975(0.0);
                MovementUtil.method23149(class5717, 0.0);
            }
        }
    }
    
    @EventListener
    public void method10384(final UpdateWalkingEvent updateWalkingEvent) {
        if (this.isEnabled() && updateWalkingEvent.isPre()) {
            ++this.field15795;
            if (this.field15795 != 2) {
                if (this.field15795 > 2) {
                    if (this.field15795 >= 20 && this.field15795 % 20 == 0) {
                        updateWalkingEvent.method17037(-(150.0 + Math.random() * 150.0));
                        this.field15796 += 2;
                    }
                    else {
                        updateWalkingEvent.setCancelled(true);
                    }
                }
            }
            else {
                updateWalkingEvent.method17037(-(150.0 + Math.random() * 150.0));
                this.field15796 += 2;
            }
            updateWalkingEvent.method17033(true);
        }
    }
    
    @EventListener
    public void method10385(final Class5723 class5723) {
        if (this.isEnabled()) {
            final IPacket method16998 = class5723.method16998();
            if (!(method16998 instanceof Class4328)) {
                if (method16998 instanceof Class4378) {
                    final String method16999 = ((Class4378)method16998).method13164().getFormattedText();
                    if (this.field15796 > 0) {
                        if (method16999.contains("Now leaving: §") || method16999.contains("Now entering: §")) {
                            --this.field15796;
                            class5723.setCancelled(true);
                        }
                    }
                }
            }
            else {
                final Class4328 class5724 = (Class4328)method16998;
                if (this.field15795 >= 1) {
                    this.field15795 = -1;
                }
                this.field15798 = this.field15797;
                this.field15797 = class5724.field19378;
            }
        }
    }
    
    @EventListener
    public void method10386(final Class5721 class5721) {
        if (this.isEnabled()) {
            final IPacket method16990 = class5721.method16990();
            if (method16990 instanceof Class4353) {
                final Class4353 class5722 = (Class4353)method16990;
                if (this.field15795 == -1) {
                    class5722.field19504 = true;
                }
            }
        }
    }
    
    @EventListener
    public void method10387(final Class5741 class5741) {
        if (this.isEnabled()) {
            final double field15797 = this.field15797;
            VeltPvPFly.mc.player.posY = field15797;
            VeltPvPFly.mc.player.lastTickPosY = field15797;
            VeltPvPFly.mc.player.field3019 = field15797;
            VeltPvPFly.mc.player.prevPosY = field15797;
        }
    }
}
