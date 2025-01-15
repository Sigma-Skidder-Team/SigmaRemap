// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Arrays;
import java.util.List;

public abstract class Class5005 extends Class4997<Boolean>
{
    public List<Class4997> field21522;
    
    public Class5005(final String s, final String s2, final Class2076 class2076, final boolean b, final List<Class4997> field21522) {
        super(s, s2, class2076, b);
        this.field21522 = field21522;
    }
    
    public Class5005(final String s, final String s2, final Class2076 class2076, final boolean b, final Class4997... a) {
        this(s, s2, class2076, b, (List<Class4997>)Arrays.asList((Class4997[])a));
    }
    
    @Override
    public Class4405 method15186(final Class4405 class4405) {
        final Class88 method26638 = Class8105.method26638(class4405, this.method15204());
        if (method26638 != null) {
            for (int i = 0; i < method26638.method462(); ++i) {
                final Class4405 method26639 = method26638.method457(i);
                final String method26640 = Class8105.method26636(class4405, "name", null);
                for (final Class4997 class4406 : this.method15224()) {
                    if (!class4406.method15204().equals(method26640)) {
                        continue;
                    }
                    class4406.method15186(method26639);
                    break;
                }
            }
        }
        this.field21511 = (T)Boolean.valueOf(Class8105.method26630(class4405, "value", this.method15203()));
        return class4405;
    }
    
    @Override
    public Class4405 method15193(final Class4405 class4405) {
        final Class88 class4406 = new Class88();
        final Iterator<Class4997> iterator = (Iterator<Class4997>)this.method15224().iterator();
        while (iterator.hasNext()) {
            class4406.method486(iterator.next().method15193(new Class4405()));
        }
        class4405.method13301("children", class4406);
        class4405.method13301("name", this.method15204());
        return super.method15193(class4405);
    }
    
    public List<Class4997> method15224() {
        return this.field21522;
    }
}
