package remapped;

import com.google.common.collect.Queues;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public final class class_5943 implements class_2096<class_9465, Runnable> {
   private static String[] field_30318;
   private final List<Queue<Runnable>> field_30319;

   public class_5943(int var1) {
      this.field_30319 = IntStream.range(0, var1)
         .<ConcurrentLinkedQueue>mapToObj(var0 -> Queues.newConcurrentLinkedQueue())
         .collect(Collectors.<Queue<Runnable>>toList());
   }

   @Nullable
   public Runnable method_27183() {
      for (Queue var4 : this.field_30319) {
         Runnable var5 = (Runnable)var4.poll();
         if (var5 != null) {
            return var5;
         }
      }

      return null;
   }

   public boolean method_27182(class_9465 var1) {
      int var4 = var1.method_43740();
      this.field_30319.get(var4).add(var1);
      return true;
   }

   @Override
   public boolean method_9797() {
      return this.field_30319.stream().allMatch(Collection::isEmpty);
   }
}
