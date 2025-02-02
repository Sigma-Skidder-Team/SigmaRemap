// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.flys;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.*;

public class HawkFly extends Module { //Hawk tuah
    private int field15576;
    private double field15577;
    private double field15578;
    private double field15579;

    public HawkFly() {
        super(Category.MOVEMENT, "Hawk", "A fly for Hawk anticheat");
    }

    @Override
    public void onEnable() {
        this.field15577 = HawkFly.mc.player.posX;
        this.field15578 = HawkFly.mc.player.posY;
        this.field15579 = HawkFly.mc.player.posZ;
        this.field15576 = 0;
    }

    @Override
    public void onDisable() {
        Class7482.method23151(0.0);
        if (HawkFly.mc.player.getMotion().y > 0.0) {
            ColorUtils.method19155(-0.0789);
        }
    }

    @EventListener
    @Class6759
    public void method9987(final Class5717 class5717) {
        if (this.isEnabled()) {
            final double n = 0.125;
            if (this.field15576 != -1) {
                if (this.field15576 == 0) {
                    Class7482.method23149(class5717, 0.18);
                }
            } else {
                class5717.method16975(0.015);
                Class7482.method23149(class5717, n);
            }
            ColorUtils.method19155(class5717.method16974());
            ColorUtils.method19154(class5717.method16972());
            ColorUtils.method19156(class5717.method16976());
        }
    }

    @EventListener
    public void method9988(final Class5744 class5744) {
        if (this.isEnabled() && class5744.method17046()) {
            ++this.field15576;
            if (this.field15576 == 1) {
                class5744.method17037(0.1);
            }
            class5744.method17033(true);
            class5744.method17045(false);
        }
    }

    @EventListener
    public void method9989(final Class5723 class5723) {
        if (this.isEnabled()) {
            final IPacket method16998 = class5723.method16998();
            if (method16998 instanceof Class4328) {
                final Class4328 class5724 = (Class4328) method16998;
                if (this.field15576 >= 1) {
                    this.field15576 = -1;
                }
                this.field15577 = class5724.field19377;
                this.field15578 = class5724.field19378;
                this.field15579 = class5724.field19379;
                class5724.field19380 = HawkFly.mc.player.rotationYaw;
                class5724.field19381 = HawkFly.mc.player.rotationPitch;
            }
        }
    }

    @EventListener
    public void method9990(final Class5741 class5741) {
        if (this.isEnabled()) {
            final double field15578 = this.field15578;
            final double field15579 = this.field15577;
            final double field15580 = this.field15579;
            HawkFly.mc.player.posY = field15578;
            HawkFly.mc.player.lastTickPosY = field15578;
            HawkFly.mc.player.field3019 = field15578;
            HawkFly.mc.player.prevPosY = field15578;
            HawkFly.mc.player.posX = field15579;
            HawkFly.mc.player.lastTickPosX = field15579;
            HawkFly.mc.player.field3018 = field15579;
            HawkFly.mc.player.prevPosX = field15579;
            HawkFly.mc.player.posZ = field15580;
            HawkFly.mc.player.lastTickPosZ = field15580;
            HawkFly.mc.player.field3020 = field15580;
            HawkFly.mc.player.prevPosZ = field15580;
        }
    }
}
