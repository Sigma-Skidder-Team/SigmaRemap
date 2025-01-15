// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Vector3f;
import net.minecraft.util.math.MathHelper;

public class Class4792 extends Class4703<Class400>
{
    private static final Class1932 field20432;
    private final Class5870<Class400> field20433;
    
    public Class4792(final Class8551 class8551) {
        super(class8551);
        this.field20433 = new Class5870<Class400>();
    }
    
    public void method14175(final Class400 class400, final float n, final float n2, final Class7351 class401, final Class7807 class402, final int n3) {
        class401.method22567();
        class401.method22564(0.0, 0.15000000596046448, 0.0);
        class401.method22566(Vector3f.YP.rotationDegrees(MathHelper.method35700(n2, class400.prevRotationYaw, class400.rotationYaw) - 90.0f));
        class401.method22566(Vector3f.ZP.rotationDegrees(MathHelper.method35700(n2, class400.prevRotationPitch, class400.rotationPitch)));
        this.field20433.method17557(class400, n2, 0.0f, -0.1f, 0.0f, 0.0f);
        this.field20433.method17564(class401, class402.method25214(this.field20433.method17647(Class4792.field20432)), n3, Class1904.field10335, 1.0f, 1.0f, 1.0f, 1.0f);
        class401.method22568();
        super.method13951(class400, n, n2, class401, class402, n3);
    }
    
    public Class1932 method14176(final Class400 class400) {
        return Class4792.field20432;
    }
    
    static {
        field20432 = new Class1932("textures/entity/llama/spit.png");
    }
}
