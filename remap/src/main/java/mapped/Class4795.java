// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Vector3f;

public class Class4795 extends Class4703<Class507>
{
    private static final Class1932 field20446;
    private final Class5897<Class507> field20447;
    
    public Class4795(final Class8551 class8551) {
        super(class8551);
        this.field20447 = new Class5897<Class507>();
    }
    
    public void method14186(final Class507 class507, final float n, final float n2, final Class7351 class508, final Class7807 class509, final int n3) {
        final float method2603 = class507.method2603(n2);
        if (method2603 != 0.0f) {
            float n4 = 2.0f;
            if (method2603 > 0.9f) {
                n4 *= (float)((1.0 - method2603) / 0.10000000149011612);
            }
            class508.method22567();
            class508.method22566(Vector3f.YP.rotationDegrees(90.0f - class507.rotationYaw));
            class508.method22565(-n4, -n4, n4);
            class508.method22564(0.0, -0.6259999871253967, 0.0);
            class508.method22565(0.5f, 0.5f, 0.5f);
            this.field20447.method17557(class507, method2603, 0.0f, 0.0f, class507.rotationYaw, class507.rotationPitch);
            this.field20447.method17564(class508, class509.method25214(this.field20447.method17647(Class4795.field20446)), n3, Class1904.field10335, 1.0f, 1.0f, 1.0f, 1.0f);
            class508.method22568();
            super.method13951(class507, n, n2, class508, class509, n3);
        }
    }
    
    public Class1932 method14187(final Class507 class507) {
        return Class4795.field20446;
    }
    
    static {
        field20446 = new Class1932("textures/entity/illager/evoker_fangs.png");
    }
}
