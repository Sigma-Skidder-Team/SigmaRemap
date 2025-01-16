// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.util.math.MathHelper;

public class Class5899<T extends Class812> extends Class5845<T>
{
    private static String[] field24245;
    private final Class6300 field24246;
    private final Class6300 field24247;
    private final Class6300 field24248;
    private final Class6300 field24249;
    private final Class6300 field24250;
    private final Class6300 field24251;
    private final Class6300 field24252;
    private final Class6300 field24253;
    
    public Class5899(final float n) {
        this.field24269 = 128;
        this.field24270 = 64;
        (this.field24246 = new Class6300(this, 0, 0)).method18638(-2.0f, -14.0f, -10.0f, 4.0f, 4.0f, 9.0f, n);
        this.field24246.method18642(0.0f, 7.0f, -6.0f);
        this.field24246.method18634(0, 14).method18638(-4.0f, -16.0f, -6.0f, 8.0f, 18.0f, 6.0f, n);
        this.field24246.method18634(17, 0).method18638(-4.0f, -19.0f, -4.0f, 3.0f, 3.0f, 2.0f, n);
        this.field24246.method18634(17, 0).method18638(1.0f, -19.0f, -4.0f, 3.0f, 3.0f, 2.0f, n);
        (this.field24247 = new Class6300(this, 29, 0)).method18638(-6.0f, -10.0f, -7.0f, 12.0f, 18.0f, 10.0f, n);
        this.field24247.method18642(0.0f, 5.0f, 2.0f);
        (this.field24252 = new Class6300(this, 45, 28)).method18638(-3.0f, 0.0f, 0.0f, 8.0f, 8.0f, 3.0f, n);
        this.field24252.method18642(-8.5f, 3.0f, 3.0f);
        this.field24252.field25184 = 1.5707964f;
        (this.field24253 = new Class6300(this, 45, 41)).method18638(-3.0f, 0.0f, 0.0f, 8.0f, 8.0f, 3.0f, n);
        this.field24253.method18642(5.5f, 3.0f, 3.0f);
        this.field24253.field25184 = 1.5707964f;
        (this.field24248 = new Class6300(this, 29, 29)).method18638(-2.0f, 0.0f, -2.0f, 4.0f, 14.0f, 4.0f, n);
        this.field24248.method18642(-2.5f, 10.0f, 6.0f);
        (this.field24249 = new Class6300(this, 29, 29)).method18638(-2.0f, 0.0f, -2.0f, 4.0f, 14.0f, 4.0f, n);
        this.field24249.method18642(2.5f, 10.0f, 6.0f);
        (this.field24250 = new Class6300(this, 29, 29)).method18638(-2.0f, 0.0f, -2.0f, 4.0f, 14.0f, 4.0f, n);
        this.field24250.method18642(-2.5f, 10.0f, -4.0f);
        (this.field24251 = new Class6300(this, 29, 29)).method18638(-2.0f, 0.0f, -2.0f, 4.0f, 14.0f, 4.0f, n);
        this.field24251.method18642(2.5f, 10.0f, -4.0f);
        final Class6300 field24248 = this.field24248;
        --field24248.field25180;
        final Class6300 field24249 = this.field24249;
        ++field24249.field25180;
        final Class6300 field24250 = this.field24248;
        field24250.field25182 += 0.0f;
        final Class6300 field24251 = this.field24249;
        field24251.field25182 += 0.0f;
        final Class6300 field24252 = this.field24250;
        --field24252.field25180;
        final Class6300 field24253 = this.field24251;
        ++field24253.field25180;
        final Class6300 field24254 = this.field24250;
        --field24254.field25182;
        final Class6300 field24255 = this.field24251;
        --field24255.field25182;
    }
    
    public void method17638(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
        this.field24246.field25183 = n5 * 0.017453292f;
        this.field24246.field25184 = n4 * 0.017453292f;
        this.field24247.field25183 = 1.5707964f;
        this.field24248.field25183 = MathHelper.cos(n * 0.6662f) * 1.4f * n2;
        this.field24249.field25183 = MathHelper.cos(n * 0.6662f + 3.1415927f) * 1.4f * n2;
        this.field24250.field25183 = MathHelper.cos(n * 0.6662f + 3.1415927f) * 1.4f * n2;
        this.field24251.field25183 = MathHelper.cos(n * 0.6662f) * 1.4f * n2;
        final boolean b = !t.method2625() && t.method4780();
        this.field24252.field25187 = b;
        this.field24253.field25187 = b;
    }
    
    @Override
    public void method17564(final MatrixStack class7351, final Class4150 class7352, final int n, final int n2, final float n3, final float n4, final float n5, final float n6) {
        if (!this.field23957) {
            ImmutableList.of((Object)this.field24246, (Object)this.field24247, (Object)this.field24248, (Object)this.field24249, (Object)this.field24250, (Object)this.field24251, (Object)this.field24252, (Object)this.field24253).forEach(class7355 -> class7355.method18644(class7353, class7354, n7, n8, n9, n10, n11, n12));
        }
        else {
            class7351.method22567();
            class7351.method22565(0.71428573f, 0.64935064f, 0.7936508f);
            class7351.method22564(0.0, 1.3125, 0.2199999988079071);
            this.field24246.method18644(class7351, class7352, n, n2, n3, n4, n5, n6);
            class7351.method22568();
            class7351.method22567();
            class7351.method22565(0.625f, 0.45454544f, 0.45454544f);
            class7351.method22564(0.0, 2.0625, 0.0);
            this.field24247.method18644(class7351, class7352, n, n2, n3, n4, n5, n6);
            class7351.method22568();
            class7351.method22567();
            class7351.method22565(0.45454544f, 0.41322312f, 0.45454544f);
            class7351.method22564(0.0, 2.0625, 0.0);
            ImmutableList.of((Object)this.field24248, (Object)this.field24249, (Object)this.field24250, (Object)this.field24251, (Object)this.field24252, (Object)this.field24253).forEach(class7358 -> class7358.method18644(class7356, class7357, n13, n14, n15, n16, n17, n18));
            class7351.method22568();
        }
    }
}
