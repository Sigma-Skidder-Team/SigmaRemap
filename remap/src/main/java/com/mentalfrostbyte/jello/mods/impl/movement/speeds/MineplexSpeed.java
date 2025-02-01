// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.speeds;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.impl.movement.BlockFly;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import mapped.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.Vec3d;

public class MineplexSpeed extends Module
{
    private int field15675;
    private int field15676;
    private int field15677;
    private double field15678;
    
    public MineplexSpeed() {
        super(Category.MOVEMENT, "Mineplex", "Speed for Mineplex");
        this.addSetting(new BooleanSetting("AutoJump", "Automatically jumps for you.", true));
        this.addSetting(new BooleanSetting("OnGround", "OnGround Speed.", true));
        this.addSetting(new NumberSetting("OnGround Speed", "OnGround value.", 0.8f, Float.class, 0.3f, 1.5f, 0.01f));
    }
    
    @Override
    public void onDisable() {
        Class7482.method23151(Class7482.method23136() * 0.7);
        if (MineplexSpeed.mc.player.field3006.field2743 != this.field15677) {
            MineplexSpeed.mc.method5269().method17292(new Class4321(MineplexSpeed.mc.player.field3006.field2743));
            this.field15677 = MineplexSpeed.mc.player.field3006.field2743;
        }
    }
    
    @Override
    public void method9879() {
        this.field15676 = 0;
        this.field15675 = 0;
        this.field15677 = -1;
        this.field15678 = this.getNumberSettingValueByName("OnGround Speed") * 1.0f / 4.0f;
    }
    
    @EventListener
    @Class6757
    public void method10150(final Class5717 class5717) {
        if (this.method9906()) {
            if (!Client.method35173().method35189().method21551(BlockFly.class).method9906()) {
                if (!ColorUtils.method19112(MineplexSpeed.mc.player)) {
                    final double field15678 = this.getNumberSettingValueByName("OnGround Speed");
                    if (!MineplexSpeed.mc.player.onGround) {
                        if (MineplexSpeed.mc.player.collidedHorizontally) {
                            this.field15678 = 0.35;
                            this.field15676 = 1;
                        }
                        if (!ColorUtils.method19114()) {
                            this.field15678 = 0.3;
                        }
                        this.field15678 -= 0.01;
                        if (this.field15678 < 0.3) {
                            this.field15678 = 0.3;
                        }
                        Class7482.method23149(class5717, this.field15678);
                    }
                    else {
                        if (this.field15675 > 1) {
                            this.field15676 = 0;
                        }
                        else {
                            ++this.field15675;
                        }
                        if (this.method9883("AutoJump")) {
                            if (ColorUtils.method19114()) {
                                MineplexSpeed.mc.player.method2725();
                                class5717.method16975(MineplexSpeed.mc.player.getMotion().y);
                            }
                        }
                        if (class5717.method16974() == 0.4199998) {
                            Class7482.method23149(class5717, 0.0);
                            return;
                        }
                        if (!this.method9883("OnGround")) {
                            return;
                        }
                        if (this.method10154() == -1) {
                            Class7482.method23149(class5717, 0.2);
                            return;
                        }
                        MineplexSpeed.mc.method5269().method17292(new Class4329(Class316.field1877, new BlockRayTraceResult(new Vec3d(0.475 + Math.random() * 0.05, 1.0, 0.475 + Math.random() * 0.05), Direction.UP, new BlockPos(MineplexSpeed.mc.player).add(0, -1, 0), false)));
                        this.field15678 += field15678 / 4.0;
                        if (MineplexSpeed.mc.player.collidedHorizontally) {
                            this.field15678 /= 2.0;
                        }
                        if (this.field15678 > field15678) {
                            this.field15678 = field15678;
                        }
                        if (this.field15678 < 0.3) {
                            this.field15678 = 0.3;
                        }
                        Class7482.method23149(class5717, this.field15678);
                    }
                }
            }
        }
    }
    
    @EventListener
    public void method10151(final Class5722 class5722) {
        if (this.method9906()) {
            this.field15678 = 0.81 + this.field15676 * 0.095;
            if (MineplexSpeed.mc.player.posY != (int) MineplexSpeed.mc.player.posY) {
                this.field15678 = 0.52;
                this.field15676 = 1;
            }
            this.field15675 = 0;
            if (this.field15676 < 2) {
                ++this.field15676;
            }
            class5722.method16996(0.0);
            class5722.method16995(0.4199998);
            if (MineplexSpeed.mc.player.field3006.field2743 != this.field15677) {
                MineplexSpeed.mc.method5269().method17292(new Class4321(MineplexSpeed.mc.player.field3006.field2743));
                this.field15677 = MineplexSpeed.mc.player.field3006.field2743;
            }
        }
    }
    
    @EventListener
    public void method10152(final Class5723 class5723) {
        if (this.method9906() && MineplexSpeed.mc.player != null) {
            if (class5723.method16998() instanceof Class4328) {
                this.field15676 = 0;
                this.field15678 = 0.0;
            }
        }
    }
    
    @EventListener
    public void method10153(final Class5745 class5745) {
        if (this.method9906() && MineplexSpeed.mc.player != null) {
            if (class5745.method17049() > 0.2) {
                this.field15678 -= this.getNumberSettingValueByName("OnGround Speed") / 4.0f;
            }
        }
    }
    
    private int method10154() {
        if (!MineplexSpeed.mc.player.getHeldItemMainhand().method27620()) {
            for (int i = 36; i < 45; ++i) {
                final int field15677 = i - 36;
                if (MineplexSpeed.mc.player.field3008.method10878(i).method20053().method27620()) {
                    if (MineplexSpeed.mc.player.field3006.field2743 != field15677) {
                        if (this.field15677 != field15677) {
                            MineplexSpeed.mc.method5269().method17292(new Class4321(field15677));
                            this.field15677 = field15677;
                        }
                    }
                    return field15677;
                }
            }
            Class8639.method29367(MineplexSpeed.mc.player.field3008.field16154, 42, 0, Class2133.field12438, MineplexSpeed.mc.player, true);
            if (MineplexSpeed.mc.player.field3008.method10878(42).method20053().method27620()) {
                if (MineplexSpeed.mc.player.field3006.field2743 != 6) {
                    if (this.field15677 != 6) {
                        MineplexSpeed.mc.method5269().method17292(new Class4321(6));
                        return this.field15677 = 6;
                    }
                }
            }
            return -1;
        }
        return this.field15677 = MineplexSpeed.mc.player.field3006.field2743;
    }
}
