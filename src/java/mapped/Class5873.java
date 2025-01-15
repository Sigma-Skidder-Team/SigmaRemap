// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;

public class Class5873 extends Class5846<Class856>
{
    private static String[] field24067;
    private final Class6300 field24068;
    private final Class6300 field24069;
    private final Class6300 field24070;
    private final Class6300 field24071;
    private final Class6300 field24072;
    private final Class6300 field24073;
    
    public Class5873() {
        this.field24269 = 64;
        this.field24270 = 64;
        (this.field24068 = new Class6300(this, 0, 0)).method18636(-3.0f, -3.0f, -3.0f, 6.0f, 6.0f, 6.0f);
        final Class6300 class6300 = new Class6300(this, 24, 0);
        class6300.method18636(-4.0f, -6.0f, -2.0f, 3.0f, 4.0f, 1.0f);
        this.field24068.method18633(class6300);
        final Class6300 class6301 = new Class6300(this, 24, 0);
        class6301.field25186 = true;
        class6301.method18636(1.0f, -6.0f, -2.0f, 3.0f, 4.0f, 1.0f);
        this.field24068.method18633(class6301);
        (this.field24069 = new Class6300(this, 0, 16)).method18636(-3.0f, 4.0f, -3.0f, 6.0f, 12.0f, 6.0f);
        this.field24069.method18634(0, 34).method18636(-5.0f, 16.0f, 0.0f, 10.0f, 6.0f, 1.0f);
        (this.field24070 = new Class6300(this, 42, 0)).method18636(-12.0f, 1.0f, 1.5f, 10.0f, 16.0f, 1.0f);
        (this.field24072 = new Class6300(this, 24, 16)).method18642(-12.0f, 1.0f, 1.5f);
        this.field24072.method18636(-8.0f, 1.0f, 0.0f, 8.0f, 12.0f, 1.0f);
        this.field24071 = new Class6300(this, 42, 0);
        this.field24071.field25186 = true;
        this.field24071.method18636(2.0f, 1.0f, 1.5f, 10.0f, 16.0f, 1.0f);
        this.field24073 = new Class6300(this, 24, 16);
        this.field24073.field25186 = true;
        this.field24073.method18642(12.0f, 1.0f, 1.5f);
        this.field24073.method18636(0.0f, 1.0f, 0.0f, 8.0f, 12.0f, 1.0f);
        this.field24069.method18633(this.field24070);
        this.field24069.method18633(this.field24071);
        this.field24070.method18633(this.field24072);
        this.field24071.method18633(this.field24073);
    }
    
    @Override
    public Iterable<Class6300> method17570() {
        return (Iterable<Class6300>)ImmutableList.of((Object)this.field24068, (Object)this.field24069);
    }
    
    public void method17614(final Class856 class856, final float n, final float n2, final float n3, final float n4, final float n5) {
        if (!class856.method5144()) {
            this.field24068.field25183 = n5 * 0.017453292f;
            this.field24068.field25184 = n4 * 0.017453292f;
            this.field24068.field25185 = 0.0f;
            this.field24068.method18642(0.0f, 0.0f, 0.0f);
            this.field24070.method18642(0.0f, 0.0f, 0.0f);
            this.field24071.method18642(0.0f, 0.0f, 0.0f);
            this.field24069.field25183 = 0.7853982f + Class9546.method35639(n3 * 0.1f) * 0.15f;
            this.field24069.field25184 = 0.0f;
            this.field24070.field25184 = Class9546.method35639(n3 * 1.3f) * 3.1415927f * 0.25f;
            this.field24071.field25184 = -this.field24070.field25184;
            this.field24072.field25184 = this.field24070.field25184 * 0.5f;
            this.field24073.field25184 = -this.field24070.field25184 * 0.5f;
        }
        else {
            this.field24068.field25183 = n5 * 0.017453292f;
            this.field24068.field25184 = 3.1415927f - n4 * 0.017453292f;
            this.field24068.field25185 = 3.1415927f;
            this.field24068.method18642(0.0f, -2.0f, 0.0f);
            this.field24070.method18642(-3.0f, 0.0f, 3.0f);
            this.field24071.method18642(3.0f, 0.0f, 3.0f);
            this.field24069.field25183 = 3.1415927f;
            this.field24070.field25183 = -0.15707964f;
            this.field24070.field25184 = -1.2566371f;
            this.field24072.field25184 = -1.7278761f;
            this.field24071.field25183 = this.field24070.field25183;
            this.field24071.field25184 = -this.field24070.field25184;
            this.field24073.field25184 = -this.field24072.field25184;
        }
    }
}
