package remapped;

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

public class class_3082 {
   private Optional<Supplier<class_7929<?>>> field_15151 = Optional.<Supplier<class_7929<?>>>empty();
   private final Map<class_6033, List<Supplier<class_987<?>>>> field_15152 = Maps.newLinkedHashMap();
   private final List<List<Supplier<class_5927<?, ?>>>> field_15149 = Lists.newArrayList();
   private final List<Supplier<class_7865<?, ?>>> field_15150 = Lists.newArrayList();

   public class_3082 method_14125(class_7929<?> var1) {
      return this.method_14127(() -> var1);
   }

   public class_3082 method_14127(Supplier<class_7929<?>> var1) {
      this.field_15151 = Optional.<Supplier<class_7929<?>>>of(var1);
      return this;
   }

   public class_3082 method_14130(class_1841 var1, class_5927<?, ?> var2) {
      return this.method_14128(var1.ordinal(), () -> var2);
   }

   public class_3082 method_14128(int var1, Supplier<class_5927<?, ?>> var2) {
      this.method_14123(var1);
      this.field_15149.get(var1).add(var2);
      return this;
   }

   public <C extends class_9472> class_3082 method_14131(class_6033 var1, class_987<C> var2) {
      this.field_15152.computeIfAbsent(var1, var0 -> Lists.newArrayList()).add(() -> var2);
      return this;
   }

   public class_3082 method_14126(class_7865<?, ?> var1) {
      this.field_15150.add(() -> var1);
      return this;
   }

   private void method_14123(int var1) {
      while (this.field_15149.size() <= var1) {
         this.field_15149.add(Lists.newArrayList());
      }
   }

   public class_2025 method_14124() {
      return new class_2025(
         this.field_15151.orElseThrow(() -> new IllegalStateException("Missing surface builder")),
         this.field_15152.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, var0 -> ImmutableList.copyOf((Collection)var0.getValue()))),
         this.field_15149.stream().map(ImmutableList::copyOf).collect(ImmutableList.toImmutableList()),
         ImmutableList.copyOf(this.field_15150),
         null
      );
   }
}
