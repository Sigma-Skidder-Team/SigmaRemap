// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import javax.annotation.Nullable;
import java.util.List;
import java.time.temporal.TemporalField;
import java.time.temporal.ChronoField;
import java.time.LocalDate;
import com.mojang.datafixers.types.DynamicOps;
import java.util.function.Predicate;
import java.util.UUID;

public class Class827 extends Class763
{
    public static final Class8725 field4423;
    private static final UUID field4424;
    private static final Class7919 field4425;
    private static final Class8810<Boolean> field4426;
    private static final Class8810<Integer> field4427;
    private static final Class8810<Boolean> field4428;
    private static final Predicate<Class2113> field4429;
    private final Class3470 field4430;
    private boolean field4431;
    private int field4432;
    private int field4433;
    
    public Class827(final Class7499<? extends Class827> class7499, final Class1847 class7500) {
        super(class7499, class7500);
        this.field4430 = new Class3470(this, Class827.field4429);
    }
    
    public Class827(final Class1847 class1847) {
        this(Class7499.field29052, class1847);
    }
    
    @Override
    public void method4142() {
        this.field4114.method22062(4, new Class3486(this, this, 1.0, 3));
        this.field4114.method22062(8, new Class3628(this, Class512.class, 8.0f));
        this.field4114.method22062(8, new Class3503(this));
        this.method4157();
    }
    
