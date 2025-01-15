// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7802 extends Class7799
{
    private static String[] field31966;
    public final Class8797 field31967;
    public final boolean field31968;
    
    public Class7802(final Class8797 field31967, final boolean field31968) {
        this.field31967 = field31967;
        this.field31968 = field31968;
    }
    
    @Override
    public boolean method25201(final Class8797 class8797) {
        return this.field31968 ? (class8797.method30691(this.field31967) == 1.0) : (class8797.method30691(this.field31967) == 0.0);
    }
    
    @Override
    public double method25202(final Class8797 class8797) {
        return this.field31967.method30689(class8797);
    }
}
