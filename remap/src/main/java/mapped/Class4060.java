// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;

public class Class4060 extends Class3820
{
    public Class4060(final Class8959 class8959) {
        super(class8959);
    }
    
    @Override
    public boolean method11730(final Class8321 class8321) {
        return true;
    }
    
    @Override
    public boolean method11703(final Class7096 class7096, final Class1847 class7097, final BlockPos class7098, final Class512 class7099) {
        if (!class7097.field10067) {
            this.method12265(class7099, class7096, class7097, class7098, false, class7099.method2715(Class316.field1877));
        }
        return false;
    }
    
    @Override
    public Class2201 method11694(final Class7075 class7075) {
        final Class512 method21652 = class7075.method21652();
        final Class1847 method21653 = class7075.method21654();
        if (!method21653.field10067) {
            if (method21652 != null) {
                final BlockPos method21654 = class7075.method21639();
                this.method12265(method21652, method21653.method6701(method21654), method21653, method21654, true, class7075.method21651());
            }
        }
        return Class2201.field13400;
    }
    
    private void method12265(final Class512 class512, final Class7096 class513, final Class1851 class514, final BlockPos class515, final boolean b, final Class8321 class516) {
        if (class512.method2908()) {
            final Class3833 method21696 = class513.method21696();
            final Class9104<Class3833, Class7096> method21697 = method21696.method11876();
            final Collection method21698 = method21697.method32905();
            final String string = Class90.field208.method503(method21696).toString();
            if (!method21698.isEmpty()) {
                final Class51 method21699 = class516.method27659("DebugProperty");
                Class7111 method21700 = method21697.method32906(method21699.method323(string));
                if (!b) {
                    final Class7111<?> class517 = method12267(method21698, method21700, class512.method2804());
                    final String method21701 = class517.method21826();
                    method21699.method306(string, method21701);
                    method12268(class512, new Class2259(this.method11717() + ".select", new Object[] { method21701, method12269(class513, class517) }));
                }
                else {
                    if (method21700 == null) {
                        method21700 = (Class7111)method21698.iterator().next();
                    }
                    final Class7096 method21702 = method12266(class513, method21700, class512.method2804());
                    class514.method6688(class515, method21702, 18);
                    method12268(class512, new Class2259(this.method11717() + ".update", new Object[] { method21700.method21826(), method12269(method21702, method21700) }));
                }
            }
            else {
                method12268(class512, new Class2259(this.method11717() + ".empty", new Object[] { string }));
            }
        }
    }
    
    private static <T extends Comparable<T>> Class7096 method12266(final Class7096 class7096, final Class7111<T> class7097, final boolean b) {
        return ((Class7097<O, Class7096>)class7096).method21773(class7097, (Comparable)method12267((Iterable<V>)class7097.method21829(), (V)class7096.method21772((Class7111<T>)class7097), b));
    }
    
    private static <T> T method12267(final Iterable<T> iterable, final T t, final boolean b) {
        return b ? Class8349.method27849(iterable, t) : Class8349.method27848(iterable, t);
    }
    
    private static void method12268(final Class512 class512, final Class2250 class513) {
        ((Class513)class512).method2941(class513, Class285.field1574);
    }
    
    private static <T extends Comparable<T>> String method12269(final Class7096 class7096, final Class7111<T> class7097) {
        return class7097.method21831(class7096.method21772(class7097));
    }
}
