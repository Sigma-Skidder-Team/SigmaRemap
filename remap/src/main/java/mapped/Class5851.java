// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.util.math.MathHelper;

public class Class5851<T extends Class772> extends Class5846<T> implements Class5852, Class5855
{
    private static String[] field23982;
    private final Class6300 field23983;
    private final Class6300 field23984;
    private final Class6300 field23985;
    private final Class6300 field23986;
    private final Class6300 field23987;
    private final Class6300 field23988;
    private final Class6300 field23989;
    private final Class6300 field23990;
    private float field23991;
    
    public Class5851(final float n, final float n2, final int n3, final int n4) {
        (this.field23983 = new Class6300(this).method18647(n3, n4)).method18642(0.0f, 0.0f + n2, 0.0f);
        this.field23983.method18634(0, 0).method18638(-4.0f, -10.0f, -4.0f, 8.0f, 10.0f, 8.0f, n);
        (this.field23984 = new Class6300(this, 32, 0).method18647(n3, n4)).method18638(-4.0f, -10.0f, -4.0f, 8.0f, 12.0f, 8.0f, n + 0.45f);
        this.field23983.method18633(this.field23984);
        this.field23984.field25187 = false;
        final Class6300 method18647 = new Class6300(this).method18647(n3, n4);
        method18647.method18642(0.0f, n2 - 2.0f, 0.0f);
        method18647.method18634(24, 0).method18638(-1.0f, -1.0f, -6.0f, 2.0f, 4.0f, 2.0f, n);
        this.field23983.method18633(method18647);
        (this.field23985 = new Class6300(this).method18647(n3, n4)).method18642(0.0f, 0.0f + n2, 0.0f);
        this.field23985.method18634(16, 20).method18638(-4.0f, 0.0f, -3.0f, 8.0f, 12.0f, 6.0f, n);
        this.field23985.method18634(0, 38).method18638(-4.0f, 0.0f, -3.0f, 8.0f, 18.0f, 6.0f, n + 0.5f);
        (this.field23986 = new Class6300(this).method18647(n3, n4)).method18642(0.0f, 0.0f + n2 + 2.0f, 0.0f);
        this.field23986.method18634(44, 22).method18638(-8.0f, -2.0f, -2.0f, 4.0f, 8.0f, 4.0f, n);
        final Class6300 method18648 = new Class6300(this, 44, 22).method18647(n3, n4);
        method18648.field25186 = true;
        method18648.method18638(4.0f, -2.0f, -2.0f, 4.0f, 8.0f, 4.0f, n);
        this.field23986.method18633(method18648);
        this.field23986.method18634(40, 38).method18638(-4.0f, 2.0f, -2.0f, 8.0f, 4.0f, 4.0f, n);
        (this.field23987 = new Class6300(this, 0, 22).method18647(n3, n4)).method18642(-2.0f, 12.0f + n2, 0.0f);
        this.field23987.method18638(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, n);
        this.field23988 = new Class6300(this, 0, 22).method18647(n3, n4);
        this.field23988.field25186 = true;
        this.field23988.method18642(2.0f, 12.0f + n2, 0.0f);
        this.field23988.method18638(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, n);
        (this.field23989 = new Class6300(this, 40, 46).method18647(n3, n4)).method18638(-3.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, n);
        this.field23989.method18642(-5.0f, 2.0f + n2, 0.0f);
        this.field23990 = new Class6300(this, 40, 46).method18647(n3, n4);
        this.field23990.field25186 = true;
        this.field23990.method18638(-1.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, n);
        this.field23990.method18642(5.0f, 2.0f + n2, 0.0f);
    }
    
    @Override
    public Iterable<Class6300> method17570() {
        return (Iterable<Class6300>)ImmutableList.of((Object)this.field23983, (Object)this.field23985, (Object)this.field23987, (Object)this.field23988, (Object)this.field23986, (Object)this.field23989, (Object)this.field23990);
    }
    
