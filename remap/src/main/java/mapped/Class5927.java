// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.util.math.MathHelper;

public class Class5927<T extends Class803> extends Class5844<T>
{
    private static String[] field24362;
    public final Class6300 field24363;
    private final Class6300 field24364;
    private final Class6300 field24365;
    private final Class6300 field24366;
    private final Class6300 field24367;
    private final Class6300 field24368;
    private final Class6300 field24369;
    private final Class6300 field24370;
    private final Class6300 field24371;
    private final Class6300 field24372;
    private float field24373;
    
    public Class5927() {
        super(true, 8.0f, 3.35f);
        this.field24269 = 48;
        this.field24270 = 32;
        (this.field24363 = new Class6300(this, 1, 5)).method18636(-3.0f, -2.0f, -5.0f, 8.0f, 6.0f, 6.0f);
        this.field24363.method18642(-1.0f, 16.5f, -3.0f);
        (this.field24364 = new Class6300(this, 8, 1)).method18636(-3.0f, -4.0f, -4.0f, 2.0f, 2.0f, 1.0f);
        (this.field24365 = new Class6300(this, 15, 1)).method18636(3.0f, -4.0f, -4.0f, 2.0f, 2.0f, 1.0f);
        (this.field24366 = new Class6300(this, 6, 18)).method18636(-1.0f, 2.01f, -8.0f, 4.0f, 2.0f, 3.0f);
        this.field24363.method18633(this.field24364);
        this.field24363.method18633(this.field24365);
        this.field24363.method18633(this.field24366);
        (this.field24367 = new Class6300(this, 24, 15)).method18636(-3.0f, 3.999f, -3.5f, 6.0f, 11.0f, 6.0f);
        this.field24367.method18642(0.0f, 16.0f, -6.0f);
        (this.field24368 = new Class6300(this, 13, 24)).method18638(2.0f, 0.5f, -1.0f, 2.0f, 6.0f, 2.0f, 0.001f);
        this.field24368.method18642(-5.0f, 17.5f, 7.0f);
        (this.field24369 = new Class6300(this, 4, 24)).method18638(2.0f, 0.5f, -1.0f, 2.0f, 6.0f, 2.0f, 0.001f);
        this.field24369.method18642(-1.0f, 17.5f, 7.0f);
        (this.field24370 = new Class6300(this, 13, 24)).method18638(2.0f, 0.5f, -1.0f, 2.0f, 6.0f, 2.0f, 0.001f);
        this.field24370.method18642(-5.0f, 17.5f, 0.0f);
        (this.field24371 = new Class6300(this, 4, 24)).method18638(2.0f, 0.5f, -1.0f, 2.0f, 6.0f, 2.0f, 0.001f);
        this.field24371.method18642(-1.0f, 17.5f, 0.0f);
        (this.field24372 = new Class6300(this, 30, 0)).method18636(2.0f, 0.0f, -1.0f, 4.0f, 9.0f, 5.0f);
        this.field24372.method18642(-4.0f, 15.0f, -1.0f);
        this.field24367.method18633(this.field24372);
    }
    
