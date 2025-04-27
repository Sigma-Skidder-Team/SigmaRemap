// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import java.util.stream.LongStream;
import com.mojang.datafixers.DataFixUtils;
import com.google.common.collect.ImmutableList;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Objects;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.Typed;
import java.util.List;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.types.Type;

public abstract class Class8187
{
    private final Type<Pair<String, Dynamic<?>>> field33694;
    public final OpticFinder<List<Pair<String, Dynamic<?>>>> field33695;
    public final List<Dynamic<?>> field33696;
    public final int field33697;
    public Class9217 field33698;
    
    public Class8187(final Typed<?> typed, final Schema schema) {
        this.field33694 = (Type<Pair<String, Dynamic<?>>>)DSL.named(Class9451.field40623.typeName(), DSL.remainderType());
        this.field33695 = (OpticFinder<List<Pair<String, Dynamic<?>>>>)DSL.fieldFinder("Palette", DSL.list((Type)this.field33694));
        if (Objects.equals(schema.getType(Class9451.field40623), this.field33694)) {
            this.field33696 = typed.getOptional((OpticFinder)this.field33695).map(list -> list.stream().map(Pair::getSecond).collect(Collectors.toList())).orElse(ImmutableList.of());
            final Dynamic dynamic = typed.get(DSL.remainderFinder());
            this.field33697 = dynamic.get("Y").asInt(0);
            this.method27103((Dynamic<?>)dynamic);
            return;
        }
        throw new IllegalStateException("Block state type is not what was expected.");
    }
    
    public void method27103(final Dynamic<?> dynamic) {
        if (!this.method27101()) {
            this.field33698 = new Class9217(Math.max(4, DataFixUtils.ceillog2(this.field33696.size())), 4096, dynamic.get("BlockStates").asLongStreamOpt().get().toArray());
        }
        else {
            this.field33698 = null;
        }
    }
    
    public Typed<?> method27104(final Typed<?> typed) {
        return (Typed<?>)(this.method27105() ? typed : typed.update(DSL.remainderFinder(), dynamic -> dynamic.set("BlockStates", dynamic.createLongList(Arrays.stream(this.field33698.method33928())))).set((OpticFinder)this.field33695, (Object)this.field33696.stream().map(dynamic2 -> Pair.of((Object)Class9451.field40623.typeName(), (Object)dynamic2)).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList())));
    }
    
    public boolean method27105() {
        return this.field33698 == null;
    }
    
    public int method27106(final int n) {
        return this.field33698.method33927(n);
    }
    
    public int method27107(final String s, final boolean b, final int n) {
        return Class8463.method28247().get((Object)s) << 5 | (b ? 16 : 0) | n;
    }
    
    public int method27108() {
        return this.field33697;
    }
    
    public abstract boolean method27101();
}
