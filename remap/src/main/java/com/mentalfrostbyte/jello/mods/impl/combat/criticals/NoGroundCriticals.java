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
    public void method9879() {
        if (ColorUtils.method19160(NoGroundCriticals.mc.player, 0.001f)) {
            this.field15885 = this.method9887("Offset").equals("OldHypixel");
            this.field15884 = (this.field15885 ? 2 : 1);
        }
        this.field15886 = false;
    }
    
    @EventListener
    @Class6757
    private void method10469(final Class5745 class5745) {
        if (this.method9906() && class5745.method17049() >= 0.625) {
            if (this.field15884 == 0) {
                if (this.field15885) {
                    class5745.method16961(true);
                }
            }
        }
    }
    
    @EventListener
    private void method10470(final Class5722 class5722) {
        if (this.method9906()) {
            if (this.field15884 == 1) {
                class5722.method16961(true);
                this.field15886 = true;
            }
        }
    }
    
    @EventListener
    @Class6757
    private void method10471(final Class5744 class5744) {
        if (!this.method9906()) {
            return;
        }
        if (NoGroundCriticals.mc.player.onGround) {
            this.field15887 = false;
            if (this.field15886 && this.field15884 != 1) {
                this.field15886 = !this.field15886;
                NoGroundCriticals.mc.player.method2725();
            }
            if (this.method9887("Offset").equals("OldHypixel") != this.field15885) {
                this.field15885 = this.method9887("Offset").equals("OldHypixel");
                this.field15884 = 2;
            }
            double n = this.field15885 ? 1.0E-14 : 0.0;
            boolean b = false;
            final boolean b2 = NoGroundCriticals.mc.field4691 != null && NoGroundCriticals.mc.field4691.getType() == RayTraceResult.Type.BLOCK;
            if (NoGroundCriticals.mc.field4682.method27337() || (NoGroundCriticals.mc.gameSettings.field23446.method1056() && b2) || Jesus.method10433()) {
                this.field15884 = 2;
                b = true;
            }
            else {
                switch (this.field15884) {
                    case 0: {
                        class5744.method17033(true);
                        --this.field15884;
                        break;
                    }
                    case 1: {
                        n = 0.065;
                        --this.field15884;
                        break;
                    }
                    case 2: {
                        class5744.method17033(true);
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
                        class5744.method17033(true);
                        n = 0.0;
                        b = true;
                        --this.field15884;
                        break;
                    }
                }
            }
            final Module method21551 = Client.method35173().method35189().method21551(Speed.class);
            if (!method21551.method9906() || method21551.method9887("Type").equalsIgnoreCase("Hypixel")) {
                class5744.method17037(class5744.method17036() + n);
            }
            class5744.method17045(b);
        }
        else {
            this.field15884 = ((this.method9883("Avoid Fall Damage") && !this.field15885) ? 3 : 0);
            if (this.method9883("Avoid Fall Damage") && this.field15885 && !this.field15887 && NoGroundCriticals.mc.player.getMotion().y < -0.1) {
                this.field15887 = !this.field15887;
                class5744.method17045(true);
            }
        }
    }
}
