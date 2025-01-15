// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import java.util.Optional;
import java.util.UUID;

public class Class841 extends Class785 implements Class762
{
    private static final UUID field4479;
    private static final Class7919 field4480;
    public static final Class8810<Class179> field4481;
    public static final Class8810<Optional<Class354>> field4482;
    public static final Class8810<Byte> field4483;
    public static final Class8810<Byte> field4484;
    private float field4485;
    private float field4486;
    private Class354 field4487;
    private int field4488;
    
    public Class841(final Class7499<? extends Class841> class7499, final Class1847 class7500) {
        super(class7499, class7500);
        this.field2952 = 180.0f;
        this.field2951 = 180.0f;
        this.field4487 = null;
        this.field4108 = 5;
    }
    
    @Nullable
    @Override
    public Class5496 method4188(final Class1851 class1851, final Class9592 class1852, final Class2101 class1853, final Class5496 class1854, final Class51 class1855) {
        this.field2951 = 180.0f;
        this.field2952 = 180.0f;
        this.field2399 = 180.0f;
        this.field2401 = 180.0f;
        this.field2953 = 180.0f;
        this.field2954 = 180.0f;
        return super.method4188(class1851, class1852, class1853, class1854, class1855);
    }
    
    @Override
    public void method4142() {
        this.field4114.method22062(1, new Class3628(this, Class512.class, 8.0f));
        this.field4114.method22062(4, new Class3458(this));
        this.field4114.method22062(7, new Class3455(this, null));
        this.field4114.method22062(8, new Class3503(this));
        this.field4115.method22062(1, new Class3547(this, (Class<?>[])new Class[0]).method11100((Class<?>[])new Class[0]));
        this.field4115.method22062(2, new Class3568(this, this));
        this.field4115.method22062(3, new Class3563(this));
    }
    
    @Override
    public boolean method1700() {
        return false;
    }
    
    @Override
    public Class286 method1922() {
        return Class286.field1583;
    }
    
    @Override
    public Class7795 method4160() {
        return Class8520.field35548;
    }
    
    @Override
    public void method4156() {
        if (!this.method5017()) {
            super.method4156();
        }
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35554;
    }
    
