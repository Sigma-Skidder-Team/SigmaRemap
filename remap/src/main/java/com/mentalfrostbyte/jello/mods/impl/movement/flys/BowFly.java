// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.flys;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.impl.item.InvManager;
import mapped.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;

public class BowFly extends Module
{
    private int field15760;
    private Class7617 field15761;
    
    public BowFly() {
        super(Category.MOVEMENT, "Bow", "Fly for Bow");
        this.field15761 = new Class7617();
    }
    
    @Override
    public void onDisable() {
        if (BowFly.mc.timer.timerSpeed == 0.1f) {
            BowFly.mc.timer.timerSpeed = 1.0f;
        }
    }
    
    @Override
    public void method9917() {
    }
    
    @EventListener
    public void method10304(final Class5751 class5751) {
        if (this.method9906()) {
            if (BowFly.mc.player.method2715(Class316.field1877).getItem() == Items.field31279) {
                if (this.field15760 >= 1) {
                    class5751.method16961(true);
                }
            }
        }
    }
    
    @EventListener
    public void method10305(final Class5717 class5717) {
        if (!this.method9906()) {
            return;
        }
        final double field22771 = class5717.method16978().y;
        class5717.method16978().y = 0.0;
        final double method16752 = class5717.method16978().length();
        class5717.method16978().y = field22771;
        final float n = Class7482.method23143()[1];
        final float n2 = Class7482.method23143()[2];
        final float n3 = Class7482.method23143()[0];
        System.out.println(method16752);
        if ((n != 0.0f || n2 != 0.0f) && class5717.method16978().y >= -0.5) {
            final double cos = Math.cos(Math.toRadians(n3));
            final double sin = Math.sin(Math.toRadians(n3));
            class5717.method16973(n * method16752 * cos + n2 * method16752 * sin);
            class5717.method16977(n * method16752 * sin - n2 * method16752 * cos);
            BowFly.mc.player.getMotion().x = class5717.method16972();
            BowFly.mc.player.getMotion().y = class5717.method16974();
            return;
        }
        class5717.method16973(0.0);
        class5717.method16977(0.0);
    }
    
    @EventListener
    public void method10306(final Class5744 class5744) {
        if (!this.method9906() || !class5744.method17046()) {
            return;
        }
        if (!this.field15761.method23937()) {
            this.field15761.method23932();
        }
        final int method10307 = this.method10307();
        if (method10307 < 0 && method10307 > 8) {
            return;
        }
        if (BowFly.mc.player.method2715(Class316.field1877).getItem() == Items.field31279) {
            if (InvManager.method10673(Items.field31280) == 0) {
                if (this.field15761.method23935() > 5000L) {
                    Client.method35173().method35197().method25776(new Class6224("BowFly", "You have no arrows"));
                    this.field15761.method23934();
                }
                if (BowFly.mc.timer.timerSpeed == 0.1f) {
                    BowFly.mc.timer.timerSpeed = 1.0f;
                }
                return;
            }
            float field2399 = BowFly.mc.player.rotationYaw;
            float n = -90.0f;
            if (BowFly.mc.player.field2970 != 0.0f || BowFly.mc.player.field2968 != 0.0f) {
                n = -80.0f;
            }
            if (BowFly.mc.player.field2970 < 0.0f) {
                field2399 -= 180.0f;
            }
            if (BowFly.mc.player.getMotion().y < -0.1) {
                n = 90.0f;
            }
            class5744.method17041(n);
            class5744.method17043(field2399);
            if (BowFly.mc.player.onGround && BowFly.mc.player.collidedVertically) {
                BowFly.mc.player.method2725();
            }
            else if (BowFly.mc.player.getMotion().y >= 0.0) {
                if (BowFly.mc.timer.timerSpeed == 0.1f) {
                    BowFly.mc.timer.timerSpeed = 1.0f;
                }
            }
            else {
                BowFly.mc.timer.timerSpeed = 0.1f;
            }
            ++this.field15760;
            if (this.field15760 < 4) {
                if (this.field15760 == 1) {
                    BowFly.mc.method5269().method17292(new Class4307(Class316.field1877));
                }
            }
            else {
                BowFly.mc.method5269().method17292(new Class4399(Class2003.field11245, BlockPos.ZERO, Direction.DOWN));
                this.field15760 = 0;
            }
        }
    }
    
    private int method10307() {
        for (int i = 36; i < 45; ++i) {
            if (BowFly.mc.player.field3008.method10878(i).method20054() && BowFly.mc.player.field3008.method10878(i).method20053().getItem() == Items.field31279) {
                return i - 36;
            }
        }
        for (int j = 9; j < 36; ++j) {
            if (BowFly.mc.player.field3008.method10878(j).method20054() && BowFly.mc.player.field3008.method10878(j).method20053().getItem() == Items.field31279) {
                Class8639.method29370(j, 7);
                return 7;
            }
        }
        return -1;
    }
}
