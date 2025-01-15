// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public abstract class Class4997<T>
{
    public final Class2076 field21510;
    public T field21511;
    public T field21512;
    public final String field21513;
    public final String field21514;
    private final List<Class7655> field21515;
    
    public Class4997(final String field21513, final String field21514, final Class2076 field21515, final T t) {
        this.field21515 = new ArrayList<Class7655>();
        this.field21510 = field21515;
        this.field21512 = t;
        this.field21511 = t;
        this.field21513 = field21513;
        this.field21514 = field21514;
    }
    
    public abstract Class4405 method15186(final Class4405 p0);
    
    public Class4405 method15193(final Class4405 class4405) {
        class4405.method13301("name", this.method15204());
        class4405.method13301("value", this.field21511);
        return class4405;
    }
    
    public void method15194() {
        this.field21511 = this.field21512;
    }
    
    public final Class4997 method15195(final Class7655 class7655) {
        this.field21515.add(class7655);
        return this;
    }
    
    public final void method15196() {
        final Iterator<Class7655> iterator = this.field21515.iterator();
        while (iterator.hasNext()) {
            iterator.next().method24257(this);
        }
    }
    
    public Class2076 method15197() {
        return this.field21510;
    }
    
    public T method15198() {
        return this.field21511;
    }
    
    public void method15199(final T t) {
        this.method15200(t, true);
    }
    
    public void method15200(final T field21511, final boolean b) {
        if (this.field21511 != field21511) {
            this.field21511 = field21511;
            if (b) {
                this.method15196();
            }
        }
    }
    
    public void method15201() {
    }
    
    public boolean method15202() {
        return false;
    }
    
    public T method15203() {
        return this.field21512;
    }
    
    public String method15204() {
        return this.field21513;
    }
    
    public String method15205() {
        return this.field21514;
    }
    
    @Override
    public String toString() {
        return this.method15198().toString();
    }
}
