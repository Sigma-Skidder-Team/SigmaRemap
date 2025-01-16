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
    public void method9879() {
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
            if (!Client.method35173().method35189().method21551(Timer.class).method9906()) {
                HypixelSpeed.mc.timer.timerSpeed = 1.0f;
            }
        }
    }
    
    @EventListener
    public void method10588(final Class5744 class5744) {
        if (this.method9906()) {
            if (HypixelSpeed.mc.player != null) {
                if (!Jesus.method10433()) {
                    if (!Client.method35173().method35189().method21551(BlockFly.class).method9906()) {
                        if (!Client.method35173().method35189().method21551(Fly.class).method9906()) {
                            if (class5744.method17046()) {
                                if (!HypixelSpeed.mc.player.onGround) {
                                    if (class5744.method17046()) {
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
                                    final Module method21551 = Client.method35173().method35189().method21551(Criticals.class);
                                    boolean b = false;
                                    Label_0166: {
                                        if (method21551.method9906()) {
                                            if (method21551.method9887("Type").equals("NoGround")) {
                                                if (method21551.method9883("Hypixel")) {
                                                    b = true;
                                                    break Label_0166;
                                                }
                                            }
                                        }
                                        b = false;
                                    }
                                    if (!b) {
                                        class5744.method17037(class5744.method17036() + 1.0E-14);
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
        if (!this.method9906() || HypixelSpeed.mc.player == null) {
            return;
        }
        if (!this.method9883("Auto Jump") && !HypixelSpeed.mc.player.field2967) {
            this.onDisable();
            HypixelSpeed.field15955 = true;
            return;
        }
        ++this.field15952;
        if (!Jesus.method10433()) {
            if (!HypixelSpeed.mc.player.method1706()) {
                if (!Client.method35173().method35189().method21551(BlockFly.class).method9906()) {
                    if (!Client.method35173().method35189().method21551(Fly.class).method9906()) {
                        HypixelSpeed.field15955 = false;
                        HypixelSpeed.mc.player.field2985 = 5;
                        if (!HypixelSpeed.mc.player.onGround) {
                            if (this.field15951 >= 0) {
                                ++this.field15951;
                                if (Class7482.method23140() == 0) {
                                    if (this.field15951 != 1) {
                                        if (this.field15951 != 2) {
                                            if (this.field15951 != 3) {
                                                if (this.field15951 == 4) {
                                                    if (Math.abs(class5717.method16974()) < 0.1) {
                                                        if (Class9367.method34762() == Class7906.field32452.method25613()) {
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
                                    if (!Client.method35173().method35189().method21551(Timer.class).method9906()) {
                                        HypixelSpeed.mc.timer.timerSpeed = 1.0f;
                                    }
                                }
                                double n = this.field15954;
                                if (this.field15951 > 0) {
                                    n = Math.max(Class7482.method23138() - Math.min(5, this.field15953) / 5 * this.field15953, this.field15954 * 0.99);
                                }
                                Class7482.method23149(class5717, n);
                            }
                        }
                        else if (this.field15953 <= 0 && Step.field15758 >= 3) {
                            if (((this.method9883("Auto Jump") || HypixelSpeed.mc.player.field2967) && Class6430.method19114()) || HypixelSpeed.mc.gameSettings.field23439.method1056()) {
                                this.field15951 = 0;
                                HypixelSpeed.mc.player.method2725();
                                class5717.method16973(HypixelSpeed.mc.player.getMotion().x);
                                class5717.method16975(HypixelSpeed.mc.player.getMotion().y);
                                class5717.method16977(HypixelSpeed.mc.player.getMotion().z);
                            }
                        }
                        else {
                            Class7482.method23149(class5717, Class7482.method23137());
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
    @Class6759
    public void method10590(final Class5722 class5722) {
        if (this.method9906()) {
            if (!Jesus.method10433()) {
                if (!Client.method35173().method35189().method21551(BlockFly.class).method9906()) {
                    if (!Client.method35173().method35189().method21551(Fly.class).method9906()) {
                        if (HypixelSpeed.mc.gameSettings.field23439.method1056() && Client.method35173().method35189().method21551(BlockFly.class).method9906()) {
                            return;
                        }
                        if (!this.method9883("Auto Jump") && !HypixelSpeed.mc.player.field2967) {
                            return;
                        }
                        if (this.field15951 != 0) {
                            class5722.method16961(true);
                        }
                        class5722.method16995(Class7482.method23141() + 1.0E-14);
                        double field15954 = 0.644348756324588 + Math.random() * 1.0E-5 + Class7482.method23139() * 0.13;
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
                        if (this.method9883("Timer")) {
                            if (!Client.method35173().method35189().method21551(Timer.class).method9906()) {
                                HypixelSpeed.mc.timer.timerSpeed = 1.4123f;
                            }
                        }
                    }
                }
            }
        }
    }
    
    @EventListener
    public void method10591(final Class5723 class5723) {
        if (this.method9906()) {
            if (class5723.method16998() instanceof Class4328) {
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