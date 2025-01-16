// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Vector3f;
import net.minecraft.util.math.MathHelper;

public class Class4788 extends Class4703<Class510>
{
    private static String[] field20421;
    
    public Class4788(final Class8551 class8551) {
        super(class8551);
        this.field20284 = 0.5f;
    }
    
    public void method14156(final Class510 class510, final float n, final float n2, final MatrixStack class511, final IRenderTypeBuffer class512, final int n3) {
        class511.method22567();
        class511.method22564(0.0, 0.5, 0.0);
        if (class510.method2617() - n2 + 1.0f < 10.0f) {
            final float method35653 = MathHelper.clamp(1.0f - (class510.method2617() - n2 + 1.0f) / 10.0f, 0.0f, 1.0f);
            final float n4 = method35653 * method35653;
            final float n5 = 1.0f + n4 * n4 * 0.3f;
            class511.method22565(n5, n5, n5);
        }
        class511.method22566(Vector3f.YP.rotationDegrees(-90.0f));
        class511.method22564(-0.5, -0.5, 0.5);
        class511.method22566(Vector3f.YP.rotationDegrees(90.0f));
        Class4709.method13977(Blocks.TNT.getDefaultState(), class511, class512, n3, class510.method2617() / 5 % 2 == 0);
        class511.method22568();
        super.method13951(class510, n, n2, class511, class512, n3);
    }
    
    public ResourceLocation method14157(final Class510 class510) {
        return Class1774.field9853;
    }
}
