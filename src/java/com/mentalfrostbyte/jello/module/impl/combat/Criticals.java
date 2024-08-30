package com.mentalfrostbyte.jello.module.impl.combat;

import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.ModuleWithModuleSettings;
import com.mentalfrostbyte.jello.module.impl.combat.criticals.*;

public class Criticals extends ModuleWithModuleSettings {
    public Criticals() {
        super(
                ModuleCategory.COMBAT,
                "Criticals",
                "Automatically does criticals without jumping",
                new MinisCriticals(),
                new PacketCriticals(),
                new NoGroundCriticals(),
                new HoverCriticals(),
                new MinemenCriticals(),
                new AAC4Criticals()
        );
    }
}
