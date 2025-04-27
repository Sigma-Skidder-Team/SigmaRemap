// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;

import java.util.function.Function;

public class Class5853<T extends LivingEntity> extends Class5844<T> implements Class5852, Class5855
{
    private static String[] field23992;
    public Class6300 field23993;
    public Class6300 field23994;
    public Class6300 field23995;
    public Class6300 field23996;
    public Class6300 field23997;
    public Class6300 field23998;
    public Class6300 field23999;
    public Class2036 field24000;
    public Class2036 field24001;
    public boolean field24002;
    public float field24003;
    private float field24004;
    
    public Class5853(final float n) {
        this(Class6332::method18770, n, 0.0f, 64, 32);
    }
    
    public Class5853(final float n, final float n2, final int n3, final int n4) {
        this(Class6332::method18770, n, n2, n3, n4);
    }
    
    public Class5853(final Function<ResourceLocation, Class6332> function, final float n, final float n2, final int field24269, final int field24270) {
        super(function, true, 16.0f, 0.0f, 2.0f, 2.0f, 24.0f);
        this.field24000 = Class2036.field11607;
        this.field24001 = Class2036.field11607;
        this.field24269 = field24269;
        this.field24270 = field24270;
        (this.field23993 = new Class6300(this, 0, 0)).method18638(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, n);
        this.field23993.method18642(0.0f, 0.0f + n2, 0.0f);
        (this.field23994 = new Class6300(this, 32, 0)).method18638(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, n + 0.5f);
        this.field23994.method18642(0.0f, 0.0f + n2, 0.0f);
        (this.field23995 = new Class6300(this, 16, 16)).method18638(-4.0f, 0.0f, -2.0f, 8.0f, 12.0f, 4.0f, n);
        this.field23995.method18642(0.0f, 0.0f + n2, 0.0f);
        (this.field23996 = new Class6300(this, 40, 16)).method18638(-3.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, n);
        this.field23996.method18642(-5.0f, 2.0f + n2, 0.0f);
        this.field23997 = new Class6300(this, 40, 16);
        this.field23997.field25186 = true;
        this.field23997.method18638(-1.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, n);
        this.field23997.method18642(5.0f, 2.0f + n2, 0.0f);
        (this.field23998 = new Class6300(this, 0, 16)).method18638(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, n);
        this.field23998.method18642(-1.9f, 12.0f + n2, 0.0f);
        this.field23999 = new Class6300(this, 0, 16);
        this.field23999.field25186 = true;
        this.field23999.method18638(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, n);
        this.field23999.method18642(1.9f, 12.0f + n2, 0.0f);
    }
    
    @Override
    public Iterable<Class6300> method17559() {
        return (Iterable<Class6300>)ImmutableList.of((Object)this.field23993);
    }
    
    @Override
    public Iterable<Class6300> method17560() {
        return (Iterable<Class6300>)ImmutableList.of(this.field23995, this.field23996, this.field23997, this.field23998, this.field23999, (Object)this.field23994);
    }
    
    public void method17579(final T t, final float n, final float n2, final float n3) {
        this.field24003 = t.method2623(n3);
        this.field24004 = (float)t.method2768();
        super.method17558(t, n, n2, n3);
    }
    
