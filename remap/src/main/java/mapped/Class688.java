// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Comparator;
import com.mojang.authlib.GameProfile;
import java.util.Iterator;
import java.util.List;
import com.google.common.collect.Ordering;
import net.minecraft.util.math.MathHelper;

public class Class688 extends Class565
{
    private static final Ordering<Class9081> field3784;
    private final Class869 field3785;
    private final Class685 field3786;
    private Class2250 field3787;
    private Class2250 field3788;
    private long field3789;
    private boolean field3790;
    
    public Class688(final Class869 field3785, final Class685 field3786) {
        this.field3785 = field3785;
        this.field3786 = field3786;
    }
    
    public Class2250 method3819(final Class9081 class9081) {
        return (class9081.method32732() == null) ? Class6749.method20549(class9081.method32729(), new Class2260(class9081.method32719().getName())) : class9081.method32732();
    }
    
    public void method3820(final boolean field3790) {
        if (field3790) {
            if (!this.field3790) {
                this.field3789 = Class8349.method27837();
            }
        }
        this.field3790 = field3790;
    }
    
    public void method3821(final int n, final Class6516 class6516, final Class9290 class6517) {
        final List sortedCopy = Class688.field3784.sortedCopy((Iterable)this.field3785.field4684.field4069.method17370());
        int max = 0;
        int max2 = 0;
        for (final Class9081 class6518 : sortedCopy) {
            max = Math.max(max, this.field3785.field4643.method6617(this.method3819(class6518).method8461()));
            if (class6517 == null) {
                continue;
            }
            if (class6517.method34317() == Class263.field1257) {
                continue;
            }
            max2 = Math.max(max2, this.field3785.field4643.method6617(" " + class6516.method19636(class6518.method32719().getName(), class6517).method23969()));
        }
        final List subList = sortedCopy.subList(0, Math.min(sortedCopy.size(), 80));
        int i;
        int n2;
        int n3;
        for (n2 = (i = subList.size()), n3 = 1; i > 20; i = (n2 + n3 - 1) / n3) {
            ++n3;
        }
        final boolean b = this.field3785.method5283() || this.field3785.method5269().method17369().method11186();
        int n4;
        if (class6517 == null) {
            n4 = 0;
        }
        else if (class6517.method34317() != Class263.field1257) {
            n4 = max2;
        }
        else {
            n4 = 90;
        }
        final int n5 = Math.min(n3 * ((b ? 9 : 0) + max + n4 + 13), n - 50) / n3;
        final int n6 = n / 2 - (n5 * n3 + (n3 - 1) * 5) / 2;
        int n7 = 10;
        int n8 = n5 * n3 + (n3 - 1) * 5;
        List<String> method6626 = null;
        if (this.field3788 != null) {
            method6626 = this.field3785.field4643.method6626(this.field3788.method8461(), n - 50);
            final Iterator<String> iterator2 = method6626.iterator();
            while (iterator2.hasNext()) {
                n8 = Math.max(n8, this.field3785.field4643.method6617(iterator2.next()));
            }
        }
        List<String> method6627 = null;
        if (this.field3787 != null) {
            method6627 = this.field3785.field4643.method6626(this.field3787.method8461(), n - 50);
            final Iterator<String> iterator3 = method6627.iterator();
            while (iterator3.hasNext()) {
                n8 = Math.max(n8, this.field3785.field4643.method6617(iterator3.next()));
            }
        }
        if (method6626 != null) {
            Class565.method3293(n / 2 - n8 / 2 - 1, n7 - 1, n / 2 + n8 / 2 + 1, n7 + method6626.size() * 9, Integer.MIN_VALUE);
            for (final String s : method6626) {
                this.field3785.field4643.method6609(s, (float)(n / 2 - this.field3785.field4643.method6617(s) / 2), (float)n7, -1);
                n7 += 9;
            }
            ++n7;
        }
        Class565.method3293(n / 2 - n8 / 2 - 1, n7 - 1, n / 2 + n8 / 2 + 1, n7 + i * 9, Integer.MIN_VALUE);
        final int method6628 = this.field3785.field4648.method17116(553648127);
        for (int j = 0; j < n2; ++j) {
            final int n9 = j / i;
            final int n10 = j % i;
            int n11 = n6 + n9 * n5 + n9 * 5;
            final int n12 = n7 + n10 * 9;
            Class565.method3293(n11, n12, n11 + n5, n12 + 8, method6628);
            Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
            Class8726.method29999();
            Class8726.method30011();
            Class8726.method30117();
            if (j < subList.size()) {
                final Class9081 class6519 = (Class9081)subList.get(j);
                final GameProfile method6629 = class6519.method32719();
                if (b) {
                    final Class512 method6630 = this.field3785.field4683.method7143(method6629.getId());
                    boolean b2 = false;
                    Label_1032: {
                        if (method6630 != null) {
                            if (method6630.method2895(Class189.field610)) {
                                if ("Dinnerbone".equals(method6629.getName()) || "Grumm".equals(method6629.getName())) {
                                    b2 = true;
                                    break Label_1032;
                                }
                            }
                        }
                        b2 = false;
                    }
                    final boolean b3 = b2;
                    this.field3785.method5290().method5849(class6519.method32726());
                    Class565.method3300(n11, n12, 8, 8, 8.0f, (float)(8 + (b3 ? 8 : 0)), 8, 8 * (b3 ? -1 : 1), 64, 64);
                    if (method6630 != null) {
                        if (method6630.method2895(Class189.field616)) {
                            Class565.method3300(n11, n12, 8, 8, 40.0f, (float)(8 + (b3 ? 8 : 0)), 8, 8 * (b3 ? -1 : 1), 64, 64);
                        }
                    }
                    n11 += 9;
                }
                final String method6631 = this.method3819(class6519).method8461();
                if (class6519.method32720() != Class101.field301) {
                    this.field3785.field4643.method6609(method6631, (float)n11, (float)n12, -1);
                }
                else {
                    this.field3785.field4643.method6609(Class2116.field12329 + method6631, (float)n11, (float)n12, -1862270977);
                }
                if (class6517 != null) {
                    if (class6519.method32720() != Class101.field301) {
                        final int n13 = n11 + max + 1;
                        final int n14 = n13 + n4;
                        if (n14 - n13 > 5) {
                            this.method3823(class6517, n12, method6629.getName(), n13, n14, class6519);
                        }
                    }
                }
                this.method3822(n5, n11 - (b ? 9 : 0), n12, class6519);
            }
        }
        if (method6627 != null) {
            int n15 = n7 + i * 9 + 1;
            Class565.method3293(n / 2 - n8 / 2 - 1, n15 - 1, n / 2 + n8 / 2 + 1, n15 + method6627.size() * 9, Integer.MIN_VALUE);
            for (final String s2 : method6627) {
                this.field3785.field4643.method6609(s2, (float)(n / 2 - this.field3785.field4643.method6617(s2) / 2), (float)n15, -1);
                n15 += 9;
            }
        }
    }
    
