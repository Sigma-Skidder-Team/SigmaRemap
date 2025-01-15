// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayDeque;

public class Class6783 implements Class6782
{
    private final Class9360 field26683;
    
    public Class6783(final Class8263 class8263) {
        this.field26683 = new Class9360(class8263);
    }
    
    @Override
    public void method20737(final Class1794 class1794, final Class7492 class1795, final ArrayDeque<Class9234> arrayDeque, final int n) {
        this.field26683.method34708(class1794).ifPresent(class1798 -> {
            class1798.method27444();
            final Class6782[] array;
            for (int i = Math.min(array.length, n2 - arrayDeque2.size()) - 1; i >= 0; --i) {
                arrayDeque2.addFirst(new Class9234(class1796, class1797, array[i]));
            }
        });
    }
    
    @Override
    public String toString() {
        return "function " + this.field26683.method34709();
    }
}
