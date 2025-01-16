// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.combat;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.ModuleWithSettings;
import com.mentalfrostbyte.jello.mods.impl.combat.antiknockbacks.AACAntiKnockBack;
import com.mentalfrostbyte.jello.mods.impl.combat.antiknockbacks.BasicAntiKnockBack;
import com.mentalfrostbyte.jello.mods.impl.combat.antiknockbacks.DelayAntiKnockBack;
import com.mentalfrostbyte.jello.mods.impl.combat.antiknockbacks.SpartanAntiKnockBack;
import mapped.Class2209;

public class AntiKnockBack extends ModuleWithSettings
{
    public AntiKnockBack() {
        super(Category.COMBAT, "AntiKnockBack", "Prevents you from taking knockback", new Module[] { new BasicAntiKnockBack(), new AACAntiKnockBack(), new DelayAntiKnockBack(), new SpartanAntiKnockBack() });
    }
    
    @Override
    public String getName2() {
        if (Client.method35173().method35209() != Class2209.field13465) {
            return super.getName2();
        }
        return "AntiVelocity";
    }
}
