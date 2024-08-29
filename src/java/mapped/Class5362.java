package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import net.minecraft.client.Minecraft;
import net.minecraft.util.math.BlockPos;

public class Class5362 extends Module {
    public Class5362() {
        super(ModuleCategory.WORLD, "AutoFarm", "Automatically breaks and replants crops");
    }

    // $VF: synthetic method
    public static Minecraft method16866() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16867() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16868() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16869() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16870() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16871() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16872() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16873() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16874() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16875() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16876() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16877() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16878() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16879() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16880() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16881() {
        return mc;
    }

    @EventTarget
    public void method16865(Class4399 var1) {
        if (this.isEnabled()) {
            if (mc.player != null && mc.world != null) {
                for (BlockPos var5 : Class9217.method34545(Class9217.method34561(mc.playerController.method23135()))) {
                    if (Class9217.method34535(mc.player, var5)) {
                        BlockState var6 = mc.world.getBlockState(var5);
                        if (var6.getBlock() instanceof Class3480 || var6.getBlock() instanceof Class3481 || var6.getBlock() instanceof Class3483) {
                            ItemStack var14 = mc.player.getHeldItem(Hand.MAIN_HAND);
                            if (var14 != null && var14.getItem() instanceof Class3321) {
                                if (var6.<Integer>method23463(Class8820.field39742) != 7) {
                                    float[] var18 = Class9217.method34542(var5, Direction.DOWN);
                                    var1.method13918(var18[0]);
                                    var1.method13916(var18[1]);
                                    var1.method13922(new Class1358(this, var18));
                                    return;
                                }
                            } else if (var6.<Integer>method23463(Class8820.field39742) == 7) {
                                float[] var17 = Class9217.method34542(var5, Direction.DOWN);
                                var1.method13918(var17[0]);
                                var1.method13916(var17[1]);
                                var1.method13922(new Class532(this, var5));
                                mc.world.method7179(var5, false);
                                return;
                            }
                        } else if (!(var6.getBlock() instanceof Class3221)) {
                            if (!(var6.getBlock() instanceof Class3408)) {
                                if (var6.getBlock() instanceof Class3448) {
                                    BlockState var7 = mc.world.getBlockState(var5.down());
                                    BlockState var8 = mc.world.getBlockState(var5.up());
                                    if (!(var7.getBlock() instanceof Class3448) && var8.getBlock() instanceof Class3448) {
                                        float[] var9 = Class9217.method34541(var5.up());
                                        var1.method13918(var9[0]);
                                        var1.method13916(var9[1]);
                                        var1.method13922(new Class1431(this, var5));
                                        mc.world.method7179(var5.up(), false);
                                    }
                                }
                            } else {
                                BlockState var12 = mc.world.getBlockState(var5.down());
                                BlockState var15 = mc.world.getBlockState(var5.up());
                                if (!(var12.getBlock() instanceof Class3408) && var15.getBlock() instanceof Class3408) {
                                    float[] var19 = Class9217.method34541(var5.up());
                                    var1.method13918(var19[0]);
                                    var1.method13916(var19[1]);
                                    var1.method13922(new Class654(this, var5));
                                    mc.world.method7179(var5.up(), false);
                                }
                            }
                        } else if (mc.rightClickDelayTimer == 0) {
                            BlockState var13 = mc.world.getBlockState(var5.up());
                            int var16 = Class7789.method25843(Items.field37841);
                            if (var16 == -1) {
                                var16 = Class7789.method25843(Items.field38052);
                            }

                            if (var16 == -1) {
                                var16 = Class7789.method25843(Items.field38053);
                            }

                            if (var16 == -1) {
                                var16 = Class7789.method25843(Items.field38112);
                            }

                            if (var16 == -1) {
                                var16 = Class7789.method25843(Items.field37960);
                            }

                            if (var16 == -1) {
                                var16 = Class7789.method25843(Items.field37959);
                            }

                            if (var16 != -1 && var13.getBlock() instanceof AirBlock) {
                                float[] var20 = Class9217.method34542(var5, Direction.field673);
                                var1.method13918(var20[0]);
                                var1.method13916(var20[1]);
                                var1.method13922(new Class649(this, var16, var20));
                                mc.rightClickDelayTimer = 2;
                                BlockState var11 = Blocks.field36539.method11579();
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
