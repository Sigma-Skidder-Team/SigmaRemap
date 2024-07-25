package remapped;

import java.util.Queue;
import javax.annotation.Nullable;

public final class class_1875<T> implements class_2096<T, T> {
   private static String[] field_9499;
   private final Queue<T> field_9498;

   public class_1875(Queue<T> var1) {
      this.field_9498 = var1;
   }

   @Nullable
   @Override
   public T method_9798() {
      return this.field_9498.poll();
   }

   @Override
   public boolean method_9796(T var1) {
      return this.field_9498.add((T)var1);
   }

   @Override
   public boolean method_9797() {
      return this.field_9498.isEmpty();
   }
}
