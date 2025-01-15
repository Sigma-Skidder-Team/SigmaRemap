// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Supplier;
import java.util.function.BooleanSupplier;
import java.util.ListIterator;
import javax.annotation.Nullable;
import java.util.Iterator;
import java.util.Optional;
import java.util.List;

public interface Class597 extends Class574
{
    List<? extends Class574> method3040();
    
    default Optional<Class574> method3475(final double n, final double n2) {
        for (final Class574 value : this.method3040()) {
            if (!value.method3055(n, n2)) {
                continue;
            }
            return Optional.of(value);
        }
        return Optional.empty();
    }
    
    default boolean method2982(final double n, final double n2, final int n3) {
        for (final Class574 class574 : this.method3040()) {
            if (!class574.method2982(n, n2, n3)) {
                continue;
            }
            this.method3470(class574);
            if (n3 == 0) {
                this.method3469(true);
            }
            return true;
        }
        return false;
    }
    
    default boolean method2985(final double n, final double n2, final int n3) {
        this.method3469(false);
        return this.method3475(n, n2).filter(class574 -> class574.method2985(n4, n5, n6)).isPresent();
    }
    
    default boolean method2984(final double n, final double n2, final int n3, final double n4, final double n5) {
        if (this.method3471() != null) {
            if (this.method3468()) {
                if (n3 == 0) {
                    return this.method3471().method2984(n, n2, n3, n4, n5);
                }
            }
        }
        return false;
    }
    
    boolean method3468();
    
    void method3469(final boolean p0);
    
    default boolean method3012(final double n, final double n2, final double n3) {
        return this.method3475(n, n2).filter(class574 -> class574.method3012(n4, n5, n6)).isPresent();
    }
    
    default boolean method2972(final int n, final int n2, final int n3) {
        return this.method3471() != null && this.method3471().method2972(n, n2, n3);
    }
    
    default boolean method3007(final int n, final int n2, final int n3) {
        return this.method3471() != null && this.method3471().method3007(n, n2, n3);
    }
    
    default boolean method3004(final char c, final int n) {
        return this.method3471() != null && this.method3471().method3004(c, n);
    }
    
    @Nullable
    Class574 method3471();
    
    void method3470(final Class574 p0);
    
    default void method3476(final Class574 class574) {
        this.method3470(class574);
    }
    
    default void method3477(final Class574 class574) {
        this.method3470(class574);
    }
    
    default boolean method3281(final boolean b) {
        final Class574 method3471 = this.method3471();
        final boolean b2 = method3471 != null;
        if (b2 && method3471.method3281(b)) {
            return true;
        }
        final List<? extends Class574> method3472 = this.method3040();
        final int index = method3472.indexOf(method3471);
        int size;
        if (b2 && index >= 0) {
            size = index + (b ? 1 : 0);
        }
        else if (!b) {
            size = method3472.size();
        }
        else {
            size = 0;
        }
        final ListIterator listIterator = method3472.listIterator(size);
        final BooleanSupplier booleanSupplier = b ? listIterator::hasNext : listIterator::hasPrevious;
        final Supplier<Object> supplier = b ? listIterator::next : listIterator::previous;
        while (booleanSupplier.getAsBoolean()) {
            final Class574 class574 = supplier.get();
            if (!class574.method3281(b)) {
                continue;
            }
            this.method3470(class574);
            return true;
        }
        this.method3470(null);
        return false;
    }
}
