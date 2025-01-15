// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4750 extends Class4749
{
    private static final Class1932 field20372;
    
    public Class4750(final Class8551 class8551) {
        super(class8551);
    }
    
    public void method14085(final Class827 class827, final Class7351 class828, final float n) {
        class828.method22565(1.0625f, 1.0625f, 1.0625f);
        super.method13990(class827, class828, n);
    }
    
    @Override
    public Class1932 method14083(final Class827 class827) {
        return Class4750.field20372;
    }
    
    static {
        field20372 = new Class1932("textures/entity/zombie/husk.png");
    }
}
