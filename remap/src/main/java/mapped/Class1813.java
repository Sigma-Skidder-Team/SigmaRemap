// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1813 extends Class1799<Class801, Class5842<Class801>>
{
    private static final ResourceLocation field9984;
    private final Class5842<Class801> field9985;
    
    public Class1813(final Class4778<Class801, Class5842<Class801>> class4778) {
        super(class4778);
        this.field9985 = new Class5842<Class801>(0.5f);
    }
    
    public void method6574(final MatrixStack class7351, final IRenderTypeBuffer class7352, final int n, final Class801 class7353, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        if (class7353.method4625()) {
            this.method6559().method17569(this.field9985);
            this.field9985.method17558(class7353, n2, n3, n4);
            this.field9985.method17557(class7353, n2, n3, n5, n6, n7);
            this.field9985.method17564(class7351, class7352.method25214(Class6332.method18770(Class1813.field9984)), n, Class1904.field10335, 1.0f, 1.0f, 1.0f, 1.0f);
        }
    }
    
    static {
        field9984 = new ResourceLocation("textures/entity/pig/pig_saddle.png");
    }
}
