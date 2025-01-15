// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayDeque;
import java.util.Deque;

public class Class9573
{
    private static String[] field41608;
    private Deque<Class9023> field41609;
    
    public Class9573() {
        this.field41609 = new ArrayDeque<Class9023>();
    }
    
    public void method35863(final Class9023 class9023) {
        this.field41609.addLast(class9023);
    }
    
    public Class9023 method35864() {
        if (!this.field41609.isEmpty()) {
            return this.field41609.pollLast();
        }
        return Class9216.field39252;
    }
}
