// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.mods.Module;

import java.util.Comparator;

public class ModuleNameComparator implements Comparator<Module>
{

    @Override
    public int compare(final Module mod1, final Module mod2) {
        return mod1.getFormattedName().compareTo(mod2.getFormattedName());
    }
}
