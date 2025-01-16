// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Vector3f;

public class Class1832 extends Class1799<Class786, Class5874<Class786>>
{
    private static String[] field10012;
    
    public Class1832(final Class4778<Class786, Class5874<Class786>> class4778) {
        super(class4778);
    }
    
    public void method6570(final MatrixStack class7351, final IRenderTypeBuffer class7352, final int n, final Class786 class7353, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        if (class7353.method4340() != 0) {
            class7351.method22567();
            ((Class1799<T, Class5874>)this).method6559().method17618().method18645(class7351);
            class7351.method22564(-1.1875, 1.0625, -0.9375);
            class7351.method22564(0.5, 0.5, 0.5);
            class7351.method22565(0.5f, 0.5f, 0.5f);
            class7351.method22566(Vector3f.XP.rotationDegrees(-90.0f));
            class7351.method22564(-0.5, -0.5, -0.5);
            Minecraft.method5277().method5305().method5795(Blocks.POPPY.getDefaultState(), class7351, class7352, n, Class1904.field10335);
            class7351.method22568();
        }
    }
}
