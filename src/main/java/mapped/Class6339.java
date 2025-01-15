// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6339 extends Class6322
{
    private final boolean field25353;
    
    public Class6339(final boolean field25353) {
        super("shade_model", () -> Class8726.method30045(b ? 7425 : 7424), () -> Class8726.method30045(7424));
        this.field25353 = field25353;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.field25353 == ((Class6339)o).field25353);
    }
    
    @Override
    public int hashCode() {
        return Boolean.hashCode(this.field25353);
    }
}
