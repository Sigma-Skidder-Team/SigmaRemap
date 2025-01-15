// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;

public class Class5924<T extends Class798> extends Class5844<T>
{
    private final Class6300 field24338;
    private final Class6300 field24339;
    private final Class6300 field24340;
    private final Class6300 field24341;
    private final Class6300 field24342;
    private final Class6300 field24343;
    private final Class6300 field24344;
    private final Class6300 field24345;
    private final Class6300 field24346;
    private final Class6300 field24347;
    private float field24348;
    
    public Class5924() {
        super(false, 24.0f, 0.0f);
        this.field24269 = 64;
        this.field24270 = 64;
        (this.field24338 = new Class6300(this)).method18642(0.0f, 19.0f, 0.0f);
        (this.field24339 = new Class6300(this, 0, 0)).method18642(0.0f, 0.0f, 0.0f);
        this.field24338.method18633(this.field24339);
        this.field24339.method18638(-3.5f, -4.0f, -5.0f, 7.0f, 7.0f, 10.0f, 0.0f);
        (this.field24345 = new Class6300(this, 26, 7)).method18638(0.0f, -1.0f, 5.0f, 0.0f, 1.0f, 2.0f, 0.0f);
        this.field24339.method18633(this.field24345);
        (this.field24346 = new Class6300(this, 2, 0)).method18642(0.0f, -2.0f, -5.0f);
        this.field24346.method18638(1.5f, -2.0f, -3.0f, 1.0f, 2.0f, 3.0f, 0.0f);
        (this.field24347 = new Class6300(this, 2, 3)).method18642(0.0f, -2.0f, -5.0f);
        this.field24347.method18638(-2.5f, -2.0f, -3.0f, 1.0f, 2.0f, 3.0f, 0.0f);
        this.field24339.method18633(this.field24346);
        this.field24339.method18633(this.field24347);
        (this.field24340 = new Class6300(this, 0, 18)).method18642(-1.5f, -4.0f, -3.0f);
        this.field24340.field25183 = 0.0f;
        this.field24340.field25184 = -0.2618f;
        this.field24340.field25185 = 0.0f;
        this.field24338.method18633(this.field24340);
        this.field24340.method18638(-9.0f, 0.0f, 0.0f, 9.0f, 0.0f, 6.0f, 0.001f);
        (this.field24341 = new Class6300(this, 0, 18)).method18642(1.5f, -4.0f, -3.0f);
        this.field24341.field25183 = 0.0f;
        this.field24341.field25184 = 0.2618f;
        this.field24341.field25185 = 0.0f;
        this.field24341.field25186 = true;
        this.field24338.method18633(this.field24341);
        this.field24341.method18638(0.0f, 0.0f, 0.0f, 9.0f, 0.0f, 6.0f, 0.001f);
        (this.field24342 = new Class6300(this)).method18642(1.5f, 3.0f, -2.0f);
        this.field24338.method18633(this.field24342);
        this.field24342.method18635("frontLegBox", -5.0f, 0.0f, 0.0f, 7, 2, 0, 0.0f, 26, 1);
        (this.field24343 = new Class6300(this)).method18642(1.5f, 3.0f, 0.0f);
        this.field24338.method18633(this.field24343);
        this.field24343.method18635("midLegBox", -5.0f, 0.0f, 0.0f, 7, 2, 0, 0.0f, 26, 3);
        (this.field24344 = new Class6300(this)).method18642(1.5f, 3.0f, 2.0f);
        this.field24338.method18633(this.field24344);
        this.field24344.method18635("backLegBox", -5.0f, 0.0f, 0.0f, 7, 2, 0, 0.0f, 26, 5);
    }
    
    public void method17794(final T t, final float n, final float n2, final float n3) {
        super.method17558(t, n, n2, n3);
        this.field24348 = t.method4515(n3);
        this.field24345.field25187 = !t.method4531();
    }
    
    public void method17795(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
        this.field24340.field25183 = 0.0f;
        this.field24346.field25183 = 0.0f;
        this.field24347.field25183 = 0.0f;
        this.field24338.field25183 = 0.0f;
        this.field24338.field25181 = 19.0f;
        final boolean b = t.field2404 && t.method1935().method16753() < 1.0E-7;
        if (!b) {
            final float n6 = n3 * 2.1f;
            this.field24340.field25184 = 0.0f;
            this.field24340.field25185 = Class9546.method35639(n6) * 3.1415927f * 0.15f;
            this.field24341.field25183 = this.field24340.field25183;
            this.field24341.field25184 = this.field24340.field25184;
            this.field24341.field25185 = -this.field24340.field25185;
            this.field24342.field25183 = 0.7853982f;
            this.field24343.field25183 = 0.7853982f;
            this.field24344.field25183 = 0.7853982f;
            this.field24338.field25183 = 0.0f;
            this.field24338.field25184 = 0.0f;
            this.field24338.field25185 = 0.0f;
        }
        else {
            this.field24340.field25184 = -0.2618f;
            this.field24340.field25185 = 0.0f;
            this.field24341.field25183 = 0.0f;
            this.field24341.field25184 = 0.2618f;
            this.field24341.field25185 = 0.0f;
            this.field24342.field25183 = 0.0f;
            this.field24343.field25183 = 0.0f;
            this.field24344.field25183 = 0.0f;
        }
        if (!t.method4519()) {
            this.field24338.field25183 = 0.0f;
            this.field24338.field25184 = 0.0f;
            this.field24338.field25185 = 0.0f;
            if (!b) {
                final float method35639 = Class9546.method35639(n3 * 0.18f);
                this.field24338.field25183 = 0.1f + method35639 * 3.1415927f * 0.025f;
                this.field24346.field25183 = method35639 * 3.1415927f * 0.03f;
                this.field24347.field25183 = method35639 * 3.1415927f * 0.03f;
                this.field24342.field25183 = -method35639 * 3.1415927f * 0.1f + 0.3926991f;
                this.field24344.field25183 = -method35639 * 3.1415927f * 0.05f + 0.7853982f;
                this.field24338.field25181 = 19.0f - Class9546.method35639(n3 * 0.18f) * 0.9f;
            }
        }
        if (this.field24348 > 0.0f) {
            this.field24338.field25183 = Class9102.method32896(this.field24338.field25183, 3.0915928f, this.field24348);
        }
    }
    
    @Override
    public Iterable<Class6300> method17559() {
        return (Iterable<Class6300>)ImmutableList.of();
    }
    
    @Override
    public Iterable<Class6300> method17560() {
        return (Iterable<Class6300>)ImmutableList.of((Object)this.field24338);
    }
}
