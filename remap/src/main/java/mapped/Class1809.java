// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Vector3f;
import net.minecraft.item.ItemStack;

public class Class1809 extends Class1799<Class784, Class5894<Class784>>
{
    private static String[] field9980;
    
    public Class1809(final Class4778<Class784, Class5894<Class784>> class4778) {
        super(class4778);
    }
    
    public void method6569(final MatrixStack class7351, final IRenderTypeBuffer class7352, final int n, final Class784 class7353, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        if (!class7353.method1823()) {
            if (class7353.method4332()) {
                class7351.method22567();
                ((Class1799<T, Class5894>)this).method6559().method17634().method18645(class7351);
                class7351.method22564(0.0, -0.34375, 0.0);
                class7351.method22566(Vector3f.YP.rotationDegrees(180.0f));
                class7351.method22565(0.625f, -0.625f, -0.625f);
                Minecraft.getInstance().getItemRenderer().method6537(class7353, new ItemStack(Blocks.field29342), Class2016.field11491, false, class7351, class7352, class7353.world, n, Class4710.method13982(class7353, 0.0f));
                class7351.method22568();
            }
        }
    }
}
