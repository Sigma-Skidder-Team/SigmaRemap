// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.speeds;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.impl.movement.BlockFly;
import com.mentalfrostbyte.jello.mods.impl.world.Timer;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import com.mentalfrostbyte.jello.settings.impl.StringSetting;
import mapped.*;

public class CubecraftSpeed extends Module
{
    private int field15941;
    private double field15942;
    private double field15943;
    
    public CubecraftSpeed() {
        super(Category.MOVEMENT, "Cubecraft", "Speed for Cubecraft");
        this.addSetting(new StringSetting("Mode", "Mode", 0, new String[] { "Basic", "Hop", "YPort" }));
        this.addSetting(new NumberSetting("Speed", "Speed value", 0.75f, Float.class, 0.1f, 1.0f, 0.01f));
        this.addSetting(new BooleanSetting("AutoJump", "Automatically jumps for you.", false));
    }
    
    @Override
    public void method9879() {
        this.field15941 = 0;
        this.field15943 = -1.0;
    }
    
    @Override
    public void onDisable() {
        CubecraftSpeed.mc.timer.timerSpeed = 1.0f;
        Class7482.method23151(0.2);
        if (CubecraftSpeed.mc.player.getMotion().y > 0.0) {
            Class6430.method19155(-0.078);
        }
    }
    
    @EventListener
    public void method10569(final Class5717 class5717) {
        if (!this.method9906() || Client.method35173().method35189().method21551(BlockFly.class).method9906() || Class6430.method19112(CubecraftSpeed.mc.player)) {
            return;
        }
        final String method9887 = this.method9887("Mode");
        switch (method9887) {
            case "Basic": {
                ++this.field15941;
                this.field15942 = 0.27;
                CubecraftSpeed.mc.timer.timerSpeed = 0.7f;
                if (Class6430.method19160(CubecraftSpeed.mc.player, 0.01f)) {
                    if (this.method9883("AutoJump")) {
                        CubecraftSpeed.mc.player.method2725();
                        class5717.method16975(CubecraftSpeed.mc.player.getMotion().y);
                        Class7482.method23149(class5717, this.field15942);
                    }
                    if (this.field15941 == 1) {
                        this.field15942 = this.getNumberSettingValueByName("Speed") * 2.4;
                    }
                    else if (this.field15941 == 2) {
                        CubecraftSpeed.mc.timer.timerSpeed = 1.0f;
                        this.field15942 = 0.26;
                    }
                    else if (this.field15941 >= 3) {
                        this.field15941 = 0;
                        this.field15942 = 0.26;
                    }
                }
                else {
                    if (CubecraftSpeed.mc.timer.timerSpeed == 0.7f) {
                        CubecraftSpeed.mc.timer.timerSpeed = 1.0f;
                    }
                    if (this.field15941 == 1) {
                        this.field15942 = 0.27;
                        if (class5717.method16974() > 0.0) {
                            this.field15942 = 2.0;
                        }
                    }
                    else if (this.field15941 > 1) {
                        this.field15941 = 0;
                    }
                }
                Class7482.method23149(class5717, this.field15942);
                break;
            }
            case "Hop": {
                if (!CubecraftSpeed.mc.player.collidedVertically || !Class6430.method19160(CubecraftSpeed.mc.player, 0.001f) || !Class7482.method23148()) {
                    ++this.field15941;
                    if (this.field15941 == 1) {
                        this.field15942 = 0.4 + Class7482.method23139() * 0.1;
                    }
                    this.field15942 -= 0.015;
                    if (CubecraftSpeed.mc.gameSettings.field23437.field2162) {
                        this.field15942 -= 0.07;
                    }
                    Class7482.method23149(class5717, this.field15942 = Math.max(this.field15942, 0.2));
                    break;
                }
                if (this.method9883("AutoJump")) {
                    CubecraftSpeed.mc.player.method2725();
                    class5717.method16975(CubecraftSpeed.mc.player.getMotion().y);
                    Class7482.method23149(class5717, this.field15942);
                    break;
                }
                break;
            }
            case "YPort": {
                if (CubecraftSpeed.mc.player.onGround) {
                    if (Class6430.method19114()) {
                        class5717.method16975(0.53000000000001);
                        Class7482.method23149(class5717, 3.67 * this.getNumberSettingValueByName("Speed"));
                        this.field15941 = 0;
                    }
                    this.field15943 = CubecraftSpeed.mc.player.posY;
                    if (!Client.method35173().method35189().method21551(Timer.class).method9906()) {
                        CubecraftSpeed.mc.timer.timerSpeed = 1.0f;
                        break;
                    }
                    break;
                }
                else {
                    CubecraftSpeed.mc.timer.timerSpeed = 1.0f - this.getNumberSettingValueByName("Speed") * 0.13f;
                    if (this.field15941 == 0 && class5717.method16974() == 0.44100000858307864) {
                        this.field15941 = 1;
                        Class7482.method23149(class5717, 0.286);
                        class5717.method16975(-0.265);
                        Class6430.method19155(class5717.method16974());
                        break;
                    }
                    if (this.field15941 == 1) {
                        this.field15941 = -1;
                        Class7482.method23149(class5717, 0.285);
                        break;
                    }
                    break;
                }
                break;
            }
        }
    }
    
    @EventListener
    public void method10570(final Class5741 class5741) {
        if (this.method9906()) {
            if (this.field15943 >= 0.0) {
                if (this.method9887("Mode").equals("YPort")) {
                    if (CubecraftSpeed.mc.player.onGround) {
                        if (Class6430.method19160(CubecraftSpeed.mc.player, 0.001f)) {
                            this.field15943 = CubecraftSpeed.mc.player.posY;
                        }
                    }
                    CubecraftSpeed.mc.player.posY = this.field15943;
                    CubecraftSpeed.mc.player.lastTickPosY = this.field15943;
                    CubecraftSpeed.mc.player.field3019 = this.field15943;
                    CubecraftSpeed.mc.player.prevPosY = this.field15943;
                    if (Class7482.method23148()) {
                        CubecraftSpeed.mc.player.field3013 = 0.099999994f;
                    }
                }
            }
        }
    }
    
    @EventListener
    public void method10571(final Class5722 class5722) {
        if (this.method9906()) {
            class5722.method16995(0.4);
            this.field15942 = 0.6 + Class7482.method23139() * 0.1;
            this.field15941 = 0;
            class5722.method16996(this.field15942);
        }
    }
}