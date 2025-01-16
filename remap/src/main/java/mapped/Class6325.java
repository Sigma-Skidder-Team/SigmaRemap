// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class6325 extends Class6323
{
    private final int field25321;
    
    public Class6325(final int field25321) {
        super("portal_texturing", () -> {
            Class8726.method30057(5890);
            Class8726.method30059();
            Class8726.method30058();
            Class8726.method30065(0.5f, 0.5f, 0.0f);
            Class8726.method30063(0.5f, 0.5f, 1.0f);
            Class8726.method30065(17.0f / n, (2.0f + n / 1.5f) * (Util.method27837() % 800000L / 800000.0f), 0.0f);
            Class8726.method30062((n * n * 4321.0f + n * 9.0f) * 2.0f, 0.0f, 0.0f, 1.0f);
            Class8726.method30063(4.5f - n / 4.0f, 4.5f - n / 4.0f, 1.0f);
            Class8726.method30110();
            Class8726.method30057(5888);
            Class8726.method30111();
            return;
        }, () -> {
            Class8726.method30057(5890);
            Class8726.method30060();
            Class8726.method30057(5888);
            Class8726.method30112();
            return;
        });
        this.field25321 = field25321;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.field25321 == ((Class6325)o).field25321);
    }
    
    @Override
    public int hashCode() {
        return Integer.hashCode(this.field25321);
    }
}
