// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.function.Consumer;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Class5455<E extends Class511> extends Class5419<E>
{
    private final Set<Class8233<?>> field22691;
    private final Class321 field22692;
    private final Class1986 field22693;
    private final Class8841<Class5419<? super E>> field22694;
    
    public Class5455(final Map<Class8233<?>, Class1952> map, final Set<Class8233<?>> field22691, final Class321 field22692, final Class1986 field22693, final List<Pair<Class5419<? super E>, Integer>> list) {
        super(map);
        this.field22694 = new Class8841<Class5419<? super E>>();
        this.field22691 = field22691;
        this.field22692 = field22692;
        this.field22693 = field22693;
        list.forEach(pair -> this.field22694.method30872((Class5419<? super E>)pair.getFirst(), (int)pair.getSecond()));
    }
    
    @Override
    public boolean method16549(final Class1849 class1849, final E e, final long n) {
        return this.field22694.method30875().filter(class1850 -> class1850.method16543() == Class232.field868).anyMatch(class1853 -> class1853.method16549(class1851, class1852, n2));
    }
    
    @Override
    public boolean method16550(final long n) {
        return false;
    }
    
    @Override
    public void method16539(final Class1849 class1849, final E e, final long n) {
        this.field22692.method991(this.field22694);
        this.field22693.method7999(this.field22694, class1849, e, n);
    }
    
    @Override
    public void method16546(final Class1849 class1849, final E e, final long n) {
        this.field22694.method30875().filter(class1850 -> class1850.method16543() == Class232.field868).forEach(class1853 -> class1853.method16545(class1851, class1852, n2));
    }
    
    @Override
    public void method16548(final Class1849 class1849, final E e, final long n) {
        this.field22694.method30875().filter(class1850 -> class1850.method16543() == Class232.field868).forEach(class1853 -> class1853.method16547(class1851, class1852, n2));
        this.field22691.forEach(e.method2618()::method1195);
    }
    
    @Override
    public String toString() {
        return "(" + this.getClass().getSimpleName() + "): " + this.field22694.method30875().filter(class5419 -> class5419.method16543() == Class232.field868).collect((Collector<? super Class5419<? super E>, ?, Set<? super Class5419<? super E>>>)Collectors.toSet());
    }
}
