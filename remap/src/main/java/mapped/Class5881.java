// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class Class5881<T extends Entity> extends Class5846<T>
{
    private static String[] field24123;
    private final Class6300 field24124;
    private final Class6300 field24125;
    private final Class6300 field24126;
    private final Class6300 field24127;
    private final Class6300 field24128;
    private final Class6300 field24129;
    private final Class6300 field24130;
    
    public Class5881() {
        this(0.0f);
    }
    
    public Class5881(final float n) {
        (this.field24124 = new Class6300(this, 0, 0)).method18638(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, n);
        this.field24124.method18642(0.0f, 6.0f, 0.0f);
        (this.field24125 = new Class6300(this, 32, 0)).method18638(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, n + 0.5f);
        this.field24125.method18642(0.0f, 6.0f, 0.0f);
        (this.field24126 = new Class6300(this, 16, 16)).method18638(-4.0f, 0.0f, -2.0f, 8.0f, 12.0f, 4.0f, n);
        this.field24126.method18642(0.0f, 6.0f, 0.0f);
        (this.field24127 = new Class6300(this, 0, 16)).method18638(-2.0f, 0.0f, -2.0f, 4.0f, 6.0f, 4.0f, n);
        this.field24127.method18642(-2.0f, 18.0f, 4.0f);
        (this.field24128 = new Class6300(this, 0, 16)).method18638(-2.0f, 0.0f, -2.0f, 4.0f, 6.0f, 4.0f, n);
        this.field24128.method18642(2.0f, 18.0f, 4.0f);
        (this.field24129 = new Class6300(this, 0, 16)).method18638(-2.0f, 0.0f, -2.0f, 4.0f, 6.0f, 4.0f, n);
        this.field24129.method18642(-2.0f, 18.0f, -4.0f);
        (this.field24130 = new Class6300(this, 0, 16)).method18638(-2.0f, 0.0f, -2.0f, 4.0f, 6.0f, 4.0f, n);
        this.field24130.method18642(2.0f, 18.0f, -4.0f);
    }
    
    @Override
    public Iterable<Class6300> method17570() {
        return (Iterable<Class6300>)ImmutableList.of(this.field24124, this.field24126, this.field24127, this.field24128, this.field24129, (Object)this.field24130);
    }
    
    @Override
    public void method17557(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
        this.field24124.field25184 = n4 * 0.017453292f;
        this.field24124.field25183 = n5 * 0.017453292f;
        this.field24127.field25183 = MathHelper.cos(n * 0.6662f) * 1.4f * n2;
        this.field24128.field25183 = MathHelper.cos(n * 0.6662f + 3.1415927f) * 1.4f * n2;
        this.field24129.field25183 = MathHelper.cos(n * 0.6662f + 3.1415927f) * 1.4f * n2;
        this.field24130.field25183 = MathHelper.cos(n * 0.6662f) * 1.4f * n2;
    }
}
