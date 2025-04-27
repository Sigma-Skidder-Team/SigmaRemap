// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.speeds;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.impl.combat.Criticals;
import com.mentalfrostbyte.jello.mods.impl.movement.*;
import com.mentalfrostbyte.jello.mods.impl.world.Timer;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import mapped.*;

public class HypixelSpeed extends Module
{
    private int field15951;
    private int field15952;
    private int field15953;
    private double field15954;
    public static boolean field15955;
    
    public HypixelSpeed() {
        super(Category.MOVEMENT, "Hypixel", "Speed for Hypixel");
        this.addSetting(new BooleanSetting("Auto Jump", "Automatically jumps for you.", true));
        this.addSetting(new BooleanSetting("Timer", "Use timer", true));
    }
    
    @Override
    public void onEnable() {
        this.field15952 = 7;
        final double field22770 = HypixelSpeed.mc.player.getMotion().x;
        final double field22771 = HypixelSpeed.mc.player.getMotion().z;
        this.field15954 = Math.sqrt(field22770 * field22770 + field22771 * field22771);
        this.field15953 = 0;
    }
    
    @Override
    public void onDisable() {
        HypixelSpeed.field15955 = false;
        if (Math.abs(HypixelSpeed.mc.timer.timerSpeed - 1.4123) < 0.001) {
            if (!Client.getInstance().moduleManager().getModuleByClass(Timer.class).isEnabled()) {
                HypixelSpeed.mc.timer.timerSpeed = 1.0f;
            }
        }
    }
    
