// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.speeds;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.impl.movement.BlockFly;
import com.mentalfrostbyte.jello.mods.impl.movement.Fly;
import com.mentalfrostbyte.jello.mods.impl.movement.Speed;
import com.mentalfrostbyte.jello.mods.impl.movement.Jesus;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import mapped.*;

public class NCPSpeed extends Module
{
    private int field15847;
    private int field15848;
    private double field15849;
    
    public NCPSpeed() {
        super(Category.MOVEMENT, "NCP", "Speed for NCP");
        this.addSetting(new BooleanSetting("Auto Jump", "Automatically jumps for you.", true));
    }
    
    @Override
    public void method9879() {
        this.field15848 = 1;
        final double field22770 = NCPSpeed.mc.player.getMotion().x;
        final double field22771 = NCPSpeed.mc.player.getMotion().z;
        this.field15849 = Math.sqrt(field22770 * field22770 + field22771 * field22771);
    }
    
    @EventListener
    public void method10412(final Class5744 class5744) {
        if (this.method9906()) {
            if (NCPSpeed.mc.player != null) {
                if (!Jesus.method10433()) {
                    if (!Client.method35173().method35189().method21551(Fly.class).method9906()) {
                        if (class5744.method17046()) {
                            if (Speed.field15748 > 1) {
                                final double n = NCPSpeed.mc.player.posX - NCPSpeed.mc.player.field4074;
                                final double n2 = NCPSpeed.mc.player.posZ - NCPSpeed.mc.player.field4076;
                                if (this.field15847 != 0) {
                                    this.field15849 = Math.sqrt(n * n + n2 * n2);
                                }
                                else {
                                    this.field15849 *= 0.67 + Math.random() * 1.0E-10;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    @EventListener
    public void method10413(final Class5717 class5717) {
        if (!this.method9906() || NCPSpeed.mc.player == null) {
            return;
        }
        if (!Jesus.method10433() && !NCPSpeed.mc.player.method1706()) {
            if (this.field15848 < 2) {
                ++this.field15848;
            }
            if (!NCPSpeed.mc.player.onGround) {
                if (this.field15847 >= 0) {
                    ++this.field15847;
                    double n = this.field15849;
                    if (this.field15847 > 1) {
                        n = Math.max(Class7482.method23137(), this.field15849 - (0.004 - Class7482.method23137() * 0.003) - Math.random() * 1.0E-10);
                    }
                    Class7482.method23149(class5717, n);
                    if (class5717.method16974() >= -0.008744698139753596 && class5717.method16974() <= -0.008724698139753597) {
                        class5717.method16975(0.001);
                    }
                    else if (class5717.method16974() >= -0.07743000150680542) {
                        if (class5717.method16974() <= -0.07741000150680542) {
                            class5717.method16975(class5717.method16974() - 0.01);
                        }
                    }
                }
            }
            else if (this.field15848 > 1) {
                if ((this.method9883("Auto Jump") && Class6430.method19114()) || NCPSpeed.mc.gameSettings.field23439.method1056()) {
                    this.field15847 = 0;
                    NCPSpeed.mc.player.method2725();
                    class5717.method16973(NCPSpeed.mc.player.getMotion().x);
                    class5717.method16975(NCPSpeed.mc.player.getMotion().y);
                    class5717.method16977(NCPSpeed.mc.player.getMotion().z);
                }
            }
            return;
        }
        this.field15847 = -1;
    }
    
    @EventListener
    @Class6759
    public void method10414(final Class5722 class5722) {
        if (!this.method9906() || Jesus.method10433()) {
            return;
        }
        if (this.field15847 != 0) {
            class5722.method16961(true);
        }
        if (NCPSpeed.mc.gameSettings.field23439.method1056() && Client.method35173().method35189().method21551(BlockFly.class).method9906()) {
            return;
        }
        double b = 0.56 + Class7482.method23139() * 0.1;
        class5722.method16995(0.407 + Class7482.method23140() * 0.1 + Math.random() * 1.0E-5);
        if (Speed.field15748 < 2) {
            b /= 2.5;
        }
        final double max = Math.max(Class7482.method23137(), b);
        class5722.method16996(max);
        this.field15849 = max;
    }
    
    @EventListener
    public void method10415(final Class5745 class5745) {
        if (this.method9906() && class5745.method17049() >= 0.9) {
            this.field15848 = 0;
        }
    }
}
