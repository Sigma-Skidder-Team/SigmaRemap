// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;

public class Class5882<T extends Class399> extends Class5846<T>
{
    private static String[] field24131;
    private final Class6300 field24132;
    private final Class6300 field24133;
    private final Class6300 field24134;
    
    public Class5882() {
        this.field24269 = 64;
        this.field24270 = 64;
        (this.field24132 = new Class6300(this, 22, 0)).method18636(-4.0f, -7.0f, 0.0f, 8.0f, 7.0f, 13.0f);
        this.field24132.method18642(0.0f, 22.0f, -5.0f);
        final Class6300 class6300 = new Class6300(this, 51, 0);
        class6300.method18636(-0.5f, 0.0f, 8.0f, 1.0f, 4.0f, 5.0f);
        class6300.field25183 = 1.0471976f;
        this.field24132.method18633(class6300);
        final Class6300 class6301 = new Class6300(this, 48, 20);
        class6301.field25186 = true;
        class6301.method18636(-0.5f, -4.0f, 0.0f, 1.0f, 4.0f, 7.0f);
        class6301.method18642(2.0f, -2.0f, 4.0f);
        class6301.field25183 = 1.0471976f;
        class6301.field25185 = 2.0943952f;
        this.field24132.method18633(class6301);
        final Class6300 class6302 = new Class6300(this, 48, 20);
        class6302.method18636(-0.5f, -4.0f, 0.0f, 1.0f, 4.0f, 7.0f);
        class6302.method18642(-2.0f, -2.0f, 4.0f);
        class6302.field25183 = 1.0471976f;
        class6302.field25185 = -2.0943952f;
        this.field24132.method18633(class6302);
        (this.field24133 = new Class6300(this, 0, 19)).method18636(-2.0f, -2.5f, 0.0f, 4.0f, 5.0f, 11.0f);
        this.field24133.method18642(0.0f, -2.5f, 11.0f);
        this.field24133.field25183 = -0.10471976f;
        this.field24132.method18633(this.field24133);
        (this.field24134 = new Class6300(this, 19, 20)).method18636(-5.0f, -0.5f, 0.0f, 10.0f, 1.0f, 6.0f);
        this.field24134.method18642(0.0f, 0.0f, 9.0f);
        this.field24134.field25183 = 0.0f;
        this.field24133.method18633(this.field24134);
        final Class6300 class6303 = new Class6300(this, 0, 0);
        class6303.method18636(-4.0f, -3.0f, -3.0f, 8.0f, 7.0f, 6.0f);
        class6303.method18642(0.0f, -4.0f, -3.0f);
        final Class6300 class6304 = new Class6300(this, 0, 13);
        class6304.method18636(-1.0f, 2.0f, -7.0f, 2.0f, 2.0f, 4.0f);
        class6303.method18633(class6304);
        this.field24132.method18633(class6303);
    }
    
    @Override
    public Iterable<Class6300> method17570() {
        return (Iterable<Class6300>)ImmutableList.of((Object)this.field24132);
    }
    
    @Override
    public void method17557(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
        this.field24132.field25183 = n5 * 0.017453292f;
        this.field24132.field25184 = n4 * 0.017453292f;
        if (Class399.method1680(t.method1935()) > 1.0E-7) {
            final Class6300 field24132 = this.field24132;
            field24132.field25183 += -0.05f + -0.05f * Class9546.method35639(n3 * 0.3f);
            this.field24133.field25183 = -0.1f * Class9546.method35639(n3 * 0.3f);
            this.field24134.field25183 = -0.2f * Class9546.method35639(n3 * 0.3f);
        }
    }
}
