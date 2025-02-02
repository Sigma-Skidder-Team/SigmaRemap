// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.flys;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.*;

public class TestFly extends Module
{
    private int field15598;
    private int field15599;
    private double field15600;
    private double field15601;
    private double field15602;
    private double field15603;
    private double field15604;
    private double field15605;
    
    public TestFly() {
        super(Category.MOVEMENT, "Test", "A fly for OmegaCraft");
    }
    
    @Override
    public void onEnable() {
        this.field15600 = TestFly.mc.player.posX;
        this.field15601 = TestFly.mc.player.posY;
        this.field15602 = TestFly.mc.player.posZ;
        this.field15603 = 0.0;
        this.field15598 = 2;
        this.field15599 = 0;
    }
    
    @Override
    public void onDisable() {
        Class7482.method23151(0.0);
        if (TestFly.mc.player.getMotion().y > 0.0) {
            ColorUtils.method19155(-0.0789);
        }
        TestFly.mc.timer.timerSpeed = 1.0f;
    }
    
    @EventListener
    @Class6759
    public void method10018(final Class5717 class5717) {
        if (this.isEnabled()) {
            Math.sqrt(class5717.method16972() * class5717.method16972() + class5717.method16976() * class5717.method16976());
            if (this.field15598 <= 1) {
                if (this.field15598 != -1) {
                    if (this.field15598 != 0) {
                        if (this.field15598 < 1) {}
                    }
                    else {
                        Class7482.method23149(class5717, 0.1);
                    }
                }
                else {
                    ++this.field15599;
                    if (this.field15599 != 1) {
                        if (this.field15599 % 3 != 0) {
                            if (this.field15599 % 3 != 1) {}
                        }
                    }
                    ColorUtils.method19155(class5717.method16974());
                    Class7482.method23149(class5717, 1.0);
                }
            }
            else {
                class5717.method16975(0.0);
                Class7482.method23149(class5717, 0.0);
            }
        }
    }
    
    @EventListener
    public void method10019(final UpdateWalkingEvent updateWalkingEvent) {
        if (this.isEnabled() && updateWalkingEvent.method17046()) {
            ++this.field15598;
            if (this.field15598 != 3) {
                if (this.field15598 > 3) {
                    if (this.field15598 >= 20 && this.field15598 % 20 == 0) {
                        updateWalkingEvent.method17037(0.0);
                    }
                    else {
                        updateWalkingEvent.setCancelled(true);
                    }
                }
            }
            else {
                updateWalkingEvent.method17037(1000.0);
            }
            updateWalkingEvent.method17033(true);
        }
    }
    
    @EventListener
    public void method10020(final Class5723 class5723) {
        if (this.isEnabled()) {
            final IPacket method16998 = class5723.method16998();
            if (method16998 instanceof Class4328) {
                final Class4328 class5724 = (Class4328)method16998;
                if (this.field15598 >= 1) {
                    this.field15598 = -1;
                }
                this.field15604 = this.field15601;
                this.field15605 = this.field15602;
                this.field15600 = class5724.field19377;
                this.field15601 = class5724.field19378;
                this.field15602 = class5724.field19379;
                class5724.field19380 = TestFly.mc.player.rotationYaw;
                class5724.field19381 = TestFly.mc.player.rotationPitch;
            }
        }
    }
    
    @EventListener
    public void method10021(final Class5721 class5721) {
        if (this.isEnabled()) {
            final IPacket method16990 = class5721.method16990();
            if (method16990 instanceof Class4353) {
                final Class4353 class5722 = (Class4353)method16990;
                if (this.field15598 == -1) {
                    class5722.field19504 = true;
                }
            }
        }
    }
    
    @EventListener
    public void method10022(final Class5741 class5741) {
        if (this.isEnabled()) {
            return;
        }
    }
}
