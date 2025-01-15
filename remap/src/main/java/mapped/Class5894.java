// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;

public class Class5894<T extends Class399> extends Class5846<T>
{
    private static String[] field24202;
    private final Class6300 field24203;
    private final Class6300 field24204;
    private final Class6300 field24205;
    private final Class6300 field24206;
    private final Class6300 field24207;
    
    public Class5894() {
        (this.field24205 = new Class6300(this, 0, 0).method18647(64, 64)).method18638(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, -0.5f);
        this.field24205.method18642(0.0f, 4.0f, 0.0f);
        (this.field24206 = new Class6300(this, 32, 0).method18647(64, 64)).method18638(-1.0f, 0.0f, -1.0f, 12.0f, 2.0f, 2.0f, -0.5f);
        this.field24206.method18642(0.0f, 6.0f, 0.0f);
        (this.field24207 = new Class6300(this, 32, 0).method18647(64, 64)).method18638(-1.0f, 0.0f, -1.0f, 12.0f, 2.0f, 2.0f, -0.5f);
        this.field24207.method18642(0.0f, 6.0f, 0.0f);
        (this.field24203 = new Class6300(this, 0, 16).method18647(64, 64)).method18638(-5.0f, -10.0f, -5.0f, 10.0f, 10.0f, 10.0f, -0.5f);
        this.field24203.method18642(0.0f, 13.0f, 0.0f);
        (this.field24204 = new Class6300(this, 0, 36).method18647(64, 64)).method18638(-6.0f, -12.0f, -6.0f, 12.0f, 12.0f, 12.0f, -0.5f);
        this.field24204.method18642(0.0f, 24.0f, 0.0f);
    }
    
    @Override
    public void method17557(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
        this.field24205.field25184 = n4 * 0.017453292f;
        this.field24205.field25183 = n5 * 0.017453292f;
        this.field24203.field25184 = n4 * 0.017453292f * 0.25f;
        final float method35638 = Class9546.method35638(this.field24203.field25184);
        final float method35639 = Class9546.method35639(this.field24203.field25184);
        this.field24206.field25185 = 1.0f;
        this.field24207.field25185 = -1.0f;
        this.field24206.field25184 = 0.0f + this.field24203.field25184;
        this.field24207.field25184 = 3.1415927f + this.field24203.field25184;
        this.field24206.field25180 = method35639 * 5.0f;
        this.field24206.field25182 = -method35638 * 5.0f;
        this.field24207.field25180 = -method35639 * 5.0f;
        this.field24207.field25182 = method35638 * 5.0f;
    }
    
    @Override
    public Iterable<Class6300> method17570() {
        return (Iterable<Class6300>)ImmutableList.of((Object)this.field24203, (Object)this.field24204, (Object)this.field24205, (Object)this.field24206, (Object)this.field24207);
    }
    
    public Class6300 method17634() {
        return this.field24205;
    }
}
