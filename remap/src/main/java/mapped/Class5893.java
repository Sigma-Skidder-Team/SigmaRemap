// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;

public class Class5893<T extends Class399> extends Class5846<T>
{
    private static String[] field24195;
    private final Class6300 field24196;
    private final Class6300 field24197;
    private final Class6300 field24198;
    private final Class6300 field24199;
    private final Class6300 field24200;
    private final Class6300 field24201;
    
    public Class5893() {
        this.field24269 = 32;
        this.field24270 = 32;
        (this.field24196 = new Class6300(this, 0, 27)).method18636(-1.5f, -2.0f, -1.5f, 3.0f, 2.0f, 3.0f);
        this.field24196.method18642(0.0f, 23.0f, 0.0f);
        (this.field24197 = new Class6300(this, 24, 6)).method18636(-1.5f, 0.0f, -1.5f, 1.0f, 1.0f, 1.0f);
        this.field24197.method18642(0.0f, 20.0f, 0.0f);
        (this.field24198 = new Class6300(this, 28, 6)).method18636(0.5f, 0.0f, -1.5f, 1.0f, 1.0f, 1.0f);
        this.field24198.method18642(0.0f, 20.0f, 0.0f);
        (this.field24201 = new Class6300(this, -3, 0)).method18636(-1.5f, 0.0f, 0.0f, 3.0f, 0.0f, 3.0f);
        this.field24201.method18642(0.0f, 22.0f, 1.5f);
        (this.field24199 = new Class6300(this, 25, 0)).method18636(-1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f);
        this.field24199.method18642(-1.5f, 22.0f, -1.5f);
        (this.field24200 = new Class6300(this, 25, 0)).method18636(0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f);
        this.field24200.method18642(1.5f, 22.0f, -1.5f);
    }
    
    @Override
    public Iterable<Class6300> method17570() {
        return (Iterable<Class6300>)ImmutableList.of((Object)this.field24196, (Object)this.field24197, (Object)this.field24198, (Object)this.field24201, (Object)this.field24199, (Object)this.field24200);
    }
    
    @Override
    public void method17557(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
        this.field24199.field25185 = -0.2f + 0.4f * Class9546.method35638(n3 * 0.2f);
        this.field24200.field25185 = 0.2f - 0.4f * Class9546.method35638(n3 * 0.2f);
    }
}
