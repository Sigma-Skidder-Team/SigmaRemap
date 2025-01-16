// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Vector3f;
import net.minecraft.util.math.MathHelper;

public class Class4751 extends Class4748<Class830, Class5864<Class830>>
{
    private static final ResourceLocation field20373;
    
    public Class4751(final Class8551 class8551) {
        super(class8551, new Class5864(0.0f, 0.0f, 64, 64), new Class5864(0.5f, true), new Class5864(1.0f, true));
        this.method13978((Class1799<Class830, Class5864<Class830>>)new Class1804((Class4778<Class827, Class5864<Class827>>)this));
    }
    
    @Override
    public ResourceLocation method14083(final Class827 class827) {
        return Class4751.field20373;
    }
    
    public void method14086(final Class830 class830, final MatrixStack class831, final float n, final float n2, final float n3) {
        super.method14084(class830, class831, n, n2, n3);
        final float method2623 = class830.method2623(n3);
        if (method2623 > 0.0f) {
            class831.method22566(Vector3f.XP.rotationDegrees(MathHelper.method35700(method2623, class830.rotationPitch, -10.0f - class830.rotationPitch)));
        }
    }
    
    static {
        field20373 = new ResourceLocation("textures/entity/zombie/drowned.png");
    }
}
