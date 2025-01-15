// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;

public class Class5839<T extends Class399> extends Class5844<T>
{
    private static String[] field23935;
    public Class6300 field23936;
    public Class6300 field23937;
    public Class6300 field23938;
    public Class6300 field23939;
    public Class6300 field23940;
    public Class6300 field23941;
    
    public Class5839(final int n, final float n2, final boolean b, final float n3, final float n4, final float n5, final float n6, final int n7) {
        super(b, n3, n4, n5, n6, (float)n7);
        (this.field23936 = new Class6300(this, 0, 0)).method18638(-4.0f, -4.0f, -8.0f, 8.0f, 8.0f, 8.0f, n2);
        this.field23936.method18642(0.0f, (float)(18 - n), -6.0f);
        (this.field23937 = new Class6300(this, 28, 8)).method18638(-5.0f, -10.0f, -7.0f, 10.0f, 16.0f, 8.0f, n2);
        this.field23937.method18642(0.0f, (float)(17 - n), 2.0f);
        (this.field23938 = new Class6300(this, 0, 16)).method18638(-2.0f, 0.0f, -2.0f, 4.0f, (float)n, 4.0f, n2);
        this.field23938.method18642(-3.0f, (float)(24 - n), 7.0f);
        (this.field23939 = new Class6300(this, 0, 16)).method18638(-2.0f, 0.0f, -2.0f, 4.0f, (float)n, 4.0f, n2);
        this.field23939.method18642(3.0f, (float)(24 - n), 7.0f);
        (this.field23940 = new Class6300(this, 0, 16)).method18638(-2.0f, 0.0f, -2.0f, 4.0f, (float)n, 4.0f, n2);
        this.field23940.method18642(-3.0f, (float)(24 - n), -5.0f);
        (this.field23941 = new Class6300(this, 0, 16)).method18638(-2.0f, 0.0f, -2.0f, 4.0f, (float)n, 4.0f, n2);
        this.field23941.method18642(3.0f, (float)(24 - n), -5.0f);
    }
    
    @Override
    public Iterable<Class6300> method17559() {
        return (Iterable<Class6300>)ImmutableList.of((Object)this.field23936);
    }
    
    @Override
    public Iterable<Class6300> method17560() {
        return (Iterable<Class6300>)ImmutableList.of((Object)this.field23937, (Object)this.field23938, (Object)this.field23939, (Object)this.field23940, (Object)this.field23941);
    }
    
    @Override
    public void method17557(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
        this.field23936.field25183 = n5 * 0.017453292f;
        this.field23936.field25184 = n4 * 0.017453292f;
        this.field23937.field25183 = 1.5707964f;
        this.field23938.field25183 = Class9546.method35639(n * 0.6662f) * 1.4f * n2;
        this.field23939.field25183 = Class9546.method35639(n * 0.6662f + 3.1415927f) * 1.4f * n2;
        this.field23940.field25183 = Class9546.method35639(n * 0.6662f + 3.1415927f) * 1.4f * n2;
        this.field23941.field25183 = Class9546.method35639(n * 0.6662f) * 1.4f * n2;
    }
}
