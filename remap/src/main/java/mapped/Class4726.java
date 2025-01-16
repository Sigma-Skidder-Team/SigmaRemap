// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4726<T extends Class770> extends Class4723<T>
{
    private static final ResourceLocation field20328;
    
    public Class4726(final Class8551 class8551) {
        super(class8551, new Class5851(0.0f, 0.0f, 64, 64), 0.5f);
        this.method13978((Class1799<T, Class5851<T>>)new Class1826(this, this));
    }
    
    public ResourceLocation method14037(final T t) {
        return Class4726.field20328;
    }
    
    static {
        field20328 = new ResourceLocation("textures/entity/illager/evoker.png");
    }
}
