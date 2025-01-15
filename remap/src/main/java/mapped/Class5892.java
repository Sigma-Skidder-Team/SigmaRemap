// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;

public class Class5892<T extends Class399> extends Class5846<T>
{
    private static String[] field24193;
    private final Class6300 field24194;
    
    public Class5892() {
        this.field24269 = 32;
        this.field24270 = 32;
        (this.field24194 = new Class6300(this, 0, 0)).method18638(-3.0f, -6.0f, -3.0f, 6.0f, 8.0f, 6.0f, 0.0f);
        this.field24194.method18642(0.0f, 0.0f, 0.0f);
    }
    
    @Override
    public Iterable<Class6300> method17570() {
        return (Iterable<Class6300>)ImmutableList.of((Object)this.field24194);
    }
    
    @Override
    public void method17557(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
        this.field24194.field25184 = n4 * 0.017453292f;
        this.field24194.field25183 = n5 * 0.017453292f;
    }
}
