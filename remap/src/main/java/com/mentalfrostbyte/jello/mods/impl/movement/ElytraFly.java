// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import mapped.*;
import net.minecraft.entity.Entity;
import org.lwjgl.glfw.GLFW;

public class ElytraFly extends Module
{
    public int field15608;
    private float field15609;
    private float field15610;
    private float field15611;
    private boolean field15612;
    public int field15613;
    
    public ElytraFly() {
        super(Category.MOVEMENT, "ElytraFly", "Better elytra flying");
        this.field15608 = 0;
        this.field15613 = 0;
        this.addSetting(new BooleanSetting("NCP", "Bypass NCP", true));
    }
    
    @EventListener
    public void method10030(final Class5743 class5743) {
        if (this.method9906()) {
            ElytraFly.mc.gameSettings.field23440.field2162 = false;
            if (ElytraFly.mc.player.getMotion().y < 0.08 && !ElytraFly.mc.player.onGround) {
                if (!ElytraFly.mc.player.method2773()) {
                    ElytraFly.mc.method5269().method17292(new Class4336(ElytraFly.mc.player, Class287.field1599));
                    ElytraFly.mc.player.setFlag(7, true);
                }
            }
            else {
                ElytraFly.mc.player.setFlag(7, false);
                if (ElytraFly.mc.player.method1809()) {
                    this.method9909(false);
                }
            }
        }
    }
    
    @EventListener
    public void method10031(final Class5717 class5717) {
        if (this.method9906()) {
            double method23136 = Class7482.method23136();
            ColorUtils.method19114();
            if (!this.method9883("NCP")) {
                if (ElytraFly.mc.player.method1809()) {
                    method23136 *= 2.5;
                }
            }
            Class7482.method23149(class5717, 0.0);
            if (!ElytraFly.mc.player.method2773()) {
                this.field15608 = 0;
            }
            else {
                if (this.field15608 > 0) {
                    if (this.field15608 > 7) {
                        Class7482.method23149(class5717, method23136 * 6.300000190734863);
                    }
                    ColorUtils.method19155(-0.071);
                    class5717.method16975(-1.0001000191550702E-4);
                }
                ++this.field15608;
            }
            if (this.field15610 > 1.0001E-4f) {
                if (ElytraFly.mc.player.field2967) {
                    Class7482.method23149(class5717, method23136 * 6.300000190734863);
                    class5717.method16975(this.field15610);
                }
            }
            if (GLFW.glfwGetKey(ElytraFly.mc.field4632.method7690(), ElytraFly.mc.gameSettings.field23440.field2161.field32860) == 1 && this.method9883("NCP")) {
                class5717.method16975(-0.8999999761581421);
            }
            else if (!ElytraFly.mc.player.method1809()) {
                if (ElytraFly.mc.player.field2967) {
                    if (!this.method9883("NCP")) {
                        class5717.method16975(1.399999976158142);
                    }
                }
            }
            else {
                class5717.method16975(1.399999976158142);
            }
            this.field15610 *= (float)0.85;
        }
    }
    
    @EventListener
    private void method10032(final Class5723 class5723) {
        if (this.method9906()) {
            if (ElytraFly.mc.player != null) {
                if (class5723.method16998() instanceof Class4273) {
                    final Class4273 class5724 = (Class4273)class5723.method16998();
                    final Entity method6741 = ElytraFly.mc.world.getEntityByID(class5724.method12822());
                    if (method6741 instanceof Class406) {
                        final Class406 class5725 = (Class406)method6741;
                        if (class5725.field2499 != null) {
                            if (class5725.field2499.getEntityId() == ElytraFly.mc.player.getEntityId()) {
                                this.field15609 += class5724.field19165 / 8000.0f;
                                this.field15611 += class5724.field19167 / 8000.0f;
                                this.field15610 += class5724.field19166 / 8000.0f;
                                this.field15612 = true;
                            }
                        }
                    }
                }
            }
        }
    }
    
    @EventListener
    private void method10033(final Class5744 class5744) {
        if (this.method9906()) {
            final int field15613 = 65;
            if (this.field15613 != field15613 - 1) {
                if (this.field15613 <= 0) {
                    if (ElytraFly.mc.player.field2967) {
                        this.field15613 = field15613;
                    }
                }
            }
            else {
                final int method29340 = Class8639.method29340(Items.field31532);
                if (method29340 >= 0) {
                    if (method29340 != ElytraFly.mc.player.field3006.field2743) {
                        ElytraFly.mc.method5269().method17292(new Class4321(method29340));
                    }
                    ElytraFly.mc.method5269().method17292(new Class4307(Class316.field1877));
                    if (method29340 != ElytraFly.mc.player.field3006.field2743) {
                        ElytraFly.mc.method5269().method17292(new Class4321(ElytraFly.mc.player.field3006.field2743));
                    }
                }
            }
            if (this.field15613 > 0) {
                class5744.method17041(-90.0f);
            }
            if (!ElytraFly.mc.player.field2967) {
                this.field15613 = 0;
            }
            --this.field15613;
        }
    }
    
    @EventListener
    @Class6757
    private void method10034(final Class5721 class5721) {
        if (this.method9906()) {
            return;
        }
    }
    
    @EventListener
    private void method10035(final Class5715 class5715) {
        if (this.method9906()) {
            return;
        }
    }
    
    @Override
    public void method9879() {
        if (ElytraFly.mc.player.onGround) {
            ColorUtils.method19155(0.399399995803833);
        }
    }
    
    @Override
    public void onDisable() {
        if (!Class7482.method23148()) {
            ColorUtils.method19154(0.0);
            ColorUtils.method19156(0.0);
        }
    }
}
