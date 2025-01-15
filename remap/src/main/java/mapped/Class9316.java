// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Matrix4f;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.util.math.MathHelper;

import javax.annotation.Nullable;

public class Class9316
{
    private static final Class1932 field40007;
    
    public static void method34477(final Class869 class869, final Class7351 class870) {
        Class8726.method29998();
        final Class756 field4684 = class869.field4684;
        if (!field4684.noClip) {
            final Class7096 method34478 = method34478(field4684);
            if (method34478 != null) {
                method34479(class869, class869.method5305().method5787().method35427(method34478), class870);
            }
        }
        if (!class869.field4684.isSpectator()) {
            if (class869.field4684.method1720(Class7324.field28319)) {
                method34480(class869, class870);
            }
            if (class869.field4684.method1804()) {
                method34481(class869, class870);
            }
        }
        Class8726.method29999();
    }
    
    @Nullable
    private static Class7096 method34478(final Class512 class512) {
        final Mutable class513 = new Mutable();
        for (int i = 0; i < 8; ++i) {
            class513.method1286(class512.getPosX() + ((i >> 0) % 2 - 0.5f) * class512.method1930() * 0.8f, class512.method1944() + ((i >> 1) % 2 - 0.5f) * 0.1f, class512.getPosZ() + ((i >> 2) % 2 - 0.5f) * class512.method1930() * 0.8f);
            final Class7096 method6701 = class512.world.method6701(class513);
            if (method6701.method21710() != Class2115.field12305 && method6701.method21747(class512.world, class513)) {
                return method6701;
            }
        }
        return null;
    }
    
    private static void method34479(final Class869 class869, final Class1912 class870, final Class7351 class871) {
        if (Class7663.method24283()) {
            Class7663.method24285(class870);
        }
        class869.method5290().method5849(class870.method7504().method6340());
        final Class4148 method22696 = Class7392.method22694().method22696();
        final float method22697 = class870.method7497();
        final float method22698 = class870.method7498();
        final float method22699 = class870.method7500();
        final float method22700 = class870.method7501();
        final Matrix4f method22701 = class871.method22569().method32111();
        method22696.method12390(7, Class9237.field39618);
        method22696.method12444(method22701, -1.0f, -1.0f, -0.5f).method12439(0.1f, 0.1f, 0.1f, 1.0f).method12391(method22698, method22700).method12397();
        method22696.method12444(method22701, 1.0f, -1.0f, -0.5f).method12439(0.1f, 0.1f, 0.1f, 1.0f).method12391(method22697, method22700).method12397();
        method22696.method12444(method22701, 1.0f, 1.0f, -0.5f).method12439(0.1f, 0.1f, 0.1f, 1.0f).method12391(method22697, method22699).method12397();
        method22696.method12444(method22701, -1.0f, 1.0f, -0.5f).method12439(0.1f, 0.1f, 0.1f, 1.0f).method12391(method22698, method22699).method12397();
        method22696.method12393();
        Class8475.method28282(method22696);
    }
    
    private static void method34480(final Class869 class869, final Class7351 class870) {
        class869.method5290().method5849(Class9316.field40007);
        if (Class7663.method24283()) {
            Class7663.method24289(class869.method5290().method5853(Class9316.field40007).method5869());
        }
        final Class4148 method22696 = Class7392.method22694().method22696();
        final float method22697 = class869.field4684.method1726();
        Class8726.method30011();
        Class8726.method30117();
        final float n = -class869.field4684.rotationYaw / 64.0f;
        final float n2 = class869.field4684.rotationPitch / 64.0f;
        final Matrix4f method22698 = class870.method22569().method32111();
        method22696.method12390(7, Class9237.field39618);
        method22696.method12444(method22698, -1.0f, -1.0f, -0.5f).method12439(method22697, method22697, method22697, 0.1f).method12391(4.0f + n, 4.0f + n2).method12397();
        method22696.method12444(method22698, 1.0f, -1.0f, -0.5f).method12439(method22697, method22697, method22697, 0.1f).method12391(0.0f + n, 4.0f + n2).method12397();
        method22696.method12444(method22698, 1.0f, 1.0f, -0.5f).method12439(method22697, method22697, method22697, 0.1f).method12391(0.0f + n, 0.0f + n2).method12397();
        method22696.method12444(method22698, -1.0f, 1.0f, -0.5f).method12439(method22697, method22697, method22697, 0.1f).method12391(4.0f + n, 0.0f + n2).method12397();
        method22696.method12393();
        Class8475.method28282(method22696);
        Class8726.method30012();
    }
    
    private static void method34481(final Class869 class869, final Class7351 class870) {
        final Class4148 method22696 = Class7392.method22694().method22696();
        Class8726.method30009(519);
        Class8726.method30010(false);
        Class8726.method30011();
        Class8726.method30117();
        final Class1912 method22697 = Class7637.field30238.method11332();
        if (Class7663.method24283()) {
            Class7663.method24285(method22697);
        }
        class869.method5290().method5849(method22697.method7504().method6340());
        final float method22698 = method22697.method7497();
        final float method22699 = method22697.method7498();
        final float n = (method22698 + method22699) / 2.0f;
        final float method22700 = method22697.method7500();
        final float method22701 = method22697.method7501();
        final float n2 = (method22700 + method22701) / 2.0f;
        final float method22702 = method22697.method7509();
        final float method22703 = MathHelper.method35700(method22702, method22698, n);
        final float method22704 = MathHelper.method35700(method22702, method22699, n);
        final float method22705 = MathHelper.method35700(method22702, method22700, n2);
        final float method22706 = MathHelper.method35700(method22702, method22701, n2);
        final Class5746 class871 = new Class5746(0.9f);
        Class9463.method35173().method35188().method21097(class871);
        for (int i = 0; i < 2; ++i) {
            class870.method22567();
            class870.method22564(-(i * 2 - 1) * 0.24f, -0.30000001192092896, 0.0);
            class870.method22566(Vector3f.YP.rotationDegrees((i * 2 - 1) * 10.0f));
            final Matrix4f method22707 = class870.method22569().method32111();
            method22696.method12390(7, Class9237.field39618);
            method22696.method12444(method22707, -0.5f, -0.5f, -0.5f).method12439(1.0f, 1.0f, 1.0f, class871.method17054()).method12391(method22704, method22706).method12397();
            method22696.method12444(method22707, 0.5f, -0.5f, -0.5f).method12439(1.0f, 1.0f, 1.0f, class871.method17054()).method12391(method22703, method22706).method12397();
            method22696.method12444(method22707, 0.5f, 0.5f, -0.5f).method12439(1.0f, 1.0f, 1.0f, class871.method17054()).method12391(method22703, method22705).method12397();
            method22696.method12444(method22707, -0.5f, 0.5f, -0.5f).method12439(1.0f, 1.0f, 1.0f, class871.method17054()).method12391(method22704, method22705).method12397();
            method22696.method12393();
            Class8475.method28282(method22696);
            class870.method22568();
        }
        Class8726.method30012();
        Class8726.method30010(true);
        Class8726.method30009(515);
    }
    
    static {
        field40007 = new Class1932("textures/misc/underwater.png");
    }
}