    @Override
    public Class7795 method2683(final Class7929 class7929) {
        return this.method5017() ? Class8520.field35556 : Class8520.field35555;
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.field2432.method33565(Class841.field4481, Class179.field511);
        this.field2432.method33565(Class841.field4482, Optional.empty());
        this.field2432.method33565(Class841.field4483, (Byte)0);
        this.field2432.method33565(Class841.field4484, (Byte)16);
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33405).method23941(30.0);
    }
    
    @Override
    public Class7232 method4146() {
        return new Class7233(this, this);
    }
    
    @Override
    public void method1760(final Class51 class51) {
        super.method1760(class51);
        this.field2432.method33569(Class841.field4481, Class179.method792(class51.method317("AttachFace")));
        this.field2432.method33569(Class841.field4483, class51.method317("Peek"));
        this.field2432.method33569(Class841.field4484, class51.method317("Color"));
        if (!class51.method315("APX")) {
            this.field2432.method33569(Class841.field4482, Optional.empty());
        }
        else {
            this.field2432.method33569(Class841.field4482, Optional.of(new Class354(class51.method319("APX"), class51.method319("APY"), class51.method319("APZ"))));
        }
    }
    
    @Override
    public void method1761(final Class51 class51) {
        super.method1761(class51);
        class51.method296("AttachFace", (byte)this.field2432.method33568(Class841.field4481).method779());
        class51.method296("Peek", this.field2432.method33568(Class841.field4483));
        class51.method296("Color", this.field2432.method33568(Class841.field4484));
        final Class354 method5019 = this.method5019();
        if (method5019 != null) {
            class51.method298("APX", method5019.method1074());
            class51.method298("APY", method5019.method1075());
            class51.method298("APZ", method5019.method1076());
        }
    }
    
    @Override
    public void method1659() {
        super.method1659();
        Class354 class354 = this.field2432.method33568(Class841.field4482).orElse(null);
        if (class354 == null) {
            if (!this.field2391.field10067) {
                class354 = new Class354(this);
                this.field2432.method33569(Class841.field4482, Optional.of(class354));
            }
        }
        if (!this.method1805()) {
            if (!this.field2391.field10067) {
                final Class7096 method6701 = this.field2391.method6701(class354);
                if (!method6701.method21706()) {
                    if (method6701.method21696() != Class7521.field29264) {
                        if (method6701.method21696() != Class7521.field29247) {
                            this.method5016();
                        }
                        else {
                            final Class179 class355 = method6701.method21772((Class7111<Class179>)Class3835.field17415);
                            if (!this.field2391.method6961(class354.method1149(class355))) {
                                this.method5016();
                            }
                            else {
                                class354 = class354.method1149(class355);
                                this.field2432.method33569(Class841.field4482, Optional.of(class354));
                            }
                        }
                    }
                    else {
                        final Class179 class356 = method6701.method21772((Class7111<Class179>)Class3836.field17415);
                        if (!this.field2391.method6961(class354.method1149(class356))) {
                            this.method5016();
                        }
                        else {
                            class354 = class354.method1149(class356);
                            this.field2432.method33569(Class841.field4482, Optional.of(class354));
                        }
                    }
                }
                if (!this.field2391.method6732(class354.method1149(this.method5018()), this)) {
                    int n = 0;
                    for (final Class179 class357 : Class179.values()) {
                        if (this.field2391.method6732(class354.method1149(class357), this)) {
                            this.field2432.method33569(Class841.field4481, class357);
                            n = 1;
                            break;
                        }
                    }
                    if (n == 0) {
                        this.method5016();
                    }
                }
                if (this.field2391.method6732(class354.method1149(this.method5018().method782()), this)) {
                    this.method5016();
                }
            }
        }
        else {
            class354 = null;
            final float field2399 = this.method1920().field2399;
            this.field2399 = field2399;
            this.field2951 = field2399;
            this.field2952 = field2399;
            this.field4488 = 0;
        }
        final float n2 = this.method5021() * 0.01f;
        this.field4485 = this.field4486;
        if (this.field4486 <= n2) {
            if (this.field4486 < n2) {
                this.field4486 = Class9546.method35653(this.field4486 + 0.05f, 0.0f, n2);
            }
        }
        else {
            this.field4486 = Class9546.method35653(this.field4486 - 0.05f, n2, 1.0f);
        }
        if (class354 != null) {
            if (this.field2391.field10067) {
                if (this.field4488 > 0 && this.field4487 != null) {
                    --this.field4488;
                }
                else {
                    this.field4487 = class354;
                }
            }
            this.method1731(class354.method1074() + 0.5, class354.method1075(), class354.method1076() + 0.5);
            final double n3 = 0.5 - Class9546.method35638((0.5f + this.field4486) * 3.1415927f) * 0.5;
            final double n4 = 0.5 - Class9546.method35638((0.5f + this.field4485) * 3.1415927f) * 0.5;
            final Class179 method6702 = this.method5018().method782();
            this.method1889(new Class6221(this.method1938() - 0.5, this.method1941(), this.method1945() - 0.5, this.method1938() + 0.5, this.method1941() + 1.0, this.method1945() + 0.5).method18494(method6702.method785() * n3, method6702.method786() * n3, method6702.method787() * n3));
            final double n5 = n3 - n4;
            if (n5 > 0.0) {
                final List<Class399> method6703 = this.field2391.method7127(this, this.method1886());
                if (!method6703.isEmpty()) {
                    for (final Class399 class358 : method6703) {
                        if (class358 instanceof Class841) {
                            continue;
                        }
                        if (class358.field2421) {
                            continue;
                        }
                        class358.method1671(Class2160.field12830, new Class5487(n5 * method6702.method785(), n5 * method6702.method786(), n5 * method6702.method787()));
                    }
                }
            }
        }
    }
    
    @Override
    public void method1671(final Class2160 class2160, final Class5487 class2161) {
        if (class2160 != Class2160.field12829) {
            super.method1671(class2160, class2161);
        }
        else {
            this.method5016();
        }
    }
    
    @Override
    public void method1656(final double n, final double n2, final double n3) {
        super.method1656(n, n2, n3);
        if (this.field2432 != null) {
            if (this.field2424 != 0) {
                final Optional<Class354> obj = this.field2432.method33568(Class841.field4482);
                final Optional<Class354> of = Optional.of(new Class354(n, n2, n3));
                if (!of.equals(obj)) {
                    this.field2432.method33569(Class841.field4482, of);
                    this.field2432.method33569(Class841.field4483, (Byte)0);
                    this.field2448 = true;
                }
            }
        }
    }
    
    public boolean method5016() {
        if (!this.method4214() && this.method1768()) {
            final Class354 class354 = new Class354(this);
            for (int i = 0; i < 5; ++i) {
                final Class354 method1134 = class354.method1134(8 - this.field2423.nextInt(17), 8 - this.field2423.nextInt(17), 8 - this.field2423.nextInt(17));
                if (method1134.method1075() > 0) {
                    if (this.field2391.method6961(method1134)) {
                        if (this.field2391.method6787().method34779(method1134)) {
                            if (this.field2391.method6978(this, new Class6221(method1134))) {
                                int n = 0;
                                for (final Class179 class355 : Class179.values()) {
                                    if (this.field2391.method6732(method1134.method1149(class355), this)) {
                                        this.field2432.method33569(Class841.field4481, class355);
                                        n = 1;
                                        break;
                                    }
                                }
                                if (n != 0) {
                                    this.method1695(Class8520.field35559, 1.0f, 1.0f);
                                    this.field2432.method33569(Class841.field4482, Optional.of(method1134));
                                    this.field2432.method33569(Class841.field4483, (Byte)0);
                                    this.method4153(null);
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public void method2736() {
        super.method2736();
        this.method1936(Class5487.field22769);
        this.field2952 = 180.0f;
        this.field2951 = 180.0f;
        this.field2399 = 180.0f;
    }
    
    @Override
    public void method1880(final Class8810<?> class8810) {
        if (Class841.field4482.equals(class8810)) {
            if (this.field2391.field10067) {
                if (!this.method1805()) {
                    final Class354 method5019 = this.method5019();
                    if (method5019 != null) {
                        if (this.field4487 != null) {
                            this.field4488 = 6;
                        }
                        else {
                            this.field4487 = method5019;
                        }
                        this.method1731(method5019.method1074() + 0.5, method5019.method1075(), method5019.method1076() + 0.5);
                    }
                }
            }
        }
        super.method1880(class8810);
    }
    
    @Override
    public void method1788(final double n, final double n2, final double n3, final float n4, final float n5, final int n6, final boolean b) {
        this.field2971 = 0;
    }
    
    @Override
    public boolean method1740(final Class7929 class7929, final float n) {
        if (this.method5017() && class7929.method25713() instanceof Class402) {
            return false;
        }
        if (!super.method1740(class7929, n)) {
            return false;
        }
        if (this.method2664() < this.method2701() * 0.5) {
            if (this.field2423.nextInt(4) == 0) {
                this.method5016();
            }
        }
        return true;
    }
    
    private boolean method5017() {
        return this.method5021() == 0;
    }
    
    @Nullable
    @Override
    public Class6221 method1702() {
        return this.method1768() ? this.method1886() : null;
    }
    
    public Class179 method5018() {
        return this.field2432.method33568(Class841.field4481);
    }
    
    @Nullable
    public Class354 method5019() {
        return this.field2432.method33568(Class841.field4482).orElse(null);
    }
    
    public void method5020(final Class354 value) {
        this.field2432.method33569(Class841.field4482, Optional.ofNullable(value));
    }
    
    public int method5021() {
        return this.field2432.method33568(Class841.field4483);
    }
    
    public void method5022(final int n) {
        if (!this.field2391.field10067) {
            this.method2710(Class8107.field33413).method23947(Class841.field4480);
            if (n != 0) {
                this.method1695(Class8520.field35557, 1.0f, 1.0f);
            }
            else {
                this.method2710(Class8107.field33413).method23946(Class841.field4480);
                this.method1695(Class8520.field35553, 1.0f, 1.0f);
            }
        }
        this.field2432.method33569(Class841.field4483, (byte)n);
    }
    
    public float method5023(final float n) {
        return Class9546.method35700(n, this.field4485, this.field4486);
    }
    
    public int method5024() {
        return this.field4488;
    }
    
    public Class354 method5025() {
        return this.field4487;
    }
    
    @Override
    public float method2789(final Class290 class290, final Class8295 class291) {
        return 0.5f;
    }
    
    @Override
    public int method4173() {
        return 180;
    }
    
    @Override
    public int method4174() {
        return 180;
    }
    
    @Override
    public void method1737(final Class399 class399) {
    }
    
    @Override
    public float method1790() {
        return 0.0f;
    }
    
    public boolean method5026() {
        return this.field4487 != null && this.method5019() != null;
    }
    
    @Nullable
    public Class181 method5027() {
        final Byte b = this.field2432.method33568(Class841.field4484);
        return (b != 16 && b <= 15) ? Class181.method819(b) : null;
    }
    
    static {
        field4479 = UUID.fromString("7E0292F2-9434-48D5-A29F-9583AF7DF27F");
        field4480 = new Class7919(Class841.field4479, "Covered armor bonus", 20.0, Class2157.field12809).method25640(false);
        field4481 = Class9184.method33564(Class841.class, Class7709.field30666);
        field4482 = Class9184.method33564(Class841.class, Class7709.field30665);
        field4483 = Class9184.method33564(Class841.class, Class7709.field30653);
        field4484 = Class9184.method33564(Class841.class, Class7709.field30653);
    }
}
