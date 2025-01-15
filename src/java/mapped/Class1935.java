// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.annotation.Annotation;
import java.util.List;

public abstract class Class1935 implements Comparable<Class1935>
{
    private final String field10557;
    private final Class<?> field10558;
    
    public Class1935(final String field10557, final Class<?> field10558) {
        this.field10557 = field10557;
        this.field10558 = field10558;
    }
    
    public Class<?> method7821() {
        return this.field10558;
    }
    
    public abstract Class<?>[] method7822();
    
    public String method7823() {
        return this.field10557;
    }
    
    @Override
    public String toString() {
        return this.method7823() + " of " + this.method7821();
    }
    
    @Override
    public int compareTo(final Class1935 class1935) {
        return this.method7823().compareTo(class1935.method7823());
    }
    
    public boolean method7824() {
        return true;
    }
    
    public boolean method7825() {
        return true;
    }
    
    public abstract void method7826(final Object p0, final Object p1) throws Exception;
    
    public abstract Object method7827(final Object p0);
    
    public abstract List<Annotation> method7828();
    
    public abstract <A extends Annotation> A method7829(final Class<A> p0);
    
    @Override
    public int hashCode() {
        return this.method7823().hashCode() + this.method7821().hashCode();
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof Class1935)) {
            return false;
        }
        final Class1935 class1935 = (Class1935)o;
        return this.method7823().equals(class1935.method7823()) && this.method7821().equals(class1935.method7821());
    }
}
