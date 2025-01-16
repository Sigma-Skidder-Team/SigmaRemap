// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4707 extends Class4703<Class863>
{
    private static final ResourceLocation field20295;
    private final Class5892<Class863> field20296;
    
    public Class4707(final Class8551 class8551) {
        super(class8551);
        this.field20296 = new Class5892<Class863>();
    }
    
    public void method13971(final Class863 class863, final float n, final float n2, final MatrixStack class864, final IRenderTypeBuffer class865, final int n3) {
        class864.method22567();
        class864.method22565(-1.0f, -1.0f, 1.0f);
        this.field20296.method17557(class863, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.field20296.method17564(class864, class865.method25214(this.field20296.method17647(Class4707.field20295)), n3, Class1904.field10335, 1.0f, 1.0f, 1.0f, 1.0f);
        class864.method22568();
        super.method13951(class863, n, n2, class864, class865, n3);
    }
    
    public ResourceLocation method13972(final Class863 class863) {
        return Class4707.field20295;
    }
    
    static {
        field20295 = new ResourceLocation("textures/entity/lead_knot.png");
    }
}
