// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class Class5849<T extends Entity> extends Class5847<T>
{
    private static String[] field23968;
    private final Class6300 field23969;
    private final Class6300 field23970;
    private final Class6300 field23971;
    private final Class6300 field23972;
    private final Class6300 field23973;
    
    public Class5849(final float n) {
        this.field24269 = 32;
        this.field24270 = 32;
        (this.field23969 = new Class6300(this, 0, 0)).method18638(-1.0f, -1.5f, -3.0f, 2.0f, 3.0f, 6.0f, n);
        this.field23969.method18642(0.0f, 22.0f, 0.0f);
        (this.field23970 = new Class6300(this, 22, -6)).method18638(0.0f, -1.5f, 0.0f, 0.0f, 3.0f, 6.0f, n);
        this.field23970.method18642(0.0f, 22.0f, 3.0f);
        (this.field23971 = new Class6300(this, 2, 16)).method18638(-2.0f, -1.0f, 0.0f, 2.0f, 2.0f, 0.0f, n);
        this.field23971.method18642(-1.0f, 22.5f, 0.0f);
        this.field23971.field25184 = 0.7853982f;
        (this.field23972 = new Class6300(this, 2, 12)).method18638(0.0f, -1.0f, 0.0f, 2.0f, 2.0f, 0.0f, n);
        this.field23972.method18642(1.0f, 22.5f, 0.0f);
        this.field23972.field25184 = -0.7853982f;
        (this.field23973 = new Class6300(this, 10, -5)).method18638(0.0f, -3.0f, 0.0f, 0.0f, 3.0f, 6.0f, n);
        this.field23973.method18642(0.0f, 20.5f, -3.0f);
    }
    
    @Override
    public Iterable<Class6300> method17570() {
        return (Iterable<Class6300>)ImmutableList.of((Object)this.field23969, (Object)this.field23970, (Object)this.field23971, (Object)this.field23972, (Object)this.field23973);
    }
    
    @Override
    public void method17557(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
        float n6 = 1.0f;
        if (!t.method1706()) {
            n6 = 1.5f;
        }
        this.field23970.field25184 = -n6 * 0.45f * MathHelper.sin(0.6f * n3);
    }
}
