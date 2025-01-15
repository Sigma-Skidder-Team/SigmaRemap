// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.List;

public class Class7573 extends Class7574<Class7576>
{
    private final List<Class7576> field30043;
    
    public Class7573(final Class8542 class8542, final boolean field30052, final List<Class7576> field30053, final Class2314 class8543, final Class2314 class8544, final Class227 class8545) {
        super(class8542, class8543, class8544, class8545);
        if (field30053 != null) {
            this.field30043 = field30053;
            this.field30052 = field30052;
            return;
        }
        throw new NullPointerException("value in a Node is required.");
    }
    
    public Class7573(final Class8542 class8542, final List<Class7576> list, final Class227 class8543) {
        this(class8542, true, list, null, null, class8543);
    }
    
    @Override
    public Class2085 method23834() {
        return Class2085.field12056;
    }
    
    @Override
    public List<Class7576> method23835() {
        return this.field30043;
    }
    
    public void method23836(final Class<?> clazz) {
        final Iterator<Class7576> iterator = this.field30043.iterator();
        while (iterator.hasNext()) {
            iterator.next().method23850(clazz);
        }
    }
    
    @Override
    public String toString() {
        return "<" + this.getClass().getName() + " (tag=" + this.method23845() + ", value=" + this.method23835() + ")>";
    }
}
