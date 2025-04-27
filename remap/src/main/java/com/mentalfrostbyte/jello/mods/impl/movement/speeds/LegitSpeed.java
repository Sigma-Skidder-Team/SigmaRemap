// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.speeds;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import mapped.*;

public class LegitSpeed extends Module
{
    private double field15859;
    private float field15860;
    private float field15861;
    private boolean field15862;
    private float field15863;
    
    public LegitSpeed() {
        super(Category.MOVEMENT, "Legit", "Legit Sprint jumping.");
        this.field15863 = 1.0f;
        this.addSetting(new BooleanSetting("Sprint", "Sprints when walking", true));
        this.addSetting(new BooleanSetting("AutoJump", "Automatically jumps for you.", true));
    }
    
    @EventListener
    public void method10449(final Class5717 class5717) {
        if (this.isEnabled()) {
            if (LegitSpeed.mc.player.onGround) {
                if (LegitSpeed.mc.player.collidedVertically) {
                    if (LegitSpeed.mc.player.field2970 != 0.0f || LegitSpeed.mc.player.field2968 != 0.0f) {
                        if (this.getBooleanValueFromSettingName("AutoJump")) {
                            LegitSpeed.mc.player.method2725();
                            class5717.method16975(LegitSpeed.mc.player.getMotion().y);
                        }
                    }
                }
            }
            final double field22771 = class5717.method16978().y;
            class5717.method16978().y = 0.0;
            final double method16752 = class5717.method16978().length();
            class5717.method16978().y = field22771;
            this.field15859 = method16752;
            final float n = MovementUtil.method23143()[1];
            final float n2 = MovementUtil.method23143()[2];
            final float n3 = MovementUtil.method23143()[0];
            if (n == 0.0f) {
                if (n2 == 0.0f) {
                    class5717.method16973(0.0);
                    class5717.method16977(0.0);
                }
            }
            final double cos = Math.cos(Math.toRadians(n3));
            final double sin = Math.sin(Math.toRadians(n3));
            this.field15859 *= this.field15863;
            class5717.method16973(n * this.field15859 * cos + n2 * this.field15859 * sin + this.field15860);
            class5717.method16977(n * this.field15859 * sin - n2 * this.field15859 * cos + this.field15861);
            LegitSpeed.mc.player.getMotion().x = class5717.method16972();
            LegitSpeed.mc.player.getMotion().y = class5717.method16974();
            if (this.field15860 != 0.0f || this.field15861 != 0.0f) {
                this.field15860 *= (float)0.85;
                this.field15861 *= (float)0.85;
                this.field15863 = Math.min(1.0f, this.field15863 + 0.1f);
            }
            if (LegitSpeed.mc.player.onGround) {
                if (!this.field15862) {
                    this.field15860 = 0.0f;
                    this.field15861 = 0.0f;
                    this.field15863 = Math.min(1.0f, this.field15863 + 0.33f);
                }
            }
            this.field15862 = false;
        }
    }
    
    @EventListener
    private void method10450(final Class5723 class5723) {
        if (this.isEnabled()) {
            if (LegitSpeed.mc.player != null) {
                if (class5723.method16998() instanceof Class4273) {
                    final Class4273 class5724 = (Class4273)class5723.method16998();
                    if (class5724.method12822() == LegitSpeed.mc.player.getEntityId()) {
                        this.field15860 += class5724.field19165 / 8000.0f;
                        this.field15861 += class5724.field19167 / 8000.0f;
                        this.field15862 = true;
                        this.field15863 = 0.0f;
                    }
                }
            }
        }
    }
}
