// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6328 extends Class6322
{
    private final int field25325;
    
    public Class6328(final int field25325) {
        super("depth_test", () -> {
            if (n != 519) {
                Class8726.method30008();
                Class8726.method30009(n);
            }
            return;
        }, () -> {
            if (n2 != 519) {
                Class8726.method30007();
                Class8726.method30009(515);
            }
            return;
        });
        this.field25325 = field25325;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.field25325 == ((Class6328)o).field25325);
    }
    
    @Override
    public int hashCode() {
        return Integer.hashCode(this.field25325);
    }
}