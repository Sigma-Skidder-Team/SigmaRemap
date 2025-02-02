// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.longjumps;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.*;
import net.minecraft.util.math.BlockPos;

public class MineplexLongJump extends Module
{
    private double field16040;
    private double field16041;
    private int field16042;
    private int field16043;
    private int field16044;
    private boolean field16045;
    
    public MineplexLongJump() {
        super(Category.MOVEMENT, "Mineplex", "Mineplex longjump.");
    }
    
    @Override
    public void onDisable() {
        Class7482.method23151(Class7482.method23136() * 0.7);
    }
    
    @Override
    public void onEnable() {
        this.field16045 = true;
        this.field16042 = -1;
        this.field16043 = 0;
        this.field16044 = 0;
    }
    
    @EventListener
    public void method10729(final UpdateWalkingEvent updateWalkingEvent) {
        if (this.isEnabled()) {
            if (updateWalkingEvent.method17046()) {
                if (this.field16042 >= 0) {
                    updateWalkingEvent.method17033(true);
                }
            }
        }
    }
    
    @EventListener
    public void method10730(final Class5717 class5717) {
        if (this.isEnabled() && MineplexLongJump.mc.player != null) {
            if (!MineplexLongJump.mc.player.onGround) {
                if (this.field16042 >= 0) {
                    if (this.field16045) {
                        if (!ColorUtils.method19114()) {
                            this.field16045 = !this.field16045;
                            this.field16040 = 0.5;
                            this.field16043 = 1;
                        }
                    }
                    ++this.field16042;
                    this.field16041 -= 0.04000000000001;
                    if (this.field16042 <= 22) {
                        if (this.field16042 == 10) {
                            if (this.field16045) {
                                this.field16041 = -0.005;
                            }
                        }
                    }
                    else {
                        this.field16041 -= 0.02;
                    }
                    if (this.field16042 > 6) {
                        if (!ColorUtils.method19114()) {
                            this.field16041 -= 0.05;
                        }
                    }
                    if (MineplexLongJump.mc.player.collidedHorizontally) {
                        this.field16040 = 0.35;
                        this.field16043 = 1;
                    }
                    if (MineplexLongJump.mc.player.collidedVertically) {
                        this.field16041 = -0.078;
                        this.field16042 = 23;
                    }
                    this.field16040 -= 0.01;
                    if (this.field16040 < 0.3) {
                        this.field16040 = 0.3;
                    }
                    Class7482.method23149(class5717, this.field16040);
                    class5717.method16975(this.field16041);
                }
            }
            else {
                if (this.field16044 > 1) {
                    this.field16043 = 0;
                }
                else {
                    ++this.field16044;
                }
                if (this.field16042 > 0) {
                    this.field16042 = -1;
                    if (this.method9914().method9883("Auto Disable")) {
                        this.method9914().method9910();
                        return;
                    }
                }
                this.field16045 = ColorUtils.method19114();
                final BlockPos class5718 = new BlockPos(MineplexLongJump.mc.player.posX, MineplexLongJump.mc.player.posY - 0.4, MineplexLongJump.mc.player.posZ);
                if (ColorUtils.method19114()) {
                    if ((this.method9914().method9883("BorderJump") && !Class4609.method13708(class5718)) || this.method9914().method9883("Auto Jump")) {
                        MineplexLongJump.mc.player.method2725();
                        class5717.method16975(MineplexLongJump.mc.player.getMotion().y);
                        Class7482.method23149(class5717, 0.0);
                    }
                }
            }
        }
    }
    
    @EventListener
    public void method10731(final Class5722 class5722) {
        if (this.isEnabled() && MineplexLongJump.mc.player != null) {
            this.field16040 = 0.81 + this.field16043 * 0.095;
            if (MineplexLongJump.mc.player.posY != (int) MineplexLongJump.mc.player.posY) {
                this.field16040 = 0.52;
                this.field16043 = 1;
            }
            this.field16044 = 0;
            this.field16041 = 0.4299999;
            if (this.field16043 < 2) {
                ++this.field16043;
            }
            this.field16042 = 0;
            class5722.method16996(0.0);
            class5722.method16995(this.field16041);
        }
    }
    
    @EventListener
    public void method10732(final Class5723 class5723) {
        if (this.isEnabled() && MineplexLongJump.mc.player != null) {
            if (class5723.method16998() instanceof Class4328) {
                this.field16042 = -1;
                this.field16043 = 0;
            }
        }
    }
}
