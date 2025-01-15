// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import com.google.common.collect.Lists;
import java.util.Random;
import java.util.Map;
import com.google.common.collect.ImmutableMap;

public class Class5446 extends Class5419<Class824>
{
    private Class8792 field22673;
    
    public Class5446(final int n, final int n2) {
        super((Map)ImmutableMap.of(), n, n2);
    }
    
    public boolean method16559(final Class1849 class1849, final Class824 class1850) {
        final Class354 class1851 = new Class354(class1850);
        this.field22673 = class1849.method6927(class1851);
        if (this.field22673 != null) {
            if (this.field22673.method30622()) {
                if (Class5418.method16541(class1849, class1850, class1851)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean method16560(final Class1849 class1849, final Class824 class1850, final long n) {
        return this.field22673 != null && !this.field22673.method30621();
    }
    
    public void method16563(final Class1849 class1849, final Class824 class1850, final long n) {
        this.field22673 = null;
        class1850.method2618().method1205(class1849.method6755(), class1849.method6754());
    }
    
    public void method16562(final Class1849 class1849, final Class824 class1850, final long n) {
        final Random method2633 = class1850.method2633();
        if (method2633.nextInt(100) == 0) {
            class1850.method4834();
        }
        if (method2633.nextInt(200) == 0) {
            if (Class5418.method16541(class1849, class1850, new Class354(class1850))) {
                class1850.field2391.method6886(new Class406(class1850.field2391, class1850.method1938(), class1850.method1944(), class1850.method1945(), this.method16633(Class181.values()[method2633.nextInt(Class181.values().length)], method2633.nextInt(3))));
            }
        }
    }
    
    private Class8321 method16633(final Class181 class181, final int n) {
        final Class8321 class182 = new Class8321(Class7739.field31532, 1);
        final Class8321 class183 = new Class8321(Class7739.field31533);
        final Class51 method27659 = class183.method27659("Explosion");
        final ArrayList arrayList = Lists.newArrayList();
        arrayList.add(class181.method817());
        method27659.method309("Colors", arrayList);
        method27659.method296("Type", (byte)Class2141.field12609.method8300());
        final Class51 method27660 = class182.method27659("Fireworks");
        final Class52 class184 = new Class52();
        final Class51 method27661 = class183.method27660("Explosion");
        if (method27661 != null) {
            ((AbstractList<Class51>)class184).add(method27661);
        }
        method27660.method296("Flight", (byte)n);
        if (!class184.isEmpty()) {
            method27660.method295("Explosions", class184);
        }
        return class182;
    }
}
