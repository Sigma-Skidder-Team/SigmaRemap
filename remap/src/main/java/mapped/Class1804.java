// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1804<T extends Class827> extends Class1799<T, Class5864<T>>
{
    private static final ResourceLocation field9973;
    private final Class5864<T> field9974;
    
    public Class1804(final Class4778<T, Class5864<T>> class4778) {
        super(class4778);
        this.field9974 = new Class5864<T>(0.25f, 0.0f, 64, 64);
    }
    
    public void method6564(final MatrixStack class7351, final IRenderTypeBuffer class7352, final int n, final T t, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        Class1799.method6557(this.method6559(), this.field9974, Class1804.field9973, class7351, class7352, n, t, n2, n3, n5, n6, n7, n4, 1.0f, 1.0f, 1.0f);
    }
    
    static {
        field9973 = new ResourceLocation("textures/entity/zombie/drowned_outer_layer.png");
    }
}
