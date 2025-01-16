// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.impl.render.ActiveMods;

import java.util.Comparator;

public class Class4462 implements Comparator<Module>
{
    private static String[] field19816;
    public final /* synthetic */ ActiveMods field19817;
    
    public Class4462(final ActiveMods field19817) {
        this.field19817 = field19817;
    }
    
    @Override
    public int compare(final Module class3167, final Module class3168) {
        if (ActiveMods.method10494(this.field19817, class3167) > ActiveMods.method10494(this.field19817, class3168)) {
            return -1;
        }
        if (ActiveMods.method10494(this.field19817, class3167) >= ActiveMods.method10494(this.field19817, class3168)) {
            return class3167.getName2().compareTo(class3168.getName2());
        }
        return 1;
    }
}
