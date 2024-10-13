package com.mentalfrostbyte.jello.module.impl.world;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.util.world.BlockUtil;
import mapped.*;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;

public class AutoFarm extends Module {
    public AutoFarm() {
        super(ModuleCategory.WORLD, "AutoFarm", "Automatically breaks and replants crops");
    }

    @EventTarget
    public void method16865(EventUpdate var1) {
        if (this.isEnabled()) {
            if (mc.player != null && mc.world != null) {
                for (BlockPos var5 : BlockUtil.method34545(BlockUtil.method34561(mc.playerController.getBlockReachDistance()))) {
                    if (BlockUtil.method34535(mc.player, var5)) {
                        BlockState var6 = mc.world.getBlockState(var5);
                        if (var6.getBlock() instanceof Class3480 || var6.getBlock() instanceof Class3481 || var6.getBlock() instanceof Class3483) {
                            ItemStack var14 = mc.player.getHeldItem(Hand.MAIN_HAND);
                            if (var14 != null && var14.getItem() instanceof Class3321) {
                                if (var6.<Integer>get(BlockStateProperties.field39742) != 7) {
                                    float[] var18 = BlockUtil.method34542(var5, Direction.DOWN);
                                    var1.setYaw(var18[0]);
                                    var1.setPitch(var18[1]);
                                    var1.attackPost(new Class1358(this, var18));
                                    return;
                                }
                            } else if (var6.<Integer>get(BlockStateProperties.field39742) == 7) {
                                float[] var17 = BlockUtil.method34542(var5, Direction.DOWN);
                                var1.setYaw(var17[0]);
                                var1.setPitch(var17[1]);
                                var1.attackPost(new Class532(this, var5));
                                mc.world.method7179(var5, false);
                                return;
                            }
                        } else if (!(var6.getBlock() instanceof Class3221)) {
                            if (!(var6.getBlock() instanceof Class3408)) {
                                if (var6.getBlock() instanceof Class3448) {
                                    BlockState var7 = mc.world.getBlockState(var5.down());
                                    BlockState var8 = mc.world.getBlockState(var5.up());
                                    if (!(var7.getBlock() instanceof Class3448) && var8.getBlock() instanceof Class3448) {
                                        float[] var9 = BlockUtil.method34541(var5.up());
                                        var1.setYaw(var9[0]);
                                        var1.setPitch(var9[1]);
                                        var1.attackPost(new Class1431(this, var5));
                                        mc.world.method7179(var5.up(), false);
                                    }
                                }
                            } else {
                                BlockState var12 = mc.world.getBlockState(var5.down());
                                BlockState var15 = mc.world.getBlockState(var5.up());
                                if (!(var12.getBlock() instanceof Class3408) && var15.getBlock() instanceof Class3408) {
                                    float[] var19 = BlockUtil.method34541(var5.up());
                                    var1.setYaw(var19[0]);
                                    var1.setPitch(var19[1]);
                                    var1.attackPost(new Class654(this, var5));
                                    mc.world.method7179(var5.up(), false);
                                }
                            }
                        } else if (mc.rightClickDelayTimer == 0) {
                            BlockState var13 = mc.world.getBlockState(var5.up());
                            int var16 = InvManagerUtils.method25843(Items.field37841);
                            if (var16 == -1) {
                                var16 = InvManagerUtils.method25843(Items.field38052);
                            }

                            if (var16 == -1) {
                                var16 = InvManagerUtils.method25843(Items.field38053);
                            }

                            if (var16 == -1) {
                                var16 = InvManagerUtils.method25843(Items.field38112);
                            }

                            if (var16 == -1) {
                                var16 = InvManagerUtils.method25843(Items.field37960);
                            }

                            if (var16 == -1) {
                                var16 = InvManagerUtils.method25843(Items.field37959);
                            }

                            if (var16 != -1 && var13.getBlock() instanceof AirBlock) {
                                float[] var20 = BlockUtil.method34542(var5, Direction.UP);
                                var1.setYaw(var20[0]);
                                var1.setPitch(var20[1]);
                                var1.attackPost(new Class649(this, var16, var20));
                                mc.rightClickDelayTimer = 2;
                                BlockState var11 = Blocks.field36539.getDefaultState();
                                mc.world.setBlockState(var5.up(), var11);
                                return;
                            }
                        }
                    }
                }
            }
        }
    }
}
