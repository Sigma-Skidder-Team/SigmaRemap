// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.highjumps;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import mapped.*;
import net.minecraft.util.math.AxisAlignedBB;

public class MineplexHighJump extends Module
{
    private boolean field15704;
    private double field15705;
    private double field15706;
    private double field15707;
    
    public MineplexHighJump() {
        super(Category.MOVEMENT, "Mineplex", "Highjump for Mineplex");
        this.addSetting(new NumberSetting("Motion", "Highjump motion", 1.1f, Float.class, 0.42f, 5.0f, 0.05f));
        this.addSetting(new BooleanSetting("Disable", "Disable on landing.", true));
        this.addSetting(new BooleanSetting("Fake fly", "Am i flying ?", false));
    }
    
    @Override
    public void method9879() {
        this.field15704 = false;
    }
    
    @EventListener
    public void method10200(final Class5738 class5738) {
        if (this.method9906() && MineplexHighJump.mc.player.onGround) {
            class5738.method17026(true);
        }
    }
    
    @EventListener
    public void method10201(final Class5717 class5717) {
        if (this.method9906()) {
            if (this.field15704) {
                if (MineplexHighJump.mc.player.posY + 0.42 < this.field15707) {
                    this.method9914().method9910();
                }
            }
            if (!MineplexHighJump.mc.player.onGround) {
                if (this.field15704) {
                    Class7482.method23149(class5717, this.field15705 = Math.max(this.field15705, 0.499));
                    this.field15705 -= 0.007;
                    double n = 0.5;
                    if (this.getNumberSettingValueByName("Motion") > 3.0f) {
                        n -= 0.8;
                    }
                    if (Math.abs(class5717.method16974()) < n && Math.abs(this.field15706) < n) {
                        class5717.method16975(this.field15706 -= 0.04000000000001);
                        ColorUtils.method19155(class5717.method16974());
                    }
                    else {
                        this.field15706 = class5717.method16974();
                    }
                }
            }
        }
    }
    
    @EventListener
    public void method10202(final Class5747 class5747) {
        if (this.method9906()) {
            if (MineplexHighJump.mc.player.onGround) {
                if (this.field15704) {
                    this.field15704 = !this.field15704;
                    Class7482.method23151(0.0);
                    if (this.method9883("Disable")) {
                        this.method9914().method9910();
                    }
                    return;
                }
                final double field2395 = MineplexHighJump.mc.player.posX;
                final double field2396 = MineplexHighJump.mc.player.posZ;
                final double field2397 = MineplexHighJump.mc.player.posY;
                final double n = MineplexHighJump.mc.player.field4085.field24722;
                final double n2 = MineplexHighJump.mc.player.field4085.field24721;
                final float field2398 = MineplexHighJump.mc.player.rotationYaw;
                final double n3 = 0.1;
                final double n4 = field2395 + (n * 0.45 * Math.cos(Math.toRadians(field2398 + 90.0f)) + n2 * 0.45 * Math.sin(Math.toRadians(field2398 + 90.0f))) * n3;
                final double n5 = field2396 + (n * 0.45 * Math.sin(Math.toRadians(field2398 + 90.0f)) - n2 * 0.45 * Math.cos(Math.toRadians(field2398 + 90.0f))) * n3;
                final AxisAlignedBB class5748 = new AxisAlignedBB(n4 - 0.3, field2397 - 1.0, n5 - 0.3, n4 + 0.3, field2397 + 2.0, n5 + 0.3);
                if (MineplexHighJump.mc.world.method6981(MineplexHighJump.mc.player, class5748).count() == 0L) {
                    final double method10205 = this.method10205(class5748);
                    if (method10205 != 11.0) {
                        final double field2399 = MineplexHighJump.mc.player.posY;
                        final double n6 = 312.7;
                        final Class4354 class5749 = new Class4354(n4, field2399 - method10205, n6, true);
                        MineplexHighJump.mc.method5269().method17292(new Class4354(n4, field2399, n6, true));
                        MineplexHighJump.mc.method5269().method17292(class5749);
                        this.field15707 = field2399 + 0.42;
                        MineplexHighJump.mc.player.setPosition(n4, field2399, n6);
                        this.field15706 = this.getNumberSettingValueByName("Motion");
                        this.field15705 = 0.81;
                    }
                }
            }
        }
    }
    
    @EventListener
    public void method10203(final Class5723 class5723) {
        if (this.method9906()) {
            if (class5723.method16998() instanceof Class4328) {
                this.method9914().method9910();
            }
        }
    }
    
    @EventListener
    public void method10204(final Class5741 class5741) {
        if (this.method9906()) {
            if (this.field15704) {
                if (MineplexHighJump.mc.player.posY >= this.field15707) {
                    if (this.method9883("Fake fly")) {
                        MineplexHighJump.mc.player.posY = this.field15707;
                        MineplexHighJump.mc.player.lastTickPosY = this.field15707;
                        MineplexHighJump.mc.player.field3019 = this.field15707;
                        MineplexHighJump.mc.player.prevPosY = this.field15707;
                        if (Class7482.method23148()) {
                            MineplexHighJump.mc.player.field3013 = 0.099999994f;
                        }
                    }
                }
            }
        }
    }
    
    public double method10205(final AxisAlignedBB class6221) {
        double n = 6.0;
        class6221.offset(0.0, -n, 0.0);
        while (true) {
            final AxisAlignedBB method18499 = class6221.offset(0.0, -n, 0.0);
            if (MineplexHighJump.mc.world.method6981(MineplexHighJump.mc.player, method18499).count() == 0L) {
                return n;
            }
            n -= 0.5;
            if (MineplexHighJump.mc.world.method6981(MineplexHighJump.mc.player, method18499).count() != 0L && n > 3.0) {
                continue;
            }
            return 11.0;
        }
    }
}
