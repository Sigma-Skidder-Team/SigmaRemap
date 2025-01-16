// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.flys;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.PremiumModule;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import mapped.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.Vec3d;

public class MineplexFly extends PremiumModule
{
    private int field15992;
    private int field15993;
    private int field15994;
    private double field15995;
    private double field15996;
    private double field15997;
    private boolean field15998;
    private boolean field15999;
    
    public MineplexFly() {
        super("Mineplex", "Mineplex fly/longjump", Category.MOVEMENT);
        this.addSetting(new NumberSetting("Boost", "Boost value", 4.0f, Float.class, 1.0f, 8.0f, 0.01f));
        this.addSetting(new BooleanSetting("Fake", "Simulate a real fly", false));
    }
    
    @Override
    public void method9879() {
        this.field15992 = -1;
        this.field15995 = Class7482.method23136();
        this.field15993 = 0;
        this.field15999 = false;
        this.field15994 = -1;
        this.field15997 = -1.0;
        this.method10637();
    }
    
    @Override
    public void onDisable() {
        Class7482.method23151(Class7482.method23136() * 0.5);
        if (this.field15994 != -1) {
            MineplexFly.mc.method5269().method17292(new Class4321(MineplexFly.mc.player.field3006.field2743));
            this.field15994 = MineplexFly.mc.player.field3006.field2743;
        }
        MineplexFly.mc.timer.timerSpeed = 1.0f;
    }
    
    @EventListener
    public void method10630(final Class5744 class5744) {
        if (this.method9906() && class5744.method17046()) {
            class5744.method17033(true);
        }
    }
    
    @EventListener
    public void method10631(final Class5732 class5732) {
        if (this.method9906()) {
            final int n = -1;
            this.field15994 = n;
            this.field15992 = n;
            this.field15997 = n;
            this.field15993 = 0;
            this.field15999 = false;
            this.field15995 = Class7482.method23136();
        }
    }
    