    public void method4157() {
        this.field4114.method22062(2, new Class3583(this, 1.0, false));
        this.field4114.method22062(6, new Class3573(this, 1.0, true, 4, this::method4924));
        this.field4114.method22062(7, new Class3517(this, 1.0));
        this.field4115.method22062(1, new Class3547(this, (Class<?>[])new Class[0]).method11100(Class828.class));
        this.field4115.method22062(2, new Class3555<Object>(this, Class512.class, true));
        this.field4115.method22062(3, new Class3555<Object>(this, Class819.class, false));
        this.field4115.method22062(3, new Class3555<Object>(this, Class786.class, true));
        this.field4115.method22062(5, new Class3555<Object>(this, Class793.class, 10, true, false, Class793.field4242));
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33406).method23941(35.0);
        this.method2710(Class8107.field33408).method23941(0.23000000417232513);
        this.method2710(Class8107.field33410).method23941(3.0);
        this.method2710(Class8107.field33413).method23941(2.0);
        this.method2711().method20873(Class827.field4423).method23941(this.field2423.nextDouble() * 0.10000000149011612);
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.method1650().method33565(Class827.field4426, false);
        this.method1650().method33565(Class827.field4427, 0);
        this.method1650().method33565(Class827.field4428, false);
    }
    
    public boolean method4923() {
        return this.method1650().method33568(Class827.field4428);
    }
    
    public boolean method4924() {
        return this.field4431;
    }
    
    public void method4925(final boolean field4431) {
        if (!this.method4926()) {
            if (this.field4431) {
                this.field4114.method22063(this.field4430);
                this.field4431 = false;
            }
        }
        else if (this.field4431 != field4431) {
            this.field4431 = field4431;
            ((Class7747)this.method4150()).method24747(field4431);
            if (!field4431) {
                this.field4114.method22063(this.field4430);
            }
            else {
                this.field4114.method22062(1, this.field4430);
            }
        }
    }
    
    public boolean method4926() {
        return true;
    }
    
    @Override
    public boolean method2625() {
        return this.method1650().method33568(Class827.field4426);
    }
    
    @Override
    public int method2631(final Class512 class512) {
        if (this.method2625()) {
            this.field4108 *= (int)2.5f;
        }
        return super.method2631(class512);
    }
    
    public void method4927(final boolean b) {
        this.method1650().method33569(Class827.field4426, b);
        if (this.field2391 != null) {
            if (!this.field2391.field10067) {
                final Class7619 method2710 = this.method2710(Class8107.field33408);
                method2710.method23947(Class827.field4425);
                if (b) {
                    method2710.method23946(Class827.field4425);
                }
            }
        }
    }
    
    @Override
    public void method1880(final Class8810<?> class8810) {
        if (Class827.field4426.equals(class8810)) {
            this.method1881();
        }
        super.method1880(class8810);
    }
    
    public boolean method4912() {
        return true;
    }
    
    @Override
    public void method1659() {
        if (!this.field2391.field10067) {
            if (this.method1768()) {
                if (!this.method4923()) {
                    if (this.method4912()) {
                        if (!this.method1720(Class7324.field28319)) {
                            this.field4432 = -1;
                        }
                        else {
                            ++this.field4432;
                            if (this.field4432 >= 600) {
                                this.method4928(300);
                            }
                        }
                    }
                }
                else {
                    --this.field4433;
                    if (this.field4433 < 0) {
                        this.method4929();
                    }
                }
            }
        }
        super.method1659();
    }
    
    @Override
    public void method2736() {
        if (this.method1768()) {
            int n = (this.method4931() && this.method4217()) ? 1 : 0;
            if (n != 0) {
                final Class8321 method2718 = this.method2718(Class2215.field13605);
                if (!method2718.method27620()) {
                    if (method2718.method27630()) {
                        method2718.method27633(method2718.method27632() + this.field2423.nextInt(2));
                        if (method2718.method27632() >= method2718.method27634()) {
                            this.method2794(Class2215.field13605);
                            this.method1803(Class2215.field13605, Class8321.field34174);
                        }
                    }
                    n = 0;
                }
                if (n != 0) {
                    this.method1664(8);
                }
            }
        }
        super.method2736();
    }
    
    private void method4928(final int field4433) {
        this.field4433 = field4433;
        this.method1650().method33569(Class827.field4428, true);
    }
    
    public void method4929() {
        this.method4930(Class7499.field28973);
        this.field2391.method6839(null, 1040, new Class354(this), 0);
    }
    
    public void method4930(final Class7499<? extends Class827> class7499) {
        if (!this.field2410) {
            final Class827 class7500 = (Class827)class7499.method23371(this.field2391);
            class7500.method1852(this);
            class7500.method4193(this.method4192());
            class7500.method4925(class7500.method4926() && this.method4924());
            class7500.method4932(class7500.field2391.method6784(new Class354(class7500)).method35975());
            class7500.method4927(this.method2625());
            class7500.method4211(this.method4214());
            for (final Class2215 class7501 : Class2215.values()) {
                final Class8321 method2718 = this.method2718(class7501);
                if (!method2718.method27620()) {
                    class7500.method1803(class7501, method2718.method27641());
                    class7500.method4191(class7501, this.method4183(class7501));
                    method2718.method27691(0);
                }
            }
            if (this.method1874()) {
                class7500.method1872(this.method1873());
                class7500.method1875(this.method1876());
            }
            if (this.method4194()) {
                class7500.method4190();
            }
            class7500.method1851(this.method1850());
            this.field2391.method6886(class7500);
            this.method1652();
        }
    }
    
    @Override
    public boolean method4195(final Class512 class512, final Class316 class513) {
        final Class8321 method2715 = class512.method2715(class513);
        final Class3820 method2716 = method2715.method27622();
        if (method2716 instanceof Class3831 && ((Class3831)method2716).method11769(method2715.method27657(), this.method1642())) {
            if (!this.field2391.field10067) {
                final Class827 class514 = (Class827)this.method1642().method23371(this.field2391);
                if (class514 != null) {
                    class514.method4927(true);
                    class514.method1730(this.method1938(), this.method1941(), this.method1945(), 0.0f, 0.0f);
                    this.field2391.method6886(class514);
                    if (method2715.method27667()) {
                        class514.method1872(method2715.method27664());
                    }
                    if (!class512.field3025.field27304) {
                        method2715.method27693(1);
                    }
                }
            }
            return true;
        }
        return super.method4195(class512, class513);
    }
    
    public boolean method4931() {
        return true;
    }
    
    @Override
    public boolean method1740(final Class7929 class7929, final float n) {
        if (!super.method1740(class7929, n)) {
            return false;
        }
        Class511 method4152 = this.method4152();
        if (method4152 == null) {
            if (class7929.method25714() instanceof Class511) {
                method4152 = (Class511)class7929.method25714();
            }
        }
        if (method4152 != null) {
            if (this.field2391.method6954() == Class2113.field12293) {
                if (this.field2423.nextFloat() < this.method2710(Class827.field4423).method23950()) {
                    if (this.field2391.method6765().method31216(Class8878.field37318)) {
                        final int method4153 = Class9546.method35644(this.method1938());
                        final int method4154 = Class9546.method35644(this.method1941());
                        final int method4155 = Class9546.method35644(this.method1945());
                        final Class827 class7930 = new Class827(this.field2391);
                        for (int i = 0; i < 50; ++i) {
                            final int n2 = method4153 + Class9546.method35658(this.field2423, 7, 40) * Class9546.method35658(this.field2423, -1, 1);
                            final int n3 = method4154 + Class9546.method35658(this.field2423, 7, 40) * Class9546.method35658(this.field2423, -1, 1);
                            final int n4 = method4155 + Class9546.method35658(this.field2423, 7, 40) * Class9546.method35658(this.field2423, -1, 1);
                            final Class354 class7931 = new Class354(n2, n3 - 1, n4);
                            if (this.field2391.method6701(class7931).method21731(this.field2391, class7931, class7930)) {
                                if (this.field2391.method6969(new Class354(n2, n3, n4)) < 10) {
                                    class7930.method1656(n2, n3, n4);
                                    if (!this.field2391.method7134(n2, n3, n4, 7.0)) {
                                        if (this.field2391.method6975(class7930)) {
                                            if (this.field2391.method6977(class7930)) {
                                                if (!this.field2391.method6968(class7930.method1886())) {
                                                    this.field2391.method6886(class7930);
                                                    class7930.method4153(method4152);
                                                    class7930.method4188(this.field2391, this.field2391.method6784(new Class354(class7930)), Class2101.field12183, null, null);
                                                    this.method2710(Class827.field4423).method23946(new Class7919("Zombie reinforcement caller charge", -0.05000000074505806, Class2157.field12809));
                                                    class7930.method2710(Class827.field4423).method23946(new Class7919("Zombie reinforcement callee charge", -0.05000000074505806, Class2157.field12809));
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
    
    @Override
    public boolean method2734(final Class399 class399) {
        final boolean method2734 = super.method2734(class399);
        if (method2734) {
            final float method2735 = this.field2391.method6784(new Class354(this)).method35973();
            if (this.method2713().method27620()) {
                if (this.method1804()) {
                    if (this.field2423.nextFloat() < method2735 * 0.3f) {
                        class399.method1664(2 * (int)method2735);
                    }
                }
            }
        }
        return method2734;
    }
    
    @Override
    public Class7795 method4160() {
        return Class8520.field35751;
    }
    
    @Override
    public Class7795 method2683(final Class7929 class7929) {
        return Class8520.field35761;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35756;
    }
    
    public Class7795 method4917() {
        return Class8520.field35767;
    }
    
    @Override
    public void method1691(final Class354 class354, final Class7096 class355) {
        this.method1695(this.method4917(), 0.15f, 1.0f);
    }
    
    @Override
    public Class6363 method2712() {
        return Class6363.field25461;
    }
    
    @Override
    public void method4184(final Class9592 class9592) {
        super.method4184(class9592);
        if (this.field2423.nextFloat() < ((this.field2391.method6954() != Class2113.field12293) ? 0.01f : 0.05f)) {
            if (this.field2423.nextInt(3) != 0) {
                this.method1803(Class2215.field13600, new Class8321(Class7739.field31274));
            }
            else {
                this.method1803(Class2215.field13600, new Class8321(Class7739.field31286));
            }
        }
    }
    
    @Override
    public void method1761(final Class51 class51) {
        super.method1761(class51);
        if (this.method2625()) {
            class51.method312("IsBaby", true);
        }
        class51.method312("CanBreakDoors", this.method4924());
        class51.method298("InWaterTime", this.method1706() ? this.field4432 : -1);
        class51.method298("DrownedConversionTime", this.method4923() ? this.field4433 : -1);
    }
    
    @Override
    public void method1760(final Class51 class51) {
        super.method1760(class51);
        if (class51.method329("IsBaby")) {
            this.method4927(true);
        }
        this.method4925(class51.method329("CanBreakDoors"));
        this.field4432 = class51.method319("InWaterTime");
        if (class51.method316("DrownedConversionTime", 99)) {
            if (class51.method319("DrownedConversionTime") > -1) {
                this.method4928(class51.method319("DrownedConversionTime"));
            }
        }
    }
    
    @Override
    public void method1837(final Class511 class511) {
        super.method1837(class511);
        if (this.field2391.method6954() == Class2113.field12292 || this.field2391.method6954() == Class2113.field12293) {
            if (class511 instanceof Class824) {
                if (this.field2391.method6954() != Class2113.field12293 && this.field2423.nextBoolean()) {
                    return;
                }
                final Class824 class512 = (Class824)class511;
                final Class826 class513 = Class7499.field29054.method23371(this.field2391);
                class513.method1852(class512);
                class512.method1652();
                class513.method4188(this.field2391, this.field2391.method6784(new Class354(class513)), Class2101.field12182, new Class5495(this, false, null), null);
                class513.method4921(class512.method4870());
                class513.method4920((Class41)class512.method4899().method35243((com.mojang.datafixers.types.DynamicOps<Object>)Class8453.field34721).getValue());
                class513.method4919(class512.method4825().method362());
                class513.method4922(class512.method4821());
                class513.method4927(class512.method2625());
                class513.method4211(class512.method4214());
                if (class512.method1874()) {
                    class513.method1872(class512.method1873());
                    class513.method1875(class512.method1876());
                }
                if (this.method4194()) {
                    class513.method4190();
                }
                class513.method1851(this.method1850());
                this.field2391.method6886(class513);
                this.field2391.method6839(null, 1026, new Class354(this), 0);
            }
        }
    }
    
    @Override
    public float method2789(final Class290 class290, final Class8295 class291) {
        return this.method2625() ? 0.93f : 1.74f;
    }
    
    @Override
    public boolean method4167(final Class8321 class8321) {
        if (class8321.method27622() == Class7739.field31374) {
            if (this.method2625()) {
                if (this.method1805()) {
                    return false;
                }
            }
        }
        return super.method4167(class8321);
    }
    
    @Nullable
    @Override
    public Class5496 method4188(final Class1851 class1851, final Class9592 class1852, final Class2101 class1853, Class5496 method4188, final Class51 class1854) {
        method4188 = super.method4188(class1851, class1852, class1853, (Class5496)method4188, class1854);
        final float method4189 = class1852.method35975();
        this.method4193(this.field2423.nextFloat() < 0.55f * method4189);
        if (method4188 == null) {
            method4188 = new Class5495(this, class1851.method6790().nextFloat() < 0.05f, null);
        }
        if (method4188 instanceof Class5495) {
            if (((Class5495)method4188).field22784) {
                this.method4927(true);
                if (class1851.method6790().nextFloat() >= 0.05) {
                    if (class1851.method6790().nextFloat() < 0.05) {
                        final Class818 class1855 = Class7499.field28966.method23371(this.field2391);
                        class1855.method1730(this.method1938(), this.method1941(), this.method1945(), this.field2399, 0.0f);
                        class1855.method4188(class1851, class1852, Class2101.field12180, null, null);
                        class1855.method4818(true);
                        class1851.method6886(class1855);
                        this.method1778(class1855);
                    }
                }
                else {
                    final List<Class399> method4190 = class1851.method6739((Class<? extends Class399>)Class818.class, this.method1886().method18495(5.0, 3.0, 5.0), (Predicate<? super Class399>)Class9170.field38847);
                    if (!method4190.isEmpty()) {
                        final Class818 class1856 = method4190.get(0);
                        class1856.method4818(true);
                        this.method1778(class1856);
                    }
                }
            }
            this.method4925(this.method4926() && this.field2423.nextFloat() < method4189 * 0.1f);
            this.method4184(class1852);
            this.method4187(class1852);
        }
        if (this.method2718(Class2215.field13605).method27620()) {
            final LocalDate now = LocalDate.now();
            final int value = now.get(ChronoField.DAY_OF_MONTH);
            if (now.get(ChronoField.MONTH_OF_YEAR) == 10) {
                if (value == 31) {
                    if (this.field2423.nextFloat() < 0.25f) {
                        this.method1803(Class2215.field13605, new Class8321((this.field2423.nextFloat() >= 0.1f) ? Class7521.field29342 : Class7521.field29343));
                        this.field4121[Class2215.field13605.method8402()] = 0.0f;
                    }
                }
            }
        }
        this.method4932(method4189);
        return (Class5496)method4188;
    }
    
    public void method4932(final float n) {
        this.method2710(Class8107.field33407).method23946(new Class7919("Random spawn bonus", this.field2423.nextDouble() * 0.05000000074505806, Class2157.field12809));
        final double n2 = this.field2423.nextDouble() * 1.5 * n;
        if (n2 > 1.0) {
            this.method2710(Class8107.field33406).method23946(new Class7919("Random zombie-spawn bonus", n2, Class2157.field12811));
        }
        if (this.field2423.nextFloat() < n * 0.05f) {
            this.method2710(Class827.field4423).method23946(new Class7919("Leader zombie bonus", this.field2423.nextDouble() * 0.25 + 0.5, Class2157.field12809));
            this.method2710(Class8107.field33405).method23946(new Class7919("Leader zombie bonus", this.field2423.nextDouble() * 3.0 + 1.0, Class2157.field12811));
            this.method4925(this.method4926());
        }
    }
    
    @Override
    public double method1776() {
        return this.method2625() ? 0.0 : -0.45;
    }
    
    @Override
    public void method2678(final Class7929 class7929, final int n, final boolean b) {
        super.method2678(class7929, n, b);
        final Class399 method25714 = class7929.method25714();
        if (method25714 instanceof Class765) {
            final Class765 class7930 = (Class765)method25714;
            if (class7930.method4241()) {
                class7930.method4242();
                final Class8321 method25715 = this.method4918();
                if (!method25715.method27620()) {
                    this.method1766(method25715);
                }
            }
        }
    }
    
    public Class8321 method4918() {
        return new Class8321(Class7739.field31526);
    }
    
    static {
        field4423 = new Class8723(null, "zombie.spawnReinforcements", 0.0, 0.0, 1.0).method29975("Spawn Reinforcements Chance");
        field4424 = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
        field4425 = new Class7919(Class827.field4424, "Baby speed boost", 0.5, Class2157.field12810);
        field4426 = Class9184.method33564(Class827.class, Class7709.field30661);
        field4427 = Class9184.method33564(Class827.class, Class7709.field30654);
        field4428 = Class9184.method33564(Class827.class, Class7709.field30661);
        field4429 = (class2113 -> class2113 == Class2113.field12293);
    }
}
