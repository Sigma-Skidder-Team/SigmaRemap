// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Matrix3f;
import net.minecraft.client.renderer.Matrix4f;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;

public class Class1822<T extends LivingEntity, M extends Class5860<T>> extends Class1820<T, M>
{
    private static final ResourceLocation field10003;
    
    public Class1822(final Class4710<T, M> class4710) {
        super(class4710);
    }
    
    @Override
    public int method6585(final T t) {
        return t.method2704();
    }
    
    @Override
    public void method6586(final Class7351 class7351, final Class7807 class7352, final int n, final Entity class7353, final float n2, final float n3, final float n4, final float n5) {
        final float method35640 = MathHelper.method35640(n2 * n2 + n4 * n4);
        final float n6 = (float)(Math.atan2(n2, n4) * 57.2957763671875);
        final float n7 = (float)(Math.atan2(n3, method35640) * 57.2957763671875);
        class7351.method22564(0.0, 0.0, 0.0);
        class7351.method22566(Vector3f.YP.rotationDegrees(n6 - 90.0f));
        class7351.method22566(Vector3f.ZP.rotationDegrees(n7));
        class7351.method22566(Vector3f.XP.rotationDegrees(45.0f));
        class7351.method22565(0.03125f, 0.03125f, 0.03125f);
        class7351.method22564(2.5, 0.0, 0.0);
        final Class4150 method35641 = class7352.method25214(Class6332.method18770(Class1822.field10003));
        for (int i = 0; i < 4; ++i) {
            class7351.method22566(Vector3f.XP.rotationDegrees(90.0f));
            final Class8996 method35642 = class7351.method22569();
            final Matrix4f method35643 = method35642.method32111();
            final Matrix3f method35644 = method35642.method32112();
            method6587(method35641, method35643, method35644, -4.5f, -1, 0.0f, 0.0f, n);
            method6587(method35641, method35643, method35644, 4.5f, -1, 0.125f, 0.0f, n);
            method6587(method35641, method35643, method35644, 4.5f, 1, 0.125f, 0.0625f, n);
            method6587(method35641, method35643, method35644, -4.5f, 1, 0.0f, 0.0625f, n);
        }
    }
    
    private static void method6587(final Class4150 class4150, final Matrix4f class4151, final Matrix3f class4152, final float n, final int n2, final float n3, final float n4, final int n5) {
        class4150.method12444(class4151, n, (float)n2, 0.0f).method12399(255, 255, 255, 255).method12391(n3, n4).method12441(Class1904.field10335).method12440(n5).method12445(class4152, 0.0f, 1.0f, 0.0f).method12397();
    }
    
    static {
        field10003 = new ResourceLocation("textures/entity/bee/bee_stinger.png");
    }
}
