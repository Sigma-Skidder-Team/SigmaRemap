package com.mentalfrostbyte.jello.module.impl.combat.criticals;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.event.priority.HigherPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.ModuleWithModuleSettings;
import com.mentalfrostbyte.jello.module.impl.combat.AntiKnockback;

public class MinemenCriticals extends Module {
    private int field23966;

    public MinemenCriticals() {
        super(ModuleCategory.COMBAT, "Minemen", "Criticals for Anti Gaming Chair");
    }

    @Override
    public void onEnable() {
        this.field23966 = 0;
    }

    @EventTarget
    @HigherPriority
    private void method16861(EventUpdate var1) {
        if (var1.isPre()) {
            ModuleWithModuleSettings var4 = (ModuleWithModuleSettings) Client.getInstance().getModuleManager().getModuleByClass(AntiKnockback.class);
            if (!var4.isEnabled() || !var4.getStringSettingValueByName("Type").equalsIgnoreCase("Minemen")) {
                if (!mc.player.onGround) {
                    this.field23966 = 0;
                } else {
                    if (this.field23966 > 0) {
                        if (this.field23966 % 2 != 0) {
                            var1.setY(var1.getY() - 1.0E-14);
                        }

                        var1.setGround(false);
                    }

                    this.field23966++;
                    var1.method13908(true);
                }

                if (mc.playerController.getIsHittingBlock() && mc.player.onGround) {
                    this.field23966 = 0;
                    var1.setY(mc.player.getPosY());
                    var1.setGround(true);
                }
            }
        }
    }
}
