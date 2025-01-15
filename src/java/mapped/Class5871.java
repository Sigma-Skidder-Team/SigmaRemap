// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;

public class Class5871<T extends Class399> extends Class5846<T>
{
    private static String[] field24058;
    private final Class6300 field24059;
    private final Class6300 field24060;
    private final Class6300 field24061;
    private final Class6300 field24062;
    
    public Class5871(final int n) {
        this.field24059 = new Class6300(this, 0, n);
        this.field24060 = new Class6300(this, 32, 0);
        this.field24061 = new Class6300(this, 32, 4);
        this.field24062 = new Class6300(this, 32, 8);
        if (n <= 0) {
            this.field24059.method18636(-4.0f, 16.0f, -4.0f, 8.0f, 8.0f, 8.0f);
        }
        else {
            this.field24059.method18636(-3.0f, 17.0f, -3.0f, 6.0f, 6.0f, 6.0f);
            this.field24060.method18636(-3.25f, 18.0f, -3.5f, 2.0f, 2.0f, 2.0f);
            this.field24061.method18636(1.25f, 18.0f, -3.5f, 2.0f, 2.0f, 2.0f);
            this.field24062.method18636(0.0f, 21.0f, -3.5f, 1.0f, 1.0f, 1.0f);
        }
    }
    
    @Override
    public void method17557(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
    }
    
    @Override
    public Iterable<Class6300> method17570() {
        return (Iterable<Class6300>)ImmutableList.of((Object)this.field24059, (Object)this.field24060, (Object)this.field24061, (Object)this.field24062);
    }
}
