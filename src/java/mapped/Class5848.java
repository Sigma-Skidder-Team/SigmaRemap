// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;

public class Class5848<T extends Class399> extends Class5847<T>
{
    private static String[] field23961;
    private final Class6300 field23962;
    private final Class6300 field23963;
    private final Class6300 field23964;
    private final Class6300 field23965;
    private final Class6300 field23966;
    private final Class6300 field23967;
    
    public Class5848(final float n) {
        this.field24269 = 32;
        this.field24270 = 32;
        (this.field23962 = new Class6300(this, 0, 20)).method18638(-1.0f, -3.0f, -3.0f, 2.0f, 6.0f, 6.0f, n);
        this.field23962.method18642(0.0f, 19.0f, 0.0f);
        (this.field23963 = new Class6300(this, 21, 16)).method18638(0.0f, -3.0f, 0.0f, 0.0f, 6.0f, 5.0f, n);
        this.field23963.method18642(0.0f, 19.0f, 3.0f);
        (this.field23964 = new Class6300(this, 2, 16)).method18638(-2.0f, 0.0f, 0.0f, 2.0f, 2.0f, 0.0f, n);
        this.field23964.method18642(-1.0f, 20.0f, 0.0f);
        this.field23964.field25184 = 0.7853982f;
        (this.field23965 = new Class6300(this, 2, 12)).method18638(0.0f, 0.0f, 0.0f, 2.0f, 2.0f, 0.0f, n);
        this.field23965.method18642(1.0f, 20.0f, 0.0f);
        this.field23965.field25184 = -0.7853982f;
        (this.field23966 = new Class6300(this, 20, 11)).method18638(0.0f, -4.0f, 0.0f, 0.0f, 4.0f, 6.0f, n);
        this.field23966.method18642(0.0f, 16.0f, -3.0f);
        (this.field23967 = new Class6300(this, 20, 21)).method18638(0.0f, 0.0f, 0.0f, 0.0f, 4.0f, 6.0f, n);
        this.field23967.method18642(0.0f, 22.0f, -3.0f);
    }
    
    @Override
    public Iterable<Class6300> method17570() {
        return (Iterable<Class6300>)ImmutableList.of((Object)this.field23962, (Object)this.field23963, (Object)this.field23964, (Object)this.field23965, (Object)this.field23966, (Object)this.field23967);
    }
    
    @Override
    public void method17557(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
        float n6 = 1.0f;
        if (!t.method1706()) {
            n6 = 1.5f;
        }
        this.field23963.field25184 = -n6 * 0.45f * Class9546.method35638(0.6f * n3);
    }
}
