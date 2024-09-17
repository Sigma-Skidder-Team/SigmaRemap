package com.mentalfrostbyte.jello.module.impl.movement.fly;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.event.impl.WorldLoadEvent;
import com.mentalfrostbyte.jello.event.impl.EventMove;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;
import com.mentalfrostbyte.jello.util.ColorUtils;
import mapped.MovementUtils;

public class OmegaCraftFly extends Module {
    private int field23700;
    private int field23701;
    private double field23702;
    private final double[] field23703 = new double[]{0.0, 0.25, 0.5, 0.75, 1.0};

    public OmegaCraftFly() {
        super(ModuleCategory.MOVEMENT, "OmegaCraft", "A fly for OmegaCraft anticheat");
    }

    @Override
    public void onEnable() {
        this.field23701 = 0;
        this.field23700 = -1;
        double var3 = this.field23703[0];
        int var5 = this.field23703.length;
        double var6 = mc.player.getPositionVec().y - (double) ((int) mc.player.getPositionVec().y);

        for (int var8 = 1; var8 < var5; var8++) {
            double var9 = this.field23703[var8] - var6;
            if (var9 < var6 - var3) {
                var3 = this.field23703[var8];
            }
        }

        this.field23702 = (double) ((int) mc.player.getPositionVec().y) + var3;
        mc.player.setPosition(mc.player.getPositionVec().x, this.field23702, mc.player.getPositionVec().z);
    }

    @Override
    public void onDisable() {
        MovementUtils.strafe(0.2);
        if (mc.player.getMotion().y > 0.03) {
            ColorUtils.setPlayerYMotion(-0.0784);
        }
    }

    @EventTarget
    public void method16494(WorldLoadEvent var1) {
        this.field23701 = 0;
        this.field23700 = -1;
        double var4 = this.field23703[0];
        int var6 = this.field23703.length;
        double var7 = mc.player.getPositionVec().y - (double) ((int) mc.player.getPositionVec().y);

        for (int var9 = 1; var9 < var6; var9++) {
            double var10 = this.field23703[var9] - var7;
            if (var10 < var7 - var4) {
                var4 = this.field23703[var9];
            }
        }

        this.field23702 = (double) ((int) mc.player.getPositionVec().y) + var4;
        mc.player.setPosition(mc.player.getPositionVec().x, this.field23702, mc.player.getPositionVec().z);
    }

    @EventTarget
    public void method16495(EventUpdate var1) {
        if (var1.isPre()) {
            var1.method13908(true);
            if (this.field23700 != 0) {
                if (this.field23700 == 1) {
                    var1.setGround(false);
                    var1.setY(var1.getY() + 0.03);
                }
            } else {
                var1.setGround(true);
            }
        }
    }

    @EventTarget
    public void method16496(EventMove var1) {
        this.field23700++;
        if (this.field23701 > 0) {
            this.field23701--;
        }

        var1.setY(0.0);
        if (this.field23700 != 1) {
            if (this.field23700 > 1) {
                mc.player.setPosition(mc.player.getPositionVec().x, this.field23702, mc.player.getPositionVec().z);
                double var4 = !mc.gameSettings.keyBindSneak.isKeyDown() ? 0.405 + (double) MovementUtils.method37078() * 0.02 : 0.25;
                MovementUtils.setSpeed(var1, var4);
                this.field23700 = 0;
            }
        } else {
            if (mc.gameSettings.keyBindJump.isKeyDown() && this.field23701 == 0) {
                var1.setY(0.5);
                this.field23702 = this.field23702 + var1.getY();
                this.field23701 = 3;
                this.field23700 = 0;
            }

            double var6 = !mc.gameSettings.keyBindSneak.isKeyDown() ? 0.6 : 0.25;
            MovementUtils.setSpeed(var1, var6);
        }

        ColorUtils.setPlayerXMotion(var1.getX());
        ColorUtils.setPlayerYMotion(var1.getY());
        ColorUtils.setPlayerZMotion(var1.getZ());
    }

    @EventTarget
    public void method16497(ReceivePacketEvent var1) {
        if (var1.getPacket() instanceof SPlayerPositionLookPacket) {
            SPlayerPositionLookPacket var4 = (SPlayerPositionLookPacket) var1.getPacket();
            double var5 = this.field23703[0];
            int var7 = this.field23703.length;
            double var8 = var4.y - (double) ((int) var4.y);

            for (int var10 = 1; var10 < var7; var10++) {
                double var11 = this.field23703[var10] - var8;
                if (var11 < var8 - var5) {
                    var5 = this.field23703[var10];
                }
            }

            this.field23702 = (double) ((int) var4.y) + var5;
        }
    }
}
