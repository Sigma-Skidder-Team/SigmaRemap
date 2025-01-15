// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class Class423 extends Class399
{
    private static final Class8810<Integer> field2542;
    private static final Class8810<Integer> field2543;
    private static final Class8810<Float> field2544;
    private static final Class8810<Integer> field2545;
    private static final Class8810<Boolean> field2546;
    private static final Class8810<Boolean> field2547;
    private static final Class8810<Integer> field2548;
    private final float[] field2549;
    private float field2550;
    private float field2551;
    private float field2552;
    private int field2553;
    private double field2554;
    private double field2555;
    private double field2556;
    private double field2557;
    private double field2558;
    private boolean field2559;
    private boolean field2560;
    private boolean field2561;
    private boolean field2562;
    private double field2563;
    private float field2564;
    private Class2087 field2565;
    private Class2087 field2566;
    private double field2567;
    private boolean field2568;
    private boolean field2569;
    private float field2570;
    private float field2571;
    private float field2572;
    
    public Class423(final Class7499<? extends Class423> class7499, final Class1847 class7500) {
        super(class7499, class7500);
        this.field2549 = new float[2];
        this.field2386 = true;
    }
    
    public Class423(final Class1847 class1847, final double field2392, final double field2393, final double field2394) {
        this(Class7499.field28963, class1847);
        this.method1656(field2392, field2393, field2394);
        this.method1936(Class5487.field22769);
        this.field2392 = field2392;
        this.field2393 = field2393;
        this.field2394 = field2394;
    }
    
    @Override
    public boolean method1700() {
        return false;
    }
    
    @Override
    public void method1649() {
        this.field2432.method33565(Class423.field2542, 0);
        this.field2432.method33565(Class423.field2543, 1);
        this.field2432.method33565(Class423.field2544, 0.0f);
        this.field2432.method33565(Class423.field2545, Class241.field1181.ordinal());
        this.field2432.method33565(Class423.field2546, false);
        this.field2432.method33565(Class423.field2547, false);
        this.field2432.method33565(Class423.field2548, 0);
    }
    
    @Nullable
    @Override
    public Class6221 method1771(final Class399 class399) {
        return class399.method1750() ? class399.method1886() : null;
    }
    
    @Nullable
    @Override
    public Class6221 method1702() {
        return this.method1886();
    }
    
    @Override
    public boolean method1750() {
        return true;
    }
    
    @Override
    public double method1777() {
        return -0.1;
    }
    
    @Override
    public boolean method1740(final Class7929 class7929, final float n) {
        if (this.method1849(class7929)) {
            return false;
        }
        if (!this.field2391.field10067 && !this.field2410) {
            if (class7929 instanceof Class7931) {
                if (class7929.method25714() != null) {
                    if (this.method1909(class7929.method25714())) {
                        return false;
                    }
                }
            }
            this.method2062(-this.method2063());
            this.method2057(10);
            this.method2055(this.method2056() + n * 10.0f);
            this.method1739();
            final boolean b = class7929.method25714() instanceof Class512 && ((Class512)class7929.method25714()).field3025.field27304;
            if (b || this.method2056() > 40.0f) {
                if (!b) {
                    if (this.field2391.method6765().method31216(Class8878.field37321)) {
                        this.method1764(this.method2040());
                    }
                }
                this.method1652();
            }
            return true;
        }
        return true;
    }
    
    @Override
    public void method1835(final boolean field2569) {
        if (!this.field2391.field10067) {
            this.field2568 = true;
            this.field2569 = field2569;
            if (this.method2060() == 0) {
                this.method2059(60);
            }
        }
        this.field2391.method6709(Class8432.field34646, this.method1938() + this.field2423.nextFloat(), this.method1941() + 0.7, this.method1945() + this.field2423.nextFloat(), 0.0, 0.0, 0.0);
        if (this.field2423.nextInt(20) == 0) {
            this.field2391.method6708(this.method1938(), this.method1941(), this.method1945(), this.method1687(), this.method1922(), 1.0f, 0.8f + 0.4f * this.field2423.nextFloat(), false);
        }
    }
    
    @Override
    public void method1737(final Class399 class399) {
        if (!(class399 instanceof Class423)) {
            if (class399.method1886().field25074 <= this.method1886().field25074) {
                super.method1737(class399);
            }
        }
        else if (class399.method1886().field25074 < this.method1886().field25077) {
            super.method1737(class399);
        }
    }
    
    public Class3820 method2040() {
        switch (Class6847.field26864[this.method2065().ordinal()]) {
            default: {
                return Class7739.field31356;
            }
            case 2: {
                return Class7739.field31585;
            }
            case 3: {
                return Class7739.field31586;
            }
            case 4: {
                return Class7739.field31587;
            }
            case 5: {
                return Class7739.field31588;
            }
            case 6: {
                return Class7739.field31589;
            }
        }
    }
    
    @Override
    public void method1799() {
        this.method2062(-this.method2063());
        this.method2057(10);
        this.method2055(this.method2056() * 11.0f);
    }
    
    @Override
    public boolean method1749() {
        return !this.field2410;
    }
    
    @Override
    public void method1788(final double field2554, final double field2555, final double field2556, final float n, final float n2, final int n3, final boolean b) {
        this.field2554 = field2554;
        this.field2555 = field2555;
        this.field2556 = field2556;
        this.field2557 = n;
        this.field2558 = n2;
        this.field2553 = 10;
    }
    
    @Override
    public Class179 method1883() {
        return this.method1882().method783();
    }
    
    @Override
    public void method1659() {
        this.field2566 = this.field2565;
        this.field2565 = this.method2046();
        if (this.field2565 != Class2087.field12066 && this.field2565 != Class2087.field12067) {
            this.field2551 = 0.0f;
        }
        else {
            ++this.field2551;
        }
        if (!this.field2391.field10067) {
            if (this.field2551 >= 60.0f) {
                this.method1783();
            }
        }
        if (this.method2058() > 0) {
            this.method2057(this.method2058() - 1);
        }
        if (this.method2056() > 0.0f) {
            this.method2055(this.method2056() - 1.0f);
        }
        super.method1659();
        this.method2043();
        if (!this.method1919()) {
            this.method1936(Class5487.field22769);
        }
        else {
            if (this.method1908().isEmpty() || !(this.method1908().get(0) instanceof Class512)) {
                this.method2044(false, false);
            }
            this.method2051();
            if (this.field2391.field10067) {
                this.method2052();
                this.field2391.method6788(new Class4302(this.method2054(0), this.method2054(1)));
            }
            this.method1671(Class2160.field12826, this.method1935());
        }
        this.method2041();
        for (int i = 0; i <= 1; ++i) {
            if (!this.method2054(i)) {
                this.field2549[i] = 0.0f;
            }
            else {
                if (!this.method1696()) {
                    if (this.field2549[i] % 6.2831855f <= 0.7853981852531433) {
                        if ((this.field2549[i] + 0.39269909262657166) % 6.2831854820251465 >= 0.7853981852531433) {
                            final Class7795 method2042 = this.method2042();
                            if (method2042 != null) {
                                final Class5487 method2043 = this.method1741(1.0f);
                                this.field2391.method6706(null, this.method1938() + ((i != 1) ? method2043.field22772 : (-method2043.field22772)), this.method1941(), this.method1945() + ((i != 1) ? (-method2043.field22770) : method2043.field22770), method2042, this.method1922(), 1.0f, 0.8f + 0.4f * this.field2423.nextFloat());
                            }
                        }
                    }
                }
                this.field2549[i] += 0.39269909262657166;
            }
        }
        this.method1689();
        final List<Class399> method2044 = this.field2391.method6737(this, this.method1886().method18495(0.20000000298023224, -0.009999999776482582, 0.20000000298023224), Class9170.method33474(this));
        if (!method2044.isEmpty()) {
            final boolean b = !this.field2391.field10067 && !(this.method1907() instanceof Class512);
            for (int j = 0; j < method2044.size(); ++j) {
                final Class399 class399 = method2044.get(j);
                if (!class399.method1909(this)) {
                    if (b) {
                        if (this.method1908().size() < 2) {
                            if (!class399.method1805()) {
                                if (class399.method1930() < this.method1930()) {
                                    if (class399 instanceof Class511) {
                                        if (!(class399 instanceof Class832)) {
                                            if (!(class399 instanceof Class512)) {
                                                class399.method1778(this);
                                                continue;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    this.method1737(class399);
                }
            }
        }
    }
    
    private void method2041() {
        if (!this.field2391.field10067) {
            if (!this.field2568) {
                this.method2059(0);
            }
            int method2060 = this.method2060();
            if (method2060 > 0) {
                --method2060;
                this.method2059(method2060);
                if (60 - method2060 - 1 > 0) {
                    if (method2060 == 0) {
                        this.method2059(0);
                        final Class5487 method2061 = this.method1935();
                        if (!this.field2569) {
                            this.method1937(method2061.field22770, this.method1910(Class512.class) ? 2.7 : 0.6, method2061.field22772);
                        }
                        else {
                            this.method1936(method2061.method16744(0.0, -0.7, 0.0));
                            this.method1783();
                        }
                    }
                }
                this.field2568 = false;
            }
        }
        else {
            if (this.method2060() <= 0) {
                this.field2570 -= 0.1f;
            }
            else {
                this.field2570 += 0.05f;
            }
            this.field2570 = Class9546.method35653(this.field2570, 0.0f, 1.0f);
            this.field2572 = this.field2571;
            this.field2571 = 10.0f * (float)Math.sin(0.5f * this.field2391.method6754()) * this.field2570;
        }
    }
    
    @Nullable
    public Class7795 method2042() {
        switch (Class6847.field26865[this.method2046().ordinal()]) {
            case 1:
            case 2:
            case 3: {
                return Class8520.field35033;
            }
            case 4: {
                return Class8520.field35032;
            }
            default: {
                return null;
            }
        }
    }
    
    private void method2043() {
        if (this.method1919()) {
            this.field2553 = 0;
            this.method1641(this.method1938(), this.method1941(), this.method1945());
        }
        if (this.field2553 > 0) {
            final double n = this.method1938() + (this.field2554 - this.method1938()) / this.field2553;
            final double n2 = this.method1941() + (this.field2555 - this.method1941()) / this.field2553;
            final double n3 = this.method1945() + (this.field2556 - this.method1945()) / this.field2553;
            this.field2399 += (float)(Class9546.method35669(this.field2557 - this.field2399) / this.field2553);
            this.field2400 += (float)((this.field2558 - this.field2400) / this.field2553);
            --this.field2553;
            this.method1656(n, n2, n3);
            this.method1655(this.field2399, this.field2400);
        }
    }
    
    public void method2044(final boolean b, final boolean b2) {
        this.field2432.method33569(Class423.field2546, b);
        this.field2432.method33569(Class423.field2547, b2);
    }
    
    public float method2045(final int n, final float n2) {
        return this.method2054(n) ? ((float)Class9546.method35655(this.field2549[n] - 0.39269909262657166, this.field2549[n], n2)) : 0.0f;
    }
    
    private Class2087 method2046() {
        final Class2087 method2050 = this.method2050();
        if (method2050 != null) {
            this.field2563 = this.method1886().field25077;
            return method2050;
        }
        if (this.method2049()) {
            return Class2087.field12065;
        }
        final float method2051 = this.method2048();
        if (method2051 <= 0.0f) {
            return Class2087.field12069;
        }
        this.field2564 = method2051;
        return Class2087.field12068;
    }
    
    public float method2047() {
        final Class6221 method1886 = this.method1886();
        final int method1887 = Class9546.method35644(method1886.field25073);
        final int method1888 = Class9546.method35650(method1886.field25076);
        final int method1889 = Class9546.method35644(method1886.field25077);
        final int method1890 = Class9546.method35650(method1886.field25077 - this.field2567);
        final int method1891 = Class9546.method35644(method1886.field25075);
        final int method1892 = Class9546.method35650(method1886.field25078);
        try (final Class386 method1893 = Class386.method1296()) {
            int i = method1889;
        Label_0252_Outer:
            while (i < method1890) {
                float max = 0.0f;
                int j = method1887;
            Label_0252:
                while (true) {
                    while (j < method1888) {
                        for (int k = method1891; k < method1892; ++k) {
                            method1893.method1300(j, i, k);
                            final Class7099 method1894 = this.field2391.method6702(method1893);
                            if (method1894.method21793(Class7324.field28319)) {
                                max = Math.max(max, method1894.method21782(this.field2391, method1893));
                            }
                            if (max >= 1.0f) {
                                break Label_0252;
                            }
                        }
                        ++j;
                        continue Label_0252_Outer;
                        ++i;
                        continue Label_0252_Outer;
                    }
                    if (max < 1.0f) {
                        return method1893.method1075() + max;
                    }
                    continue Label_0252;
                }
            }
            return (float)(method1890 + 1);
        }
    }
    
    public float method2048() {
        final Class6221 method1886 = this.method1886();
        final Class6221 class6221 = new Class6221(method1886.field25073, method1886.field25074 - 0.001, method1886.field25075, method1886.field25076, method1886.field25074, method1886.field25078);
        final int n = Class9546.method35644(class6221.field25073) - 1;
        final int n2 = Class9546.method35650(class6221.field25076) + 1;
        final int n3 = Class9546.method35644(class6221.field25074) - 1;
        final int n4 = Class9546.method35650(class6221.field25077) + 1;
        final int n5 = Class9546.method35644(class6221.field25075) - 1;
        final int n6 = Class9546.method35650(class6221.field25078) + 1;
        final Class7702 method1887 = Class7698.method24489(class6221);
        float n7 = 0.0f;
        int n8 = 0;
        try (final Class386 method1888 = Class386.method1296()) {
            for (int i = n; i < n2; ++i) {
                for (int j = n5; j < n6; ++j) {
                    final int n9 = ((i == n || i == n2 - 1) + (j == n5 || j == n6 - 1)) ? 1 : 0;
                    if (n9 != 2) {
                        for (int k = n3; k < n4; ++k) {
                            if (n9 <= 0 || (k != n3 && k != n4 - 1)) {
                                method1888.method1300(i, k, j);
                                final Class7096 method1889 = this.field2391.method6701(method1888);
                                if (!(method1889.method21696() instanceof Class3886) && Class7698.method24496(method1889.method21727(this.field2391, method1888).method24541(i, k, j), method1887, Class9306.field39924)) {
                                    n7 += method1889.method21696().method11865();
                                    ++n8;
                                }
                            }
                        }
                    }
                }
            }
        }
        return n7 / n8;
    }
    
    private boolean method2049() {
        final Class6221 method1886 = this.method1886();
        final int method1887 = Class9546.method35644(method1886.field25073);
        final int method1888 = Class9546.method35650(method1886.field25076);
        final int method1889 = Class9546.method35644(method1886.field25074);
        final int method1890 = Class9546.method35650(method1886.field25074 + 0.001);
        final int method1891 = Class9546.method35644(method1886.field25075);
        final int method1892 = Class9546.method35650(method1886.field25078);
        boolean b = false;
        this.field2563 = Double.MIN_VALUE;
        try (final Class386 method1893 = Class386.method1296()) {
            for (int i = method1887; i < method1888; ++i) {
                for (int j = method1889; j < method1890; ++j) {
                    for (int k = method1891; k < method1892; ++k) {
                        method1893.method1300(i, j, k);
                        final Class7099 method1894 = this.field2391.method6702(method1893);
                        if (method1894.method21793(Class7324.field28319)) {
                            final float n = j + method1894.method21782(this.field2391, method1893);
                            this.field2563 = Math.max(n, this.field2563);
                            b |= (method1886.field25074 < n);
                        }
                    }
                }
            }
        }
        return b;
    }
    
    @Nullable
    private Class2087 method2050() {
        final Class6221 method1886 = this.method1886();
        final double n = method1886.field25077 + 0.001;
        final int method1887 = Class9546.method35644(method1886.field25073);
        final int method1888 = Class9546.method35650(method1886.field25076);
        final int method1889 = Class9546.method35644(method1886.field25077);
        final int method1890 = Class9546.method35650(n);
        final int method1891 = Class9546.method35644(method1886.field25075);
        final int method1892 = Class9546.method35650(method1886.field25078);
        boolean b = false;
        try (final Class386 method1893 = Class386.method1296()) {
            for (int i = method1887; i < method1888; ++i) {
                for (int j = method1889; j < method1890; ++j) {
                    for (int k = method1891; k < method1892; ++k) {
                        method1893.method1300(i, j, k);
                        final Class7099 method1894 = this.field2391.method6702(method1893);
                        if (method1894.method21793(Class7324.field28319) && n < method1893.method1075() + method1894.method21782(this.field2391, method1893)) {
                            if (!method1894.method21780()) {
                                return Class2087.field12067;
                            }
                            b = true;
                        }
                    }
                }
            }
        }
        return b ? Class2087.field12066 : null;
    }
    
    private void method2051() {
        double n = this.method1698() ? 0.0 : -0.03999999910593033;
        double n2 = 0.0;
        this.field2550 = 0.05f;
        if (this.field2566 == Class2087.field12069) {
            if (this.field2565 != Class2087.field12069) {
                if (this.field2565 != Class2087.field12068) {
                    this.field2563 = this.method1942(1.0);
                    this.method1656(this.method1938(), this.method2047() - this.method1931() + 0.101, this.method1945());
                    this.method1936(this.method1935().method16751(1.0, 0.0, 1.0));
                    this.field2567 = 0.0;
                    this.field2565 = Class2087.field12065;
                    return;
                }
            }
        }
        if (this.field2565 != Class2087.field12065) {
            if (this.field2565 != Class2087.field12067) {
                if (this.field2565 != Class2087.field12066) {
                    if (this.field2565 != Class2087.field12069) {
                        if (this.field2565 == Class2087.field12068) {
                            this.field2550 = this.field2564;
                            if (this.method1907() instanceof Class512) {
                                this.field2564 /= 2.0f;
                            }
                        }
                    }
                    else {
                        this.field2550 = 0.9f;
                    }
                }
                else {
                    n2 = 0.009999999776482582;
                    this.field2550 = 0.45f;
                }
            }
            else {
                n = -7.0E-4;
                this.field2550 = 0.9f;
            }
        }
        else {
            n2 = (this.field2563 - this.method1941()) / this.method1931();
            this.field2550 = 0.9f;
        }
        final Class5487 method1935 = this.method1935();
        this.method1937(method1935.field22770 * this.field2550, method1935.field22771 + n, method1935.field22772 * this.field2550);
        this.field2552 *= this.field2550;
        if (n2 > 0.0) {
            final Class5487 method1936 = this.method1935();
            this.method1937(method1936.field22770, (method1936.field22771 + n2 * 0.06153846016296973) * 0.75, method1936.field22772);
        }
    }
    
    private void method2052() {
        if (this.method1806()) {
            float n = 0.0f;
            if (this.field2559) {
                --this.field2552;
            }
            if (this.field2560) {
                ++this.field2552;
            }
            if (this.field2560 != this.field2559) {
                if (!this.field2561) {
                    if (!this.field2562) {
                        n += 0.005f;
                    }
                }
            }
            this.field2399 += this.field2552;
            if (this.field2561) {
                n += 0.04f;
            }
            if (this.field2562) {
                n -= 0.005f;
            }
            this.method1936(this.method1935().method16744(Class9546.method35638(-this.field2399 * 0.017453292f) * n, 0.0, Class9546.method35639(this.field2399 * 0.017453292f) * n));
            this.method2044((this.field2560 && !this.field2559) || this.field2561, (this.field2559 && !this.field2560) || this.field2561);
        }
    }
    
    @Override
    public void method1773(final Class399 class399) {
        if (this.method1909(class399)) {
            float n = 0.0f;
            final float n2 = (float)((this.field2410 ? 0.009999999776482582 : this.method1777()) + class399.method1776());
            if (this.method1908().size() > 1) {
                if (this.method1908().indexOf(class399) != 0) {
                    n = -0.6f;
                }
                else {
                    n = 0.2f;
                }
                if (class399 instanceof Class789) {
                    n += (float)0.2;
                }
            }
            final Class5487 method16755 = new Class5487(n, 0.0, 0.0).method16755(-this.field2399 * 0.017453292f - 1.5707964f);
            class399.method1656(this.method1938() + method16755.field22770, this.method1941() + n2, this.method1945() + method16755.field22772);
            class399.field2399 += this.field2552;
            class399.method1845(class399.method1844() + this.field2552);
            this.method2053(class399);
            if (class399 instanceof Class789) {
                if (this.method1908().size() > 1) {
                    final int n3 = (class399.method1643() % 2 != 0) ? 270 : 90;
                    class399.method1846(((Class789)class399).field2951 + n3);
                    class399.method1845(class399.method1844() + n3);
                }
            }
        }
    }
    
    public void method2053(final Class399 class399) {
        class399.method1846(this.field2399);
        final float method35668 = Class9546.method35668(class399.field2399 - this.field2399);
        final float method35669 = Class9546.method35653(method35668, -105.0f, 105.0f);
        class399.field2401 += method35669 - method35668;
        class399.method1845(class399.field2399 += method35669 - method35668);
    }
    
    @Override
    public void method1775(final Class399 class399) {
        this.method2053(class399);
    }
    
    @Override
    public void method1761(final Class51 class51) {
        class51.method306("Type", this.method2065().method890());
    }
    
    @Override
    public void method1760(final Class51 class51) {
        if (class51.method316("Type", 8)) {
            this.method2064(Class241.method893(class51.method323("Type")));
        }
    }
    
    @Override
    public boolean method1770(final Class512 class512, final Class316 class513) {
        return !class512.method2804() && !this.field2391.field10067 && this.field2551 < 60.0f && class512.method1778(this);
    }
    
    @Override
    public void method1701(final double n, final boolean b, final Class7096 class7096, final Class354 class7097) {
        this.field2567 = this.method1935().field22771;
        if (!this.method1805()) {
            if (!b) {
                if (!this.field2391.method6702(new Class354(this).method1139()).method21793(Class7324.field28319)) {
                    if (n < 0.0) {
                        this.field2414 -= (float)n;
                    }
                }
            }
            else {
                if (this.field2414 > 3.0f) {
                    if (this.field2565 != Class2087.field12068) {
                        this.field2414 = 0.0f;
                        return;
                    }
                    this.method1705(this.field2414, 1.0f);
                    if (!this.field2391.field10067) {
                        if (!this.field2410) {
                            this.method1652();
                            if (this.field2391.method6765().method31216(Class8878.field37321)) {
                                for (int i = 0; i < 3; ++i) {
                                    this.method1764(this.method2065().method891());
                                }
                                for (int j = 0; j < 2; ++j) {
                                    this.method1764(Class7739.field31299);
                                }
                            }
                        }
                    }
                }
                this.field2414 = 0.0f;
            }
        }
    }
    
    public boolean method2054(final int n) {
        return this.field2432.method33568((n != 0) ? Class423.field2547 : Class423.field2546) && this.method1907() != null;
    }
    
    public void method2055(final float f) {
        this.field2432.method33569(Class423.field2544, f);
    }
    
    public float method2056() {
        return this.field2432.method33568(Class423.field2544);
    }
    
    public void method2057(final int i) {
        this.field2432.method33569(Class423.field2542, i);
    }
    
    public int method2058() {
        return this.field2432.method33568(Class423.field2542);
    }
    
    private void method2059(final int i) {
        this.field2432.method33569(Class423.field2548, i);
    }
    
    private int method2060() {
        return this.field2432.method33568(Class423.field2548);
    }
    
    public float method2061(final float n) {
        return Class9546.method35700(n, this.field2572, this.field2571);
    }
    
    public void method2062(final int i) {
        this.field2432.method33569(Class423.field2543, i);
    }
    
    public int method2063() {
        return this.field2432.method33568(Class423.field2543);
    }
    
    public void method2064(final Class241 class241) {
        this.field2432.method33569(Class423.field2545, class241.ordinal());
    }
    
    public Class241 method2065() {
        return Class241.method892(this.field2432.method33568(Class423.field2545));
    }
    
    @Override
    public boolean method1787(final Class399 class399) {
        return this.method1908().size() < 2 && !this.method1720(Class7324.field28319);
    }
    
    @Nullable
    @Override
    public Class399 method1907() {
        final List<Class399> method1908 = this.method1908();
        return method1908.isEmpty() ? null : ((Class399)method1908.get(0));
    }
    
    public void method2066(final boolean field2559, final boolean field2560, final boolean field2561, final boolean field2562) {
        this.field2559 = field2559;
        this.field2560 = field2560;
        this.field2561 = field2561;
        this.field2562 = field2562;
    }
    
    @Override
    public Class4252<?> method1932() {
        return new Class4339(this);
    }
    
    static {
        field2542 = Class9184.method33564(Class423.class, Class7709.field30654);
        field2543 = Class9184.method33564(Class423.class, Class7709.field30654);
        field2544 = Class9184.method33564(Class423.class, Class7709.field30655);
        field2545 = Class9184.method33564(Class423.class, Class7709.field30654);
        field2546 = Class9184.method33564(Class423.class, Class7709.field30661);
        field2547 = Class9184.method33564(Class423.class, Class7709.field30661);
        field2548 = Class9184.method33564(Class423.class, Class7709.field30654);
    }
}
