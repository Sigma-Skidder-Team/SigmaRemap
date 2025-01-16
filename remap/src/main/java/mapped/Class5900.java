// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.util.math.MathHelper;

public class Class5900<T extends Class792> extends Class5845<T>
{
    private static String[] field24254;
    private final Class6300 field24255;
    private final Class6300 field24256;
    private final Class6300 field24257;
    private final Class6300 field24258;
    private final Class6300 field24259;
    private final Class6300 field24260;
    private final Class6300 field24261;
    private final Class6300 field24262;
    private final Class6300 field24263;
    private final Class6300 field24264;
    private final Class6300 field24265;
    private final Class6300 field24266;
    private float field24267;
    
    public Class5900() {
        (this.field24255 = new Class6300(this, 26, 24)).method18636(-1.0f, 5.5f, -3.7f, 2.0f, 1.0f, 7.0f);
        this.field24255.method18642(3.0f, 17.5f, 3.7f);
        this.field24255.field25186 = true;
        this.method17641(this.field24255, 0.0f, 0.0f, 0.0f);
        (this.field24256 = new Class6300(this, 8, 24)).method18636(-1.0f, 5.5f, -3.7f, 2.0f, 1.0f, 7.0f);
        this.field24256.method18642(-3.0f, 17.5f, 3.7f);
        this.field24256.field25186 = true;
        this.method17641(this.field24256, 0.0f, 0.0f, 0.0f);
        (this.field24257 = new Class6300(this, 30, 15)).method18636(-1.0f, 0.0f, 0.0f, 2.0f, 4.0f, 5.0f);
        this.field24257.method18642(3.0f, 17.5f, 3.7f);
        this.field24257.field25186 = true;
        this.method17641(this.field24257, -0.34906584f, 0.0f, 0.0f);
        (this.field24258 = new Class6300(this, 16, 15)).method18636(-1.0f, 0.0f, 0.0f, 2.0f, 4.0f, 5.0f);
        this.field24258.method18642(-3.0f, 17.5f, 3.7f);
        this.field24258.field25186 = true;
        this.method17641(this.field24258, -0.34906584f, 0.0f, 0.0f);
        (this.field24259 = new Class6300(this, 0, 0)).method18636(-3.0f, -2.0f, -10.0f, 6.0f, 5.0f, 10.0f);
        this.field24259.method18642(0.0f, 19.0f, 8.0f);
        this.field24259.field25186 = true;
        this.method17641(this.field24259, -0.34906584f, 0.0f, 0.0f);
        (this.field24260 = new Class6300(this, 8, 15)).method18636(-1.0f, 0.0f, -1.0f, 2.0f, 7.0f, 2.0f);
        this.field24260.method18642(3.0f, 17.0f, -1.0f);
        this.field24260.field25186 = true;
        this.method17641(this.field24260, -0.17453292f, 0.0f, 0.0f);
        (this.field24261 = new Class6300(this, 0, 15)).method18636(-1.0f, 0.0f, -1.0f, 2.0f, 7.0f, 2.0f);
        this.field24261.method18642(-3.0f, 17.0f, -1.0f);
        this.field24261.field25186 = true;
        this.method17641(this.field24261, -0.17453292f, 0.0f, 0.0f);
        (this.field24262 = new Class6300(this, 32, 0)).method18636(-2.5f, -4.0f, -5.0f, 5.0f, 4.0f, 5.0f);
        this.field24262.method18642(0.0f, 16.0f, -1.0f);
        this.field24262.field25186 = true;
        this.method17641(this.field24262, 0.0f, 0.0f, 0.0f);
        (this.field24263 = new Class6300(this, 52, 0)).method18636(-2.5f, -9.0f, -1.0f, 2.0f, 5.0f, 1.0f);
        this.field24263.method18642(0.0f, 16.0f, -1.0f);
        this.field24263.field25186 = true;
        this.method17641(this.field24263, 0.0f, -0.2617994f, 0.0f);
        (this.field24264 = new Class6300(this, 58, 0)).method18636(0.5f, -9.0f, -1.0f, 2.0f, 5.0f, 1.0f);
        this.field24264.method18642(0.0f, 16.0f, -1.0f);
        this.field24264.field25186 = true;
        this.method17641(this.field24264, 0.0f, 0.2617994f, 0.0f);
        (this.field24265 = new Class6300(this, 52, 6)).method18636(-1.5f, -1.5f, 0.0f, 3.0f, 3.0f, 2.0f);
        this.field24265.method18642(0.0f, 20.0f, 7.0f);
        this.field24265.field25186 = true;
        this.method17641(this.field24265, -0.3490659f, 0.0f, 0.0f);
        (this.field24266 = new Class6300(this, 32, 9)).method18636(-0.5f, -2.5f, -5.5f, 1.0f, 1.0f, 1.0f);
        this.field24266.method18642(0.0f, 16.0f, -1.0f);
        this.field24266.field25186 = true;
        this.method17641(this.field24266, 0.0f, 0.0f, 0.0f);
    }
    
