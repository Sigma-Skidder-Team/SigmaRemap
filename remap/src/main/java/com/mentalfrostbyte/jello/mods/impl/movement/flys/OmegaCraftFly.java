// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.flys;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.*;

public class OmegaCraftFly extends Module
{
    private int field15969;
    private int field15970;
    private double field15971;
    private double field15972;
    private double field15973;
    private double field15974;
    private double field15975;
    private double field15976;
    
    public OmegaCraftFly() {
        super(Category.MOVEMENT, "OmegaCraft", "A fly for OmegaCraft");
    }
    
    @Override
    public void method9879() {
        this.field15971 = OmegaCraftFly.mc.player.posX;
        this.field15972 = OmegaCraftFly.mc.player.posY;
        this.field15973 = OmegaCraftFly.mc.player.posZ;
        this.field15974 = OmegaCraftFly.mc.player.posX;
        this.field15975 = OmegaCraftFly.mc.player.posY;
        this.field15976 = OmegaCraftFly.mc.player.posZ;
        this.field15969 = 0;
        this.field15970 = 0;
    }
    
    @Override
    public void onDisable() {
        Class7482.method23151(0.0);
        if (OmegaCraftFly.mc.player.getMotion().y > 0.0) {
            ColorUtils.method19155(-0.0789);
        }
    }
    
    @EventListener
    @Class6759
    public void method10605(final Class5717 class5717) {
        if (this.method9906()) {
            ++this.field15970;
            final double max = Math.max(0.35, 0.0);
            if (this.field15969 <= 2) {
                if (this.field15969 != -1) {
                    if (this.field15969 == 0) {
                        if (!OmegaCraftFly.mc.gameSettings.field23439.method1056()) {
                            if (class5717.method16974() > 0.0) {
                                class5717.method16975(-Class7482.method23141());
                            }
                        }
                        ColorUtils.method19155(class5717.method16974());
                        Class7482.method23149(class5717, max - 0.01);
                    }
                }
                else {
                    class5717.method16975(Class7482.method23141());
                    if (OmegaCraftFly.mc.gameSettings.field23440.method1056()) {
                        if (!OmegaCraftFly.mc.gameSettings.field23439.method1056()) {
                            class5717.method16975(-Class7482.method23141());
                        }
                    }
                    ColorUtils.method19155(class5717.method16974());
                    Class7482.method23149(class5717, max);
                }
            }
            else {
                class5717.method16975(0.0);
                Class7482.method23149(class5717, 0.0);
            }
        }
    }
    
    @EventListener
    public void method10606(final Class5744 class5744) {
        if (this.method9906() && class5744.method17046()) {
            ++this.field15969;
            if (this.field15969 == 1) {
                class5744.method17045(true);
            }
            if (this.field15969 != 2) {
                if (this.field15969 > 2) {
                    if (this.field15969 != 40) {
                        class5744.method16961(true);
                    }
                    else {
                        class5744.method17037(-(150.0 + Math.random() * 150.0));
                    }
                }
            }
            else {
                class5744.method17037(-(150.0 + Math.random() * 150.0));
            }
            class5744.method17033(true);
        }
    }
    
    @EventListener
    public void method10607(final Class5723 class5723) {
        if (this.method9906()) {
            final IPacket method16998 = class5723.method16998();
            if (method16998 instanceof Class4328) {
                final Class4328 class5724 = (Class4328)method16998;
                if (this.field15969 >= 1) {
                    this.field15969 = -1;
                }
                this.field15974 = this.field15971;
                this.field15975 = this.field15972;
                this.field15976 = this.field15973;
                this.field15971 = class5724.field19377;
                this.field15972 = class5724.field19378;
                this.field15973 = class5724.field19379;
                class5724.field19380 = OmegaCraftFly.mc.player.rotationYaw;
                class5724.field19381 = OmegaCraftFly.mc.player.rotationPitch;
            }
        }
    }
    
    @EventListener
    public void method10608(final Class5741 class5741) {
        if (this.method9906()) {
            double n = this.field15971 - this.field15974;
            double n2 = this.field15972 - this.field15975;
            double n3 = this.field15973 - this.field15976;
            double field15974 = this.field15974;
            double field15975 = this.field15975;
            double field15976 = this.field15976;
            if (this.field15969 == -1) {
                n *= 0.0;
                n2 *= 0.0;
                n3 *= 0.0;
            }
            if (this.field15969 != 0) {
                if (this.field15969 != 1) {
                    if (this.field15969 > 1) {
                        field15974 += n;
                        field15975 += n2;
                        field15976 += n3;
                        n2 = (n = (n3 = 0.0));
                    }
                }
                else {
                    field15974 += n * 2.0 / 3.0;
                    field15975 += n2 * 2.0 / 3.0;
                    field15976 += n3 * 2.0 / 3.0;
                    n *= 0.0;
                    n2 *= 0.0;
                    n3 *= 0.0;
                }
            }
            else {
                field15974 += n * 1.0 / 3.0;
                field15975 += n2 * 1.0 / 3.0;
                field15976 += n3 * 1.0 / 3.0;
                n *= 0.0;
                n2 *= 0.0;
                n3 *= 0.0;
            }
            final double n4 = field15974 + n * OmegaCraftFly.mc.method5314();
            final double n5 = field15975 + n2 * OmegaCraftFly.mc.method5314();
            final double n6 = field15976 + n3 * OmegaCraftFly.mc.method5314();
            OmegaCraftFly.mc.player.posY = n5;
            OmegaCraftFly.mc.player.lastTickPosY = n5;
            OmegaCraftFly.mc.player.field3019 = n5;
            OmegaCraftFly.mc.player.prevPosY = n5;
            OmegaCraftFly.mc.player.posX = n4;
            OmegaCraftFly.mc.player.lastTickPosX = n4;
            OmegaCraftFly.mc.player.field3018 = n4;
            OmegaCraftFly.mc.player.prevPosX = n4;
            OmegaCraftFly.mc.player.posZ = n6;
            OmegaCraftFly.mc.player.lastTickPosZ = n6;
            OmegaCraftFly.mc.player.field3020 = n6;
            OmegaCraftFly.mc.player.prevPosZ = n6;
        }
    }
}
