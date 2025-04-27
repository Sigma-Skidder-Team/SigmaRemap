// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.PremiumModule;
import mapped.*;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;

public class BoatFly extends PremiumModule
{
    private boolean field16003;
    public boolean field16004;
    
    public BoatFly() {
        super("BoatFly", "Fly with a boat", Category.MOVEMENT);
        this.field16004 = false;
    }
    
    @EventListener
    public void method10641(final EventPlayerTick eventPlayerTick) {
        if (!this.isEnabled()) {
            return;
        }
        if (BoatFly.mc.player.method1920() != null) {
            final Vec3d method1935 = BoatFly.mc.player.method1920().getMotion();
            if (Math.sqrt(method1935.x * method1935.x + method1935.z * method1935.z) >= 1.399999976158142) {}
            final float method1936 = MovementUtil.method23147();
            double n = Math.cos(Math.toRadians(method1936)) * 5.0;
            double n2 = Math.sin(Math.toRadians(method1936)) * 5.0;
            if (!MovementUtil.isMoving()) {
                n = 0.0;
                n2 = 0.0;
            }
            final Entity method1937 = BoatFly.mc.player.method1920();
            method1937.rotationYaw = BoatFly.mc.player.rotationYaw;
            method1937.setMotion(n, BoatFly.mc.player.field2967 ? 1.0 : (this.field16004 ? -1.0 : 0.03999999910593033), n2);
            if (BoatFly.mc.player.ticksExisted % 100 != 0) {}
        }
    }
    
    @EventListener
    private void method10642(final Class5752 class5752) {
        if (!this.isEnabled()) {
            return;
        }
        if (BoatFly.mc.player.method1920() == null) {
            return;
        }
        if (!BoatFly.mc.player.method1920().onGround) {
            if (class5752.method17061() == BoatFly.mc.gameSettings.field23440.field2161.field32860) {
                class5752.setCancelled(true);
                this.field16004 = true;
            }
        }
    }
    
    @EventListener
    @HigherPriority
    private void method10643(final Class5721 class5721) {
        if (this.isEnabled()) {
            if (!class5721.method16990().toString().contains(".play.client.")) {}
            if (!(class5721.method16990() instanceof Class4303)) {
                if (class5721.method16990() instanceof Class4323) {
                    if (!BoatFly.mc.player.isAlive()) {}
                }
            }
        }
    }
    
    @EventListener
    private void method10644(final Class5715 class5715) {
        if (!this.isEnabled()) {
            return;
        }
        if (BoatFly.mc.player.method1920() == null) {
            return;
        }
        if (!BoatFly.mc.player.method1920().onGround) {
            if (class5715.method16963() == BoatFly.mc.gameSettings.field23440.field2161.field32860) {
                class5715.setCancelled(true);
                this.field16004 = false;
            }
        }
    }
    
    @Override
    public void onEnable() {
        this.field16004 = false;
    }
    
    @Override
    public void onDisable() {
        BoatFly.mc.gameSettings.field23440.field2162 = this.field16004;
    }
}