    public void method17580(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
        final boolean b = t.method2774() > 4;
        final boolean method1818 = t.method1818();
        this.field23993.field25184 = n4 * 0.017453292f;
        if (b) {
            this.field23993.field25183 = -0.7853982f;
        }
        else if (this.field24003 > 0.0f) {
            if (method1818) {
                this.field23993.field25183 = this.method17581(this.field23993.field25183, -0.7853982f, this.field24003);
            }
            else {
                this.field23993.field25183 = this.method17581(this.field23993.field25183, n5 * 0.017453292f, this.field24003);
            }
        }
        else {
            this.field23993.field25183 = n5 * 0.017453292f;
        }
        this.field23995.field25184 = 0.0f;
        this.field23996.field25182 = 0.0f;
        this.field23996.field25180 = -5.0f;
        this.field23997.field25182 = 0.0f;
        this.field23997.field25180 = 5.0f;
        float n6 = 1.0f;
        if (b) {
            final float n7 = (float)t.getMotion().lengthSquared() / 0.2f;
            n6 = n7 * n7 * n7;
        }
        if (n6 < 1.0f) {
            n6 = 1.0f;
        }
        this.field23996.field25183 = MathHelper.cos(n * 0.6662f + 3.1415927f) * 2.0f * n2 * 0.5f / n6;
        this.field23997.field25183 = MathHelper.cos(n * 0.6662f) * 2.0f * n2 * 0.5f / n6;
        this.field23996.field25185 = 0.0f;
        this.field23997.field25185 = 0.0f;
        this.field23998.field25183 = MathHelper.cos(n * 0.6662f) * 1.4f * n2 / n6;
        this.field23999.field25183 = MathHelper.cos(n * 0.6662f + 3.1415927f) * 1.4f * n2 / n6;
        this.field23998.field25184 = 0.0f;
        this.field23999.field25184 = 0.0f;
        this.field23998.field25185 = 0.0f;
        this.field23999.field25185 = 0.0f;
        if (this.field23956) {
            final Class6300 field23996 = this.field23996;
            field23996.field25183 -= 0.62831855f;
            final Class6300 field23997 = this.field23997;
            field23997.field25183 -= 0.62831855f;
            this.field23998.field25183 = -1.4137167f;
            this.field23998.field25184 = 0.31415927f;
            this.field23998.field25185 = 0.07853982f;
            this.field23999.field25183 = -1.4137167f;
            this.field23999.field25184 = -0.31415927f;
            this.field23999.field25185 = -0.07853982f;
        }
        this.field23996.field25184 = 0.0f;
        this.field23996.field25185 = 0.0f;
        switch (Class5111.field22057[this.field24000.ordinal()]) {
            case 1: {
                this.field23997.field25184 = 0.0f;
                break;
            }
            case 2: {
                this.field23997.field25183 = this.field23997.field25183 * 0.5f - 0.9424779f;
                this.field23997.field25184 = 0.5235988f;
                break;
            }
            case 3: {
                this.field23997.field25183 = this.field23997.field25183 * 0.5f - 0.31415927f;
                this.field23997.field25184 = 0.0f;
                break;
            }
        }
        switch (Class5111.field22057[this.field24001.ordinal()]) {
            case 1: {
                this.field23996.field25184 = 0.0f;
                break;
            }
            case 2: {
                this.field23996.field25183 = this.field23996.field25183 * 0.5f - 0.9424779f;
                this.field23996.field25184 = -0.5235988f;
                break;
            }
            case 3: {
                this.field23996.field25183 = this.field23996.field25183 * 0.5f - 0.31415927f;
                this.field23996.field25184 = 0.0f;
                break;
            }
            case 4: {
                this.field23996.field25183 = this.field23996.field25183 * 0.5f - 3.1415927f;
                this.field23996.field25184 = 0.0f;
                break;
            }
        }
        if (this.field24000 == Class2036.field11611 && this.field24001 != Class2036.field11609 && this.field24001 != Class2036.field11611 && this.field24001 != Class2036.field11610) {
            this.field23997.field25183 = this.field23997.field25183 * 0.5f - 3.1415927f;
            this.field23997.field25184 = 0.0f;
        }
        if (this.field23955 > 0.0f) {
            final Class2226 method1819 = this.method17586(t);
            final Class6300 method1820 = this.method17585(method1819);
            this.field23995.field25184 = MathHelper.sin(MathHelper.method35640(this.field23955) * 6.2831855f) * 0.2f;
            if (method1819 == Class2226.field13697) {
                final Class6300 field23998 = this.field23995;
                field23998.field25184 *= -1.0f;
            }
            this.field23996.field25182 = MathHelper.sin(this.field23995.field25184) * 5.0f;
            this.field23996.field25180 = -MathHelper.cos(this.field23995.field25184) * 5.0f;
            this.field23997.field25182 = -MathHelper.sin(this.field23995.field25184) * 5.0f;
            this.field23997.field25180 = MathHelper.cos(this.field23995.field25184) * 5.0f;
            final Class6300 field23999 = this.field23996;
            field23999.field25184 += this.field23995.field25184;
            final Class6300 field24000 = this.field23997;
            field24000.field25184 += this.field23995.field25184;
            final Class6300 field24001 = this.field23997;
            field24001.field25183 += this.field23995.field25184;
            final float n8 = 1.0f - this.field23955;
            final float n9 = n8 * n8;
            method1820.field25183 -= (float)(MathHelper.sin((1.0f - n9 * n9) * 3.1415927f) * 1.2 + MathHelper.sin(this.field23955 * 3.1415927f) * -(this.field23993.field25183 - 0.7f) * 0.75f);
            final Class6300 class6300 = method1820;
            class6300.field25184 += this.field23995.field25184 * 2.0f;
            final Class6300 class6301 = method1820;
            class6301.field25185 += MathHelper.sin(this.field23955 * 3.1415927f) * -0.4f;
        }
        if (this.field24002) {
            this.field23995.field25183 = 0.5f;
            final Class6300 field24002 = this.field23996;
            field24002.field25183 += 0.4f;
            final Class6300 field24003 = this.field23997;
            field24003.field25183 += 0.4f;
            this.field23998.field25182 = 4.0f;
            this.field23999.field25182 = 4.0f;
            this.field23998.field25181 = 12.2f;
            this.field23999.field25181 = 12.2f;
            this.field23993.field25181 = 4.2f;
            this.field23995.field25181 = 3.2f;
            this.field23997.field25181 = 5.2f;
            this.field23996.field25181 = 5.2f;
        }
        else {
            this.field23995.field25183 = 0.0f;
            this.field23998.field25182 = 0.1f;
            this.field23999.field25182 = 0.1f;
            this.field23998.field25181 = 12.0f;
            this.field23999.field25181 = 12.0f;
            this.field23993.field25181 = 0.0f;
            this.field23995.field25181 = 0.0f;
            this.field23997.field25181 = 2.0f;
            this.field23996.field25181 = 2.0f;
        }
        final Class6300 field24004 = this.field23996;
        field24004.field25185 += MathHelper.cos(n3 * 0.09f) * 0.05f + 0.05f;
        final Class6300 field24005 = this.field23997;
        field24005.field25185 -= MathHelper.cos(n3 * 0.09f) * 0.05f + 0.05f;
        final Class6300 field24006 = this.field23996;
        field24006.field25183 += MathHelper.sin(n3 * 0.067f) * 0.05f;
        final Class6300 field24007 = this.field23997;
        field24007.field25183 -= MathHelper.sin(n3 * 0.067f) * 0.05f;
        if (this.field24001 == Class2036.field11610) {
            this.field23996.field25184 = -0.1f + this.field23993.field25184;
            this.field23997.field25184 = 0.1f + this.field23993.field25184 + 0.4f;
            this.field23996.field25183 = -1.5707964f + this.field23993.field25183;
            this.field23997.field25183 = -1.5707964f + this.field23993.field25183;
        }
        else if (this.field24000 == Class2036.field11610 && this.field24001 != Class2036.field11611 && this.field24001 != Class2036.field11609) {
            this.field23996.field25184 = -0.1f + this.field23993.field25184 - 0.4f;
            this.field23997.field25184 = 0.1f + this.field23993.field25184;
            this.field23996.field25183 = -1.5707964f + this.field23993.field25183;
            this.field23997.field25183 = -1.5707964f + this.field23993.field25183;
        }
        final float n10 = (float)Class4086.method12308(t.method2766());
        if (this.field24001 == Class2036.field11612) {
            this.field23996.field25184 = -0.8f;
            this.field23996.field25183 = -0.97079635f;
            this.field23997.field25183 = -0.97079635f;
            final float method1821 = MathHelper.clamp(this.field24004, 0.0f, n10);
            this.field23997.field25184 = MathHelper.method35700(method1821 / n10, 0.4f, 0.85f);
            this.field23997.field25183 = MathHelper.method35700(method1821 / n10, this.field23997.field25183, -1.5707964f);
        }
        else if (this.field24000 == Class2036.field11612) {
            this.field23997.field25184 = 0.8f;
            this.field23996.field25183 = -0.97079635f;
            this.field23997.field25183 = -0.97079635f;
            final float method1822 = MathHelper.clamp(this.field24004, 0.0f, n10);
            this.field23996.field25184 = MathHelper.method35700(method1822 / n10, -0.4f, -0.85f);
            this.field23996.field25183 = MathHelper.method35700(method1822 / n10, this.field23996.field25183, -1.5707964f);
        }
        if (this.field24001 == Class2036.field11613 && this.field23955 <= 0.0f) {
            this.field23996.field25184 = -0.3f + this.field23993.field25184;
            this.field23997.field25184 = 0.6f + this.field23993.field25184;
            this.field23996.field25183 = -1.5707964f + this.field23993.field25183 + 0.1f;
            this.field23997.field25183 = -1.5f + this.field23993.field25183;
        }
        else if (this.field24000 == Class2036.field11613) {
            this.field23996.field25184 = -0.6f + this.field23993.field25184;
            this.field23997.field25184 = 0.3f + this.field23993.field25184;
            this.field23996.field25183 = -1.5f + this.field23993.field25183;
            this.field23997.field25183 = -1.5707964f + this.field23993.field25183 + 0.1f;
        }
        if (this.field24003 > 0.0f) {
            final float n11 = n % 26.0f;
            final float n12 = (this.field23955 > 0.0f) ? 0.0f : this.field24003;
            if (n11 < 14.0f) {
                this.field23997.field25183 = this.method17581(this.field23997.field25183, 0.0f, this.field24003);
                this.field23996.field25183 = MathHelper.method35700(n12, this.field23996.field25183, 0.0f);
                this.field23997.field25184 = this.method17581(this.field23997.field25184, 3.1415927f, this.field24003);
                this.field23996.field25184 = MathHelper.method35700(n12, this.field23996.field25184, 3.1415927f);
                this.field23997.field25185 = this.method17581(this.field23997.field25185, 3.1415927f + 1.8707964f * this.method17582(n11) / this.method17582(14.0f), this.field24003);
                this.field23996.field25185 = MathHelper.method35700(n12, this.field23996.field25185, 3.1415927f - 1.8707964f * this.method17582(n11) / this.method17582(14.0f));
            }
            else if (n11 >= 14.0f && n11 < 22.0f) {
                final float n13 = (n11 - 14.0f) / 8.0f;
                this.field23997.field25183 = this.method17581(this.field23997.field25183, 1.5707964f * n13, this.field24003);
                this.field23996.field25183 = MathHelper.method35700(n12, this.field23996.field25183, 1.5707964f * n13);
                this.field23997.field25184 = this.method17581(this.field23997.field25184, 3.1415927f, this.field24003);
                this.field23996.field25184 = MathHelper.method35700(n12, this.field23996.field25184, 3.1415927f);
                this.field23997.field25185 = this.method17581(this.field23997.field25185, 5.012389f - 1.8707964f * n13, this.field24003);
                this.field23996.field25185 = MathHelper.method35700(n12, this.field23996.field25185, 1.2707963f + 1.8707964f * n13);
            }
            else if (n11 >= 22.0f && n11 < 26.0f) {
                final float n14 = (n11 - 22.0f) / 4.0f;
                this.field23997.field25183 = this.method17581(this.field23997.field25183, 1.5707964f - 1.5707964f * n14, this.field24003);
                this.field23996.field25183 = MathHelper.method35700(n12, this.field23996.field25183, 1.5707964f - 1.5707964f * n14);
                this.field23997.field25184 = this.method17581(this.field23997.field25184, 3.1415927f, this.field24003);
                this.field23996.field25184 = MathHelper.method35700(n12, this.field23996.field25184, 3.1415927f);
                this.field23997.field25185 = this.method17581(this.field23997.field25185, 3.1415927f, this.field24003);
                this.field23996.field25185 = MathHelper.method35700(n12, this.field23996.field25185, 3.1415927f);
            }
            this.field23999.field25183 = MathHelper.method35700(this.field24003, this.field23999.field25183, 0.3f * MathHelper.cos(n * 0.33333334f + 3.1415927f));
            this.field23998.field25183 = MathHelper.method35700(this.field24003, this.field23998.field25183, 0.3f * MathHelper.cos(n * 0.33333334f));
        }
        if (t instanceof Entity && RotationManager.field34858.contains(t)) {
            this.field23996.field25183 = this.field23996.field25183 * 0.5f - 0.9424778f;
            this.field23996.field25184 = -0.5235988f;
        }
        this.field23994.method18632(this.field23993);
    }
    