    public void method3822(final int n, final int n2, final int n3, final Class9081 class9081) {
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        this.field3785.method5290().method5849(Class688.field3363);
        int n4;
        if (class9081.method32722() >= 0) {
            if (class9081.method32722() >= 150) {
                if (class9081.method32722() >= 300) {
                    if (class9081.method32722() >= 600) {
                        if (class9081.method32722() >= 1000) {
                            n4 = 4;
                        }
                        else {
                            n4 = 3;
                        }
                    }
                    else {
                        n4 = 2;
                    }
                }
                else {
                    n4 = 1;
                }
            }
            else {
                n4 = 0;
            }
        }
        else {
            n4 = 5;
        }
        this.method3304(this.method3303() + 100);
        this.method3186(n2 + n - 11, n3, 0, 176 + n4 * 8, 10, 8);
        this.method3304(this.method3303() - 100);
    }
    
    private void method3823(final Class9290 class9290, final int n, final String s, final int n2, final int n3, final Class9081 class9291) {
        final int method23969 = class9290.method34311().method19636(s, class9290).method23969();
        if (class9290.method34317() != Class263.field1257) {
            final String string = Class2116.field12323 + "" + method23969;
            this.field3785.field4643.method6609(string, (float)(n3 - this.field3785.field4643.method6617(string)), (float)n, 16777215);
        }
        else {
            this.field3785.method5290().method5849(Class688.field3363);
            final long method23970 = Class8349.method27837();
            if (this.field3789 == class9291.method32741()) {
                if (method23969 >= class9291.method32733()) {
                    if (method23969 > class9291.method32733()) {
                        class9291.method32738(method23970);
                        class9291.method32740(this.field3786.method3808() + 10);
                    }
                }
                else {
                    class9291.method32738(method23970);
                    class9291.method32740(this.field3786.method3808() + 20);
                }
            }
            if (method23970 - class9291.method32737() > 1000L || this.field3789 != class9291.method32741()) {
                class9291.method32734(method23969);
                class9291.method32736(method23969);
                class9291.method32738(method23970);
            }
            class9291.method32742(this.field3789);
            class9291.method32734(method23969);
            final int method23971 = MathHelper.method35649(Math.max(method23969, class9291.method32735()) / 2.0f);
            final int max = Math.max(MathHelper.method35649((float)(method23969 / 2)), Math.max(MathHelper.method35649((float)(class9291.method32735() / 2)), 10));
            final boolean b = class9291.method32739() > this.field3786.method3808() && (class9291.method32739() - this.field3786.method3808()) / 3L % 2L == 1L;
            if (method23971 > 0) {
                final int method23972 = MathHelper.method35642(Math.min((n3 - n2 - 4) / (float)max, 9.0f));
                if (method23972 <= 3) {
                    final float method23973 = MathHelper.clamp(method23969 / 20.0f, 0.0f, 1.0f);
                    final int n4 = (int)((1.0f - method23973) * 255.0f) << 16 | (int)(method23973 * 255.0f) << 8;
                    String s2 = "" + method23969 / 2.0f;
                    if (n3 - this.field3785.field4643.method6617(s2 + "hp") >= n2) {
                        s2 += "hp";
                    }
                    this.field3785.field4643.method6609(s2, (float)((n3 + n2) / 2 - this.field3785.field4643.method6617(s2) / 2), (float)n, n4);
                }
                else {
                    for (int i = method23971; i < max; ++i) {
                        this.method3186(n2 + i * method23972, n, b ? 25 : 16, 0, 9, 9);
                    }
                    for (int j = 0; j < method23971; ++j) {
                        this.method3186(n2 + j * method23972, n, b ? 25 : 16, 0, 9, 9);
                        if (b) {
                            if (j * 2 + 1 < class9291.method32735()) {
                                this.method3186(n2 + j * method23972, n, 70, 0, 9, 9);
                            }
                            if (j * 2 + 1 == class9291.method32735()) {
                                this.method3186(n2 + j * method23972, n, 79, 0, 9, 9);
                            }
                        }
                        if (j * 2 + 1 < method23969) {
                            this.method3186(n2 + j * method23972, n, (j < 10) ? 52 : 160, 0, 9, 9);
                        }
                        if (j * 2 + 1 == method23969) {
                            this.method3186(n2 + j * method23972, n, (j < 10) ? 61 : 169, 0, 9, 9);
                        }
                    }
                }
            }
        }
    }
    
    public void method3824(final Class2250 field3787) {
        this.field3787 = field3787;
    }
    
    public void method3825(final Class2250 field3788) {
        this.field3788 = field3788;
    }
    
    public void method3826() {
        this.field3788 = null;
        this.field3787 = null;
    }
    
    static {
        field3784 = Ordering.from((Comparator)new Class4442(null));
    }
}
