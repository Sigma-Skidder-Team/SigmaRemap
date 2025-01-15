// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.List;
import com.google.common.collect.Lists;
import java.util.Random;

public class Class526 extends Class516<Class3433>
{
    private static final Class1932 field3134;
    private static final Class1932 field3135;
    private static final Class5917 field3136;
    private final Random field3137;
    public int field3138;
    public float field3139;
    public float field3140;
    public float field3141;
    public float field3142;
    public float field3143;
    public float field3144;
    private Class8321 field3145;
    
    public Class526(final Class3433 class3433, final Class464 class3434, final Class2250 class3435) {
        super(class3433, class3434, class3435);
        this.field3137 = new Random();
        this.field3145 = Class8321.field34174;
    }
    
    @Override
    public void method2973(final int n, final int n2) {
        this.field3156.method6610(this.field3148.method8461(), 12.0f, 5.0f, 4210752);
        this.field3156.method6610(this.field3078.method1871().method8461(), 8.0f, (float)(this.field3076 - 96 + 2), 4210752);
    }
    
    @Override
    public void method2992() {
        super.method2992();
        this.method3025();
    }
    
    @Override
    public boolean method2982(final double n, final double n2, final int n3) {
        final int n4 = (this.field3152 - this.field3075) / 2;
        final int n5 = (this.field3153 - this.field3076) / 2;
        for (int i = 0; i < 3; ++i) {
            final double n6 = n - (n4 + 60);
            final double n7 = n2 - (n5 + 14 + 19 * i);
            if (n6 >= 0.0) {
                if (n7 >= 0.0) {
                    if (n6 < 108.0) {
                        if (n7 < 19.0) {
                            if (((Class3433)this.field3077).method10877(this.field3150.field4684, i)) {
                                this.field3150.field4682.method27326(((Class3433)this.field3077).field16154, i);
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return super.method2982(n, n2, n3);
    }
    
    @Override
    public void method2976(final float n, final int n2, final int n3) {
        Class8317.method27611();
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        this.field3150.method5290().method5849(Class526.field3134);
        final int n4 = (this.field3152 - this.field3075) / 2;
        final int n5 = (this.field3153 - this.field3076) / 2;
        this.method3186(n4, n5, 0, 0, this.field3075, this.field3076);
        Class8726.method30057(5889);
        Class8726.method30059();
        Class8726.method30058();
        final int n6 = (int)this.field3150.method5332().method7700();
        Class8726.method30048((this.field3152 - 320) / 2 * n6, (this.field3153 - 240) / 2 * n6, 320 * n6, 240 * n6);
        Class8726.method30065(-0.34f, 0.23f, 0.0f);
        Class8726.method30067(Class6789.method20755(90.0, 1.3333334f, 9.0f, 80.0f));
        Class8726.method30057(5888);
        final Class7351 class7351 = new Class7351();
        class7351.method22567();
        final Class8996 method22569 = class7351.method22569();
        method22569.method32111().method20748();
        method22569.method32112().method35039();
        class7351.method22564(0.0, 3.299999952316284, 1984.0);
        class7351.method22565(5.0f, 5.0f, 5.0f);
        class7351.method22566(Class9138.field38720.method33328(180.0f));
        class7351.method22566(Class9138.field38716.method33328(20.0f));
        final float method22570 = Class9546.method35700(n, this.field3144, this.field3143);
        class7351.method22564((1.0f - method22570) * 0.2f, (1.0f - method22570) * 0.1f, (1.0f - method22570) * 0.25f);
        class7351.method22566(Class9138.field38718.method33328(-(1.0f - method22570) * 90.0f - 90.0f));
        class7351.method22566(Class9138.field38716.method33328(180.0f));
        final float n7 = Class9546.method35700(n, this.field3140, this.field3139) + 0.25f;
        final float n8 = Class9546.method35700(n, this.field3140, this.field3139) + 0.75f;
        float n9 = (n7 - Class9546.method35643(n7)) * 1.6f - 0.3f;
        float n10 = (n8 - Class9546.method35643(n8)) * 1.6f - 0.3f;
        if (n9 < 0.0f) {
            n9 = 0.0f;
        }
        if (n10 < 0.0f) {
            n10 = 0.0f;
        }
        if (n9 > 1.0f) {
            n9 = 1.0f;
        }
        if (n10 > 1.0f) {
            n10 = 1.0f;
        }
        Class8726.method30046();
        Class526.field3136.method17788(0.0f, n9, n10, method22570);
        final Class7808 method22571 = Class7807.method25212(Class7392.method22694().method22696());
        Class526.field3136.method17564(class7351, method22571.method25214(Class526.field3136.method17647(Class526.field3135)), 15728880, Class1904.field10335, 1.0f, 1.0f, 1.0f, 1.0f);
        method22571.method25216();
        class7351.method22568();
        Class8726.method30057(5889);
        Class8726.method30048(0, 0, this.field3150.method5332().method7692(), this.field3150.method5332().method7693());
        Class8726.method30060();
        Class8726.method30057(5888);
        Class8317.method27612();
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        Class8430.method28151().method28153(((Class3433)this.field3077).method10953());
        final int method22572 = ((Class3433)this.field3077).method10952();
        for (int i = 0; i < 3; ++i) {
            final int n11 = n4 + 60;
            final int n12 = n11 + 20;
            this.method3304(0);
            this.field3150.method5290().method5849(Class526.field3134);
            final int j = ((Class3433)this.field3077).field16221[i];
            Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
            if (j != 0) {
                final String string = "" + j;
                final int n13 = 86 - this.field3156.method6617(string);
                final String method22573 = Class8430.method28151().method28152(this.field3156, n13);
                final Class1844 method22574 = this.field3150.method5323().method7376(Class869.field4625);
                int n14 = 6839882;
                int n15 = 0;
                Label_1122: {
                    if (method22572 < i + 1 || this.field3150.field4684.field3026 < j) {
                        if (!this.field3150.field4684.field3025.field27304) {
                            this.method3186(n11, n5 + 14 + 19 * i, 0, 185, 108, 19);
                            this.method3186(n11 + 1, n5 + 15 + 19 * i, 16 * i, 239, 16, 16);
                            method22574.method6622(method22573, n12, n5 + 16 + 19 * i, n13, (n14 & 0xFEFEFE) >> 1);
                            n15 = 4226832;
                            break Label_1122;
                        }
                    }
                    final int n16 = n2 - (n4 + 60);
                    final int n17 = n3 - (n5 + 14 + 19 * i);
                    Label_1062: {
                        if (n16 >= 0) {
                            if (n17 >= 0) {
                                if (n16 < 108) {
                                    if (n17 < 19) {
                                        this.method3186(n11, n5 + 14 + 19 * i, 0, 204, 108, 19);
                                        n14 = 16777088;
                                        break Label_1062;
                                    }
                                }
                            }
                        }
                        this.method3186(n11, n5 + 14 + 19 * i, 0, 166, 108, 19);
                    }
                    this.method3186(n11 + 1, n5 + 15 + 19 * i, 16 * i, 223, 16, 16);
                    method22574.method6622(method22573, n12, n5 + 16 + 19 * i, n13, n14);
                    n15 = 8453920;
                }
                final Class1844 field4643 = this.field3150.field4643;
                field4643.method6609(string, (float)(n12 + 86 - field4643.method6617(string)), (float)(n5 + 16 + 19 * i + 7), n15);
            }
            else {
                this.method3186(n11, n5 + 14 + 19 * i, 0, 185, 108, 19);
            }
        }
    }
    
    @Override
    public void method2975(final int n, final int n2, float method5314) {
        method5314 = this.field3150.method5314();
        this.method3041();
        super.method2975(n, n2, method5314);
        this.method2977(n, n2);
        final boolean field27304 = this.field3150.field4684.field3025.field27304;
        final int method5315 = ((Class3433)this.field3077).method10952();
        for (int i = 0; i < 3; ++i) {
            final int n3 = ((Class3433)this.field3077).field16221[i];
            final Class6257 method5316 = Class6257.method18590(((Class3433)this.field3077).field16222[i]);
            final int n4 = ((Class3433)this.field3077).field16223[i];
            final int n5 = i + 1;
            if (this.method2987(60, 14 + 19 * i, 108, 17, n, n2)) {
                if (n3 > 0) {
                    if (n4 >= 0) {
                        if (method5316 != null) {
                            final ArrayList arrayList = Lists.newArrayList();
                            arrayList.add("" + Class2116.field12324 + Class2116.field12329 + Class8822.method30773("container.enchant.clue", method5316.method18599(n4).method8461()));
                            if (!field27304) {
                                arrayList.add("");
                                if (this.field3150.field4684.field3026 >= n3) {
                                    String str;
                                    if (n5 != 1) {
                                        str = Class8822.method30773("container.enchant.lapis.many", n5);
                                    }
                                    else {
                                        str = Class8822.method30773("container.enchant.lapis.one", new Object[0]);
                                    }
                                    arrayList.add(((method5315 < n5) ? Class2116.field12321 : Class2116.field12316) + "" + str);
                                    String str2;
                                    if (n5 != 1) {
                                        str2 = Class8822.method30773("container.enchant.level.many", n5);
                                    }
                                    else {
                                        str2 = Class8822.method30773("container.enchant.level.one", new Object[0]);
                                    }
                                    arrayList.add(Class2116.field12316 + "" + str2);
                                }
                                else {
                                    arrayList.add(Class2116.field12321 + Class8822.method30773("container.enchant.level.requirement", ((Class3433)this.field3077).field16221[i]));
                                }
                            }
                            this.method3032(arrayList, n, n2);
                            break;
                        }
                    }
                }
            }
        }
    }
    
    public void method3025() {
        final Class8321 method20053 = this.field3077.method10878(0).method20053();
        if (!Class8321.method27643(method20053, this.field3145)) {
            this.field3145 = method20053;
            do {
                this.field3141 += this.field3137.nextInt(4) - this.field3137.nextInt(4);
                if (this.field3139 > this.field3141 + 1.0f) {
                    break;
                }
            } while (this.field3139 >= this.field3141 - 1.0f);
        }
        ++this.field3138;
        this.field3140 = this.field3139;
        this.field3144 = this.field3143;
        int n = 0;
        for (int i = 0; i < 3; ++i) {
            if (((Class3433)this.field3077).field16221[i] != 0) {
                n = 1;
            }
        }
        if (n == 0) {
            this.field3143 -= 0.2f;
        }
        else {
            this.field3143 += 0.2f;
        }
        this.field3143 = Class9546.method35653(this.field3143, 0.0f, 1.0f);
        this.field3142 += (Class9546.method35653((this.field3141 - this.field3139) * 0.4f, -0.2f, 0.2f) - this.field3142) * 0.9f;
        this.field3139 += this.field3142;
    }
    
    static {
        field3134 = new Class1932("textures/gui/container/enchanting_table.png");
        field3135 = new Class1932("textures/entity/enchanting_table_book.png");
        field3136 = new Class5917();
    }
}
