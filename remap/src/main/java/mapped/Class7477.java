// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class Class7477
{
    public static void main(final String[] array) throws Exception {
        final Class8081 class8081 = new Class8081();
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        final Random random = new Random();
        final int n = 100;
        for (int i = 0; i < n; ++i) {
            final Class9009 class8082 = new Class9009();
            class8082.method32255(i);
            list.add(class8082);
        }
        for (int j = 0; j < 100000; ++j) {
            method23105(list, list2, n);
            method23104(class8081, list2.size());
            if (j % 5 == 0) {
                method23103(class8081);
            }
            if (!random.nextBoolean()) {
                if (!list2.isEmpty()) {
                    final Class9009 class8083 = (Class9009)list2.get(random.nextInt(list2.size()));
                    class8081.method26506(class8083.method32257());
                    method23106("Remove: " + class8083.method32252());
                    list2.remove(class8083);
                    list.add(class8083);
                }
            }
            else if (!list.isEmpty()) {
                final Class9009 class8084 = (Class9009)list.get(random.nextInt(list.size()));
                final Class5835<Class9009> method32257 = class8084.method32257();
                if (!random.nextBoolean()) {
                    if (!random.nextBoolean()) {
                        if (list2.isEmpty()) {
                            continue;
                        }
                        final Class9009 class8085 = (Class9009)list2.get(random.nextInt(list2.size()));
                        class8081.method26505(class8085.method32257(), method32257);
                        method23106("Add after: " + class8085.method32252() + ", " + class8084.method32252());
                    }
                    else {
                        class8081.method26504(method32257);
                        method23106("Add last: " + class8084.method32252());
                    }
                }
                else {
                    class8081.method26503(method32257);
                    method23106("Add first: " + class8084.method32252());
                }
                list.remove(class8084);
                list2.add(class8084);
            }
        }
    }
    
    private static void method23103(final Class8081<Class9009> class8081) {
        final StringBuffer obj = new StringBuffer();
        final Iterator<Class5835<Class9009>> method26512 = class8081.method26512();
        while (method26512.hasNext()) {
            final Class9009 class8082 = method26512.next().method17537();
            if (obj.length() > 0) {
                obj.append(", ");
            }
            obj.append(class8082.method32252());
        }
        method23106("List: " + obj);
    }
    
    private static void method23104(final Class8081<Class9009> class8081, final int i) {
        if (class8081.method26515() != i) {
            throw new RuntimeException("Wrong size, linked: " + class8081.method26515() + ", used: " + i);
        }
        int j = 0;
        for (Class5835 class8082 = class8081.method26513(); class8082 != null; class8082 = class8082.method17539()) {
            ++j;
        }
        if (class8081.method26515() != j) {
            throw new RuntimeException("Wrong count, linked: " + class8081.method26515() + ", count: " + j);
        }
        int k = 0;
        for (Class5835 class8083 = class8081.method26514(); class8083 != null; class8083 = class8083.method17538()) {
            ++k;
        }
        if (class8081.method26515() == k) {
            return;
        }
        throw new RuntimeException("Wrong count back, linked: " + class8081.method26515() + ", count: " + k);
    }
    
    private static void method23105(final List<Class9009> list, final List<Class9009> list2, final int n) {
        final int i = list.size() + list2.size();
        if (i == n) {
            return;
        }
        throw new RuntimeException("Total size: " + i);
    }
    
    private static void method23106(final String x) {
        System.out.println(x);
    }
}
