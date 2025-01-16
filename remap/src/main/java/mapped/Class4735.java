// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Vector3f;
import net.minecraft.util.math.MathHelper;

public class Class4735 extends Class4712<Class836, Class5850<Class836>>
{
    private static final ResourceLocation field20341;
    
    public Class4735(final Class8551 class8551) {
        super(class8551, new Class5850(), 0.3f);
    }
    
    public ResourceLocation method14055(final Class836 class836) {
        return Class4735.field20341;
    }
    
    public void method14056(final Class836 class836, final Class7351 class837, final float n, final float n2, final float n3) {
        super.method13985(class836, class837, n, n2, n3);
        class837.method22566(Vector3f.YP.rotationDegrees(4.3f * MathHelper.sin(0.6f * n)));
        if (!class836.method1706()) {
            class837.method22564(0.10000000149011612, 0.10000000149011612, -0.10000000149011612);
            class837.method22566(Vector3f.ZP.rotationDegrees(90.0f));
        }
    }
    
    static {
        field20341 = new ResourceLocation("textures/entity/fish/cod.png");
    }
}
