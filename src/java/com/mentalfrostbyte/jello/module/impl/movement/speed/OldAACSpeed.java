package com.mentalfrostbyte.jello.module.impl.movement.speed;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.RecievePacketEvent;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.event.impl.Class4436;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.combat.antikb.AACAntiKB;
import mapped.*;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;

public class OldAACSpeed extends Module {
    private double field23534;
    private float field23535;
    private int field23536;
    private int field23537;

    public OldAACSpeed() {
        super(ModuleCategory.MOVEMENT, "OldAAC", "Speed for old version of AAC");
        this.registerSetting(new BooleanSetting("Auto Jump", "Automatically jumps for you.", true));
    }

    @Override
    public void onDisable() {
    }

    @Override
    public void onEnable() {
        this.field23537 = Client.getInstance().method19939().method31329() <= 0 ? 1 : 0;
        this.field23534 = Class9567.method37075();
        this.field23535 = Class9567.method37083()[0];
    }

    @EventTarget
    public void method16226(Class4435 var1) {
        if (this.isEnabled()) {
            if (!mc.player.onGround) {
                if (ColorUtils.method17686() && AACAntiKB.field23907 >= 7) {
                    this.field23536++;
                    if (this.field23536 == 1) {
                        if (this.field23537 != 1) {
                            if (this.field23537 == 2) {
                                this.field23534 = 0.362;
                            }
                        } else {
                            this.field23534 = 0.306;
                        }
                    }

                    if (mc.player.collidedHorizontally) {
                        this.field23534 = Class9567.method37075();
                    }

                    this.field23535 = Class9567.method37092(var1, this.field23534, Class9567.method37083()[0], this.field23535, 45.0F);
                }
            } else if (this.getBooleanValueFromSetttingName("Auto Jump") && ColorUtils.method17686()) {
                this.field23536 = 0;
                mc.player.method2914();
                var1.method13993(mc.player.getVec().x);
                var1.method13995(mc.player.getVec().y);
                var1.method13997(mc.player.getVec().z);
            } else if (var1.method13994() != 0.4 + (double) Class9567.method37079() * 0.1) {
                this.field23537 = 0;
            } else {
                Class9567.method37088(var1, this.field23534);
            }
        }
    }

    @EventTarget
    public void method16227(Class4436 var1) {
        if (this.isEnabled()) {
            if (this.field23537 < 2) {
                this.field23537++;
            }

            if (this.field23537 != 1) {
                if (this.field23537 == 2) {
                    this.field23534 = 0.6;
                }
            } else {
                this.field23534 = 0.5;
            }

            this.field23535 = Class9567.method37083()[0];
            var1.method14003(this.field23534);
            var1.method14002(0.4 + (double) Class9567.method37079() * 0.1);
            this.field23536 = 0;
        }
    }

    @EventTarget
    public void method16228(RecievePacketEvent var1) {
        if (this.isEnabled()) {
            if (var1.getPacket() instanceof SPlayerPositionLookPacket) {
                this.field23537 = 0;
                this.field23534 = Class9567.method37075();
            }
        }
    }
}
