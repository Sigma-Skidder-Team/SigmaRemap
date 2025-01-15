// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.util.Pair;
import net.minecraft.util.math.MathHelper;

import java.util.List;

public class Class744 extends Class516<Class3439>
{
    private static final Class1932 field4018;
    private static final int field4019;
    private final Class6300 field4020;
    private List<Pair<Class230, Class181>> field4021;
    private Class8321 field4022;
    private Class8321 field4023;
    private Class8321 field4024;
    private boolean field4025;
    private boolean field4026;
    private boolean field4027;
    private float field4028;
    private boolean field4029;
    private int field4030;
    
    public Class744(final Class3439 class3439, final Class464 class3440, final Class2250 class3441) {
        super(class3439, class3440, class3441);
        this.field4022 = Class8321.field34174;
        this.field4023 = Class8321.field34174;
        this.field4024 = Class8321.field34174;
        this.field4030 = 1;
        this.field4020 = Class4165.method12471();
        class3439.method10975(this::method4060);
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        super.method2975(n, n2, n3);
        this.method2977(n, n2);
    }
    
    @Override
    public void method2973(final int n, final int n2) {
        this.field3156.method6610(this.field3148.method8461(), 8.0f, 4.0f, 4210752);
        this.field3156.method6610(this.field3078.method1871().method8461(), 8.0f, (float)(this.field3076 - 96 + 2), 4210752);
    }
    
    @Override
    public void method2976(final float n, final int n2, final int n3) {
        this.method3041();
        this.field3150.method5290().method5849(Class744.field4018);
        final int field3079 = this.field3079;
        final int field3080 = this.field3080;
        this.method3186(field3079, field3080, 0, 0, this.field3075, this.field3076);
        final Class6601 method10977 = ((Class3439)this.field3077).method10977();
        final Class6601 method10978 = ((Class3439)this.field3077).method10978();
        final Class6601 method10979 = ((Class3439)this.field3077).method10979();
        final Class6601 method10980 = ((Class3439)this.field3077).method10980();
        if (!method10977.method20054()) {
            this.method3186(field3079 + method10977.field26175, field3080 + method10977.field26176, this.field3075, 0, 16, 16);
        }
        if (!method10978.method20054()) {
            this.method3186(field3079 + method10978.field26175, field3080 + method10978.field26176, this.field3075 + 16, 0, 16, 16);
        }
        if (!method10979.method20054()) {
            this.method3186(field3079 + method10979.field26175, field3080 + method10979.field26176, this.field3075 + 32, 0, 16, 16);
        }
        this.method3186(field3079 + 119, field3080 + 13 + (int)(41.0f * this.field4028), 232 + (this.field4025 ? 0 : 12), 0, 12, 15);
        Class8317.method27611();
        if (this.field4021 != null && !this.field4027) {
            final Class7808 method10981 = this.field3150.method5333().method11006();
            final Class7351 class7351 = new Class7351();
            class7351.method22564(field3079 + 139, field3080 + 52, 0.0);
            class7351.method22565(24.0f, -24.0f, 1.0f);
            class7351.method22564(0.5, 0.5, 0.5);
            class7351.method22565(0.6666667f, -0.6666667f, -0.6666667f);
            this.field4020.field25183 = 0.0f;
            this.field4020.field25181 = -32.0f;
            Class4165.method12473(class7351, method10981, 15728880, Class1904.field10335, this.field4020, Class7637.field30242, true, this.field4021);
            method10981.method25216();
        }
        else if (this.field4027) {
            this.method3186(field3079 + method10980.field26175 - 2, field3080 + method10980.field26176 - 2, this.field3075, 17, 17, 16);
        }
        if (!this.field4025) {
            if (this.field4026) {
                final int n4 = field3079 + 60;
                final int n5 = field3080 + 13;
                this.field3150.method5290().method5849(Class744.field4018);
                this.method3186(n4, n5, 0, this.field3076, 14, 14);
                this.method4059(((Class3439)this.field3077).method10974(), n4, n5);
            }
        }
        else {
            final int n6 = field3079 + 60;
            final int n7 = field3080 + 13;
            for (int n8 = this.field4030 + 16, field3081 = this.field4030; field3081 < n8 && field3081 < Class230.field852 - 5; ++field3081) {
                final int n9 = field3081 - this.field4030;
                final int n10 = n6 + n9 % 4 * 14;
                final int n11 = n7 + n9 / 4 * 14;
                this.field3150.method5290().method5849(Class744.field4018);
                int field3082 = this.field3076;
                if (field3081 != ((Class3439)this.field3077).method10974()) {
                    if (n2 >= n10) {
                        if (n3 >= n11) {
                            if (n2 < n10 + 14) {
                                if (n3 < n11 + 14) {
                                    field3082 += 28;
                                }
                            }
                        }
                    }
                }
                else {
                    field3082 += 14;
                }
                this.method3186(n10, n11, 0, field3082, 14, 14);
                this.method4059(field3081, n10, n11);
            }
        }
        Class8317.method27612();
    }
    
