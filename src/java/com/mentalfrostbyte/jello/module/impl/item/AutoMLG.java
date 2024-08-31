package com.mentalfrostbyte.jello.module.impl.item;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.PremiumModule;
import com.mentalfrostbyte.jello.module.impl.movement.Fly;
import com.mentalfrostbyte.jello.unmapped.Class8005;
import mapped.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;

import java.util.Iterator;
import java.util.stream.Stream;

public class AutoMLG extends PremiumModule {
    private static int field23649;
    private int field23647;
    private int field23648;
    private BlockPos field23650;

    public AutoMLG() {
        super("AutoMLG", "Automatically places water when falling", ModuleCategory.ITEM);
        this.registerSetting(new BooleanSetting("Cubecraft", "Cubecraft bypass", true));
        field23649 = -1;
    }

    public static boolean method16421() {
        return field23649 >= 0;
    }

    @Override
    public void onEnable() {
        field23649 = -1;
    }

    @Override
    public void onDisable() {
        field23649 = -1;
    }

    @EventTarget
    private void method16422(Class4435 var1) {
        if (this.isEnabled()) {
            if (field23649 > 0 && !mc.player.onGround) {
                Class9567.method37088(var1, 0.0);
            }
        }
    }

    @EventTarget
    @LowerPriority
    private void method16423(Class4399 var1) {
        if (this.isEnabled() && mc.playerController.method23150()) {
            if (var1.method13921() && field23649 >= 0) {
                field23649++;
                float[] var4 = Class9142.method34144(
                        (double) this.field23650.getX() + 0.5, (double) this.field23650.getZ() + 0.5, (double) this.field23650.getY() + 0.5
                );
                var1.method13918(var4[0]);
                var1.method13916(var4[1]);
            }

            if (field23649 == (!this.getBooleanValueFromSetttingName("Cubecraft") ? 3 : 5)) {
                if (mc.player.inventory.currentItem != this.field23647) {
                    this.field23648 = mc.player.inventory.currentItem;
                    mc.player.inventory.currentItem = this.field23647;
                    mc.playerController.method23138();
                }

                mc.getConnection().sendPacket(new CAnimateHandPacket(Hand.MAIN_HAND));
                mc.getConnection().sendPacket(new CPlayerTryUseItemPacket(Hand.MAIN_HAND));
                field23649 = -1;
                this.field23650 = null;
                mc.player.inventory.currentItem = this.field23648;
            }

            int var7 = this.method16424();
            if (!Client.getInstance().getModuleManager().getModuleByClass(Fly.class).isEnabled()
                    && var7 != -1
                    && !mc.player.onGround
                    && mc.player.fallDistance > 3.0F) {
                BlockPos var5 = this.method16425();
                if (var5 != null) {
                    if (var1.method13921() && field23649 == -1) {
                        float[] var6 = Class9142.method34144((double) var5.getX() + 0.5, (double) var5.getZ() + 0.5, (double) var5.getY() + 0.5);
                        var1.method13918(var6[0]);
                        var1.method13916(var6[1]);
                        if (var7 != mc.player.inventory.currentItem) {
                            this.field23648 = mc.player.inventory.currentItem;
                            mc.player.inventory.currentItem = var7;
                            mc.playerController.method23138();
                        }

                        this.field23647 = var7;
                        this.field23650 = var5;
                        field23649 = 0;
                        return;
                    }

                    if (this.field23650 != null) {
                        mc.getConnection().sendPacket(new CAnimateHandPacket(Hand.MAIN_HAND));
                        mc.getConnection().sendPacket(new CPlayerTryUseItemPacket(Hand.MAIN_HAND));
                    }
                }
            }
        }
    }

    public int method16424() {
        for (int var3 = 36; var3 < 45; var3++) {
            if (mc.player.field4904.method18131(var3).method18266()) {
                ItemStack var4 = mc.player.field4904.method18131(var3).method18265();
                if (var4.getItem() == Items.field37883) {
                    return var3 - 36;
                }
            }
        }

        if (Client.getInstance().method19939().method31333() > 1) {
            for (int var5 = 9; var5 < 36; var5++) {
                if (mc.player.field4904.method18131(var5).method18266()) {
                    ItemStack var6 = mc.player.field4904.method18131(var5).method18265();
                    if (var6.getItem() == Items.field37883) {
                        if (Class8005.method27349() <= Class5989.field26136.method18582()) {
                            mc.getConnection().sendPacket(new CClientStatusPacket(CClientStatusPacketState.field14279));
                        }

                        Class7789.method25873(var5, 6);
                        mc.getConnection().sendPacket(new CCloseWindowPacket(-1));
                        return 6;
                    }
                }
            }

            return -1;
        } else {
            return -1;
        }
    }

    private BlockPos method16425() {
        double var3 = mc.player.method3433().x;
        double var5 = mc.player.method3433().y;
        double var7 = mc.player.method3433().z;
        AxisAlignedBB var9 = mc.player.boundingBox.method19662(var3, 0.0, var7).method19667(0.0, var5, 0.0);
        Stream var10 = mc.world.method7055(mc.player, var9);
        Iterator var11 = var10.iterator();
        BlockPos var12 = null;

        while (var11.hasNext()) {
            VoxelShape var13 = (VoxelShape) var11.next();
            AxisAlignedBB var14 = var13.method19514();
            BlockPos var15 = new BlockPos(var14.method19685());
            if (Class9217.method34578(var15)
                    && (double) (var15.getY() + 1) < mc.player.getPosY()
                    && (
                    var12 == null
                            || mc.player
                            .method3276((double) var12.getX() + 0.5 - var3, var12.getY() + 1, (double) var12.getZ() + 0.5 - var7)
                            > mc.player
                            .method3276((double) var15.getX() + 0.5 - var3, var15.getY() + 1, (double) var15.getZ() + 0.5 - var7)
            )) {
                var12 = var15;
            }
        }

        if (var12 != null) {
            return var12;
        } else {
            var5 = mc.player.method3433().y - 1.0;
            var9 = mc.player.boundingBox.method19662(var3, 0.0, var7).method19667(0.0, var5, 0.0);
            var10 = mc.world.method7055(mc.player, var9);
            var11 = var10.iterator();

            while (var11.hasNext()) {
                VoxelShape var20 = (VoxelShape) var11.next();
                AxisAlignedBB var21 = var20.method19514();
                BlockPos var22 = new BlockPos(var21.method19685());
                if (Class9217.method34578(var22)
                        && (double) (var22.getY() + 1) < mc.player.getPosY()
                        && (
                        var12 == null
                                || mc.player
                                .method3276((double) var12.getX() + 0.5 - var3, var12.getY() + 1, (double) var12.getZ() + 0.5 - var7)
                                > mc.player
                                .method3276((double) var22.getX() + 0.5 - var3, var22.getY() + 1, (double) var22.getZ() + 0.5 - var7)
                )) {
                    var12 = var22;
                }
            }

            return var12;
        }
    }
}
