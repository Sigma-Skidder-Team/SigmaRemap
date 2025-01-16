// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.flys;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.VoxelShape;

import java.util.Iterator;

public class AGCFly extends Module
{
    private int field15643;
    private int field15644;
    private boolean field15645;
    
    public AGCFly() {
        super(Category.MOVEMENT, "AGC", "A fly for AntiGamingChair");
    }
    
    @Override
    public void method9879() {
        this.field15643 = 0;
        if (!AGCFly.mc.gameSettings.field23440.method1056()) {
            this.field15645 = false;
        }
        else {
            AGCFly.mc.gameSettings.field23440.field2162 = false;
            this.field15645 = true;
        }
        this.field15644 = 1;
    }
    
    @EventListener
    private void method10079(final Class5752 class5752) {
        if (this.method9906()) {
            if (class5752.method17061() == AGCFly.mc.gameSettings.field23440.field2161.field32860) {
                class5752.method16961(true);
                this.field15645 = true;
            }
        }
    }
    
    @EventListener
    private void method10080(final Class5715 class5715) {
        if (this.method9906()) {
            if (class5715.method16963() == AGCFly.mc.gameSettings.field23440.field2161.field32860) {
                class5715.method16961(true);
                this.field15645 = false;
            }
        }
    }
    
    @Override
    public void onDisable() {
        Class7482.method23151(0.0);
        if (AGCFly.mc.player.getMotion().y > 0.0) {
            Class6430.method19155(-0.0789);
        }
    }
    
    @EventListener
    @Class6759
    public void method10081(final Class5717 class5717) {
        if (this.method9906()) {
            if (this.field15643 <= ((this.field15644 != 3) ? this.field15644 : 1) - 2) {
                if (this.field15643 == -1) {
                    class5717.method16975((this.field15644 != 3) ? 0.001 : 0.095);
                    if (this.field15644 != 3) {
                        Class7482.method23149(class5717, 0.32);
                    }
                    Class6430.method19155(class5717.method16974());
                }
            }
            else {
                class5717.method16975(0.0);
                Class7482.method23149(class5717, 0.0);
            }
        }
    }
    
    @EventListener
    public void method10082(final Class5744 class5744) {
        if (this.method9906() && class5744.method17046()) {
            ++this.field15643;
            if (this.field15643 != ((this.field15644 != 3) ? this.field15644 : 1)) {
                if (this.field15643 > ((this.field15644 != 3) ? this.field15644 : 1)) {
                    if (this.field15643 % 20 != 0) {
                        class5744.method16961(true);
                    }
                    else {
                        class5744.method17037(this.method10084() - 1.0E-4);
                        class5744.method17033(true);
                        class5744.method17045(true);
                    }
                }
            }
            else {
                class5744.method17037(this.method10084() - 1.0E-4);
                class5744.method17045(true);
                class5744.method17033(true);
                this.field15644 = (this.field15645 ? (AGCFly.mc.gameSettings.field23439.method1056() ? 1 : 2) : (AGCFly.mc.gameSettings.field23439.method1056() ? 3 : 1));
            }
        }
    }
    
    @EventListener
    public void method10083(final Class5723 class5723) {
        if (this.method9906()) {
            final IPacket method16998 = class5723.method16998();
            if (method16998 instanceof Class4328) {
                final Class4328 class5724 = (Class4328)method16998;
                if (this.field15643 >= ((this.field15644 != 3) ? this.field15644 : 1)) {
                    this.field15643 = -1;
                }
                class5724.field19380 = AGCFly.mc.player.rotationYaw;
                class5724.field19381 = AGCFly.mc.player.rotationPitch;
            }
        }
    }
    
    private double method10084() {
        if (AGCFly.mc.player.method1895().y < 1.0) {
            return -1.0;
        }
        if (!AGCFly.mc.player.onGround) {
            final Iterator<Object> iterator = AGCFly.mc.world.method6981(AGCFly.mc.player, AGCFly.mc.player.boundingBox.expand(0.0, -AGCFly.mc.player.method1934().y, 0.0)).iterator();
            double field25077 = -1.0;
            BlockPos class354 = null;
            while (iterator.hasNext()) {
                final VoxelShape class355 = iterator.next();
                if (class355.getBoundingBox().maxY <= field25077) {
                    continue;
                }
                field25077 = class355.getBoundingBox().maxY;
                class354 = new BlockPos(class355.getBoundingBox().minX, class355.getBoundingBox().minY, class355.getBoundingBox().minZ);
            }
            if (class354 != null) {
                if (AGCFly.mc.world.getBlockState(class354).method21696() instanceof Class4030) {
                    field25077 = (int)field25077 - 1.0E-4;
                }
            }
            return field25077;
        }
        return AGCFly.mc.player.posY;
    }
}
