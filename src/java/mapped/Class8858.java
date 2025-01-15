// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;

public class Class8858
{
    private static String[] field37240;
    public float field37241;
    public float field37242;
    public int field37243;
    public Class7086 field37244;
    
    public Class8858() {
        this.field37241 = 1.0E-4f;
        this.field37242 = 1.0f;
        this.field37243 = 10000;
    }
    
    public Class2400[] method31013(Class2400 method9519, Class2400 method9520) {
        method9519 = method9519.method9519(new Class7310());
        method9520 = method9520.method9519(new Class7310());
        int n = 0;
        for (int i = 0; i < method9519.method9537(); ++i) {
            if (method9520.method9544(method9519.method9538(i)[0], method9519.method9538(i)[1])) {
                ++n;
            }
        }
        if (n == method9519.method9537()) {
            return new Class2400[0];
        }
        if (!method9519.method9545(method9520)) {
            return new Class2400[] { method9519 };
        }
        int n2 = 0;
        for (int j = 0; j < method9520.method9537(); ++j) {
            if (method9519.method9544(method9520.method9538(j)[0], method9520.method9538(j)[1])) {
                if (!this.method31014(method9519, method9520.method9538(j)[0], method9520.method9538(j)[1])) {
                    ++n2;
                }
            }
        }
        for (int k = 0; k < method9519.method9537(); ++k) {
            if (method9520.method9544(method9519.method9538(k)[0], method9519.method9538(k)[1])) {
                if (!this.method31014(method9520, method9519.method9538(k)[0], method9519.method9538(k)[1])) {
                    ++n2;
                }
            }
        }
        if (n2 >= 1) {
            return this.method31017(method9519, method9520, true);
        }
        return new Class2400[] { method9519 };
    }
    
    private boolean method31014(final Class2400 class2400, final float n, final float n2) {
        for (int i = 0; i < class2400.method9537() + 1; ++i) {
            if (this.method31021(class2400, method31020(class2400, i), method31020(class2400, i + 1)).method9580(new Class2412(n, n2)) < this.field37241 * 100.0f) {
                return true;
            }
        }
        return false;
    }
    
    public void method31015(final Class7086 field37244) {
        this.field37244 = field37244;
    }
    
    public Class2400[] method31016(Class2400 method9519, Class2400 method9520) {
        method9519 = method9519.method9519(new Class7310());
        method9520 = method9520.method9519(new Class7310());
        if (!method9519.method9545(method9520)) {
            return new Class2400[] { method9519, method9520 };
        }
        boolean b = false;
        int n = 0;
        for (int i = 0; i < method9519.method9537(); ++i) {
            if (method9520.method9544(method9519.method9538(i)[0], method9519.method9538(i)[1]) && !method9520.method9546(method9519.method9538(i)[0], method9519.method9538(i)[1])) {
                b = true;
                break;
            }
            if (method9520.method9546(method9519.method9538(i)[0], method9519.method9538(i)[1])) {
                ++n;
            }
        }
        for (int j = 0; j < method9520.method9537(); ++j) {
            if (method9519.method9544(method9520.method9538(j)[0], method9520.method9538(j)[1]) && !method9519.method9546(method9520.method9538(j)[0], method9520.method9538(j)[1])) {
                b = true;
                break;
            }
        }
        if (!b && n < 2) {
            return new Class2400[] { method9519, method9520 };
        }
        return this.method31017(method9519, method9520, false);
    }
    
    private Class2400[] method31017(final Class2400 class2400, final Class2400 class2401, final boolean b) {
        if (!b) {
            for (int i = 0; i < class2400.method9537(); ++i) {
                if (!class2401.method9544(class2400.method9538(i)[0], class2400.method9538(i)[1]) && !class2401.method9546(class2400.method9538(i)[0], class2400.method9538(i)[1])) {
                    return new Class2400[] { this.method31018(class2400, class2401, false, i) };
                }
            }
            return new Class2400[] { class2401 };
        }
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        for (int j = 0; j < class2400.method9537(); ++j) {
            final float[] method9538 = class2400.method9538(j);
            if (class2401.method9544(method9538[0], method9538[1])) {
                list2.add(new Class2412(method9538[0], method9538[1]));
                if (this.field37244 != null) {
                    this.field37244.method21666(method9538[0], method9538[1]);
                }
            }
        }
        for (int k = 0; k < class2400.method9537(); ++k) {
            final float[] method9539 = class2400.method9538(k);
            if (!list2.contains(new Class2412(method9539[0], method9539[1]))) {
                final Class2400 method9540 = this.method31018(class2400, class2401, true, k);
                list.add(method9540);
                for (int l = 0; l < method9540.method9537(); ++l) {
                    final float[] method9541 = method9540.method9538(l);
                    list2.add(new Class2412(method9541[0], method9541[1]));
                }
            }
        }
        return list.toArray(new Class2400[0]);
    }
    
