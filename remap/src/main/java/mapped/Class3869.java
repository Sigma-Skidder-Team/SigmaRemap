// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3869 extends Class3870
{
    private static String[] field17510;
    public static final Class7114<Class182> field17511;
    
    public Class3869(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public boolean method11798(final BlockState class7096, final Class7074 class7097) {
        final boolean method11798 = super.method11798(class7096, class7097);
        return (!method11798 || class7097.method21651().getItem() != this.method11704()) && method11798;
    }
    
    static {
        field17511 = Class3870.field17513;
    }
}
