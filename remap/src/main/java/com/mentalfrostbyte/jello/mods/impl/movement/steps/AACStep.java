// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.steps;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.*;

public class AACStep extends Module
{
    public AACStep() {
        super(Category.MOVEMENT, "AAC", "Step for AAC");
    }
    
    @EventListener
    @Class6759
    private void method10530(final Class5745 class5745) {
        if (!this.method9906() || class5745.method16962()) {
            return;
        }
        final double method17049 = class5745.method17049();
        if (ColorUtils.method19160(AACStep.mc.player, 1.0E-4f)) {
            if (!Class7482.method23142()) {
                if (method17049 >= 0.625) {
                    final double field2395 = AACStep.mc.player.posX;
                    final double field2396 = AACStep.mc.player.posY;
                    final double field2397 = AACStep.mc.player.posZ;
                    if (method17049 < 1.1) {
                        final double[] array = { 0.41999998688698 * method17049, 0.754 * method17049 };
                        for (int length = array.length, i = 0; i < length; ++i) {
                            AACStep.mc.method5269().method17292(new Class4354(field2395, field2396 + array[i], field2397, false));
                        }
                    }
                }
            }
            return;
        }
        class5745.method16961(true);
    }
    
    @EventListener
    private void method10531(final Class5738 class5738) {
        if (this.method9906() && AACStep.mc.player != null) {
            if (!class5738.method17027()) {
                AACStep.mc.player.stepHeight = 1.0f;
            }
            else {
                AACStep.mc.player.stepHeight = 0.5f;
            }
        }
    }
}
