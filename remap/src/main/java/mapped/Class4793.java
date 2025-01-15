// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public class Class4793 extends Class4703<Class403>
{
    public static final Class1932 field20434;
    private final Class5905 field20435;
    
    public Class4793(final Class8551 class8551) {
        super(class8551);
        this.field20435 = new Class5905();
    }
    
    public void method14177(final Class403 class403, final float n, final float n2, final Class7351 class404, final Class7807 class405, final int n3) {
        class404.method22567();
        class404.method22566(Vector3f.field38718.rotationDegrees(MathHelper.method35700(n2, class403.field2401, class403.field2399) - 90.0f));
        class404.method22566(Vector3f.ZP.rotationDegrees(MathHelper.method35700(n2, class403.field2402, class403.field2400) + 90.0f));
        this.field20435.method17564(class404, Class1796.method6532(class405, this.field20435.method17647(this.method14178(class403)), false, class403.method1991()), n3, Class1904.field10335, 1.0f, 1.0f, 1.0f, 1.0f);
        class404.method22568();
        super.method13951(class403, n, n2, class404, class405, n3);
    }
    
    public Class1932 method14178(final Class403 class403) {
        return Class4793.field20434;
    }
    
    static {
        field20434 = new Class1932("textures/entity/trident.png");
    }
}
