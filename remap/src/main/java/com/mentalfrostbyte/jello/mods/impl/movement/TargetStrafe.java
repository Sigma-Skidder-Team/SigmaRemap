// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.impl.combat.KillAura;
import com.mentalfrostbyte.jello.mods.impl.movement.speeds.HypixelSpeed;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import com.mentalfrostbyte.jello.settings.impl.StringSetting;
import mapped.*;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class TargetStrafe extends Module
{
    private int field15727;
    private boolean field15728;
    
    public TargetStrafe() {
        super(Category.MOVEMENT, "TargetStrafe", "Allows you to strafe arround targets with speed");
        this.field15727 = 1;
        this.addSetting(new StringSetting("Mode", "Mode", 0, new String[] { "Basic", "Ninja", "Random" }));
        this.addSetting(new NumberSetting("Radius", "Radius of the circle", 2.0f, Float.class, 1.0f, 6.0f, 0.01f));
        this.addSetting(new BooleanSetting("Only speed", "Use target strafe only when speed is enabled", true));
        this.addSetting(new BooleanSetting("Avoid void", "Avoid you from falling into void", true));
    }
    
    @EventListener
    public void method10227(final Class5739 class5739) {
        if (this.isEnabled()) {
            Entity class5740 = null;
            if ((Client.getInstance().method35189().getModuleByClass(Speed.class).isEnabled() && !HypixelSpeed.field15955) || !this.method9883("Only speed")) {
                if (KillAura.field16061 == null) {
                    if (KillAura.field16060 != null) {
                        class5740 = KillAura.field16060;
                    }
                }
                else {
                    class5740 = KillAura.field16061.method26798();
                }
            }
            if (class5740 == null) {}
        }
    }
    
    @EventListener
    @Class6759
    public void method10228(final Class5717 class5717) {
        if (!this.isEnabled()) {
            return;
        }
        Entity class5718 = null;
        if ((Client.getInstance().method35189().getModuleByClass(Speed.class).isEnabled() || !this.method9883("Only speed")) && !HypixelSpeed.field15955) {
            if (KillAura.field16061 != null) {
                class5718 = KillAura.field16061.method26798();
            }
            else if (KillAura.field16060 != null) {
                class5718 = KillAura.field16060;
            }
        }
        if (class5718 != null) {
            final double sqrt = Math.sqrt(class5717.method16972() * class5717.method16972() + class5717.method16976() * class5717.method16976());
            final float method9886 = this.getNumberSettingValueByName("Radius");
            final String method9887 = this.getStringSettingValueByName("Mode");
            switch (method9887) {
                case "Basic": {
                    this.method10229(class5718, sqrt, method9886, class5717);
                    break;
                }
                case "Ninja": {
                    final float n2 = (float)Math.toRadians(class5718.method1844() - 180.0f);
                    final double n3 = class5718.posX - MathHelper.sin(n2) * method9886;
                    final double n4 = class5718.posZ + MathHelper.cos(n2) * method9886;
                    class5717.method16973(n3 - TargetStrafe.mc.player.posX);
                    class5717.method16977(n4 - TargetStrafe.mc.player.posZ);
                    break;
                }
                case "Random": {
                    final float n5 = (float)(Math.random() * 2.0 * 3.141592653589793);
                    final double n6 = class5718.posX - MathHelper.sin(n5) * method9886;
                    final double n7 = class5718.posZ + MathHelper.cos(n5) * method9886;
                    class5717.method16973(n6 - TargetStrafe.mc.player.posX);
                    class5717.method16977(n7 - TargetStrafe.mc.player.posZ);
                    break;
                }
            }
        }
    }
    
    public void method10229(final Entity class399, final double n, final double n2, final Class5717 class400) {
        final float field32884 = Class8845.method30922(class399).field32884;
        if (TargetStrafe.mc.player.collidedHorizontally) {
            this.field15727 *= -1;
        }
        final float n3 = (float)(n / (n2 * 3.141592653589793 * 2.0)) * 360.0f * this.field15727;
        final float[] method30920;
        final float[] array = method30920 = Class8845.method30920(class399.method1934(), TargetStrafe.mc.player.method1934());
        final int n4 = 0;
        method30920[n4] += n3;
        final float n5 = array[0] * 0.017453292f;
        final float n6 = Class8845.method30920(TargetStrafe.mc.player.method1934(), new Vec3d(class399.posX - MathHelper.sin(n5) * n2, class399.posY, class399.posZ + MathHelper.cos(n5) * n2))[0] * 0.017453292f;
        class400.method16973(-MathHelper.sin(n6) * n);
        class400.method16977(MathHelper.cos(n6) * n);
        final Vec3d class401 = new Vec3d(TargetStrafe.mc.player.posX + class400.method16972(), TargetStrafe.mc.player.posY + class400.method16974(), TargetStrafe.mc.player.posZ + class400.method16976());
        if (this.method9883("Avoid void")) {
            if (!this.field15728 && this.method10230(class401)) {
                this.field15727 *= -1;
                this.field15728 = true;
            }
            else if (this.field15728) {
                if (!this.method10230(class401)) {
                    this.field15728 = false;
                }
            }
        }
    }
    
    private boolean method10230(final Vec3d class5487) {
        return TargetStrafe.mc.player.method1895().y < 1.0 || TargetStrafe.mc.world.method6981(TargetStrafe.mc.player, new AxisAlignedBB(class5487.add(-0.15, 0.0, -0.15), class5487.add(0.15, TargetStrafe.mc.player.method1931(), 0.15)).expand(0.0, -TargetStrafe.mc.player.method1934().y, 0.0)).count() == 0L;
    }
}
