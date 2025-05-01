// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.flys;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import mapped.*;

public class LibreCraftFly extends Module
{
    private int field16046;
    private boolean field16047;
    
    public LibreCraftFly() {
        super(Category.MOVEMENT, "LibreCraft", "A fly for LibreCraft");
        this.addSetting(new NumberSetting("Speed", "Fly speed", 4.0f, Float.class, 0.3f, 10.0f, 0.1f));
    }
    
    @Override
    public void onEnable() {
        this.field16046 = 0;
        if (!LibreCraftFly.mc.gameSettings.field23440.method1056()) {
            if (!LibreCraftFly.mc.gameSettings.field23440.method1056()) {
                this.field16047 = false;
            }
        }
        else {
            LibreCraftFly.mc.gameSettings.field23440.field2162 = false;
            this.field16047 = true;
        }
    }
    
    @Override
    public void onDisable() {
        MovementUtil.method23151(0.0);
        if (LibreCraftFly.mc.player.getMotion().y > 0.0) {
            AllUtils.method19155(-0.0789);
        }
    }
    
    @EventListener
    private void method10733(final Class5752 class5752) {
        if (this.isEnabled()) {
            if (class5752.method17061() == LibreCraftFly.mc.gameSettings.field23440.field2161.field32860) {
                class5752.setCancelled(true);
                this.field16047 = true;
            }
        }
    }
    
    @EventListener
    private void method10734(final Class5715 class5715) {
        if (this.isEnabled()) {
            if (class5715.method16963() == LibreCraftFly.mc.gameSettings.field23440.field2161.field32860) {
                class5715.setCancelled(true);
                this.field16047 = false;
            }
        }
    }
    
    @EventListener
    @LowerPriority
    public void method10735(final Class5717 class5717) {
        if (this.isEnabled()) {
            if (this.field16046 <= 0) {
                if (this.field16046 != -1) {
                    if (this.field16046 == 0) {
                        class5717.method16975(0.0);
                        AllUtils.method19155(class5717.method16974());
                        MovementUtil.method23149(class5717, 0.35);
                    }
                }
                else {
                    class5717.method16975(0.299);
                    AllUtils.method19155(class5717.method16974());
                    MovementUtil.method23149(class5717, this.getNumberSettingValueByName("Speed"));
                }
            }
            else {
                class5717.method16975(0.0);
                MovementUtil.method23149(class5717, 0.0);
            }
        }
    }
    
    @EventListener
    public void method10736(final UpdateWalkingEventI updateWalkingEvent) {
        if (this.isEnabled() && updateWalkingEvent.isPre()) {
            ++this.field16046;
            if (this.field16046 != 2) {
                if (this.field16046 > 2) {
                    if (this.field16046 >= 20 && this.field16046 % 20 == 0) {
                        updateWalkingEvent.method17037(0.1);
                    }
                    else {
                        updateWalkingEvent.setCancelled(true);
                    }
                }
            }
            else {
                updateWalkingEvent.method17037(0.1);
            }
            updateWalkingEvent.method17033(true);
        }
    }
    
    @EventListener
    public void method10737(final EventReceivePacket eventReceivePacket) {
        if (this.isEnabled()) {
            final IPacket method16998 = eventReceivePacket.getPacket();
            if (LibreCraftFly.mc.player != null) {
                if (method16998 instanceof SPlayerPositionLookPacket) {
                    final SPlayerPositionLookPacket class5724 = (SPlayerPositionLookPacket)method16998;
                    if (this.field16046 >= 1) {
                        this.field16046 = -1;
                    }
                    class5724.yaw = LibreCraftFly.mc.player.rotationYaw;
                    class5724.pitch = LibreCraftFly.mc.player.rotationPitch;
                }
            }
        }
    }
}
