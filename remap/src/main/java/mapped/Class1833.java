// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Vector3f;

public class Class1833 extends Class1799<Class850, Class5868<Class850>>
{
    private static String[] field10013;
    
    public Class1833(final Class4778<Class850, Class5868<Class850>> class4778) {
        super(class4778);
    }
    
    public void method6594(final MatrixStack class7351, final IRenderTypeBuffer class7352, final int n, final Class850 class7353, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        final BlockState method5080 = class7353.method5080();
        if (method5080 != null) {
            class7351.method22567();
            class7351.method22564(0.0, 0.6875, -0.75);
            class7351.method22566(Vector3f.XP.rotationDegrees(20.0f));
            class7351.method22566(Vector3f.YP.rotationDegrees(45.0f));
            class7351.method22564(0.25, 0.1875, 0.25);
            class7351.method22565(-0.5f, -0.5f, 0.5f);
            class7351.method22566(Vector3f.YP.rotationDegrees(90.0f));
            Minecraft.method5277().method5305().method5795(method5080, class7351, class7352, n, Class1904.field10335);
            class7351.method22568();
        }
    }
}
