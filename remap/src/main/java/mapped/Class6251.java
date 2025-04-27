// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6251 implements Class6250
{
    private static String[] field25097;
    private final int field25098;
    
    public Class6251(final int field25098) {
        this.field25098 = field25098;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof Class6251 && ((Class6251)o).field25098 == this.field25098;
    }
    
    @Override
    public int hashCode() {
        return this.field25098;
    }
}
