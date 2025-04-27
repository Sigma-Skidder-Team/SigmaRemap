// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.List;

public class Class7575 extends Class7574<Class9474>
{
    private List<Class9474> field30045;
    private boolean field30046;
    
    public Class7575(final Class8542 class8542, final boolean field30052, final List<Class9474> field30053, final Class2314 class8543, final Class2314 class8544, final Class227 class8545) {
        super(class8542, class8543, class8544, class8545);
        this.field30046 = false;
        if (field30053 != null) {
            this.field30045 = field30053;
            this.field30052 = field30052;
            return;
        }
        throw new NullPointerException("value in a Node is required.");
    }
    
    public Class7575(final Class8542 class8542, final List<Class9474> list, final Class227 class8543) {
        this(class8542, true, list, null, null, class8543);
    }
    
    @Override
    public Class2085 method23834() {
        return Class2085.field12057;
    }
    
    @Override
    public List<Class9474> method23835() {
        return this.field30045;
    }
    
    public void method23840(final List<Class9474> field30045) {
        this.field30045 = field30045;
    }
    
    public void method23841(final Class<?> clazz) {
        final Iterator<Class9474> iterator = this.field30045.iterator();
        while (iterator.hasNext()) {
            iterator.next().method35260().method23850(clazz);
        }
    }
    
    public void method23842(final Class<?> clazz, final Class<?> clazz2) {
        for (final Class9474 class9474 : this.field30045) {
            class9474.method35261().method23850(clazz2);
            class9474.method35260().method23850(clazz);
        }
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        for (final Class9474 class9474 : this.method23835()) {
            sb.append("{ key=");
            sb.append(class9474.method35260());
            sb.append("; value=");
            if (!(class9474.method35261() instanceof Class7574)) {
                sb.append(class9474);
            }
            else {
                sb.append(System.identityHashCode(class9474.method35261()));
            }
            sb.append(" }");
        }
        return "<" + this.getClass().getName() + " (tag=" + this.method23845() + ", values=" + sb + ")>";
    }
    
    public void method23843(final boolean field30046) {
        this.field30046 = field30046;
    }
    
    public boolean method23844() {
        return this.field30046;
    }
}
