// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Vector3f;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;

public class Class1823<T extends LivingEntity, M extends Class5845<T> & Class5852> extends Class1799<T, M>
{
    private static String[] field10004;
    
    public Class1823(final Class4778<T, M> class4778) {
        super(class4778);
    }
    
    public void method6551(final MatrixStack class7351, final IRenderTypeBuffer class7352, final int n, final T t, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        final boolean b = t.method2755() == Class2226.field13698;
        final ItemStack class7353 = b ? t.method2714() : t.getHeldItemMainhand();
        final ItemStack class7354 = b ? t.getHeldItemMainhand() : t.method2714();
        if (!class7353.method27620() || !class7354.method27620()) {
            class7351.method22567();
            if (this.method6559().field23957) {
                class7351.method22564(0.0, 0.75, 0.0);
                class7351.method22565(0.5f, 0.5f, 0.5f);
            }
            this.method6588(t, class7354, Class2016.field11488, Class2226.field13698, class7351, class7352, n);
            this.method6588(t, class7353, Class2016.field11487, Class2226.field13697, class7351, class7352, n);
            class7351.method22568();
        }
    }
    
    private void method6588(final LivingEntity class511, final ItemStack class512, final Class2016 class513, final Class2226 class514, final MatrixStack class515, final IRenderTypeBuffer class516, final int n) {
        if (!class512.method27620()) {
            class515.method22567();
            this.method6559().method17578(class514, class515);
            class515.method22566(Vector3f.XP.rotationDegrees(-90.0f));
            class515.method22566(Vector3f.YP.rotationDegrees(180.0f));
            final boolean b = class514 == Class2226.field13697;
            class515.method22564((b ? -1 : 1) / 16.0f, 0.125, -0.625);
            Minecraft.method5277().method5308().method35143(class511, class512, class513, b, class515, class516, n);
            class515.method22568();
        }
    }
}
