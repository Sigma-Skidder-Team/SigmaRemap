// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Locale;
import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import com.google.common.collect.Lists;

public class Class6347 extends Class6346<Class7067>
{
    private final Class3090 field25387;
    private final Class8011 field25388;
    private final Class8615 field25389;
    
    public Class6347(final Class1851 class1851, final Class1868 class1852, final Class7067 class1853) {
        super(class1851, class1852, class1853);
        this.field25388 = new Class8011();
        this.field25389 = new Class8615();
        this.field25387 = this.method18886();
    }
    
    private Class3090 method18886() {
        final Class3090 method21587 = ((Class7067)this.field25386).method21587();
        final Class3108 class3108 = new Class3108(method21587.method9871(), method21587.method9841(), method21587.method9870(), method21587.method9862(), method21587.method9866(), method21587.method9867(), method21587.method9863(), method21587.method9868(), method21587.method9869(), method21587.method9873());
        final Map<String, Map<String, String>> method21588 = ((Class7067)this.field25386).method21589();
        final Iterator<String> iterator = method21588.keySet().iterator();
        while (iterator.hasNext()) {
            final Class8530[] array = Class7067.field27515.get(iterator.next());
            if (array == null) {
                continue;
            }
            for (final Class8530 class3109 : array) {
                class3108.method9849(Class7067.field27514.get(class3109), class3109);
                final Class8530<?, ?> field22060 = ((Class5114)class3109.field35805).field22060;
                if (field22060.field35804 instanceof Class4574) {
                    final Class4574 class3110 = (Class4574)field22060.field35804;
                    final Class5113 method21589 = method21587.method9854((Class4574<Class5113>)class3110);
                    class3108.method9852((Class8530<Class5113, ? extends Class4574<Class5113>>)class3110.method13527((method21589 == null) ? Class7067.field27516.get(class3109) : method21589));
                }
            }
        }
        boolean b = false;
        Label_0320: {
            if (!((Class7067)this.field25386).method21600() || method21587 == Class7102.field27683) {
                if (method21588.containsKey("decoration")) {
                    b = true;
                    break Label_0320;
                }
            }
            b = false;
        }
        if (b) {
            final ArrayList arrayList = Lists.newArrayList();
            arrayList.add(Class2108.field12224);
            arrayList.add(Class2108.field12225);
            for (final Class2108 class3111 : Class2108.values()) {
                if (!arrayList.contains(class3111)) {
                    final Iterator<Class8530<?, ?>> iterator2 = method21587.method9856(class3111).iterator();
                    while (iterator2.hasNext()) {
                        class3108.method9849(class3111, iterator2.next());
                    }
                }
            }
        }
        final Class7096[] method21590 = ((Class7067)this.field25386).method21601();
        for (int k = 0; k < method21590.length; ++k) {
            final Class7096 class3112 = method21590[k];
            if (class3112 != null) {
                if (!Class2020.field11525.method8064().test(class3112)) {
                    ((Class7067)this.field25386).method21602(k);
                    class3108.method9849(Class2108.field12229, Class4535.field20015.method13527(new Class5140(k, class3112)).method28610(Class7133.field27782.method21889(Class6926.field27145)));
                }
            }
        }
        return class3108;
    }
    
    @Override
    public void method18859(final Class1878 class1878, final Class1860 class1879) {
    }
    
    @Override
    public int method18852() {
        return this.field25383.method6798(0, 0).method7018(Class2020.field11525, 8, 8);
    }
    
    @Override
    public Class3090 method18872(final Class5507 class5507, final BlockPos class5508) {
        return this.field25387;
    }
    
    @Override
    public void method18861(final Class1851 class1851, final Class1860 class1852) {
        final Class7096[] method21601 = ((Class7067)this.field25386).method21601();
        final Class385 class1853 = new Class385();
        final Class9548 method21602 = class1852.method7017(Class2020.field11523);
        final Class9548 method21603 = class1852.method7017(Class2020.field11521);
        for (int i = 0; i < method21601.length; ++i) {
            final Class7096 class1854 = method21601[i];
            if (class1854 != null) {
                for (int j = 0; j < 16; ++j) {
                    for (int k = 0; k < 16; ++k) {
                        class1852.method7008(class1853.method1284(j, i, k), class1854, false);
                        method21602.method35712(j, i, k, class1854);
                        method21603.method35712(j, i, k, class1854);
                    }
                }
            }
        }
    }
    
    @Override
    public int method18857(final int n, final int n2, final Class2020 class2020) {
        final Class7096[] method21601 = ((Class7067)this.field25386).method21601();
        for (int i = method21601.length - 1; i >= 0; --i) {
            final Class7096 class2021 = method21601[i];
            if (class2021 != null && class2020.method8064().test(class2021)) {
                return i + 1;
            }
        }
        return 0;
    }
    
    @Override
    public void method18870(final Class1849 class1849, final boolean b, final boolean b2) {
        this.field25388.method26227(class1849, b, b2);
        this.field25389.method29217(class1849, b, b2);
    }
    
    @Override
    public boolean method18877(final Class3090 class3090, final Class4574<? extends Class5113> class3091) {
        return this.field25387.method9853(class3091);
    }
    
    @Nullable
    @Override
    public <C extends Class5113> C method18878(final Class3090 class3090, final Class4574<C> class3091) {
        return this.field25387.method9854(class3091);
    }
    
    @Nullable
    @Override
    public BlockPos method18874(final Class1847 class1847, final String s, final BlockPos class1848, final int n, final boolean b) {
        return ((Class7067)this.field25386).method21589().keySet().contains(s.toLowerCase(Locale.ROOT)) ? super.method18874(class1847, s, class1848, n, b) : null;
    }
}
