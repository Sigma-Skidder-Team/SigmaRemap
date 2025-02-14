package com.mentalfrostbyte.jello.module.impl.combat;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.ClientMode;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.ModuleWithModuleSettings;
import com.mentalfrostbyte.jello.module.impl.combat.antikb.*;

public class AntiKnockback extends ModuleWithModuleSettings {
    public AntiKnockback() {
        super(
                ModuleCategory.COMBAT,
                "AntiKnockBack",
                "Prevents you from taking knockback",
                new BasicAntiKB(),
                new AACAntiKB(),
                new DelayAntiKB(),
                new SpartanAntiKB(),
                new MinemenAntiKB(),
                new GommeAntiKB()
        );
    }

    @Override
    public String getSuffix() {
        return Client.getInstance().clientMode != ClientMode.CLASSIC ? super.getSuffix() : "AntiVelocity";
    }
}
