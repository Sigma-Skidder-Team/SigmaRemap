// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4753 extends Class4746<Class843, Class5861>
{
    private static final Class1932 field20375;
    private static final Class1932 field20376;
    
    public Class4753(final Class8551 class8551) {
        super(class8551, new Class5861(), 0.3f);
    }
    
    public int method14088(final Class843 class843, final float n) {
        return 15;
    }
    
    public Class1932 method14089(final Class843 class843) {
        return class843.method5041() ? Class4753.field20376 : Class4753.field20375;
    }
    
    public void method14090(final Class843 class843, final Class7351 class844, final float n) {
        class844.method22565(0.4f, 0.4f, 0.4f);
    }
    
    static {
        field20375 = new Class1932("textures/entity/illager/vex.png");
        field20376 = new Class1932("textures/entity/illager/vex_charging.png");
    }
}
