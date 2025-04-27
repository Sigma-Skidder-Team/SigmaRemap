// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;

public class Class5874<T extends Class786> extends Class5846<T>
{
    private static String[] field24074;
    private final Class6300 field24075;
    private final Class6300 field24076;
    private final Class6300 field24077;
    private final Class6300 field24078;
    private final Class6300 field24079;
    private final Class6300 field24080;
    
    public Class5874() {
        (this.field24075 = new Class6300(this).method18647(128, 128)).method18642(0.0f, -7.0f, -2.0f);
        this.field24075.method18634(0, 0).method18638(-4.0f, -12.0f, -5.5f, 8.0f, 10.0f, 8.0f, 0.0f);
        this.field24075.method18634(24, 0).method18638(-1.0f, -5.0f, -7.5f, 2.0f, 4.0f, 2.0f, 0.0f);
        (this.field24076 = new Class6300(this).method18647(128, 128)).method18642(0.0f, -7.0f, 0.0f);
        this.field24076.method18634(0, 40).method18638(-9.0f, -2.0f, -6.0f, 18.0f, 12.0f, 11.0f, 0.0f);
        this.field24076.method18634(0, 70).method18638(-4.5f, 10.0f, -3.0f, 9.0f, 5.0f, 6.0f, 0.5f);
        (this.field24077 = new Class6300(this).method18647(128, 128)).method18642(0.0f, -7.0f, 0.0f);
        this.field24077.method18634(60, 21).method18638(-13.0f, -2.5f, -3.0f, 4.0f, 30.0f, 6.0f, 0.0f);
        (this.field24078 = new Class6300(this).method18647(128, 128)).method18642(0.0f, -7.0f, 0.0f);
        this.field24078.method18634(60, 58).method18638(9.0f, -2.5f, -3.0f, 4.0f, 30.0f, 6.0f, 0.0f);
        (this.field24079 = new Class6300(this, 0, 22).method18647(128, 128)).method18642(-4.0f, 11.0f, 0.0f);
        this.field24079.method18634(37, 0).method18638(-3.5f, -3.0f, -3.0f, 6.0f, 16.0f, 5.0f, 0.0f);
        this.field24080 = new Class6300(this, 0, 22).method18647(128, 128);
        this.field24080.field25186 = true;
        this.field24080.method18634(60, 0).method18642(5.0f, 11.0f, 0.0f);
        this.field24080.method18638(-3.5f, -3.0f, -3.0f, 6.0f, 16.0f, 5.0f, 0.0f);
    }
    
    @Override
    public Iterable<Class6300> method17570() {
        return (Iterable<Class6300>)ImmutableList.of(this.field24075, this.field24076, this.field24079, this.field24080, this.field24077, (Object)this.field24078);
    }
    
    public void method17615(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
        this.field24075.field25184 = n4 * 0.017453292f;
        this.field24075.field25183 = n5 * 0.017453292f;
        this.field24079.field25183 = -1.5f * this.method17617(n, 13.0f) * n2;
        this.field24080.field25183 = 1.5f * this.method17617(n, 13.0f) * n2;
        this.field24079.field25184 = 0.0f;
        this.field24080.field25184 = 0.0f;
    }
    
    public void method17616(final T t, final float n, final float n2, final float n3) {
        final int method4338 = t.method4338();
        if (method4338 <= 0) {
            final int method4339 = t.method4340();
            if (method4339 <= 0) {
                this.field24077.field25183 = (-0.2f + 1.5f * this.method17617(n, 13.0f)) * n2;
                this.field24078.field25183 = (-0.2f - 1.5f * this.method17617(n, 13.0f)) * n2;
            }
            else {
                this.field24077.field25183 = -0.8f + 0.025f * this.method17617((float)method4339, 70.0f);
                this.field24078.field25183 = 0.0f;
            }
        }
        else {
            this.field24077.field25183 = -2.0f + 1.5f * this.method17617(method4338 - n3, 10.0f);
            this.field24078.field25183 = -2.0f + 1.5f * this.method17617(method4338 - n3, 10.0f);
        }
    }
    
    private float method17617(final float n, final float n2) {
        return (Math.abs(n % n2 - n2 * 0.5f) - n2 * 0.25f) / (n2 * 0.25f);
    }
    
    public Class6300 method17618() {
        return this.field24077;
    }
}
