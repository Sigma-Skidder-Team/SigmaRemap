// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.util.math.MathHelper;

public class Class5928<T extends Class806> extends Class5844<T>
{
    private static String[] field24374;
    public final Class6300 field24375;
    public final Class6300 field24376;
    private final Class6300 field24377;
    private final Class6300 field24378;
    private final Class6300 field24379;
    private final Class6300 field24380;
    private final Class6300 field24381;
    private final Class6300 field24382;
    private final Class6300 field24383;
    private final Class6300 field24384;
    private final Class6300 field24385;
    private final Class6300[] field24386;
    private final Class6300[] field24387;
    
    public Class5928(final float n) {
        super(true, 16.2f, 1.36f, 2.7272f, 2.0f, 20.0f);
        this.field24269 = 64;
        this.field24270 = 64;
        (this.field24375 = new Class6300(this, 0, 32)).method18638(-5.0f, -8.0f, -17.0f, 10.0f, 10.0f, 22.0f, 0.05f);
        this.field24375.method18642(0.0f, 11.0f, 5.0f);
        (this.field24376 = new Class6300(this, 0, 35)).method18636(-2.05f, -6.0f, -2.0f, 4.0f, 12.0f, 7.0f);
        this.field24376.field25183 = 0.5235988f;
        final Class6300 class6300 = new Class6300(this, 0, 13);
        class6300.method18638(-3.0f, -11.0f, -2.0f, 6.0f, 5.0f, 7.0f, n);
        final Class6300 class6301 = new Class6300(this, 56, 36);
        class6301.method18638(-1.0f, -11.0f, 5.01f, 2.0f, 16.0f, 2.0f, n);
        final Class6300 class6302 = new Class6300(this, 0, 25);
        class6302.method18638(-2.0f, -11.0f, -7.0f, 4.0f, 5.0f, 5.0f, n);
        this.field24376.method18633(class6300);
        this.field24376.method18633(class6301);
        this.field24376.method18633(class6302);
        this.method17800(this.field24376);
        this.field24377 = new Class6300(this, 48, 21);
        this.field24377.field25186 = true;
        this.field24377.method18638(-3.0f, -1.01f, -1.0f, 4.0f, 11.0f, 4.0f, n);
        this.field24377.method18642(4.0f, 14.0f, 7.0f);
        (this.field24378 = new Class6300(this, 48, 21)).method18638(-1.0f, -1.01f, -1.0f, 4.0f, 11.0f, 4.0f, n);
        this.field24378.method18642(-4.0f, 14.0f, 7.0f);
        this.field24379 = new Class6300(this, 48, 21);
        this.field24379.field25186 = true;
        this.field24379.method18638(-3.0f, -1.01f, -1.9f, 4.0f, 11.0f, 4.0f, n);
        this.field24379.method18642(4.0f, 6.0f, -12.0f);
        (this.field24380 = new Class6300(this, 48, 21)).method18638(-1.0f, -1.01f, -1.9f, 4.0f, 11.0f, 4.0f, n);
        this.field24380.method18642(-4.0f, 6.0f, -12.0f);
        this.field24381 = new Class6300(this, 48, 21);
        this.field24381.field25186 = true;
        this.field24381.method18639(-3.0f, -1.01f, -1.0f, 4.0f, 11.0f, 4.0f, n, n + 5.5f, n);
        this.field24381.method18642(4.0f, 14.0f, 7.0f);
        (this.field24382 = new Class6300(this, 48, 21)).method18639(-1.0f, -1.01f, -1.0f, 4.0f, 11.0f, 4.0f, n, n + 5.5f, n);
        this.field24382.method18642(-4.0f, 14.0f, 7.0f);
        this.field24383 = new Class6300(this, 48, 21);
        this.field24383.field25186 = true;
        this.field24383.method18639(-3.0f, -1.01f, -1.9f, 4.0f, 11.0f, 4.0f, n, n + 5.5f, n);
        this.field24383.method18642(4.0f, 6.0f, -12.0f);
        (this.field24384 = new Class6300(this, 48, 21)).method18639(-1.0f, -1.01f, -1.9f, 4.0f, 11.0f, 4.0f, n, n + 5.5f, n);
        this.field24384.method18642(-4.0f, 6.0f, -12.0f);
        (this.field24385 = new Class6300(this, 42, 36)).method18638(-1.5f, 0.0f, 0.0f, 3.0f, 14.0f, 4.0f, n);
        this.field24385.method18642(0.0f, -5.0f, 2.0f);
        this.field24385.field25183 = 0.5235988f;
        this.field24375.method18633(this.field24385);
        final Class6300 class6303 = new Class6300(this, 26, 0);
        class6303.method18638(-5.0f, -8.0f, -9.0f, 10.0f, 9.0f, 9.0f, 0.5f);
        this.field24375.method18633(class6303);
        final Class6300 class6304 = new Class6300(this, 29, 5);
        class6304.method18638(2.0f, -9.0f, -6.0f, 1.0f, 2.0f, 2.0f, n);
        this.field24376.method18633(class6304);
        final Class6300 class6305 = new Class6300(this, 29, 5);
        class6305.method18638(-3.0f, -9.0f, -6.0f, 1.0f, 2.0f, 2.0f, n);
        this.field24376.method18633(class6305);
        final Class6300 class6306 = new Class6300(this, 32, 2);
        class6306.method18638(3.1f, -6.0f, -8.0f, 0.0f, 3.0f, 16.0f, n);
        class6306.field25183 = -0.5235988f;
        this.field24376.method18633(class6306);
        final Class6300 class6307 = new Class6300(this, 32, 2);
        class6307.method18638(-3.1f, -6.0f, -8.0f, 0.0f, 3.0f, 16.0f, n);
        class6307.field25183 = -0.5235988f;
        this.field24376.method18633(class6307);
        final Class6300 class6308 = new Class6300(this, 1, 1);
        class6308.method18638(-3.0f, -11.0f, -1.9f, 6.0f, 5.0f, 6.0f, 0.2f);
        this.field24376.method18633(class6308);
        final Class6300 class6309 = new Class6300(this, 19, 0);
        class6309.method18638(-2.0f, -11.0f, -4.0f, 4.0f, 5.0f, 2.0f, 0.2f);
        this.field24376.method18633(class6309);
        this.field24386 = new Class6300[] { class6303, class6304, class6305, class6308, class6309 };
        this.field24387 = new Class6300[] { class6306, class6307 };
    }
    
