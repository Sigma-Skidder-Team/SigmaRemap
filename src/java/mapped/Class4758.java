// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4758 extends Class4712<Class761, Class5890<Class761>>
{
    private static final Class1932 field20381;
    private static final Class1932 field20382;
    
    public Class4758(final Class8551 class8551) {
        super(class8551, new Class5890(), 1.5f);
    }
    
    public Class1932 method14095(final Class761 class761) {
        return class761.method4222() ? Class4758.field20382 : Class4758.field20381;
    }
    
    public void method14096(final Class761 class761, final Class7351 class762, final float n) {
        class762.method22565(4.5f, 4.5f, 4.5f);
    }
    
    static {
        field20381 = new Class1932("textures/entity/ghast/ghast.png");
        field20382 = new Class1932("textures/entity/ghast/ghast_shooting.png");
    }
}
