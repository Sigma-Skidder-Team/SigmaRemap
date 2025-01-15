// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.util.math.MathHelper;

public class Class5884 extends Class5846<Class779>
{
    private static String[] field24147;
    private final Class6300 field24148;
    private final Class6300 field24149;
    private final Class6300 field24150;
    private final Class6300 field24151;
    private final Class6300 field24152;
    private final Class6300 field24153;
    private final Class6300 field24154;
    private final Class6300 field24155;
    
    public Class5884() {
        this.field24269 = 128;
        this.field24270 = 128;
        (this.field24155 = new Class6300(this)).method18642(0.0f, -7.0f, -1.5f);
        this.field24155.method18634(68, 73).method18638(-5.0f, -1.0f, -18.0f, 10.0f, 10.0f, 18.0f, 0.0f);
        (this.field24148 = new Class6300(this)).method18642(0.0f, 16.0f, -17.0f);
        this.field24148.method18634(0, 0).method18638(-8.0f, -20.0f, -14.0f, 16.0f, 20.0f, 16.0f, 0.0f);
        this.field24148.method18634(0, 0).method18638(-2.0f, -6.0f, -18.0f, 4.0f, 8.0f, 4.0f, 0.0f);
        final Class6300 class6300 = new Class6300(this);
        class6300.method18642(-10.0f, -14.0f, -8.0f);
        class6300.method18634(74, 55).method18638(0.0f, -14.0f, -2.0f, 2.0f, 14.0f, 4.0f, 0.0f);
        class6300.field25183 = 1.0995574f;
        this.field24148.method18633(class6300);
        final Class6300 class6301 = new Class6300(this);
        class6301.field25186 = true;
        class6301.method18642(8.0f, -14.0f, -8.0f);
        class6301.method18634(74, 55).method18638(0.0f, -14.0f, -2.0f, 2.0f, 14.0f, 4.0f, 0.0f);
        class6301.field25183 = 1.0995574f;
        this.field24148.method18633(class6301);
        (this.field24149 = new Class6300(this)).method18642(0.0f, -2.0f, 2.0f);
        this.field24149.method18634(0, 36).method18638(-8.0f, 0.0f, -16.0f, 16.0f, 3.0f, 16.0f, 0.0f);
        this.field24148.method18633(this.field24149);
        this.field24155.method18633(this.field24148);
        this.field24150 = new Class6300(this);
        this.field24150.method18634(0, 55).method18638(-7.0f, -10.0f, -7.0f, 14.0f, 16.0f, 20.0f, 0.0f);
        this.field24150.method18634(0, 91).method18638(-6.0f, 6.0f, -7.0f, 12.0f, 13.0f, 18.0f, 0.0f);
        this.field24150.method18642(0.0f, 1.0f, 2.0f);
        (this.field24151 = new Class6300(this, 96, 0)).method18638(-4.0f, 0.0f, -4.0f, 8.0f, 37.0f, 8.0f, 0.0f);
        this.field24151.method18642(-8.0f, -13.0f, 18.0f);
        this.field24152 = new Class6300(this, 96, 0);
        this.field24152.field25186 = true;
        this.field24152.method18638(-4.0f, 0.0f, -4.0f, 8.0f, 37.0f, 8.0f, 0.0f);
        this.field24152.method18642(8.0f, -13.0f, 18.0f);
        (this.field24153 = new Class6300(this, 64, 0)).method18638(-4.0f, 0.0f, -4.0f, 8.0f, 37.0f, 8.0f, 0.0f);
        this.field24153.method18642(-8.0f, -13.0f, -5.0f);
        this.field24154 = new Class6300(this, 64, 0);
        this.field24154.field25186 = true;
        this.field24154.method18638(-4.0f, 0.0f, -4.0f, 8.0f, 37.0f, 8.0f, 0.0f);
        this.field24154.method18642(8.0f, -13.0f, -5.0f);
    }
    
    @Override
    public Iterable<Class6300> method17570() {
        return (Iterable<Class6300>)ImmutableList.of((Object)this.field24155, (Object)this.field24150, (Object)this.field24151, (Object)this.field24152, (Object)this.field24153, (Object)this.field24154);
    }
    
    public void method17627(final Class779 class779, final float n, final float n2, final float n3, final float n4, final float n5) {
        this.field24148.field25183 = n5 * 0.017453292f;
        this.field24148.field25184 = n4 * 0.017453292f;
        this.field24150.field25183 = 1.5707964f;
        final float n6 = 0.4f * n2;
        this.field24151.field25183 = MathHelper.cos(n * 0.6662f) * n6;
        this.field24152.field25183 = MathHelper.cos(n * 0.6662f + 3.1415927f) * n6;
        this.field24153.field25183 = MathHelper.cos(n * 0.6662f + 3.1415927f) * n6;
        this.field24154.field25183 = MathHelper.cos(n * 0.6662f) * n6;
    }
    
    public void method17628(final Class779 class779, final float n, final float n2, final float n3) {
        super.method17558(class779, n, n2, n3);
        final int method4325 = class779.method4325();
        final int method4326 = class779.method4326();
        final int method4327 = class779.method4324();
        if (method4327 <= 0) {
            final float n4 = -1.0f * MathHelper.sin(this.field24155.field25183);
            this.field24155.field25180 = 0.0f;
            this.field24155.field25181 = -7.0f - n4;
            this.field24155.field25182 = 5.5f;
            final boolean b = method4325 > 0;
            this.field24155.field25183 = (b ? 0.21991149f : 0.0f);
            this.field24149.field25183 = 3.1415927f * (b ? 0.05f : 0.01f);
            if (!b) {
                if (method4326 > 0) {
                    this.field24149.field25183 = 1.5707964f * MathHelper.sin((20 - method4326 - n3) / 20.0f * 3.1415927f * 0.25f);
                }
            }
            else {
                this.field24155.field25180 = (float)Math.sin(method4325 / 40.0 * 10.0) * 3.0f;
            }
        }
        else {
            final float n5 = (1.0f + this.method17629(method4327 - n3, 10.0f)) * 0.5f;
            final float n6 = n5 * n5 * n5 * 12.0f;
            final float n7 = n6 * MathHelper.sin(this.field24155.field25183);
            this.field24155.field25182 = -6.5f + n6;
            this.field24155.field25181 = -7.0f - n7;
            this.field24149.field25183 = 1.5707964f * MathHelper.sin((method4327 - n3) / 10.0f * 3.1415927f * 0.25f);
            if (method4327 <= 5) {
                this.field24149.field25183 = 0.15707964f * MathHelper.sin(3.1415927f * (method4327 - n3) / 10.0f);
            }
            else {
                this.field24149.field25183 = MathHelper.sin((-4 + method4327 - n3) / 4.0f) * 3.1415927f * 0.4f;
            }
        }
    }
    
    private float method17629(final float n, final float n2) {
        return (Math.abs(n % n2 - n2 * 0.5f) - n2 * 0.25f) / (n2 * 0.25f);
    }
}
