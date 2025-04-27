// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.clicktps;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.*;
import net.minecraft.util.math.BlockPos;

public class SpartanClickTP extends Module
{
    private int field15791;
    private BlockPos field15792;
    
    public SpartanClickTP() {
        super(Category.MOVEMENT, "Spartan", "ClickTP for spartan anticheat");
    }
    
    @Override
    public void onEnable() {
        this.field15791 = -1;
        this.field15792 = null;
    }
    
    @Override
    public void onDisable() {
        ColorUtils.method19155(-0.08);
        MovementUtil.method23151(MovementUtil.method23136());
        SpartanClickTP.mc.timer.timerSpeed = 1.0f;
    }
    
    @EventListener
    private void method10366(final Class5748 class5748) {
        if (this.isEnabled() && (SpartanClickTP.mc.player.method1809() || !this.method9914().getBooleanValueFromSettingName("Sneak"))) {
            if (class5748.method17055() == Class1958.field10672) {
                final BlockRayTraceResult method13697 = Class4609.method13697(SpartanClickTP.mc.player.rotationYaw, SpartanClickTP.mc.player.rotationPitch, this.method9914().getNumberSettingValueByName("Maximum range"));
                BlockPos method13698 = null;
                if (method13697 != null) {
                    method13698 = method13697.getPos();
                }
                if (method13698 == null) {
                    return;
                }
                this.field15792 = method13698;
                SpartanClickTP.mc.method5269().method17292(new Class4354(this.field15792.getX() + 0.5, this.field15792.getY() + 1, this.field15792.getZ() + 0.5, true));
                this.field15791 = 0;
            }
        }
    }
    
    @EventListener
    public void method10367(final Class5723 class5723) {
        if (this.isEnabled()) {
            if (class5723.method16998() instanceof Class4328) {
                final Class4328 class5724 = (Class4328)class5723.method16998();
                if (class5724.field19377 == this.field15792.getX() + 0.5) {
                    if (class5724.field19378 == this.field15792.getY() + 1) {
                        if (class5724.field19379 == this.field15792.getZ() + 0.5) {
                            Client.getInstance().getNotificationManager().send(new Notification("ClickTP", "Successfully teleported"));
                            this.method9914().toggle();
                        }
                    }
                }
            }
        }
    }
    
    @EventListener
    private void method10368(final Class5717 class5717) {
        if (this.isEnabled()) {
            if (this.field15791 > -1) {
                if (this.field15792 != null) {
                    class5717.method16975(0.01);
                    ++this.field15791;
                    if (this.field15791 >= 20) {
                        SpartanClickTP.mc.timer.timerSpeed = 1.4f;
                    }
                    else {
                        SpartanClickTP.mc.timer.timerSpeed = 2.0f;
                    }
                    SpartanClickTP.mc.method5269().method17292(new Class4354(SpartanClickTP.mc.player.posX, SpartanClickTP.mc.player.posY, SpartanClickTP.mc.player.posZ, true));
                    SpartanClickTP.mc.method5269().method17292(new Class4354(this.field15792.getX() + 0.5, this.field15792.getY() + 1, this.field15792.getZ() + 0.5, true));
                }
            }
        }
    }
}
