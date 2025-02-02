// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.speeds;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.*;

public class GommeSpeed extends Module
{
    private int field15929;
    private int field15930;
    private double field15931;
    private float field15932;
    
    public GommeSpeed() {
        super(Category.MOVEMENT, "Gomme", "Speed for GommeHD");
    }
    
    @Override
    public void onEnable() {
        this.field15929 = 0;
        this.field15930 = 0;
        this.field15932 = Class7482.method23144()[0];
    }
    
    @Override
    public void onDisable() {
        Class7482.method23154(0.27, Class7482.method23144()[0], this.field15932, 45.0f);
    }
    
    @EventListener
    public void method10548(final Class5723 class5723) {
        if (this.isEnabled()) {
            if (class5723.method16998() instanceof Class4328) {
                this.field15930 = 0;
            }
        }
    }
    
    @EventListener
    public void method10549(final Class5717 class5717) {
        if (this.isEnabled()) {
            if (GommeSpeed.mc.player.onGround && ColorUtils.method19114()) {
                this.field15929 = 0;
                class5717.method16975(Class7482.method23141());
                final double[] array = { 0.549, 0.625 };
                this.field15931 = array[Math.min(this.field15930, array.length - 1)];
                if (this.field15930 < array.length) {
                    ++this.field15930;
                }
                Class7482.method23149(class5717, this.field15931);
                this.field15932 = Class7482.method23144()[0];
                Class9274.method34209("§6" + this.field15931);
            }
            else if (this.field15931 > 0.0) {
                if (this.field15930 > 0) {
                    ++this.field15929;
                    if (this.field15929 != 1) {
                        if (this.field15929 != 11) {
                            final double[] array2 = { 0.98, 0.98 };
                            double d = 0.98;
                            if (this.field15930 - 1 < array2.length) {
                                d = array2[this.field15930 - 1];
                            }
                            this.field15931 *= d;
                            Class9274.method34209("§8" + d);
                        }
                        else {
                            final double[] array3 = { 0.999, 0.999 };
                            double d2 = 0.98;
                            if (this.field15930 - 1 < array3.length) {
                                d2 = array3[this.field15930 - 1];
                            }
                            this.field15931 *= d2;
                            Class9274.method34209("§5" + d2);
                        }
                    }
                    else {
                        final double[] array4 = { 0.3686, 0.3688 };
                        if (this.field15930 - 1 >= array4.length) {
                            this.field15931 = 0.28;
                        }
                        else {
                            this.field15931 = array4[this.field15930 - 1];
                        }
                        Class9274.method34209("§2" + array4[this.field15930 - 1]);
                    }
                    Class7482.method23149(class5717, this.field15931);
                }
            }
        }
    }
}
