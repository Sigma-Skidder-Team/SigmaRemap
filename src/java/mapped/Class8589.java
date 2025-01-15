// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

public class Class8589
{
    private static String[] field36085;
    private int field36086;
    
    public int method29087(final Class1849 class1849, final boolean b, final boolean b2) {
        if (!b) {
            return 0;
        }
        if (!class1849.method6765().method31216(Class8878.field37344)) {
            return 0;
        }
        final Random field10062 = class1849.field10062;
        --this.field36086;
        if (this.field36086 > 0) {
            return 0;
        }
        this.field36086 += 12000 + field10062.nextInt(1200);
        if (class1849.method6755() / 24000L < 5L || !class1849.method6703()) {
            return 0;
        }
        if (field10062.nextInt(5) != 0) {
            return 0;
        }
        final int size = class1849.method6840().size();
        if (size < 1) {
            return 0;
        }
        final Class512 class1850 = class1849.method6840().get(field10062.nextInt(size));
        if (class1850.method1639()) {
            return 0;
        }
        if (class1849.method6922(class1850.method1894())) {
            return 0;
        }
        final Class385 method1292 = new Class385(class1850).method1292((24 + field10062.nextInt(24)) * (field10062.nextBoolean() ? -1 : 1), 0, (24 + field10062.nextInt(24)) * (field10062.nextBoolean() ? -1 : 1));
        if (!class1849.method6973(method1292.method1074() - 10, method1292.method1075() - 10, method1292.method1076() - 10, method1292.method1074() + 10, method1292.method1075() + 10, method1292.method1076() + 10)) {
            return 0;
        }
        if (class1849.method6959(method1292).method9870() != Class2140.field12600) {
            int n = 0;
            for (int n2 = (int)Math.ceil(class1849.method6784(method1292).method35973()) + 1, i = 0; i < n2; ++i) {
                ++n;
                method1292.method1294(class1849.method6958(Class2020.field11526, method1292).method1075());
                if (i != 0) {
                    this.method29088(class1849, method1292, field10062, false);
                }
                else if (!this.method29088(class1849, method1292, field10062, true)) {
                    break;
                }
                method1292.method1293(method1292.method1074() + field10062.nextInt(5) - field10062.nextInt(5));
                method1292.method1295(method1292.method1076() + field10062.nextInt(5) - field10062.nextInt(5));
            }
            return n;
        }
        return 0;
    }
    
    private boolean method29088(final Class1847 class1847, final Class354 class1848, final Random random, final boolean b) {
        final Class7096 method6701 = class1847.method6701(class1848);
        if (!Class8532.method28620(class1847, class1848, method6701, method6701.method21756())) {
            return false;
        }
        if (!Class777.method4309(Class7499.field29045, class1847, Class2101.field12189, class1848, random)) {
            return false;
        }
        final Class777 class1849 = Class7499.field29045.method23371(class1847);
        if (class1849 == null) {
            return false;
        }
        if (b) {
            class1849.method4313(true);
            class1849.method4315();
        }
        class1849.method1656(class1848.method1074(), class1848.method1075(), class1848.method1076());
        class1849.method4188(class1847, class1847.method6784(class1848), Class2101.field12189, null, null);
        class1847.method6886(class1849);
        return true;
    }
}
