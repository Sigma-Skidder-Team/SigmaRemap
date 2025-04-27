// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class Class5850<T extends Entity> extends Class5846<T>
{
    private static String[] field23974;
    private final Class6300 field23975;
    private final Class6300 field23976;
    private final Class6300 field23977;
    private final Class6300 field23978;
    private final Class6300 field23979;
    private final Class6300 field23980;
    private final Class6300 field23981;
    
    public Class5850() {
        this.field24269 = 32;
        this.field24270 = 32;
        (this.field23975 = new Class6300(this, 0, 0)).method18636(-1.0f, -2.0f, 0.0f, 2.0f, 4.0f, 7.0f);
        this.field23975.method18642(0.0f, 22.0f, 0.0f);
        (this.field23977 = new Class6300(this, 11, 0)).method18636(-1.0f, -2.0f, -3.0f, 2.0f, 4.0f, 3.0f);
        this.field23977.method18642(0.0f, 22.0f, 0.0f);
        (this.field23978 = new Class6300(this, 0, 0)).method18636(-1.0f, -2.0f, -1.0f, 2.0f, 3.0f, 1.0f);
        this.field23978.method18642(0.0f, 22.0f, -3.0f);
        (this.field23979 = new Class6300(this, 22, 1)).method18636(-2.0f, 0.0f, -1.0f, 2.0f, 0.0f, 2.0f);
        this.field23979.method18642(-1.0f, 23.0f, 0.0f);
        this.field23979.field25185 = -0.7853982f;
        (this.field23980 = new Class6300(this, 22, 4)).method18636(0.0f, 0.0f, -1.0f, 2.0f, 0.0f, 2.0f);
        this.field23980.method18642(1.0f, 23.0f, 0.0f);
        this.field23980.field25185 = 0.7853982f;
        (this.field23981 = new Class6300(this, 22, 3)).method18636(0.0f, -2.0f, 0.0f, 0.0f, 4.0f, 4.0f);
        this.field23981.method18642(0.0f, 22.0f, 7.0f);
        (this.field23976 = new Class6300(this, 20, -6)).method18636(0.0f, -1.0f, -1.0f, 0.0f, 1.0f, 6.0f);
        this.field23976.method18642(0.0f, 20.0f, 0.0f);
    }
    
    @Override
    public Iterable<Class6300> method17570() {
        return (Iterable<Class6300>)ImmutableList.of(this.field23975, this.field23977, this.field23978, this.field23979, this.field23980, this.field23981, (Object)this.field23976);
    }
    
    @Override
    public void method17557(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
        float n6 = 1.0f;
        if (!t.method1706()) {
            n6 = 1.5f;
        }
        this.field23981.field25184 = -n6 * 0.45f * MathHelper.sin(0.6f * n3);
    }
}