    private void method17641(final Class6300 class6300, final float field25183, final float field25184, final float field25185) {
        class6300.field25183 = field25183;
        class6300.field25184 = field25184;
        class6300.field25185 = field25185;
    }
    
    @Override
    public void method17564(final MatrixStack class7351, final Class4150 class7352, final int n, final int n2, final float n3, final float n4, final float n5, final float n6) {
        if (!this.field23957) {
            class7351.method22567();
            class7351.method22565(0.6f, 0.6f, 0.6f);
            class7351.method22564(0.0, 1.0, 0.0);
            ImmutableList.of((Object)this.field24255, (Object)this.field24256, (Object)this.field24257, (Object)this.field24258, (Object)this.field24259, (Object)this.field24260, (Object)this.field24261, (Object)this.field24262, (Object)this.field24263, (Object)this.field24264, (Object)this.field24265, (Object)this.field24266, (Object[])new Class6300[0]).forEach(class7355 -> class7355.method18644(class7353, class7354, n7, n8, n9, n10, n11, n12));
            class7351.method22568();
        }
        else {
            class7351.method22567();
            class7351.method22565(0.56666666f, 0.56666666f, 0.56666666f);
            class7351.method22564(0.0, 1.375, 0.125);
            ImmutableList.of((Object)this.field24262, (Object)this.field24264, (Object)this.field24263, (Object)this.field24266).forEach(class7358 -> class7358.method18644(class7356, class7357, n13, n14, n15, n16, n17, n18));
            class7351.method22568();
            class7351.method22567();
            class7351.method22565(0.4f, 0.4f, 0.4f);
            class7351.method22564(0.0, 2.25, 0.0);
            ImmutableList.of((Object)this.field24255, (Object)this.field24256, (Object)this.field24257, (Object)this.field24258, (Object)this.field24259, (Object)this.field24260, (Object)this.field24261, (Object)this.field24265).forEach(class7361 -> class7361.method18644(class7359, class7360, n19, n20, n21, n22, n23, n24));
            class7351.method22568();
        }
    }
    
    public void method17642(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
        final float n6 = n3 - t.ticksExisted;
        this.field24266.field25183 = n5 * 0.017453292f;
        this.field24262.field25183 = n5 * 0.017453292f;
        this.field24263.field25183 = n5 * 0.017453292f;
        this.field24264.field25183 = n5 * 0.017453292f;
        this.field24266.field25184 = n4 * 0.017453292f;
        this.field24262.field25184 = n4 * 0.017453292f;
        this.field24263.field25184 = this.field24266.field25184 - 0.2617994f;
        this.field24264.field25184 = this.field24266.field25184 + 0.2617994f;
        this.field24267 = MathHelper.sin(t.method4433(n6) * 3.1415927f);
        this.field24257.field25183 = (this.field24267 * 50.0f - 21.0f) * 0.017453292f;
        this.field24258.field25183 = (this.field24267 * 50.0f - 21.0f) * 0.017453292f;
        this.field24255.field25183 = this.field24267 * 50.0f * 0.017453292f;
        this.field24256.field25183 = this.field24267 * 50.0f * 0.017453292f;
        this.field24260.field25183 = (this.field24267 * -40.0f - 11.0f) * 0.017453292f;
        this.field24261.field25183 = (this.field24267 * -40.0f - 11.0f) * 0.017453292f;
    }
    
    public void method17643(final T t, final float n, final float n2, final float n3) {
        super.method17558(t, n, n2, n3);
        this.field24267 = MathHelper.sin(t.method4433(n3) * 3.1415927f);
    }
}
