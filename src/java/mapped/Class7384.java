package mapped;

import com.google.common.collect.Queues;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public final class Class7384 implements Class7383<Class497, Runnable> {
   private static String[] field31593;
   private final List<Queue<Runnable>> field31594;

   public Class7384(int var1) {
      this.field31594 = IntStream.range(0, var1)
         .<ConcurrentLinkedQueue<Runnable>>mapToObj(var0 -> Queues.newConcurrentLinkedQueue())
         .collect(Collectors.toList());
   }

   @Nullable
   public Runnable method23498() {
      for (Queue<Runnable> var4 : this.field31594) {
         Runnable var5 = var4.poll();
         if (var5 != null) {
            return var5;
         }
      }

      return null;
   }

   public boolean method23499(Class497 var1) {
      int var4 = var1.method1889();
      this.field31594.get(var4).add(var1);
      return true;
   }

   @Override
   public boolean method23500() {
      return this.field31594.stream().allMatch(Collection::isEmpty);
   }
}
