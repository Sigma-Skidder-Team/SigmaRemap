// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Matrix3f;
import net.minecraft.client.renderer.Matrix4f;
import net.minecraft.client.renderer.Vector3f;

public class Class4782 extends Class4703<Class420>
{
    private static final ResourceLocation field20414;
    private static final Class6332 field20415;
    
    public Class4782(final Class8551 class8551) {
        super(class8551);
    }
    
    public int method14144(final Class420 class420, final float n) {
        return 15;
    }
    
    public void method14145(final Class420 class420, final float n, final float n2, final Class7351 class421, final Class7807 class422, final int n3) {
        class421.method22567();
        class421.method22565(2.0f, 2.0f, 2.0f);
        class421.method22566(this.field20283.method28717());
        class421.method22566(Vector3f.YP.rotationDegrees(180.0f));
        final Class8996 method22569 = class421.method22569();
        final Matrix4f method22570 = method22569.method32111();
        final Matrix3f method22571 = method22569.method32112();
        final Class4150 method22572 = class422.method25214(Class4782.field20415);
        method14146(method22572, method22570, method22571, n3, 0.0f, 0, 0, 1);
        method14146(method22572, method22570, method22571, n3, 1.0f, 0, 1, 1);
        method14146(method22572, method22570, method22571, n3, 1.0f, 1, 1, 0);
        method14146(method22572, method22570, method22571, n3, 0.0f, 1, 0, 0);
        class421.method22568();
        super.method13951(class420, n, n2, class421, class422, n3);
    }
    
    private static void method14146(final Class4150 class4150, final Matrix4f class4151, final Matrix3f class4152, final int n, final float n2, final int n3, final int n4, final int n5) {
        class4150.method12444(class4151, n2 - 0.5f, n3 - 0.25f, 0.0f).method12399(255, 255, 255, 255).method12391((float)n4, (float)n5).method12441(Class1904.field10335).method12440(n).method12445(class4152, 0.0f, 1.0f, 0.0f).method12397();
    }
    
    public ResourceLocation method14147(final Class420 class420) {
        return Class4782.field20414;
    }
    
    static {
        field20414 = new ResourceLocation("textures/entity/enderdragon/dragon_fireball.png");
        field20415 = Class6332.method18770(Class4782.field20414);
    }
}
