// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Vector3f;
import net.minecraft.util.math.MathHelper;

public class Class4745 extends Class4712<Class839, Class5895<Class839>>
{
    private static final ResourceLocation field20367;
    
    public Class4745(final Class8551 class8551) {
        super(class8551, new Class5895(), 0.7f);
    }
    
    public ResourceLocation method14077(final Class839 class839) {
        return Class4745.field20367;
    }
    
    public void method14078(final Class839 class839, final MatrixStack class840, final float n, final float n2, final float n3) {
        final float method35700 = MathHelper.method35700(n3, class839.field4461, class839.field4460);
        final float method35701 = MathHelper.method35700(n3, class839.field4463, class839.field4462);
        class840.method22564(0.0, 0.5, 0.0);
        class840.method22566(Vector3f.YP.rotationDegrees(180.0f - n2));
        class840.method22566(Vector3f.XP.rotationDegrees(method35700));
        class840.method22566(Vector3f.YP.rotationDegrees(method35701));
        class840.method22564(0.0, -1.2000000476837158, 0.0);
    }
    
    public float method14079(final Class839 class839, final float n) {
        return MathHelper.method35700(n, class839.field4467, class839.field4466);
    }
    
    static {
        field20367 = new ResourceLocation("textures/entity/squid.png");
    }
}
