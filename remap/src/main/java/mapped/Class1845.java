// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Matrix4f;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.util.math.MathHelper;

public class Class1845 implements AutoCloseable
{
    private final Class6356 field10036;
    private final Class1773 field10037;
    private final Class6332 field10038;
    public final /* synthetic */ Class1905 field10039;
    
    private Class1845(final Class1905 field10039, final Class6356 field10040) {
        this.field10039 = field10039;
        this.field10036 = field10040;
        this.field10037 = new Class1773(128, 128, true);
        this.field10038 = Class6332.method18787(Class1905.method7396(field10039).method5854("map/" + field10040.method18906(), this.field10037));
    }
    
    private void method6632() {
        for (int i = 0; i < 128; ++i) {
            for (int j = 0; j < 128; ++j) {
                final int n = this.field10036.field25426[j + i * 128] & 0xFF;
                if (n / 4 != 0) {
                    this.field10037.method6328().method6648(j, i, MaterialColor.COLORS[n / 4].getMapColor(n & 0x3));
                }
                else {
                    this.field10037.method6328().method6648(j, i, 0);
                }
            }
        }
        this.field10037.method6327();
    }
    
    private void method6633(final Class7351 class7351, final Class7807 class7352, final boolean b, final int n) {
        final Matrix4f method32111 = class7351.method22569().method32111();
        final Class4150 method32112 = class7352.method25214(this.field10038);
        method32112.method12444(method32111, 0.0f, 128.0f, -0.01f).method12399(255, 255, 255, 255).method12391(0.0f, 1.0f).method12440(n).method12397();
        method32112.method12444(method32111, 128.0f, 128.0f, -0.01f).method12399(255, 255, 255, 255).method12391(1.0f, 1.0f).method12440(n).method12397();
        method32112.method12444(method32111, 128.0f, 0.0f, -0.01f).method12399(255, 255, 255, 255).method12391(1.0f, 0.0f).method12440(n).method12397();
        method32112.method12444(method32111, 0.0f, 0.0f, -0.01f).method12399(255, 255, 255, 255).method12391(0.0f, 0.0f).method12440(n).method12397();
        int n2 = 0;
        for (final Class9323 class7353 : this.field10036.field25431.values()) {
            if (b && !class7353.method34527()) {
                continue;
            }
            class7351.method22567();
            class7351.method22564(0.0f + class7353.method34524() / 2.0f + 64.0f, 0.0f + class7353.method34525() / 2.0f + 64.0f, -0.019999999552965164);
            class7351.method22566(Vector3f.ZP.rotationDegrees(class7353.method34526() * 360 / 16.0f));
            class7351.method22565(4.0f, 4.0f, 3.0f);
            class7351.method22564(-0.125, 0.125, 0.0);
            final byte method32113 = class7353.method34522();
            final float n3 = (method32113 % 16 + 0) / 16.0f;
            final float n4 = (method32113 / 16 + 0) / 16.0f;
            final float n5 = (method32113 % 16 + 1) / 16.0f;
            final float n6 = (method32113 / 16 + 1) / 16.0f;
            final Matrix4f method32114 = class7351.method22569().method32111();
            final Class4150 method32115 = class7352.method25214(Class1905.method7397());
            method32115.method12444(method32114, -1.0f, 1.0f, n2 * -0.001f).method12399(255, 255, 255, 255).method12391(n3, n4).method12440(n).method12397();
            method32115.method12444(method32114, 1.0f, 1.0f, n2 * -0.001f).method12399(255, 255, 255, 255).method12391(n5, n4).method12440(n).method12397();
            method32115.method12444(method32114, 1.0f, -1.0f, n2 * -0.001f).method12399(255, 255, 255, 255).method12391(n5, n6).method12440(n).method12397();
            method32115.method12444(method32114, -1.0f, -1.0f, n2 * -0.001f).method12399(255, 255, 255, 255).method12391(n3, n6).method12440(n).method12397();
            class7351.method22568();
            if (class7353.method34528() != null) {
                final Class1844 field4643 = Class869.method5277().field4643;
                final String method32116 = class7353.method34528().getFormattedText();
                final float n7 = (float)field4643.method6617(method32116);
                final float method32117 = MathHelper.clamp(25.0f / n7, 0.0f, 0.6666667f);
                class7351.method22567();
                class7351.method22564(0.0f + class7353.method34524() / 2.0f + 64.0f - n7 * method32117 / 2.0f, 0.0f + class7353.method34525() / 2.0f + 64.0f + 4.0f, -0.02500000037252903);
                class7351.method22565(method32117, method32117, 1.0f);
                class7351.method22564(0.0, 0.0, -0.10000000149011612);
                field4643.method6613(method32116, 0.0f, 0.0f, -1, false, class7351.method22569().method32111(), class7352, false, Integer.MIN_VALUE, n);
                class7351.method22568();
            }
            ++n2;
        }
    }
    
    @Override
    public void close() {
        this.field10037.close();
    }
}
