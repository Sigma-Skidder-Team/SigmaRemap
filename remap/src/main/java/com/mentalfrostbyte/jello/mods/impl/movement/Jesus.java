// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.impl.item.AutoMLG;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.settings.impl.StringSetting;
import mapped.*;
import net.minecraft.util.math.AxisAlignedBB;

import java.util.Iterator;

public class Jesus extends Module
{
    public int field15854;
    public int field15855;
    public int field15856;
    
    public Jesus() {
        super(Category.MOVEMENT, "Jesus", "Where's the scientific proof?");
        this.addSetting(new StringSetting("Mode", "Mode", 0, new String[] { "Basic", "Dolphin" }).setPremiumMode("Dolphin"));
        this.addSetting(new BooleanSetting("Swim up", "Automatically swim up", true));
    }
    
    @Override
    public void onDisable() {
    }
    
    @EventListener
    public void method10426(final Class5753 class5753) {
        if (this.method9906()) {
            if (Jesus.mc.world != null) {
                if (!AutoMLG.method10645()) {
                    if (Jesus.mc.world.getBlockState(class5753.method17064()).method21697() != Material.SEA_GRASS) {
                        if (Jesus.mc.world.getBlockState(class5753.method17064()).method21697() != Material.WATER) {
                            if (Jesus.mc.world.getBlockState(class5753.method17064()).method21697() != Material.LAVA) {
                                return;
                            }
                        }
                    }
                    if (class5753.method17064().getY() >= Jesus.mc.player.posY - ((Jesus.mc.player.posY % 0.5 != 0.0) ? 0.0f : 0.5f)) {
                        return;
                    }
                    if (this.method10432(Jesus.mc.player.boundingBox)) {
                        return;
                    }
                    if (Jesus.mc.player.method1809()) {
                        return;
                    }
                    if (Jesus.mc.player.fallDistance <= 10.0f) {
                        final int method21784 = Jesus.mc.world.getBlockState(class5753.method17064()).method21756().method21784();
                        float n = 0.0f;
                        if (method21784 > 3) {
                            ++n;
                        }
                        if (Jesus.mc.player.fallDistance > 10.0f) {
                            n -= 0.8f;
                        }
                        class5753.method17067(VoxelShapes.method24488(0.0, 0.0, 0.0, 1.0, n, 1.0));
                    }
                }
            }
        }
    }
    
    @EventListener
    public void method10427(final Class5744 class5744) {
        if (this.method9906()) {
            if (Jesus.mc.world != null) {
                if (class5744.method17046()) {
                    if (Jesus.mc.method5282() != null) {
                        if (method10433() && !this.method10432(Jesus.mc.player.boundingBox)) {
                            ++this.field15856;
                        }
                        else {
                            this.field15856 = 0;
                        }
                        if (method10433() && !this.method10432(Jesus.mc.player.boundingBox)) {
                            Jesus.mc.player.field2985 = 0;
                            class5744.method17033(true);
                            ++this.field15854;
                            if (this.field15854 % 2 == 0) {
                                class5744.method17037(class5744.method17036() - 0.001);
                            }
                        }
                        else {
                            this.field15854 = (Jesus.mc.player.onGround ? 0 : 1);
                        }
                    }
                }
            }
        }
    }
    
