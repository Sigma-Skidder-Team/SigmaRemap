// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4739 extends Class4712<Class793, Class5932<Class793>>
{
    private static final Class1932 field20355;
    
    public Class4739(final Class8551 class8551) {
        super(class8551, new Class5932(0.0f), 0.7f);
    }
    
    public void method14062(final Class793 class793, final float n, final float n2, final Class7351 class794, final Class7807 class795, final int n3) {
        if (class793.method2625()) {
            this.field20284 *= 0.5f;
        }
        super.method14006(class793, n, n2, class794, class795, n3);
    }
    
    public Class1932 method14063(final Class793 class793) {
        return Class4739.field20355;
    }
    
    static {
        field20355 = new Class1932("textures/entity/turtle/big_sea_turtle.png");
    }
}
