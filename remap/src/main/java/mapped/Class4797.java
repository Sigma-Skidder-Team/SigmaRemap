// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Matrix3f;
import net.minecraft.client.renderer.Matrix4f;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.util.math.MathHelper;

public class Class4797 extends Class4703<Class508>
{
    private static final ResourceLocation field20449;
    private static final Class6332 field20450;
    
    public Class4797(final Class8551 class8551) {
        super(class8551);
        this.field20284 = 0.15f;
        this.field20285 = 0.75f;
    }
    
    public int method14190(final Class508 class508, final float n) {
        return MathHelper.method35651(super.method13954(class508, n) + 7, 0, 15);
    }
    
    public void method14191(final Class508 class508, final float n, final float n2, final MatrixStack class509, final IRenderTypeBuffer class510, final int n3) {
        class509.method22567();
        final int method2608 = class508.method2608();
        final float n4 = (method2608 % 4 * 16) / 64.0f;
        final float n5 = (method2608 % 4 * 16 + 16) / 64.0f;
        final float n6 = (method2608 / 4 * 16) / 64.0f;
        final float n7 = (method2608 / 4 * 16 + 16) / 64.0f;
        float method2609 = (class508.field2897 + n2) / 2.0f;
        if (Config.method28945()) {
            method2609 = Class8763.method30347(method2609);
        }
        final int n8 = (int)((MathHelper.sin(method2609 + 0.0f) + 1.0f) * 0.5f * 255.0f);
        final int n9 = (int)((MathHelper.sin(method2609 + 4.1887903f) + 1.0f) * 0.1f * 255.0f);
        class509.method22564(0.0, 0.10000000149011612, 0.0);
        class509.method22566(this.field20283.method28717());
        class509.method22566(Vector3f.YP.rotationDegrees(180.0f));
        class509.method22565(0.3f, 0.3f, 0.3f);
        final Class4150 method2610 = class510.method25214(Class4797.field20450);
        final Class8996 method2611 = class509.getLast();
        final Matrix4f method2612 = method2611.getMatrix();
        final Matrix3f method2613 = method2611.method32112();
        int n10 = n8;
        int n11 = 255;
        int n12 = n9;
        if (Config.method28945()) {
            final int method2614 = Class8763.method30348(method2609);
            if (method2614 >= 0) {
                n10 = (method2614 >> 16 & 0xFF);
                n11 = (method2614 >> 8 & 0xFF);
                n12 = (method2614 >> 0 & 0xFF);
            }
        }
        method14192(method2610, method2612, method2613, -0.5f, -0.25f, n10, n11, n12, n4, n7, n3);
        method14192(method2610, method2612, method2613, 0.5f, -0.25f, n10, n11, n12, n5, n7, n3);
        method14192(method2610, method2612, method2613, 0.5f, 0.75f, n10, n11, n12, n5, n6, n3);
        method14192(method2610, method2612, method2613, -0.5f, 0.75f, n10, n11, n12, n4, n6, n3);
        class509.method22568();
        super.method13951(class508, n, n2, class509, class510, n3);
    }
    
    private static void method14192(final Class4150 class4150, final Matrix4f class4151, final Matrix3f class4152, final float n, final float n2, final int n3, final int n4, final int n5, final float n6, final float n7, final int n8) {
        class4150.pos(class4151, n, n2, 0.0f).method12399(n3, n4, n5, 128).tex(n6, n7).method12441(Class1904.field10335).method12440(n8).method12445(class4152, 0.0f, 1.0f, 0.0f).endVertex();
    }
    
    public ResourceLocation method14193(final Class508 class508) {
        return Class4797.field20449;
    }
    
    static {
        field20449 = new ResourceLocation("textures/entity/experience_orb.png");
        field20450 = Class6332.method18773(Class4797.field20449);
    }
}
