package mapped;

import com.google.common.collect.Sets;
import java.util.Set;

public class Class7328 {
   private final Set<Class9821<?>> field31409 = Sets.newIdentityHashSet();
   private final Set<Class9821<?>> field31410 = Sets.newIdentityHashSet();

   public Class7328 method23225(Class9821<?> var1) {
      if (!this.field31410.contains(var1)) {
         this.field31409.add(var1);
         return this;
      } else {
         throw new IllegalArgumentException("Parameter " + var1.method38767() + " is already optional");
      }
   }

   public Class7328 method23226(Class9821<?> var1) {
      if (!this.field31409.contains(var1)) {
         this.field31410.add(var1);
         return this;
      } else {
         throw new IllegalArgumentException("Parameter " + var1.method38767() + " is already required");
      }
   }

   public Class7538 method23227() {
      return new Class7538(this.field31409, this.field31410);
   }
}
