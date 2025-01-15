// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4029 extends Class4027
{
    private static String[] field18119;
    private final Class8819 field18122;
    
    public Class4029(final Class8819 field18122, final Class9288 class9288) {
        super(class9288);
        this.field18122 = field18122;
    }
    
    @Override
    public Class8819 method11783(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098) {
        return (class7096.method21772(Class4029.field18120) != Axis.Y) ? this.field17402 : this.field18122;
    }
}
