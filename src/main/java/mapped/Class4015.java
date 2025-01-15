// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.LinkedList;
import com.google.common.collect.Lists;

public class Class4015 extends Class3833
{
    private static String[] field18089;
    
    public Class4015(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public void method11828(final Class7096 class7096, final Class1847 class7097, final Class354 class7098, final Class7096 class7099, final boolean b) {
        if (class7099.method21696() != class7096.method21696()) {
            this.method12197(class7097, class7098);
        }
    }
    
    @Override
    public void method11825(final Class7096 class7096, final Class1847 class7097, final Class354 class7098, final Class3833 class7099, final Class354 class7100, final boolean b) {
        this.method12197(class7097, class7098);
        super.method11825(class7096, class7097, class7098, class7099, class7100, b);
    }
    
    public void method12197(final Class1847 class1847, final Class354 class1848) {
        if (this.method12198(class1847, class1848)) {
            class1847.method6688(class1848, Class7521.field29212.method11878(), 2);
            class1847.method6955(2001, class1848, Class3833.method11774(Class7521.field29173.method11878()));
        }
    }
    
    private boolean method12198(final Class1847 class1847, final Class354 class1848) {
        final LinkedList linkedList = Lists.newLinkedList();
        linkedList.add(new Class8554(class1848, 0));
        int n = 0;
        while (!linkedList.isEmpty()) {
            final Class8554 class1849 = (Class8554)linkedList.poll();
            final Class354 class1850 = class1849.method28745();
            final int intValue = class1849.method28746();
            final Class179[] values = Class179.values();
            for (int length = values.length, i = 0; i < length; ++i) {
                final Class354 method1149 = class1850.method1149(values[i]);
                final Class7096 method1150 = class1847.method6701(method1149);
                final Class7099 method1151 = class1847.method6702(method1149);
                final Class8059 method1152 = method1150.method21697();
                if (method1151.method21793(Class7324.field28319)) {
                    if (method1150.method21696() instanceof Class3857 && ((Class3857)method1150.method21696()).method11922(class1847, method1149, method1150) != Class7558.field29974) {
                        ++n;
                        if (intValue < 6) {
                            linkedList.add(new Class8554(method1149, intValue + 1));
                        }
                    }
                    else if (!(method1150.method21696() instanceof Class3859)) {
                        if (method1152 == Class8059.field33158 || method1152 == Class8059.field33160) {
                            Class3833.method11837(method1150, class1847, method1149, method1150.method21696().method11802() ? class1847.method6727(method1149) : null);
                            class1847.method6688(method1149, Class7521.field29147.method11878(), 3);
                            ++n;
                            if (intValue < 6) {
                                linkedList.add(new Class8554(method1149, intValue + 1));
                            }
                        }
                    }
                    else {
                        class1847.method6688(method1149, Class7521.field29147.method11878(), 3);
                        ++n;
                        if (intValue < 6) {
                            linkedList.add(new Class8554(method1149, intValue + 1));
                        }
                    }
                }
            }
            if (n <= 64) {
                continue;
            }
            break;
        }
        return n > 0;
    }
}
