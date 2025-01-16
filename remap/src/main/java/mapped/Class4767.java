// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4767 extends Class4712<Class821, Class5856<Class821>>
{
    private static final ResourceLocation field20394;
    
    public Class4767(final Class8551 class8551) {
        super(class8551, new Class5856(0.0f), 0.5f);
        this.method13978(new Class1831<Class821, Class5856<Class821>>(this));
        this.method13978(new Class1827<Class821, Class5856<Class821>>(this));
    }
    
    public ResourceLocation method14110(final Class821 class821) {
        return Class4767.field20394;
    }
    
    public void method14111(final Class821 class821, final Class7351 class822, final float n) {
        class822.method22565(0.9375f, 0.9375f, 0.9375f);
    }
    
    static {
        field20394 = new ResourceLocation("textures/entity/wandering_trader.png");
    }
}
