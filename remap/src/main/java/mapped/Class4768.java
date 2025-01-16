// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4768<T extends Class846> extends Class4712<T, Class5880<T>>
{
    private static final ResourceLocation field20395;
    
    public Class4768(final Class8551 class8551) {
        super(class8551, new Class5880(), 0.8f);
        this.method13978(new Class1840<T, Class5880<T>>(this));
    }
    
    public float method14112(final T t) {
        return 180.0f;
    }
    
    public ResourceLocation method14113(final T t) {
        return Class4768.field20395;
    }
    
    static {
        field20395 = new ResourceLocation("textures/entity/spider/spider.png");
    }
}
