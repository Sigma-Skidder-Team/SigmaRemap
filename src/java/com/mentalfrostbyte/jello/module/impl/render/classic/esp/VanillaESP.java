package com.mentalfrostbyte.jello.module.impl.render.classic.esp;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import mapped.Class2258;
import mapped.ColorUtils;
import net.minecraft.entity.Entity;

public class VanillaESP extends Module {
    public VanillaESP() {
        super(ModuleCategory.RENDER, "Vanilla", "Draws a line arround players");
    }

    @EventTarget
    public void method16625(TickEvent var1) {
        if (this.isEnabled()) {
            for (Entity var5 : mc.world.method6835()) {
                if (!Client.getInstance().getCombatManager().method29346(var5)) {
                    boolean var6 = ColorUtils.method17744(var5) == Class2258.field14690 && this.access().getBooleanValueFromSetttingName("Show Players");
                    boolean var7 = ColorUtils.method17744(var5) == Class2258.field14689 && this.access().getBooleanValueFromSetttingName("Show Mobs");
                    boolean var8 = ColorUtils.method17744(var5) == Class2258.field14691 && this.access().getBooleanValueFromSetttingName("Show Passives");
                    boolean var9 = !var5.isInvisible() || this.access().getBooleanValueFromSetttingName("Show Invisibles");
                    var5.setGlowing((var7 || var6 || var8) && var9 && var5 != mc.player);
                }
            }
        }
    }

    @Override
    public void onDisable() {
        for (Entity var4 : mc.world.method6835()) {
            var4.setGlowing(false);
        }
    }
}
