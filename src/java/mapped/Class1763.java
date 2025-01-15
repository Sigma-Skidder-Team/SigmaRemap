// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1763 extends Class1760
{
    private static String[] field9812;
    public final Class1668 field9813;
    private final Class1681 field9814;
    private final String field9815;
    private final String field9816;
    
    public Class1763(final Class1668 field9813, final String field9814, final String field9815) {
        this.field9813 = field9813;
        this.field9815 = field9814;
        this.field9816 = field9815;
        this.field9814 = Class8753.method30275(new Class1693(this, field9813.method5883(1), field9813));
    }
    
    @Override
    public Class8991 method6282() {
        return (this.field9815 == null) ? null : Class8991.method32077(this.field9815);
    }
    
    @Override
    public long method6283() {
        try {
            return (this.field9816 != null) ? Long.parseLong(this.field9816) : -1L;
        }
        catch (final NumberFormatException ex) {
            return -1L;
        }
    }
    
    @Override
    public Class1681 method6285() {
        return this.field9814;
    }
}