    @EventListener
    public void method10588(final UpdateWalkingEventI updateWalkingEvent) {
        if (this.isEnabled()) {
            if (HypixelSpeed.mc.player != null) {
                if (!Jesus.method10433()) {
                    if (!Client.getInstance().moduleManager().getModuleByClass(BlockFly.class).isEnabled()) {
                        if (!Client.getInstance().moduleManager().getModuleByClass(Fly.class).isEnabled()) {
                            if (updateWalkingEvent.isPre()) {
                                if (!HypixelSpeed.mc.player.onGround) {
                                    if (updateWalkingEvent.isPre()) {
                                        if (Speed.field15748 > 1) {
                                            final double n = HypixelSpeed.mc.player.posX - HypixelSpeed.mc.player.field4074;
                                            final double n2 = HypixelSpeed.mc.player.posZ - HypixelSpeed.mc.player.field4076;
                                            if (this.field15951 != 0) {
                                                this.field15954 = Math.sqrt(n * n + n2 * n2);
                                            }
                                            else {
                                                this.field15954 *= 0.63 + Math.random() * 1.0E-5;
                                            }
                                        }
                                    }
                                }
                                else {
                                    final Module method21551 = Client.getInstance().moduleManager().getModuleByClass(Criticals.class);
                                    boolean b = false;
                                    Label_0166: {
                                        if (method21551.isEnabled()) {
                                            if (method21551.getStringSettingValueByName("Type").equals("NoGround")) {
                                                if (method21551.getBooleanValueFromSettingName("Hypixel")) {
                                                    b = true;
                                                    break Label_0166;
                                                }
                                            }
                                        }
                                        b = false;
                                    }
                                    if (!b) {
                                        updateWalkingEvent.method17037(updateWalkingEvent.method17036() + 1.0E-14);
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
    public void method10589(final Class5717 class5717) {
        if (!this.isEnabled() || HypixelSpeed.mc.player == null) {
            return;
        }
        if (!this.getBooleanValueFromSettingName("Auto Jump") && !HypixelSpeed.mc.player.field2967) {
            this.onDisable();
            HypixelSpeed.field15955 = true;
            return;
        }
        ++this.field15952;
        if (!Jesus.method10433()) {
            if (!HypixelSpeed.mc.player.method1706()) {
                if (!Client.getInstance().moduleManager().getModuleByClass(BlockFly.class).isEnabled()) {
                    if (!Client.getInstance().moduleManager().getModuleByClass(Fly.class).isEnabled()) {
                        HypixelSpeed.field15955 = false;
                        HypixelSpeed.mc.player.field2985 = 5;
                        if (!HypixelSpeed.mc.player.onGround) {
                            if (this.field15951 >= 0) {
                                ++this.field15951;
                                if (MovementUtil.method23140() == 0) {
                                    if (this.field15951 != 1) {
                                        if (this.field15951 != 2) {
                                            if (this.field15951 != 3) {
                                                if (this.field15951 == 4) {
                                                    if (Math.abs(class5717.method16974()) < 0.1) {
                                                        if (ViaManager.method34762() == Class7906.field32452.method25613()) {
                                                            class5717.method16975(0.0300011120129438);
                                                        }
                                                    }
                                                }
                                            }
                                            else {
                                                class5717.method16975(class5717.method16974() * 0.967);
                                            }
                                        }
                                        else {
                                            class5717.method16975(class5717.method16974() * 0.98);
                                        }
                                    }
                                    else {
                                        class5717.method16975(class5717.method16974() * 0.985);
                                    }
                                }
                                if (Math.abs(HypixelSpeed.mc.timer.timerSpeed - 1.4123) < 0.001) {
                                    if (!Client.getInstance().moduleManager().getModuleByClass(Timer.class).isEnabled()) {
                                        HypixelSpeed.mc.timer.timerSpeed = 1.0f;
                                    }
                                }
                                double n = this.field15954;
                                if (this.field15951 > 0) {
                                    n = Math.max(MovementUtil.method23138() - Math.min(5, this.field15953) / 5 * this.field15953, this.field15954 * 0.99);
                                }
                                MovementUtil.method23149(class5717, n);
                            }
                        }
                        else if (this.field15953 <= 0 && Step.field15758 >= 3) {
                            if (((this.getBooleanValueFromSettingName("Auto Jump") || HypixelSpeed.mc.player.field2967) && ColorUtils.method19114()) || HypixelSpeed.mc.gameSettings.field23439.method1056()) {
                                this.field15951 = 0;
                                HypixelSpeed.mc.player.method2725();
                                class5717.method16973(HypixelSpeed.mc.player.getMotion().x);
                                class5717.method16975(HypixelSpeed.mc.player.getMotion().y);
                                class5717.method16977(HypixelSpeed.mc.player.getMotion().z);
                            }
                        }
                        else {
                            MovementUtil.method23149(class5717, MovementUtil.method23137());
                            this.field15953 = 0;
                        }
                        return;
                    }
                }
            }
        }
        this.field15951 = -1;
        HypixelSpeed.mc.timer.timerSpeed = 1.0f;
    }
    
    @EventListener
    @LowerPriority
    public void method10590(final Class5722 class5722) {
        if (this.isEnabled()) {
            if (!Jesus.method10433()) {
                if (!Client.getInstance().moduleManager().getModuleByClass(BlockFly.class).isEnabled()) {
                    if (!Client.getInstance().moduleManager().getModuleByClass(Fly.class).isEnabled()) {
                        if (HypixelSpeed.mc.gameSettings.field23439.method1056() && Client.getInstance().moduleManager().getModuleByClass(BlockFly.class).isEnabled()) {
                            return;
                        }
                        if (!this.getBooleanValueFromSettingName("Auto Jump") && !HypixelSpeed.mc.player.field2967) {
                            return;
                        }
                        if (this.field15951 != 0) {
                            class5722.setCancelled(true);
                        }
                        class5722.method16995(MovementUtil.method23141() + 1.0E-14);
                        double field15954 = 0.644348756324588 + Math.random() * 1.0E-5 + MovementUtil.method23139() * 0.13;
                        if (this.field15952 >= 5) {
                            this.field15952 = 0;
                        }
                        else {
                            field15954 /= 1.2;
                        }
                        if (Speed.field15748 < 4) {
                            field15954 /= 1.4;
                        }
                        class5722.method16996(field15954);
                        this.field15954 = field15954;
                        if (this.getBooleanValueFromSettingName("Timer")) {
                            if (!Client.getInstance().moduleManager().getModuleByClass(Timer.class).isEnabled()) {
                                HypixelSpeed.mc.timer.timerSpeed = 1.4123f;
                            }
                        }
                    }
                }
            }
        }
    }
    
    @EventListener
    public void method10591(final EventReceivePacket eventReceivePacket) {
        if (this.isEnabled()) {
            if (eventReceivePacket.getPacket() instanceof SPlayerPositionLookPacket) {
                this.field15954 = 0.0;
                ++this.field15953;
            }
        }
    }
    
    public void method10592() {
        this.field15951 = 0;
    }
    
    static {
        HypixelSpeed.field15955 = false;
    }
}
