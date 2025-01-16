// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4744 extends Class4712<Class799, Class5922<Class799>>
{
    private static final ResourceLocation field20364;
    private static final ResourceLocation field20365;
    private static final ResourceLocation field20366;
    
    public Class4744(final Class8551 class8551) {
        super(class8551, new Class5922(), 0.5f);
        this.method13978(new Class1802(this));
    }
    
    public float method14074(final Class799 class799, final float n) {
        return class799.method4596();
    }
    
    public void method14075(final Class799 class799, final float n, final float n2, final Class7351 class800, final Class7807 class801, final int n3) {
        if (class799.method4592()) {
            final float n4 = class799.method1726() * class799.method4593(n2);
            ((Class5922)this.field20301).method17791(n4, n4, n4);
        }
        super.method14006(class799, n, n2, class800, class801, n3);
        if (class799.method4592()) {
            ((Class5922)this.field20301).method17791(1.0f, 1.0f, 1.0f);
        }
    }
    
    public ResourceLocation method14076(final Class799 class799) {
        if (!class799.method4480()) {
            return class799.method4597() ? Class4744.field20366 : Class4744.field20364;
        }
        return Class4744.field20365;
    }
    
    static {
        field20364 = new ResourceLocation("textures/entity/wolf/wolf.png");
        field20365 = new ResourceLocation("textures/entity/wolf/wolf_tame.png");
        field20366 = new ResourceLocation("textures/entity/wolf/wolf_angry.png");
    }
}
