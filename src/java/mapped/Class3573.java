// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.EnumSet;
import com.google.common.collect.Lists;
import java.util.function.BooleanSupplier;
import java.util.List;

public class Class3573 extends Class3446
{
    public final Class787 field16676;
    private final double field16677;
    private Class9468 field16678;
    private Class354 field16679;
    private final boolean field16680;
    private final List<Class354> field16681;
    private final int field16682;
    private final BooleanSupplier field16683;
    
    public Class3573(final Class787 field16676, final double field16677, final boolean field16678, final int field16679, final BooleanSupplier field16680) {
        this.field16681 = Lists.newArrayList();
        this.field16676 = field16676;
        this.field16677 = field16677;
        this.field16680 = field16678;
        this.field16682 = field16679;
        this.field16683 = field16680;
        this.method11019(EnumSet.of(Class2139.field12580));
        if (field16676.method4150() instanceof Class7747) {
            return;
        }
        throw new IllegalArgumentException("Unsupported mob for MoveThroughVillageGoal");
    }
    
    @Override
    public boolean method11013() {
        this.method11114();
        if (this.field16680 && this.field16676.field2391.method6703()) {
            return false;
        }
        final Class1849 class1849 = (Class1849)this.field16676.field2391;
        if (!class1849.method6924(new Class354(this.field16676), 6)) {
            return false;
        }
        final Class5487 method24903 = Class7775.method24903(this.field16676, 15, 7, class1853 -> {
            if (class1851.method6922(class1853)) {
                class1851.method6921().method7204(Class8912.field37458, this::method11113, class1853, 10, Class2045.field11651);
                final Optional optional;
                return optional.isPresent() ? (-optional.get().method1083(class1852)) : Double.NEGATIVE_INFINITY;
            }
            else {
                return Double.NEGATIVE_INFINITY;
            }
        });
        if (method24903 == null) {
            return false;
        }
        final Optional<Class354> method24904 = class1849.method6921().method7204(Class8912.field37458, this::method11113, new Class354(method24903), 10, Class2045.field11651);
        if (method24904.isPresent()) {
            this.field16679 = method24904.get().method1153();
            final Class7747 class1850 = (Class7747)this.field16676.method4150();
            final boolean method24905 = class1850.method24748();
            class1850.method24747(this.field16683.getAsBoolean());
            this.field16678 = class1850.method24721(this.field16679, 0);
            class1850.method24747(method24905);
            if (this.field16678 == null) {
                final Class5487 method24906 = Class7775.method24905(this.field16676, 10, 7, new Class5487(this.field16679));
                if (method24906 == null) {
                    return false;
                }
                class1850.method24747(this.field16683.getAsBoolean());
                this.field16678 = this.field16676.method4150().method24719(method24906.field22770, method24906.field22771, method24906.field22772, 0);
                class1850.method24747(method24905);
                if (this.field16678 == null) {
                    return false;
                }
            }
            for (int i = 0; i < this.field16678.method35221(); ++i) {
                final Class6772 method24907 = this.field16678.method35217(i);
                if (Class3467.method11035(this.field16676.field2391, new Class354(method24907.field26589, method24907.field26590 + 1, method24907.field26591))) {
                    this.field16678 = this.field16676.method4150().method24719(method24907.field26589, method24907.field26590, method24907.field26591, 0);
                    break;
                }
            }
            return this.field16678 != null;
        }
        return false;
    }
    
    @Override
    public boolean method11017() {
        return !this.field16676.method4150().method24731() && !this.field16679.method1082(this.field16676.method1934(), this.field16676.method1930() + this.field16682);
    }
    
    @Override
    public void method11015() {
        this.field16676.method4150().method24726(this.field16678, this.field16677);
    }
    
    @Override
    public void method11018() {
        if (this.field16676.method4150().method24731() || this.field16679.method1082(this.field16676.method1934(), this.field16682)) {
            this.field16681.add(this.field16679);
        }
    }
    
    private boolean method11113(final Class354 a) {
        final Iterator<Class354> iterator = this.field16681.iterator();
        while (iterator.hasNext()) {
            if (!Objects.equals(a, iterator.next())) {
                continue;
            }
            return false;
        }
        return true;
    }
    
    private void method11114() {
        if (this.field16681.size() > 15) {
            this.field16681.remove(0);
        }
    }
}
