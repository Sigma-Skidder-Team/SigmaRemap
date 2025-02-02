// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.player;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.impl.movement.HighJump;
import com.mentalfrostbyte.jello.mods.impl.movement.Fly;
import com.mentalfrostbyte.jello.mods.util.InDevelopment;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import com.mentalfrostbyte.jello.settings.impl.StringSetting;
import mapped.*;
import net.minecraft.util.math.Vec3d;

@InDevelopment
public class AntiVoid extends Module
{
    private double field15662;
    private int field15663;
    private int field15664;
    private Vec3d field15665;
    
    public AntiVoid() {
        super(Category.PLAYER, "AntiVoid", "Avoids you from falling in the void");
        this.field15665 = null;
        this.addSetting(new BooleanSetting("Void", "Catch only above void", true));
        this.addSetting(new NumberSetting("Fall Distance", "Fall distance before catching you", 8.0f, Float.class, 2.0f, 15.0f, 0.5f));
        this.addSetting(new StringSetting("Mode", "AntiVoid method", 0, new String[] { "Hypixel", "Motion", "Cubecraft", "Legit" }));
    }
    
    @Override
    public void onEnable() {
        this.field15662 = 0.0;
        this.field15664 = 0;
        this.field15663 = 0;
        if (AntiVoid.mc.player.onGround || ColorUtils.method19160(AntiVoid.mc.player, 0.001f)) {
            this.field15665 = new Vec3d(AntiVoid.mc.player.posX, AntiVoid.mc.player.posY, AntiVoid.mc.player.posZ);
        }
    }
    
    @EventListener
    private void method10134(final Class5717 class5717) {
        if (this.isEnabled()) {
            if (AntiVoid.mc.player.onGround || ColorUtils.method19160(AntiVoid.mc.player, 0.001f)) {
                this.field15665 = new Vec3d(AntiVoid.mc.player.posX, AntiVoid.mc.player.posY, AntiVoid.mc.player.posZ);
            }
            if (this.field15664 <= 0) {
                final Module method21551 = Client.getInstance().method35189().method21551(Fly.class);
                final String method21552 = method21551.getStringSettingValueByName("Type");
                final Module method21553 = Client.getInstance().method35189().method21551(HighJump.class);
                final String method21554 = method21553.getStringSettingValueByName("Type");
                boolean method21555 = method21551.isEnabled();
                if (method21552.equals("Cubecraft")) {
                    if (class5717.method16974() < -0.4) {
                        method21555 = false;
                    }
                }
                if (method21553.isEnabled()) {
                    if (method21554.equals("Hypixel")) {
                        method21555 = true;
                    }
                }
                if (AntiVoid.mc.player.getMotion().y < -0.08 && !method21555) {
                    this.field15662 -= AntiVoid.mc.player.getMotion().y;
                }
                else if (AntiVoid.mc.player.onGround) {
                    this.field15662 = 0.0;
                }
            }
            else {
                Class7482.method23149(class5717, 0.0);
                class5717.method16975(0.0);
                --this.field15664;
            }
            if (this.field15662 > this.getNumberSettingValueByName("Fall Distance")) {
                if (this.method10137() || !this.method9883("Void")) {
                    this.field15662 = 0.0;
                    this.method10138(this.getStringSettingValueByName("Mode"), class5717);
                }
            }
            if (this.field15663 > 0) {
                --this.field15663;
                Class7482.method23149(class5717, 0.1);
            }
        }
    }
    
    @EventListener
    private void method10135(final UpdateWalkingEvent updateWalkingEvent) {
        if (this.isEnabled()) {
            if (updateWalkingEvent.method17046()) {
                if (this.field15664 != 0) {
                    updateWalkingEvent.setCancelled(true);
                }
            }
        }
    }
    
    @EventListener
    private void method10136(final Class5723 class5723) {
        if (this.isEnabled() && this.field15664 != 0) {
            if (class5723.method16998() instanceof Class4328) {
                this.field15664 = 0;
                this.field15663 = 4;
            }
        }
    }
    
    private boolean method10137() {
        return AntiVoid.mc.player.method1895().y < 1.0 || (!AntiVoid.mc.player.onGround && AntiVoid.mc.world.method6981(AntiVoid.mc.player, AntiVoid.mc.player.boundingBox.expand(0.0, -AntiVoid.mc.player.method1934().y, 0.0)).count() == 0L);
    }
    
    private void method10138(String s, final Class5717 class5717) {
        final double method16760 = AntiVoid.mc.player.method1895().getX();
        AntiVoid.mc.player.method1895().getY();
        final double method16761 = AntiVoid.mc.player.method1895().getZ();
        if (s.equals("Cubecraft") && !ColorUtils.method19148()) {
            s = "Motion";
        }
        final String s2 = s;
        switch (s2) {
            case "Hypixel": {
                AntiVoid.mc.method5269().method17292(new Class4354(0.0, -999.0, 0.0, true));
                break;
            }
            case "Motion": {
                class5717.method16975(0.1);
                ColorUtils.method19155(class5717.method16974());
                break;
            }
            case "Cubecraft": {
                AntiVoid.mc.method5269().method17292(new Class4354(method16760, 3.2E7, method16761, false));
                Client.getInstance().method35189().method21551(Fly.class).method9909(false);
                break;
            }
            case "Legit": {
                this.field15664 = 200;
                break;
            }
        }
    }
}
