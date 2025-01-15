// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

public class Class7542 implements Class7543
{
    private static String[] field29923;
    public static final Class7543 field29924;
    private final boolean field29925;
    private final double field29926;
    private final Class3820 field29927;
    
    public Class7542(final boolean field29925, final double field29926, final Class3820 field29927) {
        this.field29925 = field29925;
        this.field29926 = field29926;
        this.field29927 = field29927;
    }
    
    @Deprecated
    public Class7542(final Entity class399) {
        this(class399.method1813(), class399.method1941(), (class399 instanceof Class511) ? ((Class511)class399).method2713().method27622() : Class7739.field30754);
    }
    
    @Override
    public boolean method23627(final Class3820 class3820) {
        return this.field29927 == class3820;
    }
    
    @Override
    public boolean method23628() {
        return this.field29925;
    }
    
    @Override
    public boolean method23626(final Class7702 class7702, final BlockPos class7703, final boolean b) {
        return this.field29926 > class7703.getY() + class7702.method24536(Axis.Y) - 9.999999747378752E-6;
    }
    
    static {
        field29924 = new Class7541(false, -1.7976931348623157E308, Class7739.field30754);
    }
}
