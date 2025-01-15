// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4757 extends Class4712<Class824, Class5856<Class824>>
{
    private static final Class1932 field20380;
    
    public Class4757(final Class8551 class8551, final Class6580 class8552) {
        super(class8551, new Class5856(0.0f), 0.5f);
        this.method13978(new Class1831<Class824, Class5856<Class824>>(this));
        this.method13978(new Class1798<Class824, Class5856<Class824>>(this, class8552, "villager"));
        this.method13978(new Class1827<Class824, Class5856<Class824>>(this));
    }
    
    public Class1932 method14093(final Class824 class824) {
        return Class4757.field20380;
    }
    
    public void method14094(final Class824 class824, final Class7351 class825, final float n) {
        float n2 = 0.9375f;
        if (!class824.method2625()) {
            this.field20284 = 0.5f;
        }
        else {
            n2 *= 0.5;
            this.field20284 = 0.25f;
        }
        class825.method22565(n2, n2, n2);
    }
    
    static {
        field20380 = new Class1932("textures/entity/villager/villager.png");
    }
}
