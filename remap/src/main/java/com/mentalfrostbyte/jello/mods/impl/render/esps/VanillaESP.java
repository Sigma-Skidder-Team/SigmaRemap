// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.render.esps;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.Class2068;
import mapped.Class5743;
import mapped.ColorUtils;
import mapped.EventListener;
import net.minecraft.entity.Entity;

import java.util.Iterator;

public class VanillaESP extends Module
{
    public VanillaESP() {
        super(Category.RENDER, "Vanilla", "Draws a line arround players");
    }
    
    @EventListener
    public void method9992(final Class5743 class5743) {
        if (this.isEnabled()) {
            for (final Entity class5744 : VanillaESP.mc.world.method6806()) {
                if (!Client.getInstance().method35191().method31751(class5744)) {
                    final boolean b = ColorUtils.method19174(class5744) == Class2068.field11839 && this.method9914().method9883("Show Players");
                    final boolean b2 = ColorUtils.method19174(class5744) == Class2068.field11838 && this.method9914().method9883("Show Mobs");
                    final boolean b3 = ColorUtils.method19174(class5744) == Class2068.field11840 && this.method9914().method9883("Show Passives");
                    final boolean b4 = !class5744.method1823() || this.method9914().method9883("Show Invisibles");
                    Label_0222: {
                        if (!b2) {
                            if (!b) {
                                if (!b3) {
                                    break Label_0222;
                                }
                            }
                        }
                        if (b4) {
                            if (class5744 != VanillaESP.mc.player) {
                                class5744.method1822(true);
                                continue;
                            }
                        }
                    }
                    class5744.method1822(false);
                }
            }
        }
    }
    
    @Override
    public void onDisable() {
        final Iterator<Entity> iterator = VanillaESP.mc.world.method6806().iterator();
        while (iterator.hasNext()) {
            iterator.next().method1822(false);
        }
    }
}
