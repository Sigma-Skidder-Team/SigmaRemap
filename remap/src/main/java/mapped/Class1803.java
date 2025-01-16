// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1803 extends Class1799<Class800, Class5926<Class800>>
{
    private static final ResourceLocation field9971;
    private final Class5926<Class800> field9972;
    
    public Class1803(final Class4778<Class800, Class5926<Class800>> class4778) {
        super(class4778);
        this.field9972 = new Class5926<Class800>(0.01f);
    }
    
    public void method6563(final MatrixStack class7351, final IRenderTypeBuffer class7352, final int n, final Class800 class7353, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        if (class7353.method4480()) {
            final float[] method815 = class7353.method4613().method815();
            Class1799.method6557(((Class1799<T, Class5845<Class800>>)this).method6559(), this.field9972, Class1803.field9971, class7351, class7352, n, class7353, n2, n3, n5, n6, n7, n4, method815[0], method815[1], method815[2]);
        }
    }
    
    static {
        field9971 = new ResourceLocation("textures/entity/cat/cat_collar.png");
    }
}
