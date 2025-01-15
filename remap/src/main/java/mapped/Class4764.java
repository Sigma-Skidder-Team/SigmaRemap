// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public class Class4764 extends Class4712<Class844, Class5879>
{
    private static final Class1932 field20389;
    private static final Class1932 field20390;
    private static final Class6332 field20391;
    
    public Class4764(final Class8551 class8551) {
        this(class8551, 0.5f);
    }
    
    public Class4764(final Class8551 class8551, final float n) {
        super(class8551, new Class5879(), n);
    }
    
    public boolean method14103(final Class844 class844, final Class6664 class845, final double n, final double n2, final double n3) {
        if (!super.method14005(class844, class845, n, n2, n3)) {
            if (class844.method5058()) {
                final Class511 method5059 = class844.method5059();
                if (method5059 != null) {
                    final Class5487 method5060 = this.method14104(method5059, method5059.method1931() * 0.5, 1.0f);
                    final Class5487 method5061 = this.method14104(class844, class844.method1892(), 1.0f);
                    return class845.method20261(new Class6221(method5061.field22770, method5061.field22771, method5061.field22772, method5060.field22770, method5060.field22771, method5060.field22772));
                }
            }
            return false;
        }
        return true;
    }
    
    private Class5487 method14104(final Class511 class511, final double n, final float n2) {
        return new Class5487(MathHelper.method35701(n2, class511.field2417, class511.method1938()), MathHelper.method35701(n2, class511.field2418, class511.method1941()) + n, MathHelper.method35701(n2, class511.field2419, class511.method1945()));
    }
    
    public void method14105(final Class844 class844, final float n, final float n2, final Class7351 class845, final Class7807 class846, final int n3) {
        super.method14006(class844, n, n2, class845, class846, n3);
        final Class511 method5059 = class844.method5059();
        if (method5059 != null) {
            final float method5060 = class844.method5063(n2);
            final float n4 = class844.field2391.method6754() + n2;
            final float n5 = n4 * 0.5f % 1.0f;
            final float method5061 = class844.method1892();
            class845.method22567();
            class845.method22564(0.0, method5061, 0.0);
            final Class5487 method5062 = this.method14104(method5059, method5059.method1931() * 0.5, n2).method16741(this.method14104(class844, method5061, n2));
            final float n6 = (float)(method5062.method16752() + 1.0);
            final Class5487 method5063 = method5062.method16738();
            final float n7 = (float)Math.acos(method5063.field22771);
            class845.method22566(Vector3f.field38718.rotationDegrees((1.5707964f - (float)Math.atan2(method5063.field22772, method5063.field22770)) * 57.295776f));
            class845.method22566(Vector3f.XP.rotationDegrees(n7 * 57.295776f));
            final float n8 = n4 * 0.05f * -1.5f;
            final float n9 = method5060 * method5060;
            final int n10 = 64 + (int)(n9 * 191.0f);
            final int n11 = 32 + (int)(n9 * 191.0f);
            final int n12 = 128 - (int)(n9 * 64.0f);
            final float n13 = MathHelper.cos(n8 + 2.3561945f) * 0.282f;
            final float n14 = MathHelper.sin(n8 + 2.3561945f) * 0.282f;
            final float n15 = MathHelper.cos(n8 + 0.7853982f) * 0.282f;
            final float n16 = MathHelper.sin(n8 + 0.7853982f) * 0.282f;
            final float n17 = MathHelper.cos(n8 + 3.926991f) * 0.282f;
            final float n18 = MathHelper.sin(n8 + 3.926991f) * 0.282f;
            final float n19 = MathHelper.cos(n8 + 5.4977875f) * 0.282f;
            final float n20 = MathHelper.sin(n8 + 5.4977875f) * 0.282f;
            final float n21 = MathHelper.cos(n8 + 3.1415927f) * 0.2f;
            final float n22 = MathHelper.sin(n8 + 3.1415927f) * 0.2f;
            final float n23 = MathHelper.cos(n8 + 0.0f) * 0.2f;
            final float n24 = MathHelper.sin(n8 + 0.0f) * 0.2f;
            final float n25 = MathHelper.cos(n8 + 1.5707964f) * 0.2f;
            final float n26 = MathHelper.sin(n8 + 1.5707964f) * 0.2f;
            final float n27 = MathHelper.cos(n8 + 4.712389f) * 0.2f;
            final float n28 = MathHelper.sin(n8 + 4.712389f) * 0.2f;
            final float n29 = -1.0f + n5;
            final float n30 = n6 * 2.5f + n29;
            final Class4150 method5064 = class846.method25214(Class4764.field20391);
            final Class8996 method5065 = class845.method22569();
            final Class6789 method5066 = method5065.method32111();
            final Class9429 method5067 = method5065.method32112();
            method14106(method5064, method5066, method5067, n21, n6, n22, n10, n11, n12, 0.4999f, n30);
            method14106(method5064, method5066, method5067, n21, 0.0f, n22, n10, n11, n12, 0.4999f, n29);
            method14106(method5064, method5066, method5067, n23, 0.0f, n24, n10, n11, n12, 0.0f, n29);
            method14106(method5064, method5066, method5067, n23, n6, n24, n10, n11, n12, 0.0f, n30);
            method14106(method5064, method5066, method5067, n25, n6, n26, n10, n11, n12, 0.4999f, n30);
            method14106(method5064, method5066, method5067, n25, 0.0f, n26, n10, n11, n12, 0.4999f, n29);
            method14106(method5064, method5066, method5067, n27, 0.0f, n28, n10, n11, n12, 0.0f, n29);
            method14106(method5064, method5066, method5067, n27, n6, n28, n10, n11, n12, 0.0f, n30);
            float n31 = 0.0f;
            if (class844.field2424 % 2 == 0) {
                n31 = 0.5f;
            }
            method14106(method5064, method5066, method5067, n13, n6, n14, n10, n11, n12, 0.5f, n31 + 0.5f);
            method14106(method5064, method5066, method5067, n15, n6, n16, n10, n11, n12, 1.0f, n31 + 0.5f);
            method14106(method5064, method5066, method5067, n19, n6, n20, n10, n11, n12, 1.0f, n31);
            method14106(method5064, method5066, method5067, n17, n6, n18, n10, n11, n12, 0.5f, n31);
            class845.method22568();
        }
    }
    
    private static void method14106(final Class4150 class4150, final Class6789 class4151, final Class9429 class4152, final float n, final float n2, final float n3, final int n4, final int n5, final int n6, final float n7, final float n8) {
        class4150.method12444(class4151, n, n2, n3).method12399(n4, n5, n6, 255).method12391(n7, n8).method12441(Class1904.field10335).method12440(15728880).method12445(class4152, 0.0f, 1.0f, 0.0f).method12397();
    }
    
    public Class1932 method14107(final Class844 class844) {
        return Class4764.field20389;
    }
    
    static {
        field20389 = new Class1932("textures/entity/guardian.png");
        field20390 = new Class1932("textures/entity/guardian_beam.png");
        field20391 = Class6332.method18770(Class4764.field20390);
    }
}
