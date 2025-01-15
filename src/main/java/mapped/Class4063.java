// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.Collection;
import com.google.common.collect.Lists;
import java.util.List;

public class Class4063 extends Class3820
{
    public Class4063(final Class8959 class8959) {
        super(class8959);
    }
    
    @Override
    public Class2201 method11694(final Class7075 class7075) {
        final Class1847 method21654 = class7075.method21654();
        if (!method21654.field10067) {
            final Class8321 method21655 = class7075.method21651();
            final Class5487 method21656 = class7075.method21649();
            final Class179 method21657 = class7075.method21648();
            method21654.method6886(new Class406(method21654, method21656.field22770 + method21657.method785() * 0.15, method21656.field22771 + method21657.method786() * 0.15, method21656.field22772 + method21657.method787() * 0.15, method21655));
            method21655.method27693(1);
        }
        return Class2201.field13400;
    }
    
    @Override
    public Class9355<Class8321> method11695(final Class1847 class1847, final Class512 class1848, final Class316 class1849) {
        if (!class1848.method2773()) {
            return Class9355.method34676(class1848.method2715(class1849));
        }
        final Class8321 method2715 = class1848.method2715(class1849);
        if (!class1847.field10067) {
            class1847.method6886(new Class406(class1847, method2715, class1848));
            if (!class1848.field3025.field27304) {
                method2715.method27693(1);
            }
        }
        return Class9355.method34674(class1848.method2715(class1849));
    }
    
    @Override
    public void method11728(final Class8321 class8321, final Class1847 class8322, final List<Class2250> list, final Class1981 class8323) {
        final Class51 method27660 = class8321.method27660("Fireworks");
        if (method27660 != null) {
            if (method27660.method316("Flight", 99)) {
                list.add(new Class2259("item.minecraft.firework_rocket.flight", new Object[0]).method8457(" ").method8457(String.valueOf(method27660.method317("Flight"))).method8469(Class2116.field12316));
            }
            final Class52 method27661 = method27660.method328("Explosions", 10);
            if (!method27661.isEmpty()) {
                for (int i = 0; i < method27661.size(); ++i) {
                    final Class51 method27662 = method27661.method346(i);
                    final ArrayList arrayList = Lists.newArrayList();
                    Class4057.method12262(method27662, arrayList);
                    if (!arrayList.isEmpty()) {
                        for (int j = 1; j < arrayList.size(); ++j) {
                            arrayList.set(j, new Class2260("  ").method8458((Class2250)arrayList.get(j)).method8469(Class2116.field12316));
                        }
                        list.addAll(arrayList);
                    }
                }
            }
        }
    }
}