    public void method17798(final T t, final float n, final float n2, final float n3) {
        this.field24367.field25183 = 1.5707964f;
        this.field24372.field25183 = -0.05235988f;
        this.field24368.field25183 = MathHelper.cos(n * 0.6662f) * 1.4f * n2;
        this.field24369.field25183 = MathHelper.cos(n * 0.6662f + 3.1415927f) * 1.4f * n2;
        this.field24370.field25183 = MathHelper.cos(n * 0.6662f + 3.1415927f) * 1.4f * n2;
        this.field24371.field25183 = MathHelper.cos(n * 0.6662f) * 1.4f * n2;
        this.field24363.method18642(-1.0f, 16.5f, -3.0f);
        this.field24363.field25184 = 0.0f;
        this.field24363.field25185 = t.method4671(n3);
        this.field24368.field25187 = true;
        this.field24369.field25187 = true;
        this.field24370.field25187 = true;
        this.field24371.field25187 = true;
        this.field24367.method18642(0.0f, 16.0f, -6.0f);
        this.field24367.field25185 = 0.0f;
        this.field24368.method18642(-5.0f, 17.5f, 7.0f);
        this.field24369.method18642(-1.0f, 17.5f, 7.0f);
        if (!t.method1814()) {
            if (!t.method2783()) {
                if (t.method4654()) {
                    this.field24367.field25183 = 0.5235988f;
                    this.field24367.method18642(0.0f, 9.0f, -3.0f);
                    this.field24372.field25183 = 0.7853982f;
                    this.field24372.method18642(-4.0f, 15.0f, -2.0f);
                    this.field24363.method18642(-1.0f, 10.0f, -0.25f);
                    this.field24363.field25183 = 0.0f;
                    this.field24363.field25184 = 0.0f;
                    if (this.field23957) {
                        this.field24363.method18642(-1.0f, 13.0f, -3.75f);
                    }
                    this.field24368.field25183 = -1.3089969f;
                    this.field24368.method18642(-5.0f, 21.5f, 6.75f);
                    this.field24369.field25183 = -1.3089969f;
                    this.field24369.method18642(-1.0f, 21.5f, 6.75f);
                    this.field24370.field25183 = -0.2617994f;
                    this.field24371.field25183 = -0.2617994f;
                }
            }
            else {
                this.field24367.field25185 = -1.5707964f;
                this.field24367.method18642(0.0f, 21.0f, -6.0f);
                this.field24372.field25183 = -2.6179938f;
                if (this.field23957) {
                    this.field24372.field25183 = -2.1816616f;
                    this.field24367.method18642(0.0f, 21.0f, -2.0f);
                }
                this.field24363.method18642(1.0f, 19.49f, -3.0f);
                this.field24363.field25183 = 0.0f;
                this.field24363.field25184 = -2.0943952f;
                this.field24363.field25185 = 0.0f;
                this.field24368.field25187 = false;
                this.field24369.field25187 = false;
                this.field24370.field25187 = false;
                this.field24371.field25187 = false;
            }
        }
        else {
            this.field24367.field25183 = 1.6755161f;
            final float method4672 = t.method4672(n3);
            this.field24367.method18642(0.0f, 16.0f + t.method4672(n3), -6.0f);
            this.field24363.method18642(-1.0f, 16.5f + method4672, -3.0f);
            this.field24363.field25184 = 0.0f;
        }
    }
    
    @Override
    public Iterable<Class6300> method17559() {
        return (Iterable<Class6300>)ImmutableList.of((Object)this.field24363);
    }
    
    @Override
    public Iterable<Class6300> method17560() {
        return (Iterable<Class6300>)ImmutableList.of(this.field24367, this.field24368, this.field24369, this.field24370, (Object)this.field24371);
    }
    
    public void method17799(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
        if (!t.method2783()) {
            if (!t.method4656()) {
                if (!t.method1814()) {
                    this.field24363.field25183 = n5 * 0.017453292f;
                    this.field24363.field25184 = n4 * 0.017453292f;
                }
            }
        }
        if (t.method2783()) {
            this.field24363.field25183 = 0.0f;
            this.field24363.field25184 = -2.0943952f;
            this.field24363.field25185 = MathHelper.cos(n3 * 0.027f) / 22.0f;
        }
        if (t.method1814()) {
            final float field25185 = MathHelper.cos(n3) * 0.01f;
            this.field24367.field25184 = field25185;
            this.field24368.field25185 = field25185;
            this.field24369.field25185 = field25185;
            this.field24370.field25185 = field25185 / 2.0f;
            this.field24371.field25185 = field25185 / 2.0f;
        }
        if (t.method4656()) {
            this.field24373 += 0.67f;
            this.field24368.field25183 = MathHelper.cos(this.field24373 * 0.4662f) * 0.1f;
            this.field24369.field25183 = MathHelper.cos(this.field24373 * 0.4662f + 3.1415927f) * 0.1f;
            this.field24370.field25183 = MathHelper.cos(this.field24373 * 0.4662f + 3.1415927f) * 0.1f;
            this.field24371.field25183 = MathHelper.cos(this.field24373 * 0.4662f) * 0.1f;
        }
    }
}
