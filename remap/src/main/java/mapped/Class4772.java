// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4772 extends Class4712<Class853, Class5871<Class853>>
{
    private static final Class1932 field20400;
    
    public Class4772(final Class8551 class8551) {
        super(class8551, new Class5871(16), 0.25f);
        this.method13978((Class1799<Class853, Class5871<Class853>>)new Class1843((Class4778<Class511, Class5871<Class511>>)this));
    }
    
    public void method14123(final Class853 class853, final float n, final float n2, final Class7351 class854, final Class7807 class855, final int n3) {
        this.field20284 = 0.25f * class853.method5130();
        super.method14006(class853, n, n2, class854, class855, n3);
    }
    
    public void method14124(final Class853 class853, final Class7351 class854, final float n) {
        class854.method22565(0.999f, 0.999f, 0.999f);
        class854.method22564(0.0, 0.0010000000474974513, 0.0);
        final float n2 = (float)class853.method5130();
        final float n3 = 1.0f / (Class9546.method35700(n, class853.field4559, class853.field4558) / (n2 * 0.5f + 1.0f) + 1.0f);
        class854.method22565(n3 * n2, 1.0f / n3 * n2, n3 * n2);
    }
    
    public Class1932 method14125(final Class853 class853) {
        return Class4772.field20400;
    }
    
    static {
        field20400 = new Class1932("textures/entity/slime/slime.png");
    }
}
