// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Objects;

public final class Class1949<T> implements Comparable<Class1949<?>>
{
    private final Class9105<T> field10616;
    private final int field10617;
    private final T field10618;
    private long field10619;
    
    public Class1949(final Class9105<T> field10616, final int field10617, final T field10618) {
        this.field10616 = field10616;
        this.field10617 = field10617;
        this.field10618 = field10618;
    }
    
    @Override
    public int compareTo(final Class1949<?> class1949) {
        final int compare = Integer.compare(this.field10617, class1949.field10617);
        if (compare == 0) {
            final int compare2 = Integer.compare(System.identityHashCode(this.field10616), System.identityHashCode(class1949.field10616));
            return (compare2 == 0) ? this.field10616.method32913().compare(this.field10618, (T)class1949.field10618) : compare2;
        }
        return compare;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Class1949) {
            final Class1949 class1949 = (Class1949)o;
            if (this.field10617 == class1949.field10617) {
                if (Objects.equals(this.field10616, class1949.field10616)) {
                    return Objects.equals(this.field10618, class1949.field10618);
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.field10616, this.field10617, this.field10618);
    }
    
    @Override
    public String toString() {
        return "Ticket[" + this.field10616 + " " + this.field10617 + " (" + this.field10618 + ")] at " + this.field10619;
    }
    
    public Class9105<T> method7922() {
        return this.field10616;
    }
    
    public int method7923() {
        return this.field10617;
    }
    
    public void method7924(final long field10619) {
        this.field10619 = field10619;
    }
    
    public boolean method7925(final long n) {
        final long method32914 = this.field10616.method32914();
        return method32914 != 0L && n - this.field10619 > method32914;
    }
}
