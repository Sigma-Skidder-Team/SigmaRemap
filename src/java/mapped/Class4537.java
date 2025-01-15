// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import com.google.common.collect.Lists;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class4537 extends Class4536
{
    public Class4537(final Function<Dynamic<?>, ? extends Class5122> function) {
        super(function);
    }
    
    @Override
    public boolean method13536(final Class1851 class1851, final Random rnd, final Class354 class1852, final Class7096 class1853) {
        if (this.method13537(class1851, rnd, class1852, class1853)) {
            final Class179 method576 = Class98.field268.method576(rnd);
            final int n = rnd.nextInt(2) + 2;
            final ArrayList arrayList = Lists.newArrayList((Object[])new Class179[] { method576, method576.method783(), method576.method784() });
            Collections.shuffle(arrayList, rnd);
            for (final Class179 class1854 : arrayList.subList(0, n)) {
                final Class385 class1855 = new Class385(class1852);
                final int n2 = rnd.nextInt(2) + 1;
                class1855.method1290(class1854);
                Class179 class1856;
                int n3;
                if (class1854 != method576) {
                    class1855.method1290(Class179.field512);
                    final Class179[] array = { class1854, Class179.field512 };
                    class1856 = array[rnd.nextInt(array.length)];
                    n3 = rnd.nextInt(3) + 3;
                }
                else {
                    class1856 = method576;
                    n3 = rnd.nextInt(3) + 2;
                }
                for (int n4 = 0; n4 < n2 && this.method13537(class1851, rnd, class1855, class1853); ++n4) {
                    class1855.method1290(class1856);
                }
                class1855.method1290(class1856.method782());
                class1855.method1290(Class179.field512);
                for (int i = 0; i < n3; ++i) {
                    class1855.method1290(method576);
                    if (!this.method13537(class1851, rnd, class1855, class1853)) {
                        break;
                    }
                    if (rnd.nextFloat() < 0.25f) {
                        class1855.method1290(Class179.field512);
                    }
                }
            }
            return true;
        }
        return false;
    }
}
