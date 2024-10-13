package com.mentalfrostbyte.jello.module.impl.world;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.event.priority.HigherPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.ModuleWithModuleSettings;
import com.mentalfrostbyte.jello.module.impl.movement.Fly;
import com.mentalfrostbyte.jello.module.impl.movement.fly.MineplexFly;
import com.mentalfrostbyte.jello.settings.BooleanSetting;
import mapped.Class3394;
import mapped.Class3593;
import mapped.RotationHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.network.play.client.CAnimateHandPacket;
import net.minecraft.network.play.client.CPlayerTryUseItemOnBlockPacket;
import net.minecraft.network.play.server.SChatPacket;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.vector.Vector3d;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CakeEater extends Module {
    public static BlockPos field23588;

    public CakeEater() {
        super(ModuleCategory.WORLD, "CakeEater", "Automatically eats cake");
        this.registerSetting(new BooleanSetting("No Swing", "Removes the swing animation.", true));
        this.registerSetting(new BooleanSetting("Mineplex", "Mineplex mode.", true));
    }

    // $VF: synthetic method
    public static Minecraft method16322() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16323() {
        return mc;
    }

    @Override
    public void onDisable() {
        field23588 = null;
    }

    @EventTarget
    private void method16319(ReceivePacketEvent var1) {
        if (this.isEnabled()) {
            if (var1.getPacket() instanceof SChatPacket) {
                SChatPacket var4 = (SChatPacket) var1.getPacket();
                if (var4.getChatComponent().getString().equals("§9Game> §r§7You cannot eat your own cake!§r")) {
                    var1.setCancelled(true);
                }
            }
        }
    }

    @EventTarget
    @HigherPriority
    private void method16320(EventUpdate var1) {
        if (this.isEnabled()) {
            ModuleWithModuleSettings var4 = (ModuleWithModuleSettings) Client.getInstance().getModuleManager().getModuleByClass(Fly.class);
            if (var4.method16726() instanceof MineplexFly) {
                MineplexFly var5 = (MineplexFly) var4.method16726();
                if (var5.method16456()) {
                    return;
                }
            }

            if (!var1.isPre()) {
                if (field23588 != null) {
                    if (this.getBooleanValueFromSettingName("No Swing") && !this.getBooleanValueFromSettingName("Mineplex")) {
                        mc.getConnection().sendPacket(new CAnimateHandPacket(Hand.MAIN_HAND));
                    } else if (!this.getBooleanValueFromSettingName("No Swing")) {
                        mc.player.swingArm(Hand.MAIN_HAND);
                    }

                    BlockRayTraceResult var7 = new BlockRayTraceResult(
                            new Vector3d(
                                    (double) field23588.getX() + 0.4 + Math.random() * 0.2,
                                    (double) field23588.getY() + 0.5,
                                    (double) field23588.getZ() + 0.4 + Math.random() * 0.2
                            ),
                            Direction.UP,
                            field23588,
                            false
                    );
                    mc.getConnection().sendPacket(new CPlayerTryUseItemOnBlockPacket(Hand.MAIN_HAND, var7));
                }
            } else {
                List var8 = this.method16321(!this.getBooleanValueFromSettingName("Mineplex") ? mc.playerController.getBlockReachDistance() : 6.0F);
                if (var8.isEmpty()) {
                    field23588 = null;
                } else {
                    Collections.sort(var8, new Class3593(this));
                    field23588 = (BlockPos) var8.get(0);
                    if (!this.getBooleanValueFromSettingName("Mineplex")) {
                        float[] var6 = RotationHelper.method34144(
                                (double) field23588.getX() + 0.5, (double) field23588.getZ() + 0.5, field23588.getY()
                        );
                        var1.setYaw(var6[0]);
                        var1.setPitch(var6[1]);
                    }
                }
            }
        }
    }

    private List<BlockPos> method16321(float var1) {
        ArrayList var4 = new ArrayList();

        for (float var5 = var1 + 2.0F; var5 >= -var1 + 1.0F; var5--) {
            for (float var6 = -var1; var6 <= var1; var6++) {
                for (float var7 = -var1; var7 <= var1; var7++) {
                    BlockPos var8 = new BlockPos(
                            mc.player.getPosX() + (double) var6,
                            mc.player.getPosY() + (double) var5,
                            mc.player.getPosZ() + (double) var7
                    );
                    if (mc.world.getBlockState(var8).getBlock() instanceof Class3394
                            && Math.sqrt(
                            mc.player.getDistanceNearest((double) var8.getX() + 0.5, (double) var8.getY() + 0.5, (double) var8.getZ() + 0.5)
                    )
                            < (double) var1) {
                        var4.add(var8);
                    }
                }
            }
        }

        return var4;
    }
}
