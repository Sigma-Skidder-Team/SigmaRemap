// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.longjumps;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.impl.movement.Step;
import com.mentalfrostbyte.jello.mods.impl.movement.LongJump;
import com.mentalfrostbyte.jello.mods.impl.player.NoFall;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import com.mentalfrostbyte.jello.settings.impl.StringSetting;
import mapped.*;
import net.minecraft.util.math.BlockPos;

public class NCPLongJump extends Module
{
    private int field15526;
    private int field15527;
    private boolean field15528;
    private double field15529;
    
    public NCPLongJump() {
        super(Category.MOVEMENT, "NCP", "Longjump for NoCheatPlus.");
        this.addSetting(new NumberSetting("Boost", "Longjump boost", 3.0f, Float.class, 1.0f, 5.0f, 0.01f));
        this.addSetting(new NumberSetting("Duration", "Speed duration", 10.0f, Float.class, 7.0f, 200.0f, 1.0f));
        this.addSetting(new StringSetting("Glide Mode", "The way you will glide", 1, new String[] { "None", "Basic", "High" }));
        this.addSetting(new StringSetting("Speed Mode", "The way you will speed", 0, new String[] { "Basic", "Funcraft", "Hypixel" }));
    }
    
    @Override
    public void onDisable() {
        this.field15528 = false;
        NCPLongJump.mc.timer.timerSpeed = 1.0f;
        Class7482.method23151(Class7482.method23137() * 0.7);
    }
    
    @Override
    public void onEnable() {
        this.field15528 = false;
        this.field15526 = 0;
    }
    
    @EventListener
    public void method9919(final Class5717 class5717) {
        if (!this.isEnabled() || NCPLongJump.mc.player == null) {
            return;
        }
        if (NCPLongJump.mc.player.onGround) {
            this.field15527 = 0;
            ++this.field15526;
            if (this.field15528 && class5717.method16974() != 0.599 && this.method9914().method9883("Auto Disable")) {
                this.method9914().method9910();
                Class7482.method23149(class5717, Class7482.method23137() * 0.8);
                return;
            }
            final BlockPos class5718 = new BlockPos(NCPLongJump.mc.player.posX, NCPLongJump.mc.player.posY - 0.4, NCPLongJump.mc.player.posZ);
            if (Step.field15758 > 1) {
                if (this.method9914().method9883("BorderJump") && !Class4609.method13708(class5718) && this.field15526 > 0 && ColorUtils.method19114()) {
                    NCPLongJump.mc.player.method2725();
                    class5717.method16973(NCPLongJump.mc.player.getMotion().x);
                    class5717.method16975(NCPLongJump.mc.player.getMotion().y);
                    class5717.method16977(NCPLongJump.mc.player.getMotion().z);
                }
                else if (this.method9914().method9883("Auto Jump") && this.field15526 > (this.field15528 ? 1 : 0) && ColorUtils.method19114()) {
                    NCPLongJump.mc.player.method2725();
                    class5717.method16973(NCPLongJump.mc.player.getMotion().x);
                    class5717.method16975(NCPLongJump.mc.player.getMotion().y);
                    class5717.method16977(NCPLongJump.mc.player.getMotion().z);
                }
            }
        }
        else {
            ++this.field15527;
            this.field15526 = 0;
            if (this.field15528) {
                final double field15529 = Class7482.method23137() * 0.95;
                if (this.field15527 == 1) {
                    this.field15529 = this.getNumberSettingValueByName("Boost") * 0.4 + Class7482.method23139() * 0.05;
                }
                else if (this.field15527 > this.getNumberSettingValueByName("Duration") + Class7482.method23139()) {
                    this.field15529 = field15529;
                }
                else if (this.field15529 > field15529) {
                    final String method9887 = this.getStringSettingValueByName("Speed Mode");
                    switch (method9887) {
                        case "Basic": {
                            this.field15529 *= 0.987;
                            break;
                        }
                        case "Funcraft": {
                            this.field15529 -= 0.0075;
                            break;
                        }
                        case "Hypixel": {
                            this.field15529 -= 0.0079;
                            break;
                        }
                    }
                    if (this.field15529 < field15529) {
                        this.field15529 = field15529;
                    }
                }
                if (NCPLongJump.mc.player.collidedHorizontally || !ColorUtils.method19114()) {
                    this.field15529 = field15529;
                }
                Class7482.method23149(class5717, this.field15529);
                if (Class7482.method23140() == 0) {
                    final String method9888 = this.getStringSettingValueByName("Glide Mode");
                    switch (method9888) {
                        case "Basic": {
                            class5717.method16975(((LongJump)this.method9914()).method10270(this.field15527));
                            break;
                        }
                        case "High": {
                            class5717.method16975(((LongJump)this.method9914()).method10271(this.field15527));
                            if (!ColorUtils.method19146() || !Client.getInstance().method35189().getModuleByClass(NoFall.class).isEnabled() || (this.field15527 != 8 && this.field15527 != 21)) {
                                break;
                            }
                            final double n3 = NCPLongJump.mc.player.posY + class5717.method16974();
                            final double a = n3 - (int)(n3 + 0.001);
                            if (Math.abs(a) < 0.001) {
                                class5717.method16975(class5717.method16974() - a);
                                break;
                            }
                            final double a2 = n3 - (int)n3 - 0.25;
                            if (Math.abs(a2) < 0.007) {
                                class5717.method16975(class5717.method16974() - a2);
                                break;
                            }
                            break;
                        }
                    }
                }
            }
            if (this.field15526 == 1 && NCPLongJump.mc.player.getMotion().y < 0.0 && this.method9914().method9883("Auto Jump")) {
                Class7482.method23149(class5717, Class7482.method23137() * 0.2);
            }
        }
        ColorUtils.method19155(class5717.method16974());
    }
    
    @EventListener
    public void method9920(final Class5722 class5722) {
        if (this.isEnabled() && NCPLongJump.mc.player != null) {
            this.field15528 = true;
            class5722.method16996(this.field15529 = Class7482.method23137());
            class5722.method16995(0.425 + Class7482.method23140() * 0.1);
            if (this.getStringSettingValueByName("Glide Mode").equals("High")) {
                if (Class7482.method23140() == 0) {
                    class5722.method16995(0.599);
                    class5722.method16996(0.0);
                    if (this.getNumberSettingValueByName("Boost") > 1.5) {
                        class5722.method16996(0.28 + this.getNumberSettingValueByName("Boost") * 0.1 + Class7482.method23139() * 0.05);
                    }
                    if (this.getStringSettingValueByName("Speed Mode").equals("Hypixel")) {
                        if (this.getNumberSettingValueByName("Boost") > 1.75) {
                            ColorUtils.method19179(true);
                        }
                    }
                    NCPLongJump.mc.method5269().method17292(new Class4354(NCPLongJump.mc.player.posX, NCPLongJump.mc.player.posY + 0.425, NCPLongJump.mc.player.posZ, false));
                    NCPLongJump.mc.method5269().method17292(new Class4354(NCPLongJump.mc.player.posX, NCPLongJump.mc.player.posY + 0.425 + 0.396, NCPLongJump.mc.player.posZ, false));
                    NCPLongJump.mc.method5269().method17292(new Class4354(NCPLongJump.mc.player.posX, NCPLongJump.mc.player.posY + 0.425 + 0.396 - 0.122, NCPLongJump.mc.player.posZ, false));
                }
            }
        }
    }
    
    @EventListener
    public void method9921(final Class5738 class5738) {
        if (this.isEnabled() && this.getStringSettingValueByName("Glide Mode").equals("High")) {
            return;
        }
    }
}
