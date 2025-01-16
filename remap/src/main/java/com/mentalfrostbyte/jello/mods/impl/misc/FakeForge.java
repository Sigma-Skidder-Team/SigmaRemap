// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.misc;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.TextInputSetting;

public class FakeForge extends Module
{
    public FakeForge() {
        super(Category.MISC, "FakeForge", "Fakes client mod type on connection");
        this.addSetting(new TextInputSetting("Client Brand", "Client brand to set", "fml,forge"));
    }
}
