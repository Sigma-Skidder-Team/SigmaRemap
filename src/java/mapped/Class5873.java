package mapped;

import com.google.common.collect.Lists;
import java.util.List;

public abstract class Class5873<T extends Class5873<T>> implements Class5875<T> {
   private final List<ILootCondition> field25662 = Lists.newArrayList();

   public abstract T method18301();

   public T method18297(Class7519 var1) {
      this.field25662.add(var1.method24517());
      return this.method18301();
   }

   public final T method18295() {
      return this.method18301();
   }

   public ILootCondition[] method18302() {
      return this.field25662.<ILootCondition>toArray(new ILootCondition[0]);
   }

   public Class5874 method18303(Class5873<?> var1) {
      return new Class5874(this, var1);
   }

   public abstract Class4688 method18304();
}
