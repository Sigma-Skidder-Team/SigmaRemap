// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6334 extends Class6322
{
    private static String[] field25351;
    private final boolean field25352;
    
    public Class6334(final String s, final Runnable runnable, final Runnable runnable2, final boolean field25352) {
        super(s, runnable, runnable2);
        this.field25352 = field25352;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.field25352 == ((Class6334)o).field25352);
    }
    
    @Override
    public int hashCode() {
        return Boolean.hashCode(this.field25352);
    }
}
