// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.steps;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import mapped.*;

public class NCPStep extends Module
{
    public NCPStep() {
        super(Category.MOVEMENT, "NCP", "Step for NCP");
        this.addSetting(new NumberSetting("Maximum heigh", "Maximum heigh", 2.0f, Float.class, 1.0f, 2.5f, 0.5f));
    }
    
    @EventListener
    @LowerPriority
    private void method10532(final Class5745 class5745) {
        if (!this.isEnabled() || class5745.isCancelled()) {
            return;
        }
        final double method17049 = class5745.method17049();
        if (ColorUtils.method19160(NCPStep.mc.player, 1.0E-4f) && !MovementUtil.method23142()) {
            if (method17049 >= 0.625) {
                final double field2395 = NCPStep.mc.player.posX;
                final double field2396 = NCPStep.mc.player.posY;
                final double field2397 = NCPStep.mc.player.posZ;
                if (method17049 >= 1.1) {
                    if (method17049 >= 1.6) {
                        if (method17049 >= 2.1) {
                            final double[] array = { 0.425, 0.821, 0.699, 0.599, 1.022, 1.372, 1.652, 1.869, 2.019, 1.907 };
                            for (int length = array.length, i = 0; i < length; ++i) {
                                NCPStep.mc.method5269().method17292(new Class4354(field2395, field2396 + array[i], field2397, false));
                            }
                        }
                        else {
                            for (final double n : new double[] { 0.425, 0.821, 0.699, 0.599, 1.022, 1.372, 1.652, 1.869 }) {
                                if (n - 0.027 <= method17049) {
                                    NCPStep.mc.method5269().method17292(new Class4354(field2395, field2396 + n, field2397, false));
                                }
                            }
                        }
                    }
                    else {
                        final double[] array3 = { 0.41999998, 0.7531999805212, 1.01, 1.093, 1.015 };
                        for (int length3 = array3.length, k = 0; k < length3; ++k) {
                            NCPStep.mc.method5269().method17292(new Class4354(field2395, field2396 + array3[k], field2397, false));
                        }
                    }
                }
                else {
                    final double[] array4 = { 0.41999998688698 * method17049, 0.7531999805212 * method17049 };
                    for (int length4 = array4.length, l = 0; l < length4; ++l) {
                        NCPStep.mc.method5269().method17292(new Class4354(field2395, field2396 + array4[l], field2397, false));
                    }
                }
            }
            return;
        }
        class5745.setCancelled(true);
    }
    
    @EventListener
    private void method10533(final Class5738 class5738) {
        if (this.isEnabled() && NCPStep.mc.player != null) {
            if (!class5738.method17027()) {
                NCPStep.mc.player.stepHeight = this.getNumberSettingValueByName("Maximum heigh");
            }
            else {
                NCPStep.mc.player.stepHeight = 0.5f;
            }
        }
    }
}
