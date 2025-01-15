// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6252 implements Class6250
{
    private static String[] field25099;
    private int field25100;
    
    public Class6252(final int field25100) {
        this.field25100 = field25100;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof Class6252 && ((Class6252)o).field25100 == this.field25100;
    }
    
    @Override
    public int hashCode() {
        return this.field25100;
    }
}
