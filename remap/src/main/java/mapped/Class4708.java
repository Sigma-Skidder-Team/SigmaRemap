// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Vector3f;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class Class4708<T extends Class428> extends Class4703<T>
{
    private static final ResourceLocation field20297;
    public final Class5845<T> field20298;
    
    public Class4708(final Class8551 class8551) {
        super(class8551);
        this.field20298 = new Class5886<T>();
        this.field20284 = 0.7f;
    }
    
    public void method13973(final T t, float n, final float n2, final MatrixStack class7351, final IRenderTypeBuffer class7352, final int n3) {
        super.method13951(t, n, n2, class7351, class7352, n3);
        class7351.method22567();
        final long n4 = t.getEntityId() * 493286711L;
        final long n5 = n4 * n4 * 4392167121L + n4 * 98761L;
        class7351.method22564((((n5 >> 16 & 0x7L) + 0.5f) / 8.0f - 0.5f) * 0.004f, (((n5 >> 20 & 0x7L) + 0.5f) / 8.0f - 0.5f) * 0.004f, (((n5 >> 24 & 0x7L) + 0.5f) / 8.0f - 0.5f) * 0.004f);
        final double method35701 = MathHelper.lerp(n2, t.lastTickPosX, t.getPosX());
        final double method35702 = MathHelper.lerp(n2, t.lastTickPosY, t.getPosY());
        final double method35703 = MathHelper.lerp(n2, t.lastTickPosZ, t.getPosZ());
        final Vec3d method35704 = t.method2132(method35701, method35702, method35703);
        float method35705 = MathHelper.method35700(n2, t.prevRotationPitch, t.rotationPitch);
        if (method35704 != null) {
            Vec3d method35706 = t.method2131(method35701, method35702, method35703, 0.30000001192092896);
            Vec3d method35707 = t.method2131(method35701, method35702, method35703, -0.30000001192092896);
            if (method35706 == null) {
                method35706 = method35704;
            }
            if (method35707 == null) {
                method35707 = method35704;
            }
            class7351.method22564(method35704.x - method35701, (method35706.y + method35707.y) / 2.0 - method35702, method35704.z - method35703);
            final Vec3d method35708 = method35707.add(-method35706.x, -method35706.y, -method35706.z);
            if (method35708.length() != 0.0) {
                final Vec3d method35709 = method35708.normalize();
                n = (float)(Math.atan2(method35709.z, method35709.x) * 180.0 / 3.141592653589793);
                method35705 = (float)(Math.atan(method35709.y) * 73.0);
            }
        }
        class7351.method22564(0.0, 0.375, 0.0);
        class7351.method22566(Vector3f.YP.rotationDegrees(180.0f - n));
        class7351.method22566(Vector3f.ZP.rotationDegrees(-method35705));
        final float n6 = t.method2136() - n2;
        float n7 = t.method2134() - n2;
        if (n7 < 0.0f) {
            n7 = 0.0f;
        }
        if (n6 > 0.0f) {
            class7351.method22566(Vector3f.XP.rotationDegrees(MathHelper.sin(n6) * n6 * n7 / 10.0f * t.method2138()));
        }
        final int method35710 = t.method2142();
        final BlockState method35711 = t.method2140();
        if (method35711.method21710() != Class2115.field12305) {
            class7351.method22567();
            class7351.method22565(0.75f, 0.75f, 0.75f);
            class7351.method22564(-0.5, (method35710 - 8) / 16.0f, 0.5);
            class7351.method22566(Vector3f.YP.rotationDegrees(90.0f));
            this.method13975(t, n2, method35711, class7351, class7352, n3);
            class7351.method22568();
        }
        class7351.method22565(-1.0f, -1.0f, 1.0f);
        this.field20298.method17557(t, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f);
        this.field20298.method17564(class7351, class7352.method25214(this.field20298.method17647(this.method13974(t))), n3, Class1904.field10335, 1.0f, 1.0f, 1.0f, 1.0f);
        class7351.method22568();
    }
    
    public ResourceLocation method13974(final T t) {
        return Class4708.field20297;
    }
    
    public void method13975(final T t, final float n, final BlockState class7096, final MatrixStack class7097, final IRenderTypeBuffer class7098, final int n2) {
        Minecraft.method5277().method5305().method5795(class7096, class7097, class7098, n2, Class1904.field10335);
    }
    
    static {
        field20297 = new ResourceLocation("textures/entity/minecart.png");
    }
}
