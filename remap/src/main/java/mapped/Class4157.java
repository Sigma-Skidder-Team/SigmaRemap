// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Vector3f;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class Class4157 extends Class4158<Class494>
{
    private static String[] field18538;
    
    public Class4157(final Class9550 class9550) {
        super(class9550);
    }
    
    public void method12453(final Class494 class494, final float n, final MatrixStack class495, final IRenderTypeBuffer class496, final int n2, final int n3) {
        class495.method22567();
        class495.method22564(0.5, 0.0, 0.5);
        final Class4648 method2509 = class494.method2509();
        final Entity method2510 = method2509.method13891();
        if (method2510 != null) {
            float n4 = 0.53125f;
            final float max = Math.max(method2510.method1930(), method2510.method1931());
            if (max > 1.0) {
                n4 /= max;
            }
            class495.method22564(0.0, 0.4000000059604645, 0.0);
            class495.method22566(Vector3f.YP.rotationDegrees((float) MathHelper.lerp(n, method2509.method13898(), method2509.method13897()) * 10.0f));
            class495.method22564(0.0, -0.20000000298023224, 0.0);
            class495.method22566(Vector3f.XP.rotationDegrees(-30.0f));
            class495.method22565(n4, n4, n4);
            Minecraft.getInstance().method5306().method28706(method2510, 0.0, 0.0, 0.0, 0.0f, n, class495, class496, n2);
        }
        class495.method22568();
    }
}
