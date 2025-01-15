// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.util.math.MathHelper;

public class Class5922<T extends Class799> extends Class5921<T>
{
    private static String[] field24324;
    private final Class6300 field24325;
    private final Class6300 field24326;
    private final Class6300 field24327;
    private final Class6300 field24328;
    private final Class6300 field24329;
    private final Class6300 field24330;
    private final Class6300 field24331;
    private final Class6300 field24332;
    private final Class6300 field24333;
    private final Class6300 field24334;
    
    public Class5922() {
        (this.field24325 = new Class6300(this, 0, 0)).method18642(-1.0f, 13.5f, -7.0f);
        (this.field24326 = new Class6300(this, 0, 0)).method18638(-2.0f, -3.0f, -2.0f, 6.0f, 6.0f, 4.0f, 0.0f);
        this.field24325.method18633(this.field24326);
        (this.field24327 = new Class6300(this, 18, 14)).method18638(-3.0f, -2.0f, -3.0f, 6.0f, 9.0f, 6.0f, 0.0f);
        this.field24327.method18642(0.0f, 14.0f, 2.0f);
        (this.field24334 = new Class6300(this, 21, 0)).method18638(-3.0f, -3.0f, -3.0f, 8.0f, 6.0f, 7.0f, 0.0f);
        this.field24334.method18642(-1.0f, 14.0f, 2.0f);
        (this.field24328 = new Class6300(this, 0, 18)).method18638(0.0f, 0.0f, -1.0f, 2.0f, 8.0f, 2.0f, 0.0f);
        this.field24328.method18642(-2.5f, 16.0f, 7.0f);
        (this.field24329 = new Class6300(this, 0, 18)).method18638(0.0f, 0.0f, -1.0f, 2.0f, 8.0f, 2.0f, 0.0f);
        this.field24329.method18642(0.5f, 16.0f, 7.0f);
        (this.field24330 = new Class6300(this, 0, 18)).method18638(0.0f, 0.0f, -1.0f, 2.0f, 8.0f, 2.0f, 0.0f);
        this.field24330.method18642(-2.5f, 16.0f, -4.0f);
        (this.field24331 = new Class6300(this, 0, 18)).method18638(0.0f, 0.0f, -1.0f, 2.0f, 8.0f, 2.0f, 0.0f);
        this.field24331.method18642(0.5f, 16.0f, -4.0f);
        (this.field24332 = new Class6300(this, 9, 18)).method18642(-1.0f, 12.0f, 8.0f);
        (this.field24333 = new Class6300(this, 9, 18)).method18638(0.0f, 0.0f, -1.0f, 2.0f, 8.0f, 2.0f, 0.0f);
        this.field24332.method18633(this.field24333);
        this.field24326.method18634(16, 14).method18638(-2.0f, -5.0f, 0.0f, 2.0f, 2.0f, 1.0f, 0.0f);
        this.field24326.method18634(16, 14).method18638(2.0f, -5.0f, 0.0f, 2.0f, 2.0f, 1.0f, 0.0f);
        this.field24326.method18634(0, 10).method18638(-0.5f, 0.0f, -5.0f, 3.0f, 3.0f, 4.0f, 0.0f);
    }
    
    @Override
    public Iterable<Class6300> method17559() {
        return (Iterable<Class6300>)ImmutableList.of((Object)this.field24325);
    }
    
    @Override
    public Iterable<Class6300> method17560() {
        return (Iterable<Class6300>)ImmutableList.of((Object)this.field24327, (Object)this.field24328, (Object)this.field24329, (Object)this.field24330, (Object)this.field24331, (Object)this.field24332, (Object)this.field24334);
    }
    
    public void method17792(final T t, final float n, final float n2, final float n3) {
        if (!t.method4597()) {
            this.field24332.field25184 = MathHelper.cos(n * 0.6662f) * 1.4f * n2;
        }
        else {
            this.field24332.field25184 = 0.0f;
        }
        if (!t.method4483()) {
            this.field24327.method18642(0.0f, 14.0f, 2.0f);
            this.field24327.field25183 = 1.5707964f;
            this.field24334.method18642(-1.0f, 14.0f, -3.0f);
            this.field24334.field25183 = this.field24327.field25183;
            this.field24332.method18642(-1.0f, 12.0f, 8.0f);
            this.field24328.method18642(-2.5f, 16.0f, 7.0f);
            this.field24329.method18642(0.5f, 16.0f, 7.0f);
            this.field24330.method18642(-2.5f, 16.0f, -4.0f);
            this.field24331.method18642(0.5f, 16.0f, -4.0f);
            this.field24328.field25183 = MathHelper.cos(n * 0.6662f) * 1.4f * n2;
            this.field24329.field25183 = MathHelper.cos(n * 0.6662f + 3.1415927f) * 1.4f * n2;
            this.field24330.field25183 = MathHelper.cos(n * 0.6662f + 3.1415927f) * 1.4f * n2;
            this.field24331.field25183 = MathHelper.cos(n * 0.6662f) * 1.4f * n2;
        }
        else {
            this.field24334.method18642(-1.0f, 16.0f, -3.0f);
            this.field24334.field25183 = 1.2566371f;
            this.field24334.field25184 = 0.0f;
            this.field24327.method18642(0.0f, 18.0f, 0.0f);
            this.field24327.field25183 = 0.7853982f;
            this.field24332.method18642(-1.0f, 21.0f, 6.0f);
            this.field24328.method18642(-2.5f, 22.7f, 2.0f);
            this.field24328.field25183 = 4.712389f;
            this.field24329.method18642(0.5f, 22.7f, 2.0f);
            this.field24329.field25183 = 4.712389f;
            this.field24330.field25183 = 5.811947f;
            this.field24330.method18642(-2.49f, 17.0f, -4.0f);
            this.field24331.field25183 = 5.811947f;
            this.field24331.method18642(0.51f, 17.0f, -4.0f);
        }
        this.field24326.field25185 = t.method4595(n3) + t.method4594(n3, 0.0f);
        this.field24334.field25185 = t.method4594(n3, -0.08f);
        this.field24327.field25185 = t.method4594(n3, -0.16f);
        this.field24333.field25185 = t.method4594(n3, -0.2f);
    }
    
    public void method17793(final T t, final float n, final float n2, final float field25183, final float n3, final float n4) {
        this.field24325.field25183 = n4 * 0.017453292f;
        this.field24325.field25184 = n3 * 0.017453292f;
        this.field24332.field25183 = field25183;
    }
}
