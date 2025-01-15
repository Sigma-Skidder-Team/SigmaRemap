// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public class Class3886 extends Class3874
{
    private static String[] field17547;
    public static final Class7702 field17548;
    
    public Class3886(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public void method11850(final Class7096 class7096, final World class7097, final BlockPos class7098, final Entity class7099) {
        super.method11850(class7096, class7097, class7098, class7099);
        if (class7097 instanceof Class1849) {
            if (class7099 instanceof Class423) {
                class7097.method6691(new BlockPos(class7098), true, class7099);
            }
        }
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class3886.field17548;
    }
    
    @Override
    public boolean method11943(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098) {
        return class7097.method6702(class7098).method21779() == Class7558.field29976 || class7096.method21697() == Class8059.field33183;
    }
    
    static {
        field17548 = Class3833.method11778(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);
    }
}