    @EventListener
    @Class6759
    public void method10428(final Class5717 class5717) {
        if (this.method9906()) {
            if (Jesus.mc.world != null) {
                if (!AutoMLG.method10645()) {
                    if (this.method10432(Jesus.mc.player.boundingBox) && !Jesus.mc.player.method1809()) {
                        final BlockState method6701 = Jesus.mc.world.getBlockState(Jesus.mc.player.method1894());
                        if (method6701 != null) {
                            if (!method6701.getFluidState().isEmpty()) {
                                if (method6701.getFluidState().getHeight() > 0.4) {
                                    if (this.method9883("Swim up")) {
                                        class5717.method16975(0.13);
                                    }
                                    if (!this.method10432(Jesus.mc.player.boundingBox.offset(0.0, class5717.method16974(), 0.0))) {
                                        class5717.method16975((int) Jesus.mc.player.posY + 1 - Jesus.mc.player.posY);
                                        Jesus.mc.player.onGround = true;
                                        this.field15854 = 1;
                                    }
                                }
                            }
                        }
                        return;
                    }
                    if (method10433()) {
                        if (class5717.method16974() != -0.0784000015258789) {
                            if (class5717.method16974() != Class7482.method23141()) {
                                class5717.method16975(-0.078);
                            }
                        }
                    }
                    if (this.method9887("Mode").equals("Dolphin")) {
                        if (this.field15855 > 0) {
                            if (Class6430.method19160(Jesus.mc.player, 0.001f)) {
                                this.field15855 = 0;
                            }
                            else {
                                if (Jesus.mc.player.method1809() || Jesus.mc.player.collidedVertically) {
                                    this.field15855 = 0;
                                    return;
                                }
                                if (this.field15855 > 0) {
                                    Class7482.method23149(class5717, 0.25 + Class7482.method23139() * 0.05);
                                    ++this.field15855;
                                }
                                final double method6702 = this.method10434(this.field15855);
                                if (method6702 != -999.0) {
                                    Jesus.mc.player.field4075 = 0.0;
                                    class5717.method16975(method6702);
                                }
                            }
                        }
                        else if (method10433()) {
                            if (this.field15854 % 2 == 0) {
                                ++this.field15855;
                                final double method6703 = this.method10434(this.field15855);
                                Class7482.method23149(class5717, 0.25);
                                if (method6703 != -999.0) {
                                    class5717.method16975(method6703);
                                }
                            }
                        }
                    }
                    Class6430.method19155(class5717.method16974());
                }
            }
        }
    }
    
    @EventListener
    public void method10429(final Class5722 class5722) {
        if (this.method9906()) {
            if (Jesus.mc.world != null) {
                if (Jesus.mc.method5282() != null) {
                    if (method10433()) {
                        if (this.field15854 % 2 != 0) {
                            class5722.method16961(true);
                        }
                        class5722.method16996(0.2);
                    }
                }
            }
        }
    }
    
    @EventListener
    public void method10430(final Class5745 class5745) {
        if (this.method9906() && class5745.method17049() >= 0.2) {
            if (method10433()) {
                class5745.method16961(true);
            }
        }
    }
    
    @Override
    public boolean method9898() {
        if (this.method9906()) {
            if (method10433()) {
                if (!this.method10431()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean method10431() {
        return Class7482.method23142();
    }
    
    public boolean method10432(final AxisAlignedBB class6221) {
        return Jesus.mc.world.isMaterialInBB(class6221, Material.WATER) || Jesus.mc.world.isMaterialInBB(class6221, Material.LAVA);
    }
    
    public static boolean method10433() {
        final Iterator<Object> iterator = Jesus.mc.world.method6981(Jesus.mc.player, Jesus.mc.player.boundingBox.offset(0.0, -0.001, 0.0)).iterator();
        boolean b = true;
        if (iterator.hasNext()) {
            while (iterator.hasNext()) {
                final Block method21696 = Jesus.mc.world.getBlockState(new BlockPos(iterator.next().method24537().method18517())).method21696();
                if (method21696 == Class7521.field29173) {
                    continue;
                }
                if (method21696 == Class7521.field29174) {
                    continue;
                }
                if (method21696 == Class7521.field29147) {
                    continue;
                }
                if (method21696 == Class7521.field29244) {
                    continue;
                }
                if (method21696 == Class7521.field29245) {
                    continue;
                }
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public double method10434(double n) {
        --n;
        final double[] array = { 0.499, 0.484, 0.468, 0.436, 0.404, 0.372, 0.34, 0.308, 0.276, 0.244, 0.212, 0.18, 0.166, 0.166, 0.156, 0.123, 0.135, 0.111, 0.086, 0.098, 0.073, 0.048, 0.06, 0.036, 0.0106, 0.015, 0.0, 0.0, 0.0, -0.013, -0.045, -0.077, -0.109 };
        if (n < array.length && n >= 0.0) {
            return array[(int)n];
        }
        return -999.0;
    }
}
