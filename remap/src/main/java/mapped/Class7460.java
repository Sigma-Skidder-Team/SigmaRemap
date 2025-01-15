// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Comparator;

public class Class7460<T>
{
    private static long field28772;
    private final T field28773;
    public final BlockPos field28774;
    public final long field28775;
    public final Class1955 field28776;
    private final long field28777;
    
    public Class7460(final BlockPos class354, final T t) {
        this(class354, t, 0L, Class1955.field10642);
    }
    
    public Class7460(final BlockPos class354, final T field28773, final long field28774, final Class1955 field28775) {
        this.field28777 = Class7460.field28772++;
        this.field28774 = class354.method1153();
        this.field28773 = field28773;
        this.field28775 = field28774;
        this.field28776 = field28775;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof Class7460) {
            final Class7460 class7460 = (Class7460)o;
            return this.field28774.equals(class7460.field28774) && this.field28773 == class7460.field28773;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return this.field28774.hashCode();
    }
    
    public static <T> Comparator<Class7460<T>> method22979() {
        return Comparator.comparingLong(class7460 -> class7460.field28775).thenComparing(class7461 -> class7461.field28776).thenComparingLong(class7462 -> class7462.field28777);
    }
    
    @Override
    public String toString() {
        return this.field28773 + ": " + this.field28774 + ", " + this.field28775 + ", " + this.field28776 + ", " + this.field28777;
    }
    
    public T method22980() {
        return this.field28773;
    }
}
