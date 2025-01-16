// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Vector3f;
import net.minecraft.util.math.MathHelper;

public class Class4720 extends Class4712<Class837, Class5877<Class837>>
{
    private static final ResourceLocation field20323;
    
    public Class4720(final Class8551 class8551) {
        super(class8551, new Class5877(), 0.4f);
    }
    
    public ResourceLocation method14028(final Class837 class837) {
        return Class4720.field20323;
    }
    
    public void method14029(final Class837 class837, final Class7351 class838, final float n, final float n2, final float n3) {
        super.method13985(class837, class838, n, n2, n3);
        float n4 = 1.0f;
        float n5 = 1.0f;
        if (!class837.method1706()) {
            n4 = 1.3f;
            n5 = 1.7f;
        }
        class838.method22566(Vector3f.YP.rotationDegrees(n4 * 4.3f * MathHelper.sin(n5 * 0.6f * n)));
        class838.method22564(0.0, 0.0, -0.4000000059604645);
        if (!class837.method1706()) {
            class838.method22564(0.20000000298023224, 0.10000000149011612, 0.0);
            class838.method22566(Vector3f.ZP.rotationDegrees(90.0f));
        }
    }
    
    static {
        field20323 = new ResourceLocation("textures/entity/fish/salmon.png");
    }
}
