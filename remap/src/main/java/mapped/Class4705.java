// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public class Class4705 extends Class4703<Class421>
{
    private static final Class1932 field20290;
    private static final Class1932 field20291;
    private final Class5918 field20292;
    
    public Class4705(final Class8551 class8551) {
        super(class8551);
        this.field20292 = new Class5918();
    }
    
    public int method13966(final Class421 class421, final float n) {
        return 15;
    }
    
    public void method13967(final Class421 class421, final float n, final float n2, final Class7351 class422, final Class7807 class423, final int n3) {
        class422.method22567();
        class422.method22565(-1.0f, -1.0f, 1.0f);
        final float method35707 = MathHelper.method35707(class421.prevRotationYaw, class421.rotationYaw, n2);
        final float method35708 = MathHelper.method35700(n2, class421.prevRotationPitch, class421.rotationPitch);
        final Class4150 method35709 = class423.method25214(this.field20292.method17647(this.method13968(class421)));
        this.field20292.method17790(0.0f, method35707, method35708);
        this.field20292.method17564(class422, method35709, n3, Class1904.field10335, 1.0f, 1.0f, 1.0f, 1.0f);
        class422.method22568();
        super.method13951(class421, n, n2, class422, class423, n3);
    }
    
    public Class1932 method13968(final Class421 class421) {
        return class421.method2036() ? Class4705.field20290 : Class4705.field20291;
    }
    
    static {
        field20290 = new Class1932("textures/entity/wither/wither_invulnerable.png");
        field20291 = new Class1932("textures/entity/wither/wither.png");
    }
}
