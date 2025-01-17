// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.impl.gui.ActiveMods;

import java.util.Comparator;

public class Class4466 implements Comparator<Module>
{
    private static String[] field19823;
    public final /* synthetic */ ActiveMods field19824;
    
    public Class4466(final ActiveMods field19824) {
        this.field19824 = field19824;
    }
    
    @Override
    public int compare(final Module class3167, final Module class3168) {
        final int method23505 = ClientFonts.JelloLight20.getWidth(class3167.getName());
        final int method23506 = ClientFonts.JelloLight20.getWidth(class3168.getName());
        if (method23505 > method23506) {
            return -1;
        }
        if (method23505 != method23506) {
            return 1;
        }
        return 0;
    }
}
