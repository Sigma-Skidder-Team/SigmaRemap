// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.flys;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import mapped.*;

public class ViperMCFly extends Module
{
    private int field15632;
    private int field15633;
    private double field15634;
    private double field15635;
    private boolean field15636;
    
    public ViperMCFly() {
        super(Category.MOVEMENT, "ViperMC", "A fly for ViperMC");
        this.addSetting(new NumberSetting("Speed", "Fly speed", 4.0f, Float.class, 0.2f, 6.0f, 0.1f));
    }
    
    @Override
    public void onEnable() {
        this.field15634 = ViperMCFly.mc.player.posY;
        this.field15632 = 0;
        if (!ViperMCFly.mc.gameSettings.field23440.method1056()) {
            if (!ViperMCFly.mc.gameSettings.field23440.method1056()) {
                this.field15636 = false;
            }
        }
        else {
            ViperMCFly.mc.gameSettings.field23440.field2162 = false;
            this.field15636 = true;
        }
    }
    
    @Override
    public void onDisable() {
        MovementUtil.method23151(0.0);
        if (ViperMCFly.mc.player.getMotion().y > 0.0) {
            AllUtils.method19155(-0.0789);
        }
    }
    
    @EventListener
    private void method10056(final Class5752 class5752) {
        if (this.isEnabled()) {
            if (class5752.method17061() == ViperMCFly.mc.gameSettings.field23440.field2161.field32860) {
                class5752.setCancelled(true);
                this.field15636 = true;
            }
        }
    }
    
    @EventListener
    private void method10057(final Class5715 class5715) {
        if (this.isEnabled()) {
            if (class5715.method16963() == ViperMCFly.mc.gameSettings.field23440.field2161.field32860) {
                class5715.setCancelled(true);
                this.field15636 = false;
            }
        }
    }
    
    @EventListener
    @LowerPriority
    public void method10058(final Class5717 class5717) {
        if (this.isEnabled()) {
            final double n = this.getNumberSettingValueByName("Speed");
            if (this.field15632 <= 0) {
                if (this.field15632 != -1) {
                    if (this.field15632 == 0) {
                        if (!ViperMCFly.mc.gameSettings.field23439.method1056()) {
                            if (class5717.method16974() > 0.0) {
                                class5717.method16975(-MovementUtil.method23141());
                            }
                        }
                        AllUtils.method19155(class5717.method16974());
                        MovementUtil.method23149(class5717, MovementUtil.method23136());
                    }
                }
                else {
                    if (!ViperMCFly.mc.gameSettings.field23439.method1056()) {
                        class5717.method16975((this.field15636 && !AllUtils.method19160(ViperMCFly.mc.player, 0.01f)) ? (-n / 2.0) : MovementUtil.method23141());
                        this.field15635 = this.field15634;
                        this.field15634 = ((this.field15636 && !AllUtils.method19160(ViperMCFly.mc.player, 0.01f)) ? (ViperMCFly.mc.player.posY + class5717.method16974()) : this.field15634);
                    }
                    else {
                        class5717.method16975(this.field15636 ? MovementUtil.method23141() : (n / 2.0));
                        this.field15635 = this.field15634;
                        this.field15634 = (this.field15636 ? this.field15634 : (ViperMCFly.mc.player.posY + class5717.method16974()));
                    }
                    AllUtils.method19155(class5717.method16974());
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
    public void method10059(final UpdateWalkingEventI updateWalkingEvent) {
        if (this.isEnabled() && updateWalkingEvent.isPre()) {
            ++this.field15632;
            if (this.field15632 != 2) {
                if (this.field15632 > 2) {
                    if (this.field15632 >= 20 && this.field15632 % 20 == 0) {
                        updateWalkingEvent.method17037(-150.0 - Math.random() * 150.0);
                        this.field15633 += 2;
                    }
                    else {
                        updateWalkingEvent.setCancelled(true);
                    }
                }
            }
            else {
                updateWalkingEvent.method17037(-150.0 - Math.random() * 150.0);
                this.field15633 += 2;
            }
            updateWalkingEvent.method17045(true);
            updateWalkingEvent.method17033(true);
        }
    }
    
    @EventListener
    public void method10060(final EventReceivePacket eventReceivePacket) {
        if (this.isEnabled()) {
            final IPacket method16998 = eventReceivePacket.getPacket();
            if (!(method16998 instanceof SPlayerPositionLookPacket)) {
                if (method16998 instanceof Class4378) {
                    final String method16999 = ((Class4378)method16998).method13164().getFormattedText();
                    if (this.field15633 > 0) {
                        if (method16999.contains("Now leaving: §") || method16999.contains("Now entering: §")) {
                            --this.field15633;
                            eventReceivePacket.setCancelled(true);
                        }
                    }
                }
            }
            else {
                final SPlayerPositionLookPacket class5724 = (SPlayerPositionLookPacket)method16998;
                if (this.field15632 >= 1) {
                    this.field15632 = -1;
                }
                this.field15635 = this.field15634;
                this.field15634 = class5724.field19378;
                class5724.yaw = ViperMCFly.mc.player.rotationYaw;
                class5724.pitch = ViperMCFly.mc.player.rotationPitch;
            }
        }
    }
    
    @EventListener
    public void method10061(final Class5721 class5721) {
        if (this.isEnabled()) {
            final IPacket method16990 = class5721.method16990();
            if (method16990 instanceof Class4353) {
                final Class4353 class5722 = (Class4353)method16990;
                if (this.field15632 == -1) {
                    class5722.field19504 = true;
                }
            }
        }
    }
    
    @EventListener
    public void method10062(final Class5741 class5741) {
        if (this.isEnabled()) {
            final double n = this.field15634 - this.field15635;
            final double field15634 = this.field15634;
            ViperMCFly.mc.player.posY = field15634;
            ViperMCFly.mc.player.lastTickPosY = field15634;
            ViperMCFly.mc.player.field3019 = field15634;
            ViperMCFly.mc.player.prevPosY = field15634;
        }
    }
}