    public boolean method10632() {
        if (this.method9906()) {
            if (this.field15994 != -1) {
                if (this.field15995 < this.getNumberSettingValueByName("Boost")) {
                    if (MineplexFly.mc.player.onGround || Class6430.method19160(MineplexFly.mc.player, 0.001f)) {
                        if (!this.field15999) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @EventListener
    public void method10633(final Class5738 class5738) {
        if (this.method9906()) {
            if (this.field15999) {
                if (MineplexFly.mc.player != null) {
                    if (MineplexFly.mc.player.onGround) {
                        class5738.method17026(true);
                    }
                }
            }
        }
    }
    
    @EventListener
    public void method10634(final Class5717 class5717) {
        if (!this.method9906()) {
            return;
        }
        if (!this.field15999) {
            final float n = MineplexFly.mc.player.rotationYaw + 90.0f;
            if (!MineplexFly.mc.player.onGround && !Class6430.method19160(MineplexFly.mc.player, 0.001f)) {
                if (this.field15992 != -1) {
                    if (this.field15998) {
                        if (!Class6430.method19114()) {
                            this.field15998 = !this.field15998;
                            this.field15995 = 0.5;
                        }
                    }
                    ++this.field15993;
                    this.field15995 *= 0.98;
                    this.field15996 -= 0.04000000000001;
                    if (this.field15993 <= 22) {
                        if (this.field15993 == 10) {
                            if (this.field15998) {
                                this.field15996 = -0.005;
                            }
                        }
                    }
                    else {
                        this.field15996 -= 0.02;
                    }
                    if (this.field15993 > 6) {
                        if (!Class6430.method19114()) {
                            this.field15996 -= 0.05;
                        }
                    }
                    class5717.method16975(this.field15996);
                    if (MineplexFly.mc.player.collidedHorizontally || !Class6430.method19114()) {
                        this.field15995 = 0.35;
                    }
                    Class7482.method23149(class5717, this.field15995);
                }
            }
            else {
                if (this.field15993 > 0) {
                    Class7482.method23149(class5717, 0.0);
                    this.method9914().method9910();
                    return;
                }
                if (this.field15992 == -1) {
                    this.field15992 = 0;
                    this.field15995 = 0.35;
                    return;
                }
                ++this.field15992;
                if (this.method10637() == -1) {
                    return;
                }
                MineplexFly.mc.method5269().method17292(new Class4329(Class316.field1877, new BlockRayTraceResult(new Vec3d(0.475 + Math.random() * 0.05, 1.0, 0.475 + Math.random() * 0.05), Direction.UP, new BlockPos(MineplexFly.mc.player).add(0, -1, 0), false)));
                if (this.field15995 >= this.getNumberSettingValueByName("Boost")) {
                    Class7482.method23149(class5717, 0.0);
                    MineplexFly.mc.player.method2725();
                    this.field15996 = 0.4299999;
                    this.field15993 = 0;
                    this.field15998 = Class6430.method19114();
                    class5717.method16975(this.field15996);
                    this.field15997 = MineplexFly.mc.player.posY;
                    ++this.field15992;
                    this.field15995 += 0.5;
                }
                else {
                    MineplexFly.mc.timer.timerSpeed = Math.min(1.0f, Math.max(0.1f, (float)(1.2 - this.field15995 * 0.15)));
                    if (this.field15992 > 2) {
                        this.field15995 += 0.05;
                    }
                    if (this.field15992 % 2 != 0) {
                        class5717.method16973(Math.cos(Math.toRadians(n)) * this.field15995);
                        class5717.method16977(Math.sin(Math.toRadians(n)) * this.field15995);
                    }
                    else {
                        class5717.method16973(Math.cos(Math.toRadians(n + 180.0f)) * this.field15995);
                        class5717.method16977(Math.sin(Math.toRadians(n + 180.0f)) * this.field15995);
                    }
                }
            }
            return;
        }
        Class7482.method23149(class5717, 0.01);
    }
    
    @EventListener
    public void method10635(final Class5723 class5723) {
        if (this.method9906()) {
            if (class5723.method16998() instanceof Class4328) {
                this.field15999 = true;
                Client.method35173().method35197().method25776(new Class6224("Mineplex fly", "Please try again"));
            }
        }
    }
    
    @EventListener
    public void method10636(final Class5721 class5721) {
        if (this.method9906()) {
            if (class5721.method16990() instanceof Class4321) {
                if (this.field15994 != -1) {
                    if (this.field15995 < this.getNumberSettingValueByName("Boost")) {
                        if (MineplexFly.mc.player.onGround || Class6430.method19160(MineplexFly.mc.player, 0.001f)) {
                            if (!this.field15999) {
                                class5721.method16961(true);
                            }
                        }
                    }
                }
            }
        }
    }
    
    private int method10637() {
        if (!MineplexFly.mc.player.getHeldItemMainhand().method27620()) {
            for (int i = 36; i < 45; ++i) {
                final int field15994 = i - 36;
                if (MineplexFly.mc.player.field3008.method10878(i).method20053().method27620()) {
                    if (MineplexFly.mc.player.field3006.field2743 != field15994) {
                        if (this.field15994 != field15994) {
                            MineplexFly.mc.method5269().method17292(new Class4321(field15994));
                            this.field15994 = field15994;
                        }
                    }
                    return field15994;
                }
            }
            Class8639.method29367(MineplexFly.mc.player.field3008.field16154, 42, 0, Class2133.field12438, MineplexFly.mc.player, true);
            if (!MineplexFly.mc.player.field3008.method10878(42).method20053().method27620()) {
                Client.method35173().method35197().method25776(new Class6224("Mineplex Fly", "Please empty a slot in your inventory"));
            }
            else if (MineplexFly.mc.player.field3006.field2743 != 6) {
                if (this.field15994 != 6) {
                    MineplexFly.mc.method5269().method17292(new Class4321(6));
                    return this.field15994 = 6;
                }
            }
            return -1;
        }
        return this.field15994 = MineplexFly.mc.player.field3006.field2743;
    }
    
    @EventListener
    public void method10638(final Class5741 class5741) {
        if (this.method9906()) {
            if (this.method9883("Fake")) {
                if (this.field15997 >= 0.0) {
                    if (MineplexFly.mc.player.posY >= this.field15997) {
                        MineplexFly.mc.player.posY = this.field15997;
                        MineplexFly.mc.player.lastTickPosY = this.field15997;
                        MineplexFly.mc.player.field3019 = this.field15997;
                        MineplexFly.mc.player.prevPosY = this.field15997;
                        if (Class7482.method23148()) {
                            MineplexFly.mc.player.field3013 = 0.099999994f;
                        }
                    }
                }
            }
        }
    }
}
