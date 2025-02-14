package mapped;

import java.util.Queue;
import javax.annotation.Nullable;

public final class Class7382<T> implements Class7383<T, T> {
   private static String[] field31591;
   private final Queue<T> field31592;

   public Class7382(Queue<T> var1) {
      this.field31592 = var1;
   }

   @Nullable
   @Override
   public T method23498() {
      return this.field31592.poll();
   }

   @Override
   public boolean method23499(T var1) {
      return this.field31592.add((T)var1);
   }

   @Override
   public boolean method23500() {
      return this.field31592.isEmpty();
   }
}
