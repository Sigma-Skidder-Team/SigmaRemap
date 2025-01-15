// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Supplier;
import java.util.Comparator;
import java.util.stream.Stream;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.types.DynamicOps;
import java.util.function.Function;
import com.mojang.datafixers.Dynamic;
import com.google.common.collect.Lists;
import java.util.Random;
import java.util.List;

public class Class8841<U>
{
    public final List<Class8841$Entry<? extends U>> field37158;
    private final Random field37159;
    
    public Class8841(final Random field37159) {
        this.field37158 = Lists.newArrayList();
        this.field37159 = field37159;
    }
    
    public Class8841() {
        this(new Random());
    }
    
    public <T> Class8841(final Dynamic<T> dynamic, final Function<Dynamic<T>, U> function) {
        this();
        dynamic.asStream().forEach(dynamic2 -> dynamic2.get("data").map(dynamic4 -> this.method30872(function2.apply(dynamic4), dynamic3.get("weight").asInt(1))));
    }
    
    public <T> T method30871(final DynamicOps<T> dynamicOps, final Function<U, Dynamic<T>> function) {
        return (T)dynamicOps.createList((Stream)this.method30876().map(class8498 -> dynamicOps2.createMap((Map)ImmutableMap.builder().put(dynamicOps2.createString("data"), function2.apply(class8498.method28393()).getValue()).put(dynamicOps2.createString("weight"), dynamicOps2.createInt(class8498.method28394())).build())));
    }
    
    public Class8841<U> method30872(final U u, final int n) {
        this.field37158.add((Class8841$Entry<? extends U>)new Class8498(this, u, n, null));
        return this;
    }
    
    public Class8841<U> method30873() {
        return this.method30874(this.field37159);
    }
    
    public Class8841<U> method30874(final Random random) {
        this.field37158.forEach(class8498 -> Class8498.method28396(class8498, random2.nextFloat()));
        this.field37158.sort(Comparator.comparingDouble(class8499 -> Class8498.method28395(class8499)));
        return this;
    }
    
    public Stream<? extends U> method30875() {
        return this.field37158.stream().map((Function<? super Object, ? extends U>)Class8498::method28393);
    }
    
    public Stream<Class8841$Entry<? extends U>> method30876() {
        return this.field37158.stream();
    }
    
    public U method30877(final Random random) {
        return (U)this.method30874(random).method30875().findFirst().orElseThrow((Supplier<? extends Throwable>)RuntimeException::new);
    }
    
    @Override
    public String toString() {
        return "WeightedList[" + this.field37158 + "]";
    }
}
