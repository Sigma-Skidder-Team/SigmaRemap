// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.mods.Module;

import java.util.Comparator;

public class Class4450 implements Comparator<Module>
{
    private static String[] field19794;
    public final /* synthetic */ ModuleManager field19795;
    
    public Class4450(final ModuleManager field19795) {
        this.field19795 = field19795;
    }
    
    @Override
    public int compare(final Module class3167, final Module class3168) {
        return class3167.getFormattedName().compareTo(class3168.getFormattedName());
    }
}
