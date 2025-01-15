// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Matrix3f;
import net.minecraft.client.renderer.Matrix4f;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.util.math.MathHelper;

public abstract class Class4785<T extends Class402> extends Class4703<T>
{
    public Class4785(final Class8551 class8551) {
        super(class8551);
    }
    
    public void method14152(final T t, final float n, final float n2, final Class7351 class7351, final Class7807 class7352, final int n3) {
        class7351.method22567();
        class7351.method22566(Vector3f.YP.rotationDegrees(MathHelper.method35700(n2, t.field2401, t.field2399) - 90.0f));
        class7351.method22566(Vector3f.ZP.rotationDegrees(MathHelper.method35700(n2, t.field2402, t.field2400)));
        final float n4 = t.field2475 - n2;
        if (n4 > 0.0f) {
            class7351.method22566(Vector3f.ZP.rotationDegrees(-MathHelper.sin(n4 * 3.0f) * n4));
        }
        class7351.method22566(Vector3f.XP.rotationDegrees(45.0f));
        class7351.method22565(0.05625f, 0.05625f, 0.05625f);
        class7351.method22564(-4.0, 0.0, 0.0);
        final Class4150 method25214 = class7352.method25214(Class6332.method18768(this.method13950(t)));
        final Class8996 method25215 = class7351.method22569();
        final Matrix4f method25216 = method25215.method32111();
        final Matrix3f method25217 = method25215.method32112();
        this.method14153(method25216, method25217, method25214, -7, -2, -2, 0.0f, 0.15625f, -1, 0, 0, n3);
        this.method14153(method25216, method25217, method25214, -7, -2, 2, 0.15625f, 0.15625f, -1, 0, 0, n3);
        this.method14153(method25216, method25217, method25214, -7, 2, 2, 0.15625f, 0.3125f, -1, 0, 0, n3);
        this.method14153(method25216, method25217, method25214, -7, 2, -2, 0.0f, 0.3125f, -1, 0, 0, n3);
        this.method14153(method25216, method25217, method25214, -7, 2, -2, 0.0f, 0.15625f, 1, 0, 0, n3);
        this.method14153(method25216, method25217, method25214, -7, 2, 2, 0.15625f, 0.15625f, 1, 0, 0, n3);
        this.method14153(method25216, method25217, method25214, -7, -2, 2, 0.15625f, 0.3125f, 1, 0, 0, n3);
        this.method14153(method25216, method25217, method25214, -7, -2, -2, 0.0f, 0.3125f, 1, 0, 0, n3);
        for (int i = 0; i < 4; ++i) {
            class7351.method22566(Vector3f.XP.rotationDegrees(90.0f));
            this.method14153(method25216, method25217, method25214, -8, -2, 0, 0.0f, 0.0f, 0, 1, 0, n3);
            this.method14153(method25216, method25217, method25214, 8, -2, 0, 0.5f, 0.0f, 0, 1, 0, n3);
            this.method14153(method25216, method25217, method25214, 8, 2, 0, 0.5f, 0.15625f, 0, 1, 0, n3);
            this.method14153(method25216, method25217, method25214, -8, 2, 0, 0.0f, 0.15625f, 0, 1, 0, n3);
        }
        class7351.method22568();
        super.method13951(t, n, n2, class7351, class7352, n3);
    }
    
    public void method14153(final Matrix4f class6789, final Matrix3f class6790, final Class4150 class6791, final int n, final int n2, final int n3, final float n4, final float n5, final int n6, final int n7, final int n8, final int n9) {
        class6791.method12444(class6789, (float)n, (float)n2, (float)n3).method12399(255, 255, 255, 255).method12391(n4, n5).method12441(Class1904.field10335).method12440(n9).method12445(class6790, (float)n6, (float)n8, (float)n7).method12397();
    }
}
