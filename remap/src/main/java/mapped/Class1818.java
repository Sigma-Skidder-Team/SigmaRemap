// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1818<T extends Class759 & Class768, M extends Class5845<T>> extends Class1799<T, M>
{
    private static final ResourceLocation field9997;
    private final Class5854<T> field9998;
    
    public Class1818(final Class4778<T, M> class4778) {
        super(class4778);
        this.field9998 = new Class5854<T>(0.25f, true);
    }
    
    public void method6583(final MatrixStack class7351, final IRenderTypeBuffer class7352, final int n, final T t, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        Class1799.method6557(this.method6559(), this.field9998, Class1818.field9997, class7351, class7352, n, t, n2, n3, n5, n6, n7, n4, 1.0f, 1.0f, 1.0f);
    }
    
    static {
        field9997 = new ResourceLocation("textures/entity/skeleton/stray_overlay.png");
    }
}
