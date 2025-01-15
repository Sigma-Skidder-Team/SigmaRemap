// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;

public class Class5870<T extends Class399> extends Class5846<T>
{
    private static String[] field24056;
    private final Class6300 field24057;
    
    public Class5870() {
        this(0.0f);
    }
    
    public Class5870(final float n) {
        this.field24057 = new Class6300(this);
        this.field24057.method18634(0, 0).method18638(-4.0f, 0.0f, 0.0f, 2.0f, 2.0f, 2.0f, n);
        this.field24057.method18634(0, 0).method18638(0.0f, -4.0f, 0.0f, 2.0f, 2.0f, 2.0f, n);
        this.field24057.method18634(0, 0).method18638(0.0f, 0.0f, -4.0f, 2.0f, 2.0f, 2.0f, n);
        this.field24057.method18634(0, 0).method18638(0.0f, 0.0f, 0.0f, 2.0f, 2.0f, 2.0f, n);
        this.field24057.method18634(0, 0).method18638(2.0f, 0.0f, 0.0f, 2.0f, 2.0f, 2.0f, n);
        this.field24057.method18634(0, 0).method18638(0.0f, 2.0f, 0.0f, 2.0f, 2.0f, 2.0f, n);
        this.field24057.method18634(0, 0).method18638(0.0f, 0.0f, 2.0f, 2.0f, 2.0f, 2.0f, n);
        this.field24057.method18642(0.0f, 0.0f, 0.0f);
    }
    
    @Override
    public void method17557(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
    }
    
    @Override
    public Iterable<Class6300> method17570() {
        return (Iterable<Class6300>)ImmutableList.of((Object)this.field24057);
    }
}