    private void method4059(final int n, final int n2, final int n3) {
        final Class8321 class8321 = new Class8321(Class7739.field31563);
        class8321.method27659("BlockEntityTag").method295("Patterns", new Class9142().method33336(Class230.field812, Class181.field544).method33336(Class230.values()[n], Class181.field537).method33337());
        final Class7351 class8322 = new Class7351();
        class8322.method22567();
        class8322.method22564(n2 + 0.5f, n3 + 16, 0.0);
        class8322.method22565(6.0f, -6.0f, 1.0f);
        class8322.method22564(0.5, 0.5, 0.0);
        class8322.method22564(0.5, 0.5, 0.5);
        class8322.method22565(0.6666667f, -0.6666667f, -0.6666667f);
        final Class7808 method11006 = this.field3150.method5333().method11006();
        this.field4020.field25183 = 0.0f;
        this.field4020.field25181 = -32.0f;
        Class4165.method12473(class8322, method11006, 15728880, Class1904.field10335, this.field4020, Class7637.field30242, true, Class465.method2387(Class181.field544, Class465.method2382(class8321)));
        class8322.method22568();
        method11006.method25216();
    }
    
    @Override
    public boolean method2982(final double n, final double n2, final int n3) {
        this.field4029 = false;
        if (this.field4025) {
            final int n4 = this.field3079 + 60;
            final int n5 = this.field3080 + 13;
            for (int n6 = this.field4030 + 16, i = this.field4030; i < n6; ++i) {
                final int n7 = i - this.field4030;
                final double n8 = n - (n4 + n7 % 4 * 14);
                final double n9 = n2 - (n5 + n7 / 4 * 14);
                if (n8 >= 0.0) {
                    if (n9 >= 0.0) {
                        if (n8 < 14.0) {
                            if (n9 < 14.0) {
                                if (((Class3439)this.field3077).method10877(this.field3150.field4684, i)) {
                                    Class869.method5277().method5299().method6422(Class6836.method20933(Class8520.field35663, 1.0f));
                                    this.field3150.field4682.method27326(((Class3439)this.field3077).field16154, i);
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            final int n10 = this.field3079 + 119;
            final int n11 = this.field3080 + 9;
            if (n >= n10) {
                if (n < n10 + 12) {
                    if (n2 >= n11) {
                        if (n2 < n11 + 56) {
                            this.field4029 = true;
                        }
                    }
                }
            }
        }
        return super.method2982(n, n2, n3);
    }
    
    @Override
    public boolean method2984(final double n, final double n2, final int n3, final double n4, final double n5) {
        if (this.field4029 && this.field4025) {
            final int n6 = this.field3080 + 13;
            this.field4028 = ((float)n2 - n6 - 7.5f) / (n6 + 56 - n6 - 15.0f);
            this.field4028 = MathHelper.method35653(this.field4028, 0.0f, 1.0f);
            int n7 = (int)(this.field4028 * (Class744.field4019 - 4) + 0.5);
            if (n7 < 0) {
                n7 = 0;
            }
            this.field4030 = 1 + n7 * 4;
            return true;
        }
        return super.method2984(n, n2, n3, n4, n5);
    }
    
    @Override
    public boolean method3012(final double n, final double n2, final double n3) {
        if (this.field4025) {
            final int n4 = Class744.field4019 - 4;
            this.field4028 -= (float)(n3 / n4);
            this.field4028 = MathHelper.method35653(this.field4028, 0.0f, 1.0f);
            this.field4030 = 1 + (int)(this.field4028 * n4 + 0.5) * 4;
        }
        return true;
    }
    
    @Override
    public boolean method2983(final double n, final double n2, final int n3, final int n4, final int n5) {
        if (n >= n3) {
            if (n2 >= n4) {
                if (n < n3 + this.field3075) {
                    if (n2 < n4 + this.field3076) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    private void method4060() {
        final Class8321 method20053 = ((Class3439)this.field3077).method10980().method20053();
        if (!method20053.method27620()) {
            this.field4021 = Class465.method2387(((Class4044)method20053.method27622()).method12244(), Class465.method2382(method20053));
        }
        else {
            this.field4021 = null;
        }
        final Class8321 method20054 = ((Class3439)this.field3077).method10977().method20053();
        final Class8321 method20055 = ((Class3439)this.field3077).method10978().method20053();
        final Class8321 method20056 = ((Class3439)this.field3077).method10979().method20053();
        final Class51 method20057 = method20054.method27659("BlockEntityTag");
        boolean field4027 = false;
        Label_0160: {
            if (method20057.method316("Patterns", 9)) {
                if (!method20054.method27620()) {
                    if (method20057.method328("Patterns", 10).size() >= 6) {
                        field4027 = true;
                        break Label_0160;
                    }
                }
            }
            field4027 = false;
        }
        if (this.field4027 = field4027) {
            this.field4021 = null;
        }
        Label_0233: {
            if (Class8321.method27643(method20054, this.field4022)) {
                if (Class8321.method27643(method20055, this.field4023)) {
                    if (Class8321.method27643(method20056, this.field4024)) {
                        break Label_0233;
                    }
                }
            }
            boolean field4028 = false;
            Label_0302: {
                if (!method20054.method27620()) {
                    if (!method20055.method27620()) {
                        if (method20056.method27620()) {
                            if (!this.field4027) {
                                field4028 = true;
                                break Label_0302;
                            }
                        }
                    }
                }
                field4028 = false;
            }
            this.field4025 = field4028;
            boolean field4029 = false;
            Label_0355: {
                if (!this.field4027) {
                    if (!method20056.method27620()) {
                        if (!method20054.method27620()) {
                            if (!method20055.method27620()) {
                                field4029 = true;
                                break Label_0355;
                            }
                        }
                    }
                }
                field4029 = false;
            }
            this.field4026 = field4029;
        }
        this.field4022 = method20054.method27641();
        this.field4023 = method20055.method27641();
        this.field4024 = method20056.method27641();
    }
    
    static {
        field4018 = new Class1932("textures/gui/container/loom.png");
        field4019 = (Class230.field852 - 5 - 1 + 4 - 1) / 4;
    }
}
