// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1841 extends Class1799<Class815, Class5899<Class815>>
{
    private static final ResourceLocation[] field10023;
    private static final ResourceLocation field10024;
    private final Class5899<Class815> field10025;
    
    public Class1841(final Class4778<Class815, Class5899<Class815>> class4778) {
        super(class4778);
        this.field10025 = new Class5899<Class815>(0.5f);
    }
    
    public void method6607(final MatrixStack class7351, final IRenderTypeBuffer class7352, final int n, final Class815 class7353, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        final Class181 method4792 = class7353.method4792();
        ResourceLocation field10024;
        if (method4792 == null) {
            if (!class7353.method4784()) {
                return;
            }
            field10024 = Class1841.field10024;
        }
        else {
            field10024 = Class1841.field10023[method4792.method813()];
        }
        this.method6559().method17569(this.field10025);
        this.field10025.method17638(class7353, n2, n3, n5, n6, n7);
        this.field10025.method17564(class7351, class7352.method25214(Class6332.method18770(field10024)), n, Class1904.field10335, 1.0f, 1.0f, 1.0f, 1.0f);
    }
    
    static {
        field10023 = new ResourceLocation[] { new ResourceLocation("textures/entity/llama/decor/white.png"), new ResourceLocation("textures/entity/llama/decor/orange.png"), new ResourceLocation("textures/entity/llama/decor/magenta.png"), new ResourceLocation("textures/entity/llama/decor/light_blue.png"), new ResourceLocation("textures/entity/llama/decor/yellow.png"), new ResourceLocation("textures/entity/llama/decor/lime.png"), new ResourceLocation("textures/entity/llama/decor/pink.png"), new ResourceLocation("textures/entity/llama/decor/gray.png"), new ResourceLocation("textures/entity/llama/decor/light_gray.png"), new ResourceLocation("textures/entity/llama/decor/cyan.png"), new ResourceLocation("textures/entity/llama/decor/purple.png"), new ResourceLocation("textures/entity/llama/decor/blue.png"), new ResourceLocation("textures/entity/llama/decor/brown.png"), new ResourceLocation("textures/entity/llama/decor/green.png"), new ResourceLocation("textures/entity/llama/decor/red.png"), new ResourceLocation("textures/entity/llama/decor/black.png") };
        field10024 = new ResourceLocation("textures/entity/llama/decor/trader_llama.png");
    }
}
