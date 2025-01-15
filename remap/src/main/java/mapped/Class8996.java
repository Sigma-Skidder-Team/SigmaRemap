// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class8996
{
    private static String[] field37953;
    private final Class6789 field37954;
    private final Class9429 field37955;
    
    private Class8996(final Class6789 field37954, final Class9429 field37955) {
        this.field37954 = field37954;
        this.field37955 = field37955;
    }
    
    public Class6789 method32111() {
        return this.field37954;
    }
    
    public Class9429 method32112() {
        return this.field37955;
    }
    
    @Override
    public String toString() {
        return this.field37954.toString() + this.field37955.toString();
    }
}
