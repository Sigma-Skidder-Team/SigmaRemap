// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class Class5891<T extends Entity> extends Class5846<T>
{
    private static String[] field24185;
    private final Class6300 field24186;
    private final Class6300 field24187;
    private final Class6300 field24188;
    private final Class6300 field24189;
    private final Class6300 field24190;
    private final Class6300 field24191;
    private final Class6300 field24192;
    
    public Class5891() {
        this.field24269 = 64;
        this.field24270 = 64;
        (this.field24186 = new Class6300(this, 0, 8)).method18636(-3.0f, -2.0f, -8.0f, 5.0f, 3.0f, 9.0f);
        (this.field24191 = new Class6300(this, 3, 20)).method18636(-2.0f, 0.0f, 0.0f, 3.0f, 2.0f, 6.0f);
        this.field24191.method18642(0.0f, -2.0f, 1.0f);
        this.field24186.method18633(this.field24191);
        (this.field24192 = new Class6300(this, 4, 29)).method18636(-1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 6.0f);
        this.field24192.method18642(0.0f, 0.5f, 6.0f);
        this.field24191.method18633(this.field24192);
        (this.field24187 = new Class6300(this, 23, 12)).method18636(0.0f, 0.0f, 0.0f, 6.0f, 2.0f, 9.0f);
        this.field24187.method18642(2.0f, -2.0f, -8.0f);
        (this.field24188 = new Class6300(this, 16, 24)).method18636(0.0f, 0.0f, 0.0f, 13.0f, 1.0f, 9.0f);
        this.field24188.method18642(6.0f, 0.0f, 0.0f);
        this.field24187.method18633(this.field24188);
        this.field24189 = new Class6300(this, 23, 12);
        this.field24189.field25186 = true;
        this.field24189.method18636(-6.0f, 0.0f, 0.0f, 6.0f, 2.0f, 9.0f);
        this.field24189.method18642(-3.0f, -2.0f, -8.0f);
        this.field24190 = new Class6300(this, 16, 24);
        this.field24190.field25186 = true;
        this.field24190.method18636(-13.0f, 0.0f, 0.0f, 13.0f, 1.0f, 9.0f);
        this.field24190.method18642(-6.0f, 0.0f, 0.0f);
        this.field24189.method18633(this.field24190);
        this.field24187.field25185 = 0.1f;
        this.field24188.field25185 = 0.1f;
        this.field24189.field25185 = -0.1f;
        this.field24190.field25185 = -0.1f;
        this.field24186.field25183 = -0.1f;
        final Class6300 class6300 = new Class6300(this, 0, 0);
        class6300.method18636(-4.0f, -2.0f, -5.0f, 7.0f, 3.0f, 5.0f);
        class6300.method18642(0.0f, 1.0f, -7.0f);
        class6300.field25183 = 0.2f;
        this.field24186.method18633(class6300);
        this.field24186.method18633(this.field24187);
        this.field24186.method18633(this.field24189);
    }
    
    @Override
    public Iterable<Class6300> method17570() {
        return (Iterable<Class6300>)ImmutableList.of((Object)this.field24186);
    }
    
    @Override
    public void method17557(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
        final float n6 = (t.method1643() * 3 + n3) * 0.13f;
        this.field24187.field25185 = MathHelper.cos(n6) * 16.0f * 0.017453292f;
        this.field24188.field25185 = MathHelper.cos(n6) * 16.0f * 0.017453292f;
        this.field24189.field25185 = -this.field24187.field25185;
        this.field24190.field25185 = -this.field24188.field25185;
        this.field24191.field25183 = -(5.0f + MathHelper.cos(n6 * 2.0f) * 5.0f) * 0.017453292f;
        this.field24192.field25183 = -(5.0f + MathHelper.cos(n6 * 2.0f) * 5.0f) * 0.017453292f;
    }
}
