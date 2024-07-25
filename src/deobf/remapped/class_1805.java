package remapped;

import com.google.common.collect.Sets;
import java.util.Set;

public class class_1805 {
   private final Set<class_9791<?>> field_9191 = Sets.newIdentityHashSet();
   private final Set<class_9791<?>> field_9193 = Sets.newIdentityHashSet();

   public class_1805 method_8022(class_9791<?> var1) {
      if (!this.field_9193.contains(var1)) {
         this.field_9191.add(var1);
         return this;
      } else {
         throw new IllegalArgumentException("Parameter " + var1.method_45196() + " is already optional");
      }
   }

   public class_1805 method_8020(class_9791<?> var1) {
      if (!this.field_9191.contains(var1)) {
         this.field_9193.add(var1);
         return this;
      } else {
         throw new IllegalArgumentException("Parameter " + var1.method_45196() + " is already required");
      }
   }

   public class_2144 method_8021() {
      return new class_2144(this.field_9191, this.field_9193, null);
   }
}
