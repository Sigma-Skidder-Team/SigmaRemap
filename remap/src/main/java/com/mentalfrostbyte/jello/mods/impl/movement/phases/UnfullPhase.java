// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.phases;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.*;

public class UnfullPhase extends Module
{
    private int field15944;
    private double field15945;
    
    public UnfullPhase() {
        super(Category.MOVEMENT, "Unfull", "Weird Hypixel VClip for some blocks");
    }
    
    @EventListener
    private void method10572(final Class5747 class5747) {
        if (this.isEnabled()) {
            if ((int) UnfullPhase.mc.player.posY == this.field15944) {
                if (!UnfullPhase.mc.player.field2967) {
                    ColorUtils.method19155(-2.0);
                }
            }
            if (UnfullPhase.mc.player.posY > this.field15944) {
                if (UnfullPhase.mc.player.field2967) {
                    if (!UnfullPhase.mc.player.method1809()) {
                        ++this.field15944;
                    }
                }
            }
            if (UnfullPhase.mc.player.posY % 1.0 == 0.0) {
                if (UnfullPhase.mc.player.method1809()) {
                    --this.field15944;
                }
            }
        }
    }
    
    @EventListener
    private void method10573(final Class5753 class5753) {
        if (this.isEnabled()) {
            if (class5753.method17065() == null || class5753.method17064().getY() != this.field15944 - 1) {
                if (class5753.method17064().getY() != this.field15944) {
                    if (class5753.method17064().getY() != this.field15944 + 1 || !(UnfullPhase.mc.world.getBlockState(class5753.method17064()).method21696() instanceof SlabBlock)) {
                        if (!(UnfullPhase.mc.world.getBlockState(class5753.method17064()).method21696() instanceof Class3972)) {
                            if (!(UnfullPhase.mc.world.getBlockState(class5753.method17064()).method21696() instanceof Class3916)) {
                                if (!(UnfullPhase.mc.world.getBlockState(class5753.method17064()).method21696() instanceof Class3855)) {
                                    if (!(UnfullPhase.mc.world.getBlockState(class5753.method17064()).method21696() instanceof Class3849)) {
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class5753.method17067(null);
        }
    }
    
    @EventListener
    private void method10574(final Class5713 class5713) {
        if (this.isEnabled()) {
            class5713.setCancelled(true);
        }
    }
    
    @Override
    public void onEnable() {
        this.field15944 = (int) UnfullPhase.mc.player.posY;
        this.field15945 = this.field15944 - UnfullPhase.mc.player.posY;
    }
}
