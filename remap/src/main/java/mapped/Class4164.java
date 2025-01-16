// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Quaternion;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.util.math.MathHelper;

public class Class4164 extends Class4158<Class492>
{
    public static final Class3687 field18551;
    public static final Class3687 field18552;
    public static final Class3687 field18553;
    public static final Class3687 field18554;
    public static final Class3687 field18555;
    public static final Class3687 field18556;
    private final Class6300 field18557;
    private final Class6300 field18558;
    private final Class6300 field18559;
    private final Class6300 field18560;
    
    public Class4164(final Class9550 class9550) {
        super(class9550);
        (this.field18557 = new Class6300(16, 16, 0, 0)).method18638(-4.0f, -4.0f, 0.0f, 8.0f, 8.0f, 0.0f, 0.01f);
        (this.field18558 = new Class6300(64, 32, 0, 0)).method18636(-8.0f, -8.0f, -8.0f, 16.0f, 16.0f, 16.0f);
        (this.field18559 = new Class6300(32, 16, 0, 0)).method18636(-3.0f, -3.0f, -3.0f, 6.0f, 6.0f, 6.0f);
        (this.field18560 = new Class6300(32, 16, 0, 0)).method18636(-4.0f, -4.0f, -4.0f, 8.0f, 8.0f, 8.0f);
    }
    
    public void method12470(final Class492 class492, final float n, final MatrixStack class493, final IRenderTypeBuffer class494, final int n2, final int n3) {
        final float n4 = class492.field2827 + n;
        if (class492.method2494()) {
            final float n5 = class492.method2498(n) * 57.295776f;
            final float n6 = MathHelper.sin(n4 * 0.1f) / 2.0f + 0.5f;
            final float n7 = n6 * n6 + n6;
            class493.method22567();
            class493.method22564(0.5, 0.3f + n7 * 0.2f, 0.5);
            final Vector3f class495 = new Vector3f(0.5f, 1.0f, 0.5f);
            class495.normalize();
            class493.method22566(new Quaternion(class495, n5, true));
            this.field18560.method18643(class493, Class4164.field18552.method11334(class494, Class6332::method18770), n2, n3);
            class493.method22568();
            final int n8 = class492.field2827 / 66 % 3;
            class493.method22567();
            class493.method22564(0.5, 0.5, 0.5);
            if (n8 != 1) {
                if (n8 == 2) {
                    class493.method22566(Vector3f.ZP.rotationDegrees(90.0f));
                }
            }
            else {
                class493.method22566(Vector3f.XP.rotationDegrees(90.0f));
            }
            final Class4150 method11334 = ((n8 != 1) ? Class4164.field18553 : Class4164.field18554).method11334(class494, Class6332::method18770);
            this.field18558.method18643(class493, method11334, n2, n3);
            class493.method22568();
            class493.method22567();
            class493.method22564(0.5, 0.5, 0.5);
            class493.method22565(0.875f, 0.875f, 0.875f);
            class493.method22566(Vector3f.XP.rotationDegrees(180.0f));
            class493.method22566(Vector3f.ZP.rotationDegrees(180.0f));
            this.field18558.method18643(class493, method11334, n2, n3);
            class493.method22568();
            final Class6092 field41131 = this.field18539.field41131;
            class493.method22567();
            class493.method22564(0.5, 0.3f + n7 * 0.2f, 0.5);
            class493.method22565(0.5f, 0.5f, 0.5f);
            class493.method22566(Vector3f.YP.rotationDegrees(-field41131.method18164()));
            class493.method22566(Vector3f.XP.rotationDegrees(field41131.method18163()));
            class493.method22566(Vector3f.ZP.rotationDegrees(180.0f));
            class493.method22565(1.3333334f, 1.3333334f, 1.3333334f);
            this.field18557.method18643(class493, (class492.method2495() ? Class4164.field18555 : Class4164.field18556).method11334(class494, Class6332::method18770), n2, n3);
            class493.method22568();
        }
        else {
            final float method11335 = class492.method2498(0.0f);
            final Class4150 method11336 = Class4164.field18551.method11334(class494, Class6332::method18767);
            class493.method22567();
            class493.method22564(0.5, 0.5, 0.5);
            class493.method22566(Vector3f.YP.rotationDegrees(method11335));
            this.field18559.method18643(class493, method11336, n2, n3);
            class493.method22568();
        }
    }
    
    static {
        field18551 = new Class3687(Class1774.field9853, new ResourceLocation("entity/conduit/base"));
        field18552 = new Class3687(Class1774.field9853, new ResourceLocation("entity/conduit/cage"));
        field18553 = new Class3687(Class1774.field9853, new ResourceLocation("entity/conduit/wind"));
        field18554 = new Class3687(Class1774.field9853, new ResourceLocation("entity/conduit/wind_vertical"));
        field18555 = new Class3687(Class1774.field9853, new ResourceLocation("entity/conduit/open_eye"));
        field18556 = new Class3687(Class1774.field9853, new ResourceLocation("entity/conduit/closed_eye"));
    }
}
