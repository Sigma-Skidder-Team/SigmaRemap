// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class Class5856<T extends Entity> extends Class5846<T> implements Class5855, Class5858
{
    private static String[] field24006;
    public Class6300 field24007;
    public Class6300 field24008;
    public final Class6300 field24009;
    public final Class6300 field24010;
    public final Class6300 field24011;
    public final Class6300 field24012;
    public final Class6300 field24013;
    public final Class6300 field24014;
    public final Class6300 field24015;
    
    public Class5856(final float n) {
        this(n, 64, 64);
    }
    
    public Class5856(final float n, final int n2, final int n3) {
        (this.field24007 = new Class6300(this).method18647(n2, n3)).method18642(0.0f, 0.0f, 0.0f);
        this.field24007.method18634(0, 0).method18638(-4.0f, -10.0f, -4.0f, 8.0f, 10.0f, 8.0f, n);
        (this.field24008 = new Class6300(this).method18647(n2, n3)).method18642(0.0f, 0.0f, 0.0f);
        this.field24008.method18634(32, 0).method18638(-4.0f, -10.0f, -4.0f, 8.0f, 10.0f, 8.0f, n + 0.5f);
        this.field24007.method18633(this.field24008);
        (this.field24009 = new Class6300(this).method18647(n2, n3)).method18642(0.0f, 0.0f, 0.0f);
        this.field24009.method18634(30, 47).method18638(-8.0f, -8.0f, -6.0f, 16.0f, 16.0f, 1.0f, n);
        this.field24009.field25183 = -1.5707964f;
        this.field24008.method18633(this.field24009);
        (this.field24015 = new Class6300(this).method18647(n2, n3)).method18642(0.0f, -2.0f, 0.0f);
        this.field24015.method18634(24, 0).method18638(-1.0f, -1.0f, -6.0f, 2.0f, 4.0f, 2.0f, n);
        this.field24007.method18633(this.field24015);
        (this.field24010 = new Class6300(this).method18647(n2, n3)).method18642(0.0f, 0.0f, 0.0f);
        this.field24010.method18634(16, 20).method18638(-4.0f, 0.0f, -3.0f, 8.0f, 12.0f, 6.0f, n);
        (this.field24011 = new Class6300(this).method18647(n2, n3)).method18642(0.0f, 0.0f, 0.0f);
        this.field24011.method18634(0, 38).method18638(-4.0f, 0.0f, -3.0f, 8.0f, 18.0f, 6.0f, n + 0.5f);
        this.field24010.method18633(this.field24011);
        (this.field24012 = new Class6300(this).method18647(n2, n3)).method18642(0.0f, 2.0f, 0.0f);
        this.field24012.method18634(44, 22).method18638(-8.0f, -2.0f, -2.0f, 4.0f, 8.0f, 4.0f, n);
        this.field24012.method18634(44, 22).method18640(4.0f, -2.0f, -2.0f, 4.0f, 8.0f, 4.0f, n, true);
        this.field24012.method18634(40, 38).method18638(-4.0f, 2.0f, -2.0f, 8.0f, 4.0f, 4.0f, n);
        (this.field24013 = new Class6300(this, 0, 22).method18647(n2, n3)).method18642(-2.0f, 12.0f, 0.0f);
        this.field24013.method18638(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, n);
        this.field24014 = new Class6300(this, 0, 22).method18647(n2, n3);
        this.field24014.field25186 = true;
        this.field24014.method18642(2.0f, 12.0f, 0.0f);
        this.field24014.method18638(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, n);
    }
    
    @Override
    public Iterable<Class6300> method17570() {
        return (Iterable<Class6300>)ImmutableList.of((Object)this.field24007, (Object)this.field24010, (Object)this.field24013, (Object)this.field24014, (Object)this.field24012);
    }
    
    @Override
    public void method17557(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
        int n6 = 0;
        if (t instanceof Class819) {
            n6 = ((((Class819)t).method4819() > 0) ? 1 : 0);
        }
        this.field24007.field25184 = n4 * 0.017453292f;
        this.field24007.field25183 = n5 * 0.017453292f;
        if (n6 == 0) {
            this.field24007.field25185 = 0.0f;
        }
        else {
            this.field24007.field25185 = 0.3f * MathHelper.sin(0.45f * n3);
            this.field24007.field25183 = 0.4f;
        }
        this.field24012.field25181 = 3.0f;
        this.field24012.field25182 = -1.0f;
        this.field24012.field25183 = -0.75f;
        this.field24013.field25183 = MathHelper.cos(n * 0.6662f) * 1.4f * n2 * 0.5f;
        this.field24014.field25183 = MathHelper.cos(n * 0.6662f + 3.1415927f) * 1.4f * n2 * 0.5f;
        this.field24013.field25184 = 0.0f;
        this.field24014.field25184 = 0.0f;
    }
    
    @Override
    public Class6300 method17577() {
        return this.field24007;
    }
    
    @Override
    public void method17589(final boolean field25187) {
        this.field24007.field25187 = field25187;
        this.field24008.field25187 = field25187;
        this.field24009.field25187 = field25187;
    }
}
