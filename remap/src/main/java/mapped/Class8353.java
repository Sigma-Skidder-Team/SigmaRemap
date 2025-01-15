// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

public class Class8353
{
    private static String[] field34279;
    private static Class869 field34280;
    
    public static boolean method27875(final Class8733 class8733) {
        boolean b = true;
        final Iterator<Long> iterator = class8733.field36693.iterator();
        while (iterator.hasNext()) {
            if (Class8353.field34280.field4683.method6701(BlockPos.method1129(iterator.next())).method21706()) {
                continue;
            }
            b = false;
            break;
        }
        return b;
    }
    
    public static boolean method27876() {
        return Class8353.field34280.field4684.field2404 && Class8353.field34280.field4683.method6981(Class8353.field34280.field4684, Class8353.field34280.field4684.method1886().method18499(0.0, 1.0, 0.0)).count() == 0L;
    }
    
    static {
        Class8353.field34280 = Class869.method5277();
    }
}
