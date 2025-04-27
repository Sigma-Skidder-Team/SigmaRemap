// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.EnumSet;
import java.util.Set;

public enum Class2143
{
    field12617(0), 
    field12618(1), 
    field12619(2), 
    field12620(3), 
    field12621(4);
    
    private final int field12622;
    
    Class2143(final int field12622) {
        this.field12622 = field12622;
    }
    
    private int method8305() {
        return 1 << this.field12622;
    }
    
    private boolean method8306(final int n) {
        return (n & this.method8305()) == this.method8305();
    }
    
    public static Set<Class2143> method8307(final int n) {
        final EnumSet<Class2143> none = EnumSet.noneOf(Class2143.class);
        for (final Class2143 class2143 : values()) {
            if (class2143.method8306(n)) {
                none.add(class2143);
            }
        }
        return none;
    }
    
    public static int method8308(final Set<Class2143> set) {
        int n = 0;
        final Iterator<Class2143> iterator = set.iterator();
        while (iterator.hasNext()) {
            n |= iterator.next().method8305();
        }
        return n;
    }
}