    public float method17581(final float n, final float n2, final float n3) {
        float n4 = (n2 - n) % 6.2831855f;
        if (n4 < -3.1415927f) {
            n4 += 6.2831855f;
        }
        if (n4 >= 3.1415927f) {
            n4 -= 6.2831855f;
        }
        return n + n3 * n4;
    }
    
    private float method17582(final float n) {
        return -65.0f * n + n * n;
    }
    
    public void method17583(final Class5853<T> class5853) {
        super.method17569(class5853);
        class5853.field24000 = this.field24000;
        class5853.field24001 = this.field24001;
        class5853.field24002 = this.field24002;
    }
    
    public void method17584(final boolean field25187) {
        this.field23993.field25187 = field25187;
        this.field23994.field25187 = field25187;
        this.field23995.field25187 = field25187;
        this.field23996.field25187 = field25187;
        this.field23997.field25187 = field25187;
        this.field23998.field25187 = field25187;
        this.field23999.field25187 = field25187;
    }
    
    @Override
    public void method17578(final Class2226 class2226, final MatrixStack class2227) {
        this.method17585(class2226).method18645(class2227);
    }
    
    public Class6300 method17585(final Class2226 class2226) {
        return (class2226 == Class2226.field13697) ? this.field23997 : this.field23996;
    }
    
    @Override
    public Class6300 method17577() {
        return this.field23993;
    }
    
    public Class2226 method17586(final T t) {
        final Class2226 method2755 = t.method2755();
        return (t.field2934 == Class316.field1877) ? method2755 : method2755.method8419();
    }
}
