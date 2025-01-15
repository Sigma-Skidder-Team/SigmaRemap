// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class6324 extends Class6323
{
    private final float field25319;
    private final float field25320;
    
    public Class6324(final float field25319, final float field25320) {
        super("offset_texturing", () -> {
            Class8726.method30057(5890);
            Class8726.method30059();
            Class8726.method30058();
            Class8726.method30065(n, n2, 0.0f);
            Class8726.method30057(5888);
            return;
        }, () -> {
            Class8726.method30057(5890);
            Class8726.method30060();
            Class8726.method30057(5888);
            return;
        });
        this.field25319 = field25319;
        this.field25320 = field25320;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final Class6324 class6324 = (Class6324)o;
            return Float.compare(class6324.field25319, this.field25319) == 0 && Float.compare(class6324.field25320, this.field25320) == 0;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return Class7827.method25281(this.field25319, this.field25320);
    }
}
