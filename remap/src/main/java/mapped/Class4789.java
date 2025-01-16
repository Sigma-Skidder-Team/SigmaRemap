// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Matrix3f;
import net.minecraft.client.renderer.Matrix4f;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class Class4789 extends Class4703<Class425>
{
    private static final ResourceLocation field20422;
    private static final Class6332 field20423;
    
    public Class4789(final Class8551 class8551) {
        super(class8551);
    }
    
    public void method14158(final Class425 class425, final float n, final float n2, final Class7351 class426, final Class7807 class427, final int n3) {
        final PlayerEntity method2079 = class425.method2079();
        if (method2079 != null) {
            class426.method22567();
            class426.method22567();
            class426.method22565(0.5f, 0.5f, 0.5f);
            class426.method22566(this.field20283.method28717());
            class426.method22566(Vector3f.YP.rotationDegrees(180.0f));
            final Class8996 method2080 = class426.method22569();
            final Matrix4f method2081 = method2080.method32111();
            final Matrix3f method2082 = method2080.method32112();
            final Class4150 method2083 = class427.method25214(Class4789.field20423);
            method14160(method2083, method2081, method2082, n3, 0.0f, 0, 0, 1);
            method14160(method2083, method2081, method2082, n3, 1.0f, 0, 1, 1);
            method14160(method2083, method2081, method2082, n3, 1.0f, 1, 1, 0);
            method14160(method2083, method2081, method2082, n3, 0.0f, 1, 0, 0);
            class426.method22568();
            int n4 = (method2079.method2755() != Class2226.field13698) ? -1 : 1;
            if (method2079.getHeldItemMainhand().getItem() != Items.field31376) {
                n4 = -n4;
            }
            final float method2084 = MathHelper.sin(MathHelper.method35640(method2079.method2748(n2)) * 3.1415927f);
            final float n5 = MathHelper.method35700(n2, method2079.field2952, method2079.field2951) * 0.017453292f;
            final double n6 = MathHelper.sin(n5);
            final double n7 = MathHelper.cos(n5);
            final double n8 = n4 * 0.35;
            double n10 = 0.0;
            double n11 = 0.0;
            double n12 = 0.0;
            float method2086 = 0.0f;
            Label_0628: {
                if (this.field20283.field35909 == null || this.field20283.field35909.field23465 <= 0) {
                    if (method2079 == Class869.method5277().field4684) {
                        final double n9 = this.field20283.field35909.field23471 / 100.0;
                        final Vec3d method2085 = new Vec3d(n4 * -0.36 * n9, -0.045 * n9, 0.4).rotatePitch(-MathHelper.method35700(n2, method2079.prevRotationPitch, method2079.rotationPitch) * 0.017453292f).rotateYaw(-MathHelper.method35700(n2, method2079.prevRotationYaw, method2079.rotationYaw) * 0.017453292f).rotateYaw(method2084 * 0.5f).rotatePitch(-method2084 * 0.7f);
                        n10 = MathHelper.method35701(n2, method2079.prevPosX, method2079.getPosX()) + method2085.x;
                        n11 = MathHelper.method35701(n2, method2079.prevPosY, method2079.getPosY()) + method2085.y;
                        n12 = MathHelper.method35701(n2, method2079.prevPosZ, method2079.getPosZ()) + method2085.z;
                        method2086 = method2079.method1892();
                        break Label_0628;
                    }
                }
                n10 = MathHelper.method35701(n2, method2079.prevPosX, method2079.getPosX()) - n7 * n8 - n6 * 0.8;
                n11 = method2079.prevPosY + method2079.method1892() + (method2079.getPosY() - method2079.prevPosY) * n2 - 0.45;
                n12 = MathHelper.method35701(n2, method2079.prevPosZ, method2079.getPosZ()) - n6 * n8 + n7 * 0.8;
                method2086 = (method2079.method1814() ? -0.1875f : 0.0f);
            }
            final double method2087 = MathHelper.method35701(n2, class425.prevPosX, class425.getPosX());
            final double n13 = MathHelper.method35701(n2, class425.prevPosY, class425.getPosY()) + 0.25;
            final double method2088 = MathHelper.method35701(n2, class425.prevPosZ, class425.getPosZ());
            final float n14 = (float)(n10 - method2087);
            final float n15 = (float)(n11 - n13) + method2086;
            final float n16 = (float)(n12 - method2088);
            final Class4150 method2089 = class427.method25214(Class6332.method18791());
            final Matrix4f method2090 = class426.method22569().method32111();
            for (int i = 0; i < 16; ++i) {
                method14161(n14, n15, n16, method2089, method2090, method14159(i, 16));
                method14161(n14, n15, n16, method2089, method2090, method14159(i + 1, 16));
            }
            class426.method22568();
            super.method13951(class425, n, n2, class426, class427, n3);
        }
    }
    
    private static float method14159(final int n, final int n2) {
        return n / (float)n2;
    }
    
    private static void method14160(final Class4150 class4150, final Matrix4f class4151, final Matrix3f class4152, final int n, final float n2, final int n3, final int n4, final int n5) {
        class4150.method12444(class4151, n2 - 0.5f, n3 - 0.5f, 0.0f).method12399(255, 255, 255, 255).method12391((float)n4, (float)n5).method12441(Class1904.field10335).method12440(n).method12445(class4152, 0.0f, 1.0f, 0.0f).method12397();
    }
    
    private static void method14161(final float n, final float n2, final float n3, final Class4150 class4150, final Matrix4f class4151, final float n4) {
        class4150.method12444(class4151, n * n4, n2 * (n4 * n4 + n4) * 0.5f + 0.25f, n3 * n4).method12399(0, 0, 0, 255).method12397();
    }
    
    public ResourceLocation method14162(final Class425 class425) {
        return Class4789.field20422;
    }
    
    static {
        field20422 = new ResourceLocation("textures/entity/fishing_hook.png");
        field20423 = Class6332.method18768(Class4789.field20422);
    }
}
