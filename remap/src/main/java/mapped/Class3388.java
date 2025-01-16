// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;

public class Class3388 extends Module
{
    public Class3388(final Category class8013, final String s, final String s2) {
        super(class8013, s, s2);
    }
    
    @Override
    public void method9879() {
        ("op " + Class3388.mc.player.getName()).replace("&", "§");
        this.onDisable();
    }
}
