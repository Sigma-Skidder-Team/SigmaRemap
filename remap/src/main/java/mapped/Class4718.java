// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4718 extends Class4712<Class815, Class5899<Class815>>
{
    private static final ResourceLocation[] field20320;
    
    public Class4718(final Class8551 class8551) {
        super(class8551, new Class5899(0.0f), 0.7f);
        this.method13978(new Class1841(this));
    }
    
    public ResourceLocation method14025(final Class815 class815) {
        return Class4718.field20320[class815.method4788()];
    }
    
    static {
        field20320 = new ResourceLocation[] { new ResourceLocation("textures/entity/llama/creamy.png"), new ResourceLocation("textures/entity/llama/white.png"), new ResourceLocation("textures/entity/llama/brown.png"), new ResourceLocation("textures/entity/llama/gray.png") };
    }
}
