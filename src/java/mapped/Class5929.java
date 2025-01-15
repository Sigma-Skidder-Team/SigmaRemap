// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5929<T extends Class812> extends Class5928<T>
{
    private static String[] field24388;
    private final Class6300 field24389;
    private final Class6300 field24390;
    
    public Class5929(final float n) {
        super(n);
        (this.field24389 = new Class6300(this, 26, 21)).method18636(-4.0f, 0.0f, -2.0f, 8.0f, 8.0f, 3.0f);
        (this.field24390 = new Class6300(this, 26, 21)).method18636(-4.0f, 0.0f, -2.0f, 8.0f, 8.0f, 3.0f);
        this.field24389.field25184 = -1.5707964f;
        this.field24390.field25184 = 1.5707964f;
        this.field24389.method18642(6.0f, -8.0f, 0.0f);
        this.field24390.method18642(-6.0f, -8.0f, 0.0f);
        this.field24375.method18633(this.field24389);
        this.field24375.method18633(this.field24390);
    }
    
    @Override
    public void method17800(final Class6300 class6300) {
        final Class6300 class6301 = new Class6300(this, 0, 12);
        class6301.method18636(-1.0f, -7.0f, 0.0f, 2.0f, 7.0f, 1.0f);
        class6301.method18642(1.25f, -10.0f, 4.0f);
        final Class6300 class6302 = new Class6300(this, 0, 12);
        class6302.method18636(-1.0f, -7.0f, 0.0f, 2.0f, 7.0f, 1.0f);
        class6302.method18642(-1.25f, -10.0f, 4.0f);
        class6301.field25183 = 0.2617994f;
        class6301.field25185 = 0.2617994f;
        class6302.field25183 = 0.2617994f;
        class6302.field25185 = -0.2617994f;
        class6300.method18633(class6301);
        class6300.method18633(class6302);
    }
    
    public void method17638(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
        super.method17801(t, n, n2, n3, n4, n5);
        if (!t.method4780()) {
            this.field24389.field25187 = false;
            this.field24390.field25187 = false;
        }
        else {
            this.field24389.field25187 = true;
            this.field24390.field25187 = true;
        }
    }
}
