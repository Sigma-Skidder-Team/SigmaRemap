// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.speeds;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import mapped.Class5717;
import mapped.Class7482;
import mapped.EventListener;

public class VanillaSpeed extends Module
{
    public VanillaSpeed() {
        super(Category.MOVEMENT, "Vanilla", "Vanilla speed");
        this.addSetting(new NumberSetting("Speed", "Speed value", 4.0f, Float.class, 1.0f, 10.0f, 0.1f));
    }
    
    @EventListener
    public void method10547(final Class5717 class5717) {
        if (this.isEnabled()) {
            Class7482.method23149(class5717, Class7482.method23136() * this.getNumberSettingValueByName("Speed"));
        }
    }
}
