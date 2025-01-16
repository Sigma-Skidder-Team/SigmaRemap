// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.flys;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.*;

public class HorizonFly extends Module
{
    private int field15606;
    private double field15607;
    
    public HorizonFly() {
        super(Category.MOVEMENT, "Horizon", "A fly for Horizon anticheat");
    }
    
    @Override
    public void method9879() {
        this.field15607 = HorizonFly.mc.player.posY;
        this.field15606 = 10;
        HorizonFly.mc.timer.timerSpeed = 0.6f;
    }
    
    @Override
    public void onDisable() {
        Class7482.method23151(0.0);
        if (HorizonFly.mc.player.getMotion().y > 0.0) {
            Class6430.method19155(-0.0789);
        }
        HorizonFly.mc.timer.timerSpeed = 1.0f;
    }
    
    @EventListener
    @Class6759
    public void method10025(final Class5717 class5717) {
        if (this.method9906()) {
            final double sqrt = Math.sqrt(class5717.method16972() * class5717.method16972() + class5717.method16976() * class5717.method16976());
            if (this.field15606 <= 9) {
                if (this.field15606 != -1) {
                    if (this.field15606 != 0) {
                        if (this.field15606 >= 1) {
                            Class7482.method23149(class5717, sqrt + 5.0E-4);
                        }
                    }
                    else {
                        Class7482.method23149(class5717, sqrt + 0.0015);
                    }
                }
                else {
                    class5717.method16975(Class7482.method23141());
                    Class6430.method19155(class5717.method16974());
                    Class7482.method23149(class5717, 0.125);
                }
            }
            else {
                Class7482.method23149(class5717, 0.0);
            }
        }
    }
    
    @EventListener
    public void method10026(final Class5744 class5744) {
        if (this.method9906() && class5744.method17046()) {
            ++this.field15606;
            if (this.field15606 != 11) {
                if (this.field15606 > 11) {
                    if (this.field15606 >= 20) {
                        if (this.field15606 % 20 == 0) {
                            class5744.method17037(0.0);
                        }
                    }
                }
            }
            else {
                class5744.method17037(0.0);
            }
            class5744.method17033(true);
        }
    }
    
    @EventListener
    public void method10027(final Class5723 class5723) {
        if (this.method9906()) {
            final IPacket method16998 = class5723.method16998();
            if (method16998 instanceof Class4328) {
                final Class4328 class5724 = (Class4328)method16998;
                if (this.field15606 >= 1) {
                    this.field15606 = -1;
                }
                this.field15607 = class5724.field19378;
                class5724.field19380 = HorizonFly.mc.player.rotationYaw;
                class5724.field19381 = HorizonFly.mc.player.rotationPitch;
            }
        }
    }
    
    @EventListener
    public void method10028(final Class5721 class5721) {
        if (this.method9906()) {
            final IPacket method16990 = class5721.method16990();
            if (method16990 instanceof Class4353) {
                final Class4353 class5722 = (Class4353)method16990;
                if (this.field15606 == -1) {
                    class5722.field19504 = true;
                }
            }
        }
    }
    
    @EventListener
    public void method10029(final Class5741 class5741) {
        if (this.method9906()) {
            final double field15607 = this.field15607;
            HorizonFly.mc.player.posY = field15607;
            HorizonFly.mc.player.lastTickPosY = field15607;
            HorizonFly.mc.player.field3019 = field15607;
            HorizonFly.mc.player.prevPosY = field15607;
        }
    }
}