    public void method17573(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
        this.field23983.field25184 = n4 * 0.017453292f;
        this.field23983.field25183 = n5 * 0.017453292f;
        this.field23986.field25181 = 3.0f;
        this.field23986.field25182 = -1.0f;
        this.field23986.field25183 = -0.75f;
        if (!this.field23956) {
            this.field23989.field25183 = MathHelper.cos(n * 0.6662f + 3.1415927f) * 2.0f * n2 * 0.5f;
            this.field23989.field25184 = 0.0f;
            this.field23989.field25185 = 0.0f;
            this.field23990.field25183 = MathHelper.cos(n * 0.6662f) * 2.0f * n2 * 0.5f;
            this.field23990.field25184 = 0.0f;
            this.field23990.field25185 = 0.0f;
            this.field23987.field25183 = MathHelper.cos(n * 0.6662f) * 1.4f * n2 * 0.5f;
            this.field23987.field25184 = 0.0f;
            this.field23987.field25185 = 0.0f;
            this.field23988.field25183 = MathHelper.cos(n * 0.6662f + 3.1415927f) * 1.4f * n2 * 0.5f;
            this.field23988.field25184 = 0.0f;
            this.field23988.field25185 = 0.0f;
        }
        else {
            this.field23989.field25183 = -0.62831855f;
            this.field23989.field25184 = 0.0f;
            this.field23989.field25185 = 0.0f;
            this.field23990.field25183 = -0.62831855f;
            this.field23990.field25184 = 0.0f;
            this.field23990.field25185 = 0.0f;
            this.field23987.field25183 = -1.4137167f;
            this.field23987.field25184 = 0.31415927f;
            this.field23987.field25185 = 0.07853982f;
            this.field23988.field25183 = -1.4137167f;
            this.field23988.field25184 = -0.31415927f;
            this.field23988.field25185 = -0.07853982f;
        }
        final Class259 method4264 = t.method4264();
        if (method4264 != Class259.field1235) {
            if (method4264 != Class259.field1236) {
                if (method4264 != Class259.field1237) {
                    if (method4264 != Class259.field1238) {
                        if (method4264 != Class259.field1239) {
                            if (method4264 == Class259.field1240) {
                                this.field23989.field25182 = 0.0f;
                                this.field23989.field25180 = -5.0f;
                                this.field23989.field25183 = MathHelper.cos(n3 * 0.6662f) * 0.05f;
                                this.field23989.field25185 = 2.670354f;
                                this.field23989.field25184 = 0.0f;
                                this.field23990.field25182 = 0.0f;
                                this.field23990.field25180 = 5.0f;
                                this.field23990.field25183 = MathHelper.cos(n3 * 0.6662f) * 0.05f;
                                this.field23990.field25185 = -2.3561945f;
                                this.field23990.field25184 = 0.0f;
                            }
                        }
                        else {
                            this.field23989.field25184 = -0.8f;
                            this.field23989.field25183 = -0.97079635f;
                            this.field23990.field25183 = -0.97079635f;
                            final float method4265 = MathHelper.method35653(this.field23991, 0.0f, 25.0f);
                            this.field23990.field25184 = MathHelper.method35700(method4265 / 25.0f, 0.4f, 0.85f);
                            this.field23990.field25183 = MathHelper.method35700(method4265 / 25.0f, this.field23990.field25183, -1.5707964f);
                        }
                    }
                    else {
                        this.field23989.field25184 = -0.3f + this.field23983.field25184;
                        this.field23990.field25184 = 0.6f + this.field23983.field25184;
                        this.field23989.field25183 = -1.5707964f + this.field23983.field25183 + 0.1f;
                        this.field23990.field25183 = -1.5f + this.field23983.field25183;
                    }
                }
                else {
                    this.field23989.field25184 = -0.1f + this.field23983.field25184;
                    this.field23989.field25183 = -1.5707964f + this.field23983.field25183;
                    this.field23990.field25183 = -0.9424779f + this.field23983.field25183;
                    this.field23990.field25184 = this.field23983.field25184 - 0.4f;
                    this.field23990.field25185 = 1.5707964f;
                }
            }
            else {
                this.field23989.field25182 = 0.0f;
                this.field23989.field25180 = -5.0f;
                this.field23990.field25182 = 0.0f;
                this.field23990.field25180 = 5.0f;
                this.field23989.field25183 = MathHelper.cos(n3 * 0.6662f) * 0.25f;
                this.field23990.field25183 = MathHelper.cos(n3 * 0.6662f) * 0.25f;
                this.field23989.field25185 = 2.3561945f;
                this.field23990.field25185 = -2.3561945f;
                this.field23989.field25184 = 0.0f;
                this.field23990.field25184 = 0.0f;
            }
        }
        else {
            final float method4266 = MathHelper.sin(this.field23955 * 3.1415927f);
            final float method4267 = MathHelper.sin((1.0f - (1.0f - this.field23955) * (1.0f - this.field23955)) * 3.1415927f);
            this.field23989.field25185 = 0.0f;
            this.field23990.field25185 = 0.0f;
            this.field23989.field25184 = 0.15707964f;
            this.field23990.field25184 = -0.15707964f;
            if (t.method2755() != Class2226.field13698) {
                this.field23989.field25183 = -0.0f + MathHelper.cos(n3 * 0.19f) * 0.5f;
                this.field23990.field25183 = -1.8849558f + MathHelper.cos(n3 * 0.09f) * 0.15f;
                final Class6300 field23989 = this.field23989;
                field23989.field25183 += method4266 * 1.2f - method4267 * 0.4f;
                final Class6300 field23990 = this.field23990;
                field23990.field25183 += method4266 * 2.2f - method4267 * 0.4f;
            }
            else {
                this.field23989.field25183 = -1.8849558f + MathHelper.cos(n3 * 0.09f) * 0.15f;
                this.field23990.field25183 = -0.0f + MathHelper.cos(n3 * 0.19f) * 0.5f;
                final Class6300 field23991 = this.field23989;
                field23991.field25183 += method4266 * 2.2f - method4267 * 0.4f;
                final Class6300 field23992 = this.field23990;
                field23992.field25183 += method4266 * 1.2f - method4267 * 0.4f;
            }
            final Class6300 field23993 = this.field23989;
            field23993.field25185 += MathHelper.cos(n3 * 0.09f) * 0.05f + 0.05f;
            final Class6300 field23994 = this.field23990;
            field23994.field25185 -= MathHelper.cos(n3 * 0.09f) * 0.05f + 0.05f;
            final Class6300 field23995 = this.field23989;
            field23995.field25183 += MathHelper.sin(n3 * 0.067f) * 0.05f;
            final Class6300 field23996 = this.field23990;
            field23996.field25183 -= MathHelper.sin(n3 * 0.067f) * 0.05f;
        }
        final boolean field23997 = method4264 == Class259.field1234;
        this.field23986.field25187 = field23997;
        this.field23990.field25187 = !field23997;
        this.field23989.field25187 = !field23997;
    }
    
    public void method17574(final T t, final float n, final float n2, final float n3) {
        this.field23991 = (float)t.method2768();
        super.method17558(t, n, n2, n3);
    }
    
    private Class6300 method17575(final Class2226 class2226) {
        return (class2226 != Class2226.field13697) ? this.field23989 : this.field23990;
    }
    
    public Class6300 method17576() {
        return this.field23984;
    }
    
    @Override
    public Class6300 method17577() {
        return this.field23983;
    }
    
    @Override
    public void method17578(final Class2226 class2226, final Class7351 class2227) {
        this.method17575(class2226).method18645(class2227);
    }
}
