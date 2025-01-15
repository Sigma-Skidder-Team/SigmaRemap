// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.commons.lang3.tuple.Pair;
import java.util.Random;
import java.util.UUID;

public class Class805 extends Class804
{
    private static final Class8810<String> field4327;
    private Class5328 field4328;
    private int field4329;
    private UUID field4330;
    
    public Class805(final Class7499<? extends Class805> class7499, final Class1847 class7500) {
        super(class7499, class7500);
    }
    
    @Override
    public float method4228(final Class354 class354, final Class1852 class355) {
        return (class355.method6701(class354.method1139()).method21696() != Class7521.field29392) ? (class355.method6963(class354) - 0.5f) : 10.0f;
    }
    
    public static boolean method4705(final Class7499<Class805> class7499, final Class1851 class7500, final Class2101 class7501, final Class354 class7502, final Random random) {
        return class7500.method6701(class7502.method1139()).method21696() == Class7521.field29392 && class7500.method6993(class7502, 0) > 8;
    }
    
    @Override
    public void method1834(final Class422 class422) {
        final UUID method1865 = class422.method1865();
        if (!method1865.equals(this.field4330)) {
            this.method4707((this.method4708() != Class1983.field10981) ? Class1983.field10981 : Class1983.field10982);
            this.field4330 = method1865;
            this.method1695(Class8520.field35369, 2.0f, 1.0f);
        }
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.field2432.method33565(Class805.field4327, Class1983.method7994(Class1983.field10981));
    }
    
    @Override
    public boolean method4195(final Class512 class512, final Class316 class513) {
        final Class8321 method2715 = class512.method2715(class513);
        if (method2715.method27622() == Class7739.field31300) {
            if (!this.method2625()) {
                if (!class512.field3025.field27304) {
                    method2715.method27693(1);
                    boolean b = false;
                    Class8321 class514;
                    if (this.field4328 == null) {
                        class514 = new Class8321(Class7739.field31301);
                    }
                    else {
                        b = true;
                        class514 = new Class8321(Class7739.field31612);
                        Class4035.method12228(class514, this.field4328, this.field4329);
                        this.field4328 = null;
                        this.field4329 = 0;
                    }
                    if (!method2715.method27620()) {
                        if (!class512.field3006.method2362(class514)) {
                            class512.method2822(class514, false);
                        }
                    }
                    else {
                        class512.method2716(class513, class514);
                    }
                    Class7795 class515;
                    if (!b) {
                        class515 = Class8520.field35371;
                    }
                    else {
                        class515 = Class8520.field35372;
                    }
                    this.method1695(class515, 1.0f, 1.0f);
                    return true;
                }
            }
        }
        if (method2715.method27622() == Class7739.field31426 && !this.method2625()) {
            this.field2391.method6709(Class8432.field34619, this.method1938(), this.method1942(0.5), this.method1945(), 0.0, 0.0, 0.0);
            if (!this.field2391.field10067) {
                this.method1652();
                final Class804 class516 = Class7499.field28968.method23371(this.field2391);
                class516.method1730(this.method1938(), this.method1941(), this.method1945(), this.field2399, this.field2400);
                class516.method2665(this.method2664());
                class516.field2951 = this.field2951;
                if (this.method1874()) {
                    class516.method1872(this.method1873());
                    class516.method1875(this.method1876());
                }
                if (this.method4194()) {
                    class516.method4190();
                }
                class516.method1851(this.method1850());
                this.field2391.method6886(class516);
                for (int i = 0; i < 5; ++i) {
                    this.field2391.method6886(new Class427(this.field2391, this.method1938(), this.method1942(1.0), this.method1945(), new Class8321(Class1983.method7995(this.method4708()).method21696())));
                }
                method2715.method27636(1, class512, class518 -> class518.method2795(class517));
                this.method1695(Class8520.field35373, 1.0f, 1.0f);
            }
            return true;
        }
        if (this.method4708() == Class1983.field10982) {
            if (method2715.method27622().method11742(Class7855.field32266)) {
                if (this.field4328 == null) {
                    final Pair<Class5328, Integer> method2716 = this.method4706(method2715);
                    if (!class512.field3025.field27304) {
                        method2715.method27693(1);
                    }
                    for (int j = 0; j < 4; ++j) {
                        this.field2391.method6709(Class8432.field34612, this.method1938() + this.field2423.nextFloat() / 2.0f, this.method1942(0.5), this.method1945() + this.field2423.nextFloat() / 2.0f, 0.0, this.field2423.nextFloat() / 5.0f, 0.0);
                    }
                    this.field4328 = (Class5328)method2716.getLeft();
                    this.field4329 = (int)method2716.getRight();
                    this.method1695(Class8520.field35370, 2.0f, 1.0f);
                }
                else {
                    for (int k = 0; k < 2; ++k) {
                        this.field2391.method6709(Class8432.field34639, this.method1938() + this.field2423.nextFloat() / 2.0f, this.method1942(0.5), this.method1945() + this.field2423.nextFloat() / 2.0f, 0.0, this.field2423.nextFloat() / 5.0f, 0.0);
                    }
                }
            }
        }
        return super.method4195(class512, class513);
    }
    
    @Override
    public void method1761(final Class51 class51) {
        super.method1761(class51);
        class51.method306("Type", Class1983.method7994(this.method4708()));
        if (this.field4328 != null) {
            class51.method296("EffectId", (byte)Class5328.method16451(this.field4328));
            class51.method298("EffectDuration", this.field4329);
        }
    }
    
    @Override
    public void method1760(final Class51 class51) {
        super.method1760(class51);
        this.method4707(Class1983.method7996(class51.method323("Type")));
        if (class51.method316("EffectId", 1)) {
            this.field4328 = Class5328.method16450(class51.method317("EffectId"));
        }
        if (class51.method316("EffectDuration", 3)) {
            this.field4329 = class51.method319("EffectDuration");
        }
    }
    
    private Pair<Class5328, Integer> method4706(final Class8321 class8321) {
        final Class3882 class8322 = (Class3882)((Class4036)class8321.method27622()).method12240();
        return (Pair<Class5328, Integer>)Pair.of((Object)class8322.method11961(), (Object)class8322.method11962());
    }
    
    private void method4707(final Class1983 class1983) {
        this.field2432.method33569(Class805.field4327, Class1983.method7994(class1983));
    }
    
    public Class1983 method4708() {
        return Class1983.method7996(this.field2432.method33568(Class805.field4327));
    }
    
    public Class805 method4709(final Class788 class788) {
        final Class805 class789 = Class7499.field29007.method23371(this.field2391);
        class789.method4707(this.method4710((Class805)class788));
        return class789;
    }
    
    private Class1983 method4710(final Class805 class805) {
        final Class1983 method4708 = this.method4708();
        final Class1983 method4709 = class805.method4708();
        Class1983 class806;
        if (method4708 == method4709 && this.field2423.nextInt(1024) == 0) {
            class806 = ((method4708 != Class1983.field10982) ? Class1983.field10982 : Class1983.field10981);
        }
        else {
            class806 = (this.field2423.nextBoolean() ? method4708 : method4709);
        }
        return class806;
    }
    
    static {
        field4327 = Class9184.method33564(Class805.class, Class7709.field30656);
    }
}
