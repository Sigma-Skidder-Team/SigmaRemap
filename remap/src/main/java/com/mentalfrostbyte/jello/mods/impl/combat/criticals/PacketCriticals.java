// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.combat.criticals;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.impl.movement.Step;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import mapped.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;

public class PacketCriticals extends Module
{
    private TimerUtil field15680;
    private boolean field15681;
    
    public PacketCriticals() {
        super(Category.COMBAT, "Packet", "Packet criticals");
        this.field15680 = new TimerUtil();
        this.addSetting(new NumberSetting("HurtTime", "The hurtTime to crit at", 15.0f, Integer.class, 0.0f, 20.0f, 1.0f));
    }
    
    @EventListener
    private void method10157(final Class5750 class5750) {
        if (this.isEnabled()) {
            if (class5750.method17057() != null) {
                if (class5750.method17059()) {
                    final Entity method17057 = class5750.method17057();
                    if (method17057 instanceof LivingEntity) {
                        if (method17057.hurtResistantTime <= (int)this.getNumberSettingValueByName("HurtTime")) {
                            if (Step.field15758 > 1) {
                                if (this.field15680.getElapsedTime() > 200L || method17057.hurtResistantTime > 0) {
                                    if (PacketCriticals.mc.player.onGround) {
                                        if (PacketCriticals.mc.player.collidedVertically) {
                                            double[] array = { 0.2, 0.0 };
                                            if (this.method9914().getBooleanValueFromSettingName("Hypixel")) {
                                                array = new double[] { 0.121600046157806, 0.200000047683686, 0.0 };
                                            }
                                            for (int i = 0; i < array.length; ++i) {
                                                PacketCriticals.mc.method5269().method17292(new Class4354(PacketCriticals.mc.player.posX, PacketCriticals.mc.player.posY + array[i], PacketCriticals.mc.player.posZ, false));
                                            }
                                            this.field15681 = true;
                                            this.field15680.reset();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    @EventListener
    @HigherPriority
    private void method10158(final Class5721 class5721) {
        if (this.isEnabled()) {
            if (class5721.method16990() instanceof Class4353) {
                if (!this.field15680.isRunning()) {
                    this.field15680.start();
                }
                if (this.field15681) {
                    if (PacketCriticals.mc.player.onGround) {
                        class5721.setCancelled(true);
                        this.field15681 = false;
                    }
                }
            }
        }
    }
}
