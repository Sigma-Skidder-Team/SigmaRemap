package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Supplier;

public class Class7935 {
   private Optional<Supplier<Class9319<?>>> field34020 = Optional.<Supplier<Class9319<?>>>empty();
   private final Map<Class97, List<Supplier<Class6815<?>>>> field34021 = Maps.newLinkedHashMap();
   private final List<List<Supplier<Class7909<?, ?>>>> field34022 = Lists.newArrayList();
   private final List<Supplier<Class9300<?, ?>>> field34023 = Lists.newArrayList();

   public Class7935 method26688(Class9319<?> var1) {
      return this.method26689(() -> var1);
   }

   public Class7935 method26689(Supplier<Class9319<?>> var1) {
      this.field34020 = Optional.<Supplier<Class9319<?>>>of(var1);
      return this;
   }

   public Class7935 method26690(Class1993 var1, Class7909<?, ?> var2) {
      return this.method26691(var1.ordinal(), () -> var2);
   }

   public Class7935 method26691(int var1, Supplier<Class7909<?, ?>> var2) {
      this.method26694(var1);
      this.field34022.get(var1).add(var2);
      return this;
   }

   public <C extends Class4729> Class7935 method26692(Class97 var1, Class6815<C> var2) {
      this.field34021.computeIfAbsent(var1, var0 -> Lists.newArrayList()).add(() -> var2);
      return this;
   }

   public Class7935 method26693(Class9300<?, ?> var1) {
      this.field34023.add(() -> var1);
      return this;
   }

   private void method26694(int var1) {
      while (this.field34022.size() <= var1) {
         this.field34022.add(Lists.newArrayList());
      }
   }

   public Class7478 method26695() {
      return new Class7478(
         this.field34020.orElseThrow(() -> new IllegalStateException("Missing surface builder")),
         this.field34021.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, var0 -> ImmutableList.copyOf((Collection)var0.getValue()))),
         this.field34022.stream().map(ImmutableList::copyOf).collect(ImmutableList.toImmutableList()),
         ImmutableList.copyOf(this.field34023)
      );
   }
}
