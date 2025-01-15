// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public class Class4704 extends Class4703<Class423>
{
    private static final Class1932[] field20288;
    public final Class5888 field20289;
    
    public Class4704(final Class8551 class8551) {
        super(class8551);
        this.field20289 = new Class5888();
        this.field20284 = 0.8f;
    }
    
    public void method13964(final Class423 class423, final float n, final float n2, final Class7351 class424, final Class7807 class425, final int n3) {
        class424.method22567();
        class424.method22564(0.0, 0.375, 0.0);
        class424.method22566(Vector3f.field38718.rotationDegrees(180.0f - n));
        final float n4 = class423.method2058() - n2;
        float n5 = class423.method2056() - n2;
        if (n5 < 0.0f) {
            n5 = 0.0f;
        }
        if (n4 > 0.0f) {
            class424.method22566(Vector3f.XP.rotationDegrees(MathHelper.sin(n4) * n4 * n5 / 10.0f * class423.method2063()));
        }
        if (!MathHelper.method35662(class423.method2061(n2), 0.0f)) {
            class424.method22566(new Quaternion(new Vector3f(1.0f, 0.0f, 1.0f), class423.method2061(n2), true));
        }
        class424.method22565(-1.0f, -1.0f, 1.0f);
        class424.method22566(Vector3f.field38718.rotationDegrees(90.0f));
        this.field20289.method17630(class423, n2, 0.0f, -0.1f, 0.0f, 0.0f);
        this.field20289.method17564(class424, class425.method25214(this.field20289.method17647(this.method13965(class423))), n3, Class1904.field10335, 1.0f, 1.0f, 1.0f, 1.0f);
        this.field20289.method17631().method18643(class424, class425.method25214(Class6332.method18782()), n3, Class1904.field10335);
        class424.method22568();
        super.method13951(class423, n, n2, class424, class425, n3);
    }
    
    public Class1932 method13965(final Class423 class423) {
        return Class4704.field20288[class423.method2065().ordinal()];
    }
    
    static {
        field20288 = new Class1932[] { new Class1932("textures/entity/boat/oak.png"), new Class1932("textures/entity/boat/spruce.png"), new Class1932("textures/entity/boat/birch.png"), new Class1932("textures/entity/boat/jungle.png"), new Class1932("textures/entity/boat/acacia.png"), new Class1932("textures/entity/boat/dark_oak.png") };
    }
}
