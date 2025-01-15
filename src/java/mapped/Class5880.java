// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;

public class Class5880<T extends Class399> extends Class5846<T>
{
    private static String[] field24111;
    private final Class6300 field24112;
    private final Class6300 field24113;
    private final Class6300 field24114;
    private final Class6300 field24115;
    private final Class6300 field24116;
    private final Class6300 field24117;
    private final Class6300 field24118;
    private final Class6300 field24119;
    private final Class6300 field24120;
    private final Class6300 field24121;
    private final Class6300 field24122;
    
    public Class5880() {
        (this.field24112 = new Class6300(this, 32, 4)).method18638(-4.0f, -4.0f, -8.0f, 8.0f, 8.0f, 8.0f, 0.0f);
        this.field24112.method18642(0.0f, 15.0f, -3.0f);
        (this.field24113 = new Class6300(this, 0, 0)).method18638(-3.0f, -3.0f, -3.0f, 6.0f, 6.0f, 6.0f, 0.0f);
        this.field24113.method18642(0.0f, 15.0f, 0.0f);
        (this.field24114 = new Class6300(this, 0, 12)).method18638(-5.0f, -4.0f, -6.0f, 10.0f, 8.0f, 12.0f, 0.0f);
        this.field24114.method18642(0.0f, 15.0f, 9.0f);
        (this.field24115 = new Class6300(this, 18, 0)).method18638(-15.0f, -1.0f, -1.0f, 16.0f, 2.0f, 2.0f, 0.0f);
        this.field24115.method18642(-4.0f, 15.0f, 2.0f);
        (this.field24116 = new Class6300(this, 18, 0)).method18638(-1.0f, -1.0f, -1.0f, 16.0f, 2.0f, 2.0f, 0.0f);
        this.field24116.method18642(4.0f, 15.0f, 2.0f);
        (this.field24117 = new Class6300(this, 18, 0)).method18638(-15.0f, -1.0f, -1.0f, 16.0f, 2.0f, 2.0f, 0.0f);
        this.field24117.method18642(-4.0f, 15.0f, 1.0f);
        (this.field24118 = new Class6300(this, 18, 0)).method18638(-1.0f, -1.0f, -1.0f, 16.0f, 2.0f, 2.0f, 0.0f);
        this.field24118.method18642(4.0f, 15.0f, 1.0f);
        (this.field24119 = new Class6300(this, 18, 0)).method18638(-15.0f, -1.0f, -1.0f, 16.0f, 2.0f, 2.0f, 0.0f);
        this.field24119.method18642(-4.0f, 15.0f, 0.0f);
        (this.field24120 = new Class6300(this, 18, 0)).method18638(-1.0f, -1.0f, -1.0f, 16.0f, 2.0f, 2.0f, 0.0f);
        this.field24120.method18642(4.0f, 15.0f, 0.0f);
        (this.field24121 = new Class6300(this, 18, 0)).method18638(-15.0f, -1.0f, -1.0f, 16.0f, 2.0f, 2.0f, 0.0f);
        this.field24121.method18642(-4.0f, 15.0f, -1.0f);
        (this.field24122 = new Class6300(this, 18, 0)).method18638(-1.0f, -1.0f, -1.0f, 16.0f, 2.0f, 2.0f, 0.0f);
        this.field24122.method18642(4.0f, 15.0f, -1.0f);
    }
    
    @Override
    public Iterable<Class6300> method17570() {
        return (Iterable<Class6300>)ImmutableList.of((Object)this.field24112, (Object)this.field24113, (Object)this.field24114, (Object)this.field24115, (Object)this.field24116, (Object)this.field24117, (Object)this.field24118, (Object)this.field24119, (Object)this.field24120, (Object)this.field24121, (Object)this.field24122);
    }
    
    @Override
    public void method17557(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
        this.field24112.field25184 = n4 * 0.017453292f;
        this.field24112.field25183 = n5 * 0.017453292f;
        this.field24115.field25185 = -0.7853982f;
        this.field24116.field25185 = 0.7853982f;
        this.field24117.field25185 = -0.58119464f;
        this.field24118.field25185 = 0.58119464f;
        this.field24119.field25185 = -0.58119464f;
        this.field24120.field25185 = 0.58119464f;
        this.field24121.field25185 = -0.7853982f;
        this.field24122.field25185 = 0.7853982f;
        this.field24115.field25184 = 0.7853982f;
        this.field24116.field25184 = -0.7853982f;
        this.field24117.field25184 = 0.3926991f;
        this.field24118.field25184 = -0.3926991f;
        this.field24119.field25184 = -0.3926991f;
        this.field24120.field25184 = 0.3926991f;
        this.field24121.field25184 = -0.7853982f;
        this.field24122.field25184 = 0.7853982f;
        final float n6 = -(Class9546.method35639(n * 0.6662f * 2.0f + 0.0f) * 0.4f) * n2;
        final float n7 = -(Class9546.method35639(n * 0.6662f * 2.0f + 3.1415927f) * 0.4f) * n2;
        final float n8 = -(Class9546.method35639(n * 0.6662f * 2.0f + 1.5707964f) * 0.4f) * n2;
        final float n9 = -(Class9546.method35639(n * 0.6662f * 2.0f + 4.712389f) * 0.4f) * n2;
        final float n10 = Math.abs(Class9546.method35638(n * 0.6662f + 0.0f) * 0.4f) * n2;
        final float n11 = Math.abs(Class9546.method35638(n * 0.6662f + 3.1415927f) * 0.4f) * n2;
        final float n12 = Math.abs(Class9546.method35638(n * 0.6662f + 1.5707964f) * 0.4f) * n2;
        final float n13 = Math.abs(Class9546.method35638(n * 0.6662f + 4.712389f) * 0.4f) * n2;
        final Class6300 field24115 = this.field24115;
        field24115.field25184 += n6;
        final Class6300 field24116 = this.field24116;
        field24116.field25184 += -n6;
        final Class6300 field24117 = this.field24117;
        field24117.field25184 += n7;
        final Class6300 field24118 = this.field24118;
        field24118.field25184 += -n7;
        final Class6300 field24119 = this.field24119;
        field24119.field25184 += n8;
        final Class6300 field24120 = this.field24120;
        field24120.field25184 += -n8;
        final Class6300 field24121 = this.field24121;
        field24121.field25184 += n9;
        final Class6300 field24122 = this.field24122;
        field24122.field25184 += -n9;
        final Class6300 field24123 = this.field24115;
        field24123.field25185 += n10;
        final Class6300 field24124 = this.field24116;
        field24124.field25185 += -n10;
        final Class6300 field24125 = this.field24117;
        field24125.field25185 += n11;
        final Class6300 field24126 = this.field24118;
        field24126.field25185 += -n11;
        final Class6300 field24127 = this.field24119;
        field24127.field25185 += n12;
        final Class6300 field24128 = this.field24120;
        field24128.field25185 += -n12;
        final Class6300 field24129 = this.field24121;
        field24129.field25185 += n13;
        final Class6300 field24130 = this.field24122;
        field24130.field25185 += -n13;
    }
}
