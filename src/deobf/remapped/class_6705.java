package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_6705 {
   private static final Logger field_34631 = LogManager.getLogger();
   private final PriorityQueue<class_4117> field_34627 = Queues.newPriorityQueue();
   private final Queue<class_2848> field_34620;
   private final Queue<Runnable> field_34628 = Queues.newConcurrentLinkedQueue();
   private volatile int field_34621;
   private volatile int field_34614;
   private final class_2848 field_34615;
   private final class_2696<Runnable> field_34618;
   private final Executor field_34623;
   private class_6486 field_34634;
   private final class_4316 field_34619;
   private class_1343 field_34617 = class_1343.field_7335;
   private int field_34624;
   private List<class_2848> field_34630 = new ArrayList<class_2848>();
   public static final class_3581[] field_34622 = class_3581.method_16770().<class_3581>toArray(new class_3581[0]);
   private static final boolean field_34629 = class_7860.field_40161.method_45472();
   private static final boolean field_34633 = class_7860.field_40075.method_3596();
   private static final boolean field_34632 = class_7860.field_40075.method_3596();
   private static final boolean field_34626 = class_7860.field_40031.method_3596();
   public static int field_34625;

   public class_6705(class_6486 var1, class_4316 var2, Executor var3, boolean var4, class_2848 var5) {
      this(var1, var2, var3, var4, var5, -1);
   }

   public class_6705(class_6486 var1, class_4316 var2, Executor var3, boolean var4, class_2848 var5, int var6) {
      this.field_34634 = var1;
      this.field_34619 = var2;
      int var9 = Math.max(
         1, (int)((double)Runtime.getRuntime().maxMemory() * 0.3) / (class_3581.method_16770().stream().mapToInt(class_3581::method_16742).sum() * 4) - 1
      );
      int var10 = Runtime.getRuntime().availableProcessors();
      int var11 = var4 ? var10 : Math.min(var10, 4);
      int var12 = Math.max(1, Math.min(var11, var9));
      if (var6 > 0) {
         var12 = var6;
      }

      this.field_34615 = var5;
      ArrayList var13 = Lists.newArrayListWithExpectedSize(var12);

      try {
         for (int var14 = 0; var14 < var12; var14++) {
            var13.add(new class_2848());
         }
      } catch (OutOfMemoryError var17) {
         field_34631.warn("Allocated only {}/{} buffers", var13.size(), var12);
         int var15 = Math.min(var13.size() * 2 / 3, var13.size() - 1);

         for (int var16 = 0; var16 < var15; var16++) {
            var13.remove(var13.size() - 1);
         }

         System.gc();
      }

      this.field_34620 = Queues.newArrayDeque(var13);
      this.field_34614 = this.field_34620.size();
      this.field_34624 = this.field_34614;
      this.field_34623 = var3;
      this.field_34618 = class_2696.method_12148(var3, "Chunk Renderer");
      this.field_34618.method_40495(this::method_30737);
   }

   public void method_30736(class_6486 var1) {
      this.field_34634 = var1;
   }

   private void method_30737() {
      if (!this.field_34620.isEmpty()) {
         class_4117 var3 = this.field_34627.poll();
         if (var3 != null) {
            class_2848 var4 = this.field_34620.poll();
            this.field_34621 = this.field_34627.size();
            this.field_34614 = this.field_34620.size();
            CompletableFuture.runAsync(() -> {
            }, this.field_34623).<class_8490>thenCompose(var2 -> var3.method_19129(var4)).whenComplete((var2, var3x) -> {
               if (var3x == null) {
                  this.field_34618.method_40495(() -> {
                     if (var2 != class_8490.field_43498) {
                        var4.method_12957();
                     } else {
                        var4.method_12958();
                     }

                     this.field_34620.add(var4);
                     this.field_34614 = this.field_34620.size();
                     this.method_30737();
                  });
               } else {
                  class_159 var6 = class_159.method_643(var3x, "Batching chunks");
                  class_1893.method_8510().method_8555(class_1893.method_8510().method_8546(var6));
               }
            });
         }
      }
   }

   public String method_30724() {
      return String.format("pC: %03d, pU: %02d, aB: %02d", this.field_34621, this.field_34628.size(), this.field_34614);
   }

   public void method_30739(class_1343 var1) {
      this.field_34617 = var1;
   }

   public class_1343 method_30747() {
      return this.field_34617;
   }

   public boolean method_30730() {
      boolean var3;
      Runnable var4;
      for (var3 = false; (var4 = this.field_34628.poll()) != null; var3 = true) {
         var4.run();
      }

      return var3;
   }

   public void method_30726(class_3511 var1) {
      var1.method_16147();
   }

   public void method_30733() {
      this.method_30729();
   }

   public void method_30735(class_4117 var1) {
      this.field_34618.method_40495(() -> {
         this.field_34627.offer(var1);
         this.field_34621 = this.field_34627.size();
         this.method_30737();
      });
   }

   public CompletableFuture<Void> method_30744(class_9633 var1, class_7995 var2) {
      return CompletableFuture.runAsync(() -> {
      }, this.field_34628::add).<Void>thenCompose(var3 -> this.method_30748(var1, var2));
   }

   private CompletableFuture<Void> method_30748(class_9633 var1, class_7995 var2) {
      return var2.method_36278(var1);
   }

   private void method_30729() {
      while (!this.field_34627.isEmpty()) {
         class_4117 var3 = this.field_34627.poll();
         if (var3 != null) {
            var3.method_19131();
         }
      }

      this.field_34621 = 0;
   }

   public boolean method_30740() {
      return this.field_34621 == 0 && this.field_34628.isEmpty();
   }

   public void method_30732() {
      this.method_30729();
      this.field_34618.close();
      this.field_34620.clear();
   }

   public void method_30743() {
      while (this.field_34630.size() != this.field_34624) {
         this.method_30730();
         class_2848 var3 = this.field_34620.poll();
         if (var3 != null) {
            this.field_34630.add(var3);
         }
      }
   }

   public void method_30731() {
      this.field_34620.addAll(this.field_34630);
      this.field_34630.clear();
   }

   public boolean method_30728(class_3511 var1) {
      this.method_30726(var1);
      return true;
   }

   public boolean method_30727(class_3511 var1) {
      if (!this.field_34620.isEmpty()) {
         var1.method_16185(this);
         return true;
      } else {
         return false;
      }
   }

   public boolean method_30742(class_3511 var1) {
      return !this.field_34620.isEmpty() ? var1.method_16157(class_6727.field_34740, this) : false;
   }
}