    public void method17800(final Class6300 class6300) {
        final Class6300 class6301 = new Class6300(this, 19, 16);
        class6301.method18638(0.55f, -13.0f, 4.0f, 2.0f, 3.0f, 1.0f, -0.001f);
        final Class6300 class6302 = new Class6300(this, 19, 16);
        class6302.method18638(-2.55f, -13.0f, 4.0f, 2.0f, 3.0f, 1.0f, -0.001f);
        class6300.method18633(class6301);
        class6300.method18633(class6302);
    }
    
    public void method17801(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
        final boolean method4736 = t.method4736();
        final boolean method4737 = t.isBeingRidden();
        final Class6300[] field24386 = this.field24386;
        for (int length = field24386.length, i = 0; i < length; ++i) {
            field24386[i].field25187 = method4736;
        }
        final Class6300[] field24387 = this.field24387;
        for (int length2 = field24387.length, j = 0; j < length2; ++j) {
            field24387[j].field25187 = (method4737 && method4736);
        }
        this.field24375.field25181 = 11.0f;
    }
    
    @Override
    public Iterable<Class6300> method17559() {
        return (Iterable<Class6300>)ImmutableList.of((Object)this.field24376);
    }
    
    @Override
    public Iterable<Class6300> method17560() {
        return (Iterable<Class6300>)ImmutableList.of((Object)this.field24375, (Object)this.field24377, (Object)this.field24378, (Object)this.field24379, (Object)this.field24380, (Object)this.field24381, (Object)this.field24382, (Object)this.field24383, (Object)this.field24384);
    }
    
