package mapped;

import com.google.common.collect.Lists;
import java.util.List;

public abstract class Class5876<T extends Class5876<T>> implements Class5885, Class5875<T> {
   private final List<Class122> field25665 = Lists.newArrayList();

   public T method18297(Class7519 var1) {
      this.field25665.add(var1.method24517());
      return this.method18305();
   }

   public final T method18295() {
      return this.method18305();
   }

   public abstract T method18305();

   public Class122[] method18306() {
      return this.field25665.<Class122>toArray(new Class122[0]);
   }
}
