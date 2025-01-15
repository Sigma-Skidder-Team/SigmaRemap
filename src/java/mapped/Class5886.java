// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;

public class Class5886<T extends Class399> extends Class5846<T>
{
    private static String[] field24160;
    private final Class6300[] field24161;
    
    public Class5886() {
        (this.field24161 = new Class6300[6])[0] = new Class6300(this, 0, 10);
        this.field24161[1] = new Class6300(this, 0, 0);
        this.field24161[2] = new Class6300(this, 0, 0);
        this.field24161[3] = new Class6300(this, 0, 0);
        this.field24161[4] = new Class6300(this, 0, 0);
        this.field24161[5] = new Class6300(this, 44, 10);
        this.field24161[0].method18638(-10.0f, -8.0f, -1.0f, 20.0f, 16.0f, 2.0f, 0.0f);
        this.field24161[0].method18642(0.0f, 4.0f, 0.0f);
        this.field24161[5].method18638(-9.0f, -7.0f, -1.0f, 18.0f, 14.0f, 1.0f, 0.0f);
        this.field24161[5].method18642(0.0f, 4.0f, 0.0f);
        this.field24161[1].method18638(-8.0f, -9.0f, -1.0f, 16.0f, 8.0f, 2.0f, 0.0f);
        this.field24161[1].method18642(-9.0f, 4.0f, 0.0f);
        this.field24161[2].method18638(-8.0f, -9.0f, -1.0f, 16.0f, 8.0f, 2.0f, 0.0f);
        this.field24161[2].method18642(9.0f, 4.0f, 0.0f);
        this.field24161[3].method18638(-8.0f, -9.0f, -1.0f, 16.0f, 8.0f, 2.0f, 0.0f);
        this.field24161[3].method18642(0.0f, 4.0f, -7.0f);
        this.field24161[4].method18638(-8.0f, -9.0f, -1.0f, 16.0f, 8.0f, 2.0f, 0.0f);
        this.field24161[4].method18642(0.0f, 4.0f, 7.0f);
        this.field24161[0].field25183 = 1.5707964f;
        this.field24161[1].field25184 = 4.712389f;
        this.field24161[2].field25184 = 1.5707964f;
        this.field24161[3].field25184 = 3.1415927f;
        this.field24161[5].field25183 = -1.5707964f;
    }
    
    @Override
    public void method17557(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
        this.field24161[5].field25181 = 4.0f - n3;
    }
    
    @Override
    public Iterable<Class6300> method17570() {
        return Arrays.asList(this.field24161);
    }
}
