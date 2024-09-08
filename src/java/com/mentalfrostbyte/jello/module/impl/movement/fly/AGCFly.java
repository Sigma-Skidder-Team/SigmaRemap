package com.mentalfrostbyte.jello.module.impl.movement.fly;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import mapped.*;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;

import java.util.Iterator;

public class AGCFly extends Module {
    private int field23902;
    private int field23903;
    private boolean field23904;

    public AGCFly() {
        super(ModuleCategory.MOVEMENT, "AGC", "A fly for AntiGamingChair");
    }

    @Override
    public void onEnable() {
        this.field23902 = 0;
        if (!mc.gameSettings.keyBindSneak.isKeyDown()) {
            this.field23904 = false;
        } else {
            mc.gameSettings.keyBindSneak.pressed = false;
            this.field23904 = true;
        }

        this.field23903 = 1;
    }

    @EventTarget
    private void method16780(Class4430 var1) {
        if (this.isEnabled()) {
            if (var1.method13977() == mc.gameSettings.keyBindSneak.keycode.keyCode) {
                var1.method13900(true);
                this.field23904 = true;
            }
        }
    }

    @EventTarget
    private void method16781(Class4426 var1) {
        if (this.isEnabled()) {
            if (var1.method13973() == mc.gameSettings.keyBindSneak.keycode.keyCode) {
                var1.method13900(true);
                this.field23904 = false;
            }
        }
    }

    @Override
    public void onDisable() {
        Class9567.method37090(0.0);
        if (mc.player.getVec().y > 0.0) {
            ColorUtils.method17725(-0.0789);
        }
    }

    @EventTarget
    @LowerPriority
    public void method16782(Class4435 var1) {
        if (this.isEnabled()) {
            if (this.field23902 <= (this.field23903 != 3 ? this.field23903 : 1) - 2) {
                if (this.field23902 == -1) {
                    var1.method13995(this.field23903 != 3 ? 0.001 : 0.095);
                    if (this.field23903 != 3) {
                        Class9567.method37088(var1, 0.32);
                    }

                    ColorUtils.method17725(var1.method13994());
                }
            } else {
                var1.method13995(0.0);
                Class9567.method37088(var1, 0.0);
            }
        }
    }

    @EventTarget
    public void method16783(Class4399 var1) {
        if (this.isEnabled() && var1.method13921()) {
            this.field23902++;
            if (this.field23902 != (this.field23903 != 3 ? this.field23903 : 1)) {
                if (this.field23902 > (this.field23903 != 3 ? this.field23903 : 1)) {
                    if (this.field23902 % 20 != 0) {
                        var1.method13900(true);
                    } else {
                        double var4 = this.method16785();
                        var1.method13912(var4 - 1.0E-4);
                        var1.method13908(true);
                        var1.method13920(true);
                    }
                }
            } else {
                double var6 = this.method16785();
                var1.method13912(var6 - 1.0E-4);
                var1.method13920(true);
                var1.method13908(true);
                this.field23903 = !this.field23904
                        ? (!mc.gameSettings.keyBindJump.isKeyDown() ? 1 : 3)
                        : (!mc.gameSettings.keyBindJump.isKeyDown() ? 2 : 1);
            }
        }
    }

    @EventTarget
    public void method16784(RecievePacketEvent var1) {
        if (this.isEnabled()) {
            Packet var4 = var1.getPacket();
            if (var4 instanceof SPlayerPositionLookPacket) {
                SPlayerPositionLookPacket var5 = (SPlayerPositionLookPacket) var4;
                if (this.field23902 >= (this.field23903 != 3 ? this.field23903 : 1)) {
                    this.field23902 = -1;
                }

                var5.field24300 = mc.player.rotationYaw;
                var5.field24301 = mc.player.rotationPitch;
            }
        }
    }

    private double method16785() {
        if (!(mc.player.getPositionVec().y < 1.0)) {
            if (!mc.player.onGround) {
                AxisAlignedBB var3 = mc.player.boundingBox.method19662(0.0, -mc.player.getPositionVec().y, 0.0);
                Iterator var4 = mc.world.method7055(mc.player, var3).iterator();
                double var5 = -1.0;
                BlockPos var7 = null;

                while (var4.hasNext()) {
                    VoxelShape var8 = (VoxelShape) var4.next();
                    if (var8.method19514().maxY > var5) {
                        var5 = var8.method19514().maxY;
                        var7 = new BlockPos(var8.method19514().minX, var8.method19514().minY, var8.method19514().minZ);
                    }
                }

                if (var7 != null) {
                    Block var9 = mc.world.getBlockState(var7).getBlock();
                    if (var9 instanceof Class3410) {
                        var5 = (double) ((int) var5) - 1.0E-4;
                    }
                }

                return var5;
            } else {
                return mc.player.getPosY();
            }
        } else {
            return -1.0;
        }
    }
}
