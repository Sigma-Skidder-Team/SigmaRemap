// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;

public class Class5889<T extends Class399> extends Class5846<T>
{
    private static String[] field24168;
    private final Class6300 field24169;
    private final Class6300 field24170;
    private final Class6300 field24171;
    private final Class6300 field24172;
    private final Class6300 field24173;
    private final Class6300 field24174;
    private final Class6300 field24175;
    private final Class6300 field24176;
    private final Class6300 field24177;
    private final Class6300 field24178;
    private final Class6300 field24179;
    private final Class6300 field24180;
    private final Class6300 field24181;
    
    public Class5889() {
        this.field24269 = 32;
        this.field24270 = 32;
        (this.field24169 = new Class6300(this, 0, 0)).method18636(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f);
        this.field24169.method18642(0.0f, 22.0f, 0.0f);
        (this.field24170 = new Class6300(this, 24, 0)).method18636(-2.0f, 0.0f, -1.0f, 2.0f, 1.0f, 2.0f);
        this.field24170.method18642(-4.0f, 15.0f, -2.0f);
        (this.field24171 = new Class6300(this, 24, 3)).method18636(0.0f, 0.0f, -1.0f, 2.0f, 1.0f, 2.0f);
        this.field24171.method18642(4.0f, 15.0f, -2.0f);
        (this.field24172 = new Class6300(this, 15, 17)).method18636(-4.0f, -1.0f, 0.0f, 8.0f, 1.0f, 0.0f);
        this.field24172.method18642(0.0f, 14.0f, -4.0f);
        this.field24172.field25183 = 0.7853982f;
        (this.field24173 = new Class6300(this, 14, 16)).method18636(-4.0f, -1.0f, 0.0f, 8.0f, 1.0f, 1.0f);
        this.field24173.method18642(0.0f, 14.0f, 0.0f);
        (this.field24174 = new Class6300(this, 23, 18)).method18636(-4.0f, -1.0f, 0.0f, 8.0f, 1.0f, 0.0f);
        this.field24174.method18642(0.0f, 14.0f, 4.0f);
        this.field24174.field25183 = -0.7853982f;
        (this.field24175 = new Class6300(this, 5, 17)).method18636(-1.0f, -8.0f, 0.0f, 1.0f, 8.0f, 0.0f);
        this.field24175.method18642(-4.0f, 22.0f, -4.0f);
        this.field24175.field25184 = -0.7853982f;
        (this.field24176 = new Class6300(this, 1, 17)).method18636(0.0f, -8.0f, 0.0f, 1.0f, 8.0f, 0.0f);
        this.field24176.method18642(4.0f, 22.0f, -4.0f);
        this.field24176.field25184 = 0.7853982f;
        (this.field24177 = new Class6300(this, 15, 20)).method18636(-4.0f, 0.0f, 0.0f, 8.0f, 1.0f, 0.0f);
        this.field24177.method18642(0.0f, 22.0f, -4.0f);
        this.field24177.field25183 = -0.7853982f;
        (this.field24179 = new Class6300(this, 15, 20)).method18636(-4.0f, 0.0f, 0.0f, 8.0f, 1.0f, 0.0f);
        this.field24179.method18642(0.0f, 22.0f, 0.0f);
        (this.field24178 = new Class6300(this, 15, 20)).method18636(-4.0f, 0.0f, 0.0f, 8.0f, 1.0f, 0.0f);
        this.field24178.method18642(0.0f, 22.0f, 4.0f);
        this.field24178.field25183 = 0.7853982f;
        (this.field24180 = new Class6300(this, 9, 17)).method18636(-1.0f, -8.0f, 0.0f, 1.0f, 8.0f, 0.0f);
        this.field24180.method18642(-4.0f, 22.0f, 4.0f);
        this.field24180.field25184 = 0.7853982f;
        (this.field24181 = new Class6300(this, 9, 17)).method18636(0.0f, -8.0f, 0.0f, 1.0f, 8.0f, 0.0f);
        this.field24181.method18642(4.0f, 22.0f, 4.0f);
        this.field24181.field25184 = -0.7853982f;
    }
    
    @Override
    public Iterable<Class6300> method17570() {
        return (Iterable<Class6300>)ImmutableList.of((Object)this.field24169, (Object)this.field24170, (Object)this.field24171, (Object)this.field24172, (Object)this.field24173, (Object)this.field24174, (Object)this.field24175, (Object)this.field24181, (Object)this.field24177, (Object)this.field24179, (Object)this.field24178, (Object)this.field24180, (Object[])new Class6300[] { this.field24181 });
    }
    
    @Override
    public void method17557(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
        this.field24170.field25185 = -0.2f + 0.4f * Class9546.method35638(n3 * 0.2f);
        this.field24171.field25185 = 0.2f - 0.4f * Class9546.method35638(n3 * 0.2f);
    }
}
