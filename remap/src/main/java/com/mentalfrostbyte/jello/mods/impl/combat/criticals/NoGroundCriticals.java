// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.combat.criticals;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.impl.movement.Speed;
import com.mentalfrostbyte.jello.mods.impl.movement.Jesus;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.settings.impl.StringSetting;
import mapped.*;

public class NoGroundCriticals extends Module
{
    private int field15884;
    private boolean field15885;
    private boolean field15886;
    private boolean field15887;
    
    public NoGroundCriticals() {
        super(Category.COMBAT, "NoGround", "NoGround criticals");
        this.addSetting(new StringSetting("Offset", "The way you will fake no ground", 0, new String[] { "Vanilla", "OldHypixel" }));
        this.addSetting(new BooleanSetting("Avoid Fall Damage", "Avoid fall damages.", true));
    }
    
    @Override
    public void onEnable() {
        if (ColorUtils.method19160(NoGroundCriticals.mc.player, 0.001f)) {
            this.field15885 = this.getStringSettingValueByName("Offset").equals("OldHypixel");
            this.field15884 = (this.field15885 ? 2 : 1);
        }
        this.field15886 = false;
    }
    
    @EventListener
    @Class6757
    private void method10469(final Class5745 class5745) {
        if (this.isEnabled() && class5745.method17049() >= 0.625) {
            if (this.field15884 == 0) {
                if (this.field15885) {
                    class5745.setCancelled(true);
                }
            }
        }
    }
    
    @EventListener
    private void method10470(final Class5722 class5722) {
        if (this.isEnabled()) {
            if (this.field15884 == 1) {
                class5722.setCancelled(true);
                this.field15886 = true;
            }
        }
    }
    
    @EventListener
    @Class6757
    private void method10471(final UpdateWalkingEvent updateWalkingEvent) {
        if (!this.isEnabled()) {
            return;
        }
        if (NoGroundCriticals.mc.player.onGround) {
            this.field15887 = false;
            if (this.field15886 && this.field15884 != 1) {
                this.field15886 = !this.field15886;
                NoGroundCriticals.mc.player.method2725();
            }
            if (this.getStringSettingValueByName("Offset").equals("OldHypixel") != this.field15885) {
                this.field15885 = this.getStringSettingValueByName("Offset").equals("OldHypixel");
                this.field15884 = 2;
            }
            double n = this.field15885 ? 1.0E-14 : 0.0;
            boolean b = false;
            final boolean b2 = NoGroundCriticals.mc.field4691 != null && NoGroundCriticals.mc.field4691.getType() == RayTraceResult.Type.BLOCK;
            if (NoGroundCriticals.mc.playerController.method27337() || (NoGroundCriticals.mc.gameSettings.field23446.method1056() && b2) || Jesus.method10433()) {
                this.field15884 = 2;
                b = true;
            }
            else {
                switch (this.field15884) {
                    case 0: {
                        updateWalkingEvent.method17033(true);
                        --this.field15884;
                        break;
                    }
                    case 1: {
                        n = 0.065;
                        --this.field15884;
                        break;
                    }
                    case 2: {
                        updateWalkingEvent.method17033(true);
                        n = 0.065;
                        --this.field15884;
                        if (!this.field15885) {
                            n = 1.0E-14;
                            --this.field15884;
                            break;
                        }
                        break;
                    }
                    case 3: {
                        updateWalkingEvent.method17033(true);
                        n = 0.0;
                        b = true;
                        --this.field15884;
                        break;
                    }
                }
            }
            final Module method21551 = Client.getInstance().method35189().getModuleByClass(Speed.class);
            if (!method21551.isEnabled() || method21551.getStringSettingValueByName("Type").equalsIgnoreCase("Hypixel")) {
                updateWalkingEvent.method17037(updateWalkingEvent.method17036() + n);
            }
            updateWalkingEvent.method17045(b);
        }
        else {
            this.field15884 = ((this.method9883("Avoid Fall Damage") && !this.field15885) ? 3 : 0);
            if (this.method9883("Avoid Fall Damage") && this.field15885 && !this.field15887 && NoGroundCriticals.mc.player.getMotion().y < -0.1) {
                this.field15887 = !this.field15887;
                updateWalkingEvent.method17045(true);
            }
        }
    }
}