    public void method17802(final T t, final float n, final float n2, final float n3) {
        super.method17558(t, n, n2, n3);
        final float method35707 = MathHelper.method35707(t.field2952, t.field2951, n3);
        final float method35708 = MathHelper.method35707(t.field2954, t.field2953, n3);
        final float method35709 = MathHelper.method35700(n3, t.prevRotationPitch, t.rotationPitch);
        float n4 = method35708 - method35707;
        float n5 = method35709 * 0.017453292f;
        if (n4 > 20.0f) {
            n4 = 20.0f;
        }
        if (n4 < -20.0f) {
            n4 = -20.0f;
        }
        if (n2 > 0.2f) {
            n5 += MathHelper.cos(n * 0.4f) * 0.15f * n2;
        }
        final float method35710 = t.method4755(n3);
        final float method35711 = t.method4756(n3);
        final float n6 = 1.0f - method35711;
        final float method35712 = t.method4757(n3);
        final boolean b = t.field4339 != 0;
        final float n7 = t.ticksExisted + n3;
        this.field24376.field25181 = 4.0f;
        this.field24376.field25182 = -12.0f;
        this.field24375.field25183 = 0.0f;
        this.field24376.field25183 = 0.5235988f + n5;
        this.field24376.field25184 = n4 * 0.017453292f;
        final float method35713 = MathHelper.cos((t.method1706() ? 0.2f : 1.0f) * n * 0.6662f + 3.1415927f);
        final float n8 = method35713 * 0.8f * n2;
        this.field24376.field25183 = method35711 * (0.2617994f + n5) + method35710 * (2.1816616f + MathHelper.sin(n7) * 0.05f) + (1.0f - Math.max(method35711, method35710)) * (0.5235988f + n5 + method35712 * MathHelper.sin(n7) * 0.05f);
        this.field24376.field25184 = method35711 * n4 * 0.017453292f + (1.0f - Math.max(method35711, method35710)) * this.field24376.field25184;
        this.field24376.field25181 = method35711 * -4.0f + method35710 * 11.0f + (1.0f - Math.max(method35711, method35710)) * this.field24376.field25181;
        this.field24376.field25182 = method35711 * -4.0f + method35710 * -12.0f + (1.0f - Math.max(method35711, method35710)) * this.field24376.field25182;
        this.field24375.field25183 = method35711 * -0.7853982f + n6 * this.field24375.field25183;
        final float n9 = 0.2617994f * method35711;
        final float method35714 = MathHelper.cos(n7 * 0.6f + 3.1415927f);
        this.field24379.field25181 = 2.0f * method35711 + 14.0f * n6;
        this.field24379.field25182 = -6.0f * method35711 - 10.0f * n6;
        this.field24380.field25181 = this.field24379.field25181;
        this.field24380.field25182 = this.field24379.field25182;
        final float field25183 = (-1.0471976f + method35714) * method35711 + n8 * n6;
        final float field25184 = (-1.0471976f - method35714) * method35711 - n8 * n6;
        this.field24377.field25183 = n9 - method35713 * 0.5f * n2 * n6;
        this.field24378.field25183 = n9 + method35713 * 0.5f * n2 * n6;
        this.field24379.field25183 = field25183;
        this.field24380.field25183 = field25184;
        this.field24385.field25183 = 0.5235988f + n2 * 0.75f;
        this.field24385.field25181 = -5.0f + n2;
        this.field24385.field25182 = 2.0f + n2 * 2.0f;
        if (!b) {
            this.field24385.field25184 = 0.0f;
        }
        else {
            this.field24385.field25184 = MathHelper.cos(n7 * 0.7f);
        }
        this.field24381.field25181 = this.field24377.field25181;
        this.field24381.field25182 = this.field24377.field25182;
        this.field24381.field25183 = this.field24377.field25183;
        this.field24382.field25181 = this.field24378.field25181;
        this.field24382.field25182 = this.field24378.field25182;
        this.field24382.field25183 = this.field24378.field25183;
        this.field24383.field25181 = this.field24379.field25181;
        this.field24383.field25182 = this.field24379.field25182;
        this.field24383.field25183 = this.field24379.field25183;
        this.field24384.field25181 = this.field24380.field25181;
        this.field24384.field25182 = this.field24380.field25182;
        this.field24384.field25183 = this.field24380.field25183;
        final boolean method35715 = t.method2625();
        this.field24377.field25187 = !method35715;
        this.field24378.field25187 = !method35715;
        this.field24379.field25187 = !method35715;
        this.field24380.field25187 = !method35715;
        this.field24381.field25187 = method35715;
        this.field24382.field25187 = method35715;
        this.field24383.field25187 = method35715;
        this.field24384.field25187 = method35715;
        this.field24375.field25181 = (method35715 ? 10.8f : 0.0f);
    }
}
