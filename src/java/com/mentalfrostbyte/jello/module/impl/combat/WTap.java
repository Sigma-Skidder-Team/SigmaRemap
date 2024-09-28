package com.mentalfrostbyte.jello.module.impl.combat;

import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.ModuleWithModuleSettings;
import com.mentalfrostbyte.jello.module.impl.combat.wtap.LegitWTap;
import com.mentalfrostbyte.jello.module.impl.combat.wtap.NormalWTap;

public class WTap extends ModuleWithModuleSettings {
    public WTap() {
        super(ModuleCategory.COMBAT, "WTap", "Increase the knockback you give to players",
                new NormalWTap(), new LegitWTap());
    }
}
