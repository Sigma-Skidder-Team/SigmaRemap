// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.combat;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.ModuleWithSettings;
import com.mentalfrostbyte.jello.mods.impl.combat.criticals.*;

public class Criticals extends ModuleWithSettings
{
    public Criticals() {
        super(Category.COMBAT, "Criticals", "Automatically does criticals without jumping", new MinisCriticals(), new PacketCriticals(), new NoGroundCriticals(), new HoverCriticals(), new AAC4Criticals(), new AGCCriticals());
    }
}