    private Class2400 method31018(final Class2400 class2400, final Class2400 class2401, final boolean b, final int n) {
        Class2400 class2402 = class2400;
        Class2400 class2403 = class2401;
        int n2 = n;
        int n3 = 1;
        final Class2410 class2404 = new Class2410();
        boolean b2 = true;
        int n4 = 0;
        float n5 = class2402.method9538(n2)[0];
        float n6 = class2402.method9538(n2)[1];
        while (true) {
            if (class2404.method9546(n5, n6)) {
                if (!b2) {
                    if (class2402 == class2400) {
                        break;
                    }
                }
            }
            b2 = false;
            if (++n4 > this.field37243) {
                break;
            }
            class2404.method9617(n5, n6);
            if (this.field37244 != null) {
                this.field37244.method21668(n5, n6);
            }
            final Class8574 method31019 = this.method31019(class2403, this.method31022(class2402, n5, n6, method31020(class2402, n2 + n3)));
            if (method31019 == null) {
                n2 = method31020(class2402, n2 + n3);
                n5 = class2402.method9538(n2)[0];
                n6 = class2402.method9538(n2)[1];
            }
            else {
                final Class2402 field36050 = method31019.field36050;
                final Class2412 field36051 = method31019.field36053;
                n5 = field36051.field14278;
                n6 = field36051.field14279;
                if (this.field37244 != null) {
                    this.field37244.method21667(n5, n6);
                }
                if (!class2403.method9546(n5, n6)) {
                    final float n7 = field36050.method9574() / field36050.method9570();
                    final float n8 = field36050.method9575() / field36050.method9570();
                    final float n9 = n7 * this.field37242;
                    final float n10 = n8 * this.field37242;
                    if (!class2402.method9544(field36051.field14278 + n9, field36051.field14279 + n10)) {
                        if (!class2402.method9544(field36051.field14278 - n9, field36051.field14279 - n10)) {
                            if (b) {
                                break;
                            }
                            final int field36052 = method31019.field36051;
                            n3 = 1;
                            final Class2400 class2405 = class2402;
                            class2402 = class2403;
                            class2403 = class2405;
                            n2 = method31020(class2402, field36052 + n3);
                            n5 = class2402.method9538(n2)[0];
                            n6 = class2402.method9538(n2)[1];
                        }
                        else {
                            if (!b) {
                                if (class2402 != class2401) {
                                    n2 = method31019.field36051;
                                    n3 = 1;
                                }
                                else {
                                    n2 = method31019.field36051;
                                    n3 = 1;
                                }
                            }
                            else if (class2402 != class2400) {
                                n2 = method31019.field36051;
                                n3 = 1;
                            }
                            else {
                                n2 = method31019.field36052;
                                n3 = -1;
                            }
                            final Class2400 class2406 = class2402;
                            class2402 = class2403;
                            class2403 = class2406;
                        }
                    }
                    else {
                        if (!b) {
                            if (class2402 != class2400) {
                                n2 = method31019.field36052;
                                n3 = -1;
                            }
                            else {
                                n2 = method31019.field36052;
                                n3 = -1;
                            }
                        }
                        else if (class2402 != class2401) {
                            n2 = method31019.field36051;
                            n3 = 1;
                        }
                        else {
                            n2 = method31019.field36052;
                            n3 = -1;
                        }
                        final Class2400 class2407 = class2402;
                        class2402 = class2403;
                        class2403 = class2407;
                    }
                }
                else {
                    n2 = class2403.method9543(field36051.field14278, field36051.field14279);
                    n3 = 1;
                    n5 = field36051.field14278;
                    n6 = field36051.field14279;
                    final Class2400 class2408 = class2402;
                    class2402 = class2403;
                    class2403 = class2408;
                }
            }
        }
        while (true) {
            class2404.method9617(n5, n6);
            if (this.field37244 != null) {
                this.field37244.method21668(n5, n6);
            }
            return class2404;
            continue;
        }
    }
    
    public Class8574 method31019(final Class2400 class2400, final Class2402 class2401) {
        float n = Float.MAX_VALUE;
        Class8574 class2402 = null;
        for (int i = 0; i < class2400.method9537(); ++i) {
            final int method31020 = method31020(class2400, i + 1);
            final Class2402 method31021 = this.method31021(class2400, i, method31020);
            final Class2412 method31022 = class2401.method9585(method31021, true);
            if (method31022 != null) {
                final float method31023 = method31022.method9649(class2401.method9568());
                if (method31023 < n) {
                    if (method31023 > this.field37241) {
                        class2402 = new Class8574(this);
                        class2402.field36053 = method31022;
                        class2402.field36050 = method31021;
                        class2402.field36051 = i;
                        class2402.field36052 = method31020;
                        n = method31023;
                    }
                }
            }
        }
        return class2402;
    }
    
    public static int method31020(final Class2400 class2400, int i) {
        while (i < 0) {
            i += class2400.method9537();
        }
        while (i >= class2400.method9537()) {
            i -= class2400.method9537();
        }
        return i;
    }
    
    public Class2402 method31021(final Class2400 class2400, final int n, final int n2) {
        final float[] method9538 = class2400.method9538(n);
        final float[] method9539 = class2400.method9538(n2);
        return new Class2402(method9538[0], method9538[1], method9539[0], method9539[1]);
    }
    
    public Class2402 method31022(final Class2400 class2400, final float n, final float n2, final int n3) {
        final float[] method9538 = class2400.method9538(n3);
        return new Class2402(n, n2, method9538[0], method9538[1]);
    }
}
