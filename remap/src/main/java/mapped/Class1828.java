// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Vector3f;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;

public class Class1828<T extends LivingEntity> extends Class1827<T, Class5857<T>>
{
    private static String[] field10008;
    
    public Class1828(final Class4778<T, Class5857<T>> class4778) {
        super(class4778);
    }
    
    @Override
    public void method6551(final MatrixStack class7351, final IRenderTypeBuffer class7352, final int n, final T t, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        final ItemStack method2713 = t.getHeldItemMainhand();
        class7351.method22567();
        if (method2713.getItem() == Items.field31441) {
            this.method6559().method17577().method18645(class7351);
            this.method6559().method17590().method18645(class7351);
            class7351.method22564(0.0625, 0.25, 0.0);
            class7351.method22566(Vector3f.ZP.rotationDegrees(180.0f));
            class7351.method22566(Vector3f.XP.rotationDegrees(140.0f));
            class7351.method22566(Vector3f.ZP.rotationDegrees(10.0f));
            class7351.method22564(0.0, -0.4000000059604645, 0.4000000059604645);
        }
        super.method6551(class7351, class7352, n, t, n2, n3, n4, n5, n6, n7);
        class7351.method22568();
    }
}
