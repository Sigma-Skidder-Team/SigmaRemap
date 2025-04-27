// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class Class5925<T extends Entity> extends Class5844<T>
{
    public final Class6300 field24349;
    public final Class6300 field24350;
    public final Class6300 field24351;
    public final Class6300 field24352;
    public final Class6300 field24353;
    public final Class6300 field24354;
    public final Class6300 field24355;
    public final Class6300 field24356;
    public int field24357;
    
    public Class5925(final float n) {
        super(true, 10.0f, 4.0f);
        this.field24357 = 1;
        (this.field24355 = new Class6300(this)).method18635("main", -2.5f, -2.0f, -3.0f, 5, 4, 5, n, 0, 0);
        this.field24355.method18635("nose", -1.5f, 0.0f, -4.0f, 3, 2, 2, n, 0, 24);
        this.field24355.method18635("ear1", -2.0f, -3.0f, 0.0f, 1, 1, 2, n, 0, 10);
        this.field24355.method18635("ear2", 1.0f, -3.0f, 0.0f, 1, 1, 2, n, 6, 10);
        this.field24355.method18642(0.0f, 15.0f, -9.0f);
        (this.field24356 = new Class6300(this, 20, 0)).method18638(-2.0f, 3.0f, -8.0f, 4.0f, 16.0f, 6.0f, n);
        this.field24356.method18642(0.0f, 12.0f, -10.0f);
        (this.field24353 = new Class6300(this, 0, 15)).method18638(-0.5f, 0.0f, 0.0f, 1.0f, 8.0f, 1.0f, n);
        this.field24353.field25183 = 0.9f;
        this.field24353.method18642(0.0f, 15.0f, 8.0f);
        (this.field24354 = new Class6300(this, 4, 15)).method18638(-0.5f, 0.0f, 0.0f, 1.0f, 8.0f, 1.0f, n);
        this.field24354.method18642(0.0f, 20.0f, 14.0f);
        (this.field24349 = new Class6300(this, 8, 13)).method18638(-1.0f, 0.0f, 1.0f, 2.0f, 6.0f, 2.0f, n);
        this.field24349.method18642(1.1f, 18.0f, 5.0f);
        (this.field24350 = new Class6300(this, 8, 13)).method18638(-1.0f, 0.0f, 1.0f, 2.0f, 6.0f, 2.0f, n);
        this.field24350.method18642(-1.1f, 18.0f, 5.0f);
        (this.field24351 = new Class6300(this, 40, 0)).method18638(-1.0f, 0.0f, 0.0f, 2.0f, 10.0f, 2.0f, n);
        this.field24351.method18642(1.2f, 14.1f, -5.0f);
        (this.field24352 = new Class6300(this, 40, 0)).method18638(-1.0f, 0.0f, 0.0f, 2.0f, 10.0f, 2.0f, n);
        this.field24352.method18642(-1.2f, 14.1f, -5.0f);
    }
    
    @Override
    public Iterable<Class6300> method17559() {
        return (Iterable<Class6300>)ImmutableList.of((Object)this.field24355);
    }
    
    @Override
    public Iterable<Class6300> method17560() {
        return (Iterable<Class6300>)ImmutableList.of(this.field24356, this.field24349, this.field24350, this.field24351, this.field24352, this.field24353, (Object)this.field24354);
    }
    
    @Override
    public void method17557(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
        this.field24355.field25183 = n5 * 0.017453292f;
        this.field24355.field25184 = n4 * 0.017453292f;
        if (this.field24357 != 3) {
            this.field24356.field25183 = 1.5707964f;
            if (this.field24357 != 2) {
                this.field24349.field25183 = MathHelper.cos(n * 0.6662f) * n2;
                this.field24350.field25183 = MathHelper.cos(n * 0.6662f + 3.1415927f) * n2;
                this.field24351.field25183 = MathHelper.cos(n * 0.6662f + 3.1415927f) * n2;
                this.field24352.field25183 = MathHelper.cos(n * 0.6662f) * n2;
                if (this.field24357 != 1) {
                    this.field24354.field25183 = 1.7278761f + 0.47123894f * MathHelper.cos(n) * n2;
                }
                else {
                    this.field24354.field25183 = 1.7278761f + 0.7853982f * MathHelper.cos(n) * n2;
                }
            }
            else {
                this.field24349.field25183 = MathHelper.cos(n * 0.6662f) * n2;
                this.field24350.field25183 = MathHelper.cos(n * 0.6662f + 0.3f) * n2;
                this.field24351.field25183 = MathHelper.cos(n * 0.6662f + 3.1415927f + 0.3f) * n2;
                this.field24352.field25183 = MathHelper.cos(n * 0.6662f + 3.1415927f) * n2;
                this.field24354.field25183 = 1.7278761f + 0.31415927f * MathHelper.cos(n) * n2;
            }
        }
    }
    
    @Override
    public void method17558(final T t, final float n, final float n2, final float n3) {
        this.field24356.field25181 = 12.0f;
        this.field24356.field25182 = -10.0f;
        this.field24355.field25181 = 15.0f;
        this.field24355.field25182 = -9.0f;
        this.field24353.field25181 = 15.0f;
        this.field24353.field25182 = 8.0f;
        this.field24354.field25181 = 20.0f;
        this.field24354.field25182 = 14.0f;
        this.field24351.field25181 = 14.1f;
        this.field24351.field25182 = -5.0f;
        this.field24352.field25181 = 14.1f;
        this.field24352.field25182 = -5.0f;
        this.field24349.field25181 = 18.0f;
        this.field24349.field25182 = 5.0f;
        this.field24350.field25181 = 18.0f;
        this.field24350.field25182 = 5.0f;
        this.field24353.field25183 = 0.9f;
        if (!t.method1814()) {
            if (!t.method1815()) {
                this.field24357 = 1;
            }
            else {
                this.field24354.field25181 = this.field24353.field25181;
                final Class6300 field24354 = this.field24354;
                field24354.field25182 += 2.0f;
                this.field24353.field25183 = 1.5707964f;
                this.field24354.field25183 = 1.5707964f;
                this.field24357 = 2;
            }
        }
        else {
            final Class6300 field24355 = this.field24356;
            ++field24355.field25181;
            final Class6300 field24356 = this.field24355;
            field24356.field25181 += 2.0f;
            final Class6300 field24357 = this.field24353;
            ++field24357.field25181;
            final Class6300 field24358 = this.field24354;
            field24358.field25181 -= 4.0f;
            final Class6300 field24359 = this.field24354;
            field24359.field25182 += 2.0f;
            this.field24353.field25183 = 1.5707964f;
            this.field24354.field25183 = 1.5707964f;
            this.field24357 = 0;
        }
    }
}
