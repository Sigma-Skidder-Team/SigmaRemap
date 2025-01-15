// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Comparator;

public final class Class4434 implements Comparator
{
    private static String[] field19768;
    
    @Override
    public int compare(final Object o, final Object o2) {
        final Class8988 class8988 = (Class8988)o;
        final Class8988 class8989 = (Class8988)o2;
        if (class8988.field37900 != class8989.field37900) {
            return class8988.field37900 - class8989.field37900;
        }
        if (class8988.field37902 == class8989.field37902) {
            return class8988.field37882.equals(class8989.field37882) ? class8988.field37881.compareTo(class8989.field37881) : class8988.field37882.compareTo(class8989.field37882);
        }
        return class8989.field37902 - class8988.field37902;
    }
}
