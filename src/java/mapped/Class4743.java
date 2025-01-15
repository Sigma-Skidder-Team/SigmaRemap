// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4743 extends Class4712<Class818, Class5930<Class818>>
{
    private static final Class1932 field20363;
    
    public Class4743(final Class8551 class8551) {
        super(class8551, new Class5930(), 0.3f);
    }
    
    public Class1932 method14072(final Class818 class818) {
        return Class4743.field20363;
    }
    
    public float method14073(final Class818 class818, final float n) {
        return (Class9546.method35638(Class9546.method35700(n, class818.field4384, class818.field4381)) + 1.0f) * Class9546.method35700(n, class818.field4383, class818.field4382);
    }
    
    static {
        field20363 = new Class1932("textures/entity/chicken.png");
    }
}
