// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

import java.util.Comparator;

public class Class4443 implements Comparator<Entity>
{
    private static String[] field19781;
    public final /* synthetic */ Class3232 field19782;
    
    public Class4443(final Class3232 field19782) {
        this.field19782 = field19782;
    }
    
    @Override
    public int compare(final Entity class399, final Entity class400) {
        return (Class3232.method10194().field4684.method1732(class399) <= Class3232.method10195().field4684.method1732(class400)) ? -1 : 1;
    }
}