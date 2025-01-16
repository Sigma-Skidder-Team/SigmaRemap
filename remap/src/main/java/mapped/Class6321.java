// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6321 extends Class6322
{
    private final float field25273;
    
    public Class6321(final float field25273) {
        super("alpha", () -> {
            if (n <= 0.0f) {
                RenderSystem.disableAlphaTest();
            }
            else {
                RenderSystem.enableAlphaTest();
                RenderSystem.method30000(516, n);
            }
            return;
        }, () -> {
            RenderSystem.disableAlphaTest();
            RenderSystem.method30118();
            return;
        });
        this.field25273 = field25273;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && super.equals(o) && this.field25273 == ((Class6321)o).field25273);
    }
    
    @Override
    public int hashCode() {
        return Class7827.method25280(super.hashCode(), this.field25273);
    }
}
