// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.item;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.PremiumModule;
import com.mentalfrostbyte.jello.mods.impl.movement.flys.CubecraftFly;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import mapped.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;

import java.util.Iterator;
import java.util.Collections;

public class AutoMLG extends PremiumModule
{
    private int field16005;
    private int field16006;
    private static int field16007;
    private BlockPos field16008;
    
    public AutoMLG() {
        super("AutoMLG", "Automatically places water when falling", Category.ITEM);
        this.addSetting(new BooleanSetting("Cubecraft", "Cubecraft bypass", true));
        AutoMLG.field16007 = -1;
    }
    
    public static boolean method10645() {
        return AutoMLG.field16007 >= 0;
    }
    
    @Override
    public void method9879() {
        AutoMLG.field16007 = -1;
    }
    
    @Override
    public void onDisable() {
        AutoMLG.field16007 = -1;
    }
    
    @EventListener
    private void method10646(final Class5717 class5717) {
        if (this.method9906()) {
            if (AutoMLG.field16007 > 0) {
                if (!AutoMLG.mc.player.onGround) {
                    Class7482.method23149(class5717, 0.0);
                }
            }
        }
    }
    
    @EventListener
    @Class6759
    private void method10647(final Class5744 class5744) {
        if (this.method9906() && AutoMLG.mc.field4682.method27330()) {
            if (class5744.method17046()) {
                if (AutoMLG.field16007 >= 0) {
                    ++AutoMLG.field16007;
                    final float[] method30919 = Class8845.method30919(this.field16008.getX() + 0.5, this.field16008.getZ() + 0.5, this.field16008.getY() + 0.5);
                    class5744.method17043(method30919[0]);
                    class5744.method17041(method30919[1]);
                }
            }
            if (AutoMLG.field16007 == (this.method9883("Cubecraft") ? 5 : 3)) {
                if (AutoMLG.mc.player.field3006.field2743 != this.field16005) {
                    this.field16006 = AutoMLG.mc.player.field3006.field2743;
                    AutoMLG.mc.player.field3006.field2743 = this.field16005;
                    AutoMLG.mc.field4682.method27318();
                }
                AutoMLG.mc.method5269().method17292(new Class4380(Class316.field1877));
                AutoMLG.mc.method5269().method17292(new Class4307(Class316.field1877));
                AutoMLG.field16007 = -1;
                this.field16008 = null;
                AutoMLG.mc.player.field3006.field2743 = this.field16006;
            }
            final int method30920 = this.method10648();
            if (!CubecraftFly.method10177()) {
                if (method30920 != -1) {
                    if (!AutoMLG.mc.player.onGround) {
                        if (AutoMLG.mc.player.fallDistance > 3.0f) {
                            final BlockPos method30921 = this.method10649();
                            if (method30921 != null) {
                                if (class5744.method17046() && AutoMLG.field16007 == -1) {
                                    final float[] method30922 = Class8845.method30919(method30921.getX() + 0.5, method30921.getZ() + 0.5, method30921.getY() + 0.5);
                                    class5744.method17043(method30922[0]);
                                    class5744.method17041(method30922[1]);
                                    if (method30920 != AutoMLG.mc.player.field3006.field2743) {
                                        this.field16006 = AutoMLG.mc.player.field3006.field2743;
                                        AutoMLG.mc.player.field3006.field2743 = method30920;
                                        AutoMLG.mc.field4682.method27318();
                                    }
                                    this.field16005 = method30920;
                                    this.field16008 = method30921;
                                    AutoMLG.field16007 = 0;
                                    return;
                                }
                                if (this.field16008 != null) {
                                    AutoMLG.mc.method5269().method17292(new Class4380(Class316.field1877));
                                    AutoMLG.mc.method5269().method17292(new Class4307(Class316.field1877));
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public int method10648() {
        for (int i = 36; i < 45; ++i) {
            if (AutoMLG.mc.player.field3008.method10878(i).method20054() && AutoMLG.mc.player.field3008.method10878(i).method20053().getItem() == Items.field31350) {
                return i - 36;
            }
        }
        for (int j = 9; j < 36; ++j) {
            if (AutoMLG.mc.player.field3008.method10878(j).method20054() && AutoMLG.mc.player.field3008.method10878(j).method20053().getItem() == Items.field31350) {
                AutoMLG.mc.method5269().method17292(new Class4323(Class2218.field13623));
                Class8639.method29370(j, 6);
                AutoMLG.mc.method5269().method17292(new Class4389(-1));
                return 6;
            }
        }
        return -1;
    }
    
    private BlockPos method10649() {
        final double field22770 = AutoMLG.mc.player.getMotion().x;
        final double field22771 = AutoMLG.mc.player.getMotion().y;
        final double field22772 = AutoMLG.mc.player.getMotion().z;
        final Iterator<Object> iterator = AutoMLG.mc.world.method6980(AutoMLG.mc.player, AutoMLG.mc.player.boundingBox.expand(field22770, 0.0, field22772).offset(0.0, field22771, 0.0), Collections.EMPTY_SET).iterator();
        Vec3i class352 = null;
        while (iterator.hasNext()) {
            final BlockPos class353 = new BlockPos(iterator.next().method24537().method18517());
            if (!Class4609.method13708(class353)) {
                continue;
            }
            if (class353.getY() + 1 >= AutoMLG.mc.player.posY) {
                continue;
            }
            if (class352 != null && AutoMLG.mc.player.method1733(class352.getX() + 0.5 - field22770, class352.getY() + 1, class352.getZ() + 0.5 - field22772) <= AutoMLG.mc.player.method1733(class353.getX() + 0.5 - field22770, class353.getY() + 1, class353.getZ() + 0.5 - field22772)) {
                continue;
            }
            class352 = class353;
        }
        if (class352 == null) {
            final Iterator<Object> iterator2 = AutoMLG.mc.world.method6980(AutoMLG.mc.player, AutoMLG.mc.player.boundingBox.expand(field22770, 0.0, field22772).offset(0.0, AutoMLG.mc.player.getMotion().y - 1.0, 0.0), Collections.EMPTY_SET).iterator();
            while (iterator2.hasNext()) {
                final BlockPos class354 = new BlockPos(iterator2.next().method24537().method18517());
                if (!Class4609.method13708(class354)) {
                    continue;
                }
                if (class354.getY() + 1 >= AutoMLG.mc.player.posY) {
                    continue;
                }
                if (class352 != null && AutoMLG.mc.player.method1733(class352.getX() + 0.5 - field22770, class352.getY() + 1, class352.getZ() + 0.5 - field22772) <= AutoMLG.mc.player.method1733(class354.getX() + 0.5 - field22770, class354.getY() + 1, class354.getZ() + 0.5 - field22772)) {
                    continue;
                }
                class352 = class354;
            }
            return (BlockPos)class352;
        }
        return (BlockPos)class352;
    }
}
