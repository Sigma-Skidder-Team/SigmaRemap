// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.world;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.*;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;

public class AutoFarm extends Module
{
    public AutoFarm() {
        super(Category.WORLD, "AutoFarm", "Automatically breaks and replants crops");
    }
    
    @EventListener
    public void method10345(final Class5744 class5744) {
        if (!this.isEnabled()) {
            return;
        }
        if (AutoFarm.mc.player != null && AutoFarm.mc.world != null) {
            for (final BlockPos class5745 : Class4609.method13675(Class4609.method13691(AutoFarm.mc.playerController.method27315()))) {
                if (Class4609.method13665(AutoFarm.mc.player, class5745)) {
                    final BlockState method6701 = AutoFarm.mc.world.getBlockState(class5745);
                    if (!(method6701.getBlock() instanceof Class3878)) {
                        if (!(method6701.getBlock() instanceof Class3880)) {
                            if (!(method6701.getBlock() instanceof Class3881)) {
                                if (!(method6701.getBlock() instanceof Class4021)) {
                                    if (!(method6701.getBlock() instanceof Class3981)) {
                                        if (!(method6701.getBlock() instanceof Class3914)) {
                                            continue;
                                        }
                                        final BlockState method6702 = AutoFarm.mc.world.getBlockState(class5745.method1139());
                                        final BlockState method6703 = AutoFarm.mc.world.getBlockState(class5745.method1137());
                                        if (method6702.getBlock() instanceof Class3914) {
                                            continue;
                                        }
                                        if (!(method6703.getBlock() instanceof Class3914)) {
                                            continue;
                                        }
                                        final float[] method6704 = Class4609.method13671(class5745.method1137());
                                        class5744.method17043(method6704[0]);
                                        class5744.method17041(method6704[1]);
                                        class5744.method17047(new Class1164(this, class5745));
                                        AutoFarm.mc.world.method7149(class5745.method1137(), false);
                                    }
                                    else {
                                        final BlockState method6705 = AutoFarm.mc.world.getBlockState(class5745.method1139());
                                        final BlockState method6706 = AutoFarm.mc.world.getBlockState(class5745.method1137());
                                        if (method6705.getBlock() instanceof Class3981) {
                                            continue;
                                        }
                                        if (!(method6706.getBlock() instanceof Class3981)) {
                                            continue;
                                        }
                                        final float[] method6707 = Class4609.method13671(class5745.method1137());
                                        class5744.method17043(method6707[0]);
                                        class5744.method17041(method6707[1]);
                                        class5744.method17047(new Class1233(this, class5745));
                                        AutoFarm.mc.world.method7149(class5745.method1137(), false);
                                    }
                                    continue;
                                }
                                if (AutoFarm.mc.field4692 != 0) {
                                    continue;
                                }
                                final BlockState method6708 = AutoFarm.mc.world.getBlockState(class5745.method1137());
                                int n = InvManagerUtil.method29340(Items.field31314);
                                if (n == -1) {
                                    n = InvManagerUtil.method29340(Items.field31517);
                                }
                                if (n == -1) {
                                    n = InvManagerUtil.method29340(Items.field31518);
                                }
                                if (n == -1) {
                                    n = InvManagerUtil.method29340(Items.field31576);
                                }
                                if (n == -1) {
                                    n = InvManagerUtil.method29340(Items.field31430);
                                }
                                if (n == -1) {
                                    n = InvManagerUtil.method29340(Items.field31429);
                                }
                                if (n == -1) {
                                    continue;
                                }
                                if (method6708.getBlock() instanceof Class3996) {
                                    final float[] method6709 = Class4609.method13672(class5745, Direction.UP);
                                    class5744.method17043(method6709[0]);
                                    class5744.method17041(method6709[1]);
                                    class5744.method17047(new Class1281(this, n, method6709));
                                    AutoFarm.mc.field4692 = 2;
                                    AutoFarm.mc.world.method6692(class5745.method1137(), Blocks.field29297.getDefaultState());
                                    return;
                                }
                                continue;
                            }
                        }
                    }
                    final ItemStack method6710 = AutoFarm.mc.player.method2715(Class316.field1877);
                    if (method6710 != null && method6710.getItem() instanceof Class3829) {
                        if (method6701.get((IProperty<Integer>)Class8970.field37773) == 7) {
                            continue;
                        }
                        final float[] method6711 = Class4609.method13672(class5745, Direction.DOWN);
                        class5744.method17043(method6711[0]);
                        class5744.method17041(method6711[1]);
                        class5744.method17047(new Class1242(this, method6711));
                    }
                    else {
                        if (method6701.get((IProperty<Integer>)Class8970.field37773) == 7) {
                            final float[] method6712 = Class4609.method13672(class5745, Direction.DOWN);
                            class5744.method17043(method6712[0]);
                            class5744.method17041(method6712[1]);
                            class5744.method17047(new Class1172(this, class5745));
                            AutoFarm.mc.world.method7149(class5745, false);
                            return;
                        }
                        continue;
                    }
                }
            }
        }
    }
}
