// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import java.util.stream.Stream;
import com.mojang.datafixers.types.DynamicOps;
import java.util.Iterator;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;

import java.util.List;

public class Class8231 extends Class8228
{
    private final List<Class8228> field33795;
    
    @Deprecated
    public Class8231(final List<Class8228> list) {
        this(list, Class261.field1247);
    }
    
    public Class8231(final List<Class8228> field33795, final Class261 class261) {
        super(class261);
        if (!field33795.isEmpty()) {
            this.field33795 = field33795;
            this.method27268(class261);
            return;
        }
        throw new IllegalArgumentException("Elements are empty");
    }
    
    public Class8231(final Dynamic<?> dynamic) {
        super(dynamic);
        final List list = dynamic.get("elements").asList(dynamic2 -> Class7754.method24753((com.mojang.datafixers.Dynamic<Object>)dynamic2, Registry.field234, "element_type", Class8230.field33794));
        if (!list.isEmpty()) {
            this.field33795 = list;
            return;
        }
        throw new IllegalArgumentException("Elements are empty");
    }
    
    @Override
    public List<Class9038> method27253(final Class1795 class1795, final BlockPos class1796, final Class2052 class1797, final Random random) {
        return this.field33795.get(0).method27253(class1795, class1796, class1797, random);
    }
    
    @Override
    public MutableBoundingBox method27254(final Class1795 class1795, final BlockPos class1796, final Class2052 class1797) {
        final MutableBoundingBox method21407 = MutableBoundingBox.getNewBoundingBox();
        final Iterator<Class8228> iterator = this.field33795.iterator();
        while (iterator.hasNext()) {
            method21407.expandTo(iterator.next().method27254(class1795, class1796, class1797));
        }
        return method21407;
    }
    
    @Override
    public boolean method27255(final Class1795 class1795, final Class1851 class1796, final Class6346<?> class1797, final BlockPos class1798, final Class2052 class1799, final MutableBoundingBox class1800, final Random random) {
        final Iterator<Class8228> iterator = this.field33795.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().method27255(class1795, class1796, class1797, class1798, class1799, class1800, random)) {
                continue;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public Class7755 method27257() {
        return Class7755.field31689;
    }
    
    @Override
    public Class8228 method27262(final Class261 class261) {
        super.method27262(class261);
        this.method27268(class261);
        return this;
    }
    
    @Override
    public <T> Dynamic<T> method27258(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("elements"), dynamicOps.createList((Stream)this.field33795.stream().map(class8228 -> class8228.method27264((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps2).getValue())))));
    }
    
    @Override
    public String toString() {
        return "List[" + this.field33795.stream().map((Function<? super Object, ?>)Object::toString).collect((Collector<? super Object, ?, String>)Collectors.joining(", ")) + "]";
    }
    
    private void method27268(final Class261 class261) {
        this.field33795.forEach(class263 -> class263.method27262(class262));
    }
}
