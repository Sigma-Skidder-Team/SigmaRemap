// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.flys;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import mapped.*;
import net.minecraft.util.math.shapes.VoxelShape;

import java.util.Iterator;
import java.util.Collections;
import java.util.ArrayList;

public class VanillaFly extends Module
{
    private boolean field15873;
    private int field15874;
    
    public VanillaFly() {
        super(Category.MOVEMENT, "Vanilla", "Regular vanilla fly");
        this.addSetting(new NumberSetting("Speed", "Fly speed", 4.0f, Float.class, 1.0f, 10.0f, 0.1f));
        this.addSetting(new BooleanSetting("Kick bypass", "Bypass vanilla kick for flying", true));
    }
    
    @Override
    public void onEnable() {
        if (!VanillaFly.mc.gameSettings.field23440.method1056()) {
            if (!VanillaFly.mc.gameSettings.field23440.method1056()) {
                this.field15873 = false;
            }
        }
        else {
            VanillaFly.mc.gameSettings.field23440.field2162 = false;
            this.field15873 = true;
        }
    }
    
    @Override
    public void onDisable() {
        ColorUtils.method19155(-0.08);
        Class7482.method23151(Class7482.method23136());
    }
    
    @EventListener
    private void method10457(final Class5752 class5752) {
        if (this.isEnabled()) {
            if (class5752.method17061() == VanillaFly.mc.gameSettings.field23440.field2161.field32860) {
                class5752.setCancelled(true);
                this.field15873 = true;
            }
        }
    }
    
    @EventListener
    private void method10458(final Class5715 class5715) {
        if (this.isEnabled()) {
            if (class5715.method16963() == VanillaFly.mc.gameSettings.field23440.field2161.field32860) {
                class5715.setCancelled(true);
                this.field15873 = false;
            }
        }
    }
    
    @EventListener
    public void method10459(final UpdateWalkingEvent updateWalkingEvent) {
        if (!this.isEnabled()) {
            return;
        }
        if (!VanillaFly.mc.player.onGround && this.method9883("Kick bypass")) {
            if (this.field15874 > 0) {
                if (this.field15874 % 30 == 0) {
                    if (!ColorUtils.method19160(VanillaFly.mc.player, 0.01f)) {
                        if (Class9367.method34762() != Class7906.field32452.method25613()) {
                            updateWalkingEvent.method17037(updateWalkingEvent.method17036() - 0.04);
                        }
                        else {
                            final double method10461 = this.method10461();
                            if (method10461 < 0.0) {
                                return;
                            }
                            double method10462 = updateWalkingEvent.method17036();
                            final ArrayList list = new ArrayList();
                            if (method10462 - method10461 <= 9.0) {
                                VanillaFly.mc.method5269().method17292(new Class4354(updateWalkingEvent.method17034(), method10461, updateWalkingEvent.method17038(), true));
                            }
                            else {
                                while (method10462 > method10461 + 9.0) {
                                    method10462 -= 9.0;
                                    list.add(method10462);
                                    VanillaFly.mc.method5269().method17292(new Class4354(updateWalkingEvent.method17034(), method10462, updateWalkingEvent.method17038(), true));
                                }
                                final Iterator iterator = list.iterator();
                                while (iterator.hasNext()) {
                                    VanillaFly.mc.method5269().method17292(new Class4354(updateWalkingEvent.method17034(), (double)iterator.next(), updateWalkingEvent.method17038(), true));
                                }
                                VanillaFly.mc.method5269().method17292(new Class4354(updateWalkingEvent.method17034(), method10461, updateWalkingEvent.method17038(), true));
                                Collections.reverse(list);
                                final Iterator iterator2 = list.iterator();
                                while (iterator2.hasNext()) {
                                    VanillaFly.mc.method5269().method17292(new Class4354(updateWalkingEvent.method17034(), (double)iterator2.next(), updateWalkingEvent.method17038(), true));
                                }
                                VanillaFly.mc.method5269().method17292(new Class4354(updateWalkingEvent.method17034(), updateWalkingEvent.method17036(), updateWalkingEvent.method17038(), true));
                            }
                            this.field15874 = 0;
                        }
                    }
                }
            }
        }
    }
    
    @EventListener
    public void method10460(final Class5717 class5717) {
        if (this.isEnabled()) {
            if (!ColorUtils.method19160(VanillaFly.mc.player, 0.01f)) {
                ++this.field15874;
            }
            else {
                this.field15874 = 0;
            }
            final double n = Class7482.method23136() * this.getNumberSettingValueByName("Speed");
            double n2 = VanillaFly.mc.gameSettings.field23439.field2162 ? (n / 2.0) : 0.0;
            if (VanillaFly.mc.gameSettings.field23439.field2162 && VanillaFly.mc.gameSettings.field23440.field2162) {
                n2 = 0.0;
            }
            else if (!this.field15873) {
                if (VanillaFly.mc.gameSettings.field23439.field2162) {
                    n2 = n / 2.0;
                }
            }
            else {
                n2 = -n / 2.0;
            }
            Class7482.method23149(class5717, n);
            class5717.method16975(n2);
        }
    }
    
    private double method10461() {
        if (VanillaFly.mc.player.method1895().y < 1.0) {
            return -1.0;
        }
        if (!VanillaFly.mc.player.onGround) {
            final Iterator<Object> iterator = VanillaFly.mc.world.method6981(VanillaFly.mc.player, VanillaFly.mc.player.boundingBox.expand(0.0, -VanillaFly.mc.player.method1934().y, 0.0)).iterator();
            double field25077 = -1.0;
            while (iterator.hasNext()) {
                final VoxelShape class7702 = iterator.next();
                if (class7702.getBoundingBox().maxY <= field25077) {
                    continue;
                }
                field25077 = class7702.getBoundingBox().maxY;
            }
            return field25077;
        }
        return VanillaFly.mc.player.posY;
    }
}
