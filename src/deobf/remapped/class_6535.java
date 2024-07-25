package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public class class_6535<S> implements class_4302 {
   private static String[] field_33235;
   public final class_7832 field_33239;
   public final CompletableFuture<Unit> field_33238 = new CompletableFuture<Unit>();
   public final CompletableFuture<List<S>> field_33240;
   private final Set<class_2231> field_33244;
   private final int field_33243;
   private int field_33241;
   private int field_33236;
   private final AtomicInteger field_33237 = new AtomicInteger();
   private final AtomicInteger field_33242 = new AtomicInteger();

   public static class_6535<Void> method_29756(class_7832 var0, List<class_2231> var1, Executor var2, Executor var3, CompletableFuture<Unit> var4) {
      return new class_6535<Void>(
         var2,
         var3,
         var0,
         var1,
         (var1x, var2x, var3x, var4x, var5) -> var3x.method_10277(var1x, var2x, class_8677.field_44535, class_8677.field_44535, var2, var5),
         var4
      );
   }

   public class_6535(Executor var1, Executor var2, class_7832 var3, List<class_2231> var4, class_9234<S> var5, CompletableFuture<Unit> var6) {
      this.field_33239 = var3;
      this.field_33243 = var4.size();
      this.field_33237.incrementAndGet();
      var6.thenRun(this.field_33242::incrementAndGet);
      ArrayList var9 = Lists.newArrayList();
      CompletableFuture var10 = var6;
      this.field_33244 = Sets.newHashSet(var4);

      for (class_2231 var12 : var4) {
         CompletableFuture var14 = var5.method_42593(new class_6069(this, var2, var12, var10), var3, var12, var2x -> {
            this.field_33237.incrementAndGet();
            var1.execute(() -> {
               var2x.run();
               this.field_33242.incrementAndGet();
            });
         }, var2x -> {
            this.field_33241++;
            var2.execute(() -> {
               var2x.run();
               this.field_33236++;
            });
         });
         var9.add(var14);
         var10 = var14;
      }

      this.field_33240 = Util.<S>method_44680(var9);
   }

   public CompletableFuture<Unit> 㞈刃붃핇낛佉() {
      return this.field_33240.<Unit>thenApply(var0 -> Unit.INSTANCE);
   }

   public float 圭甐贞騜ࢹⰛ() {
      int var3 = this.field_33243 - this.field_33244.size();
      float var4 = (float)(this.field_33242.get() * 2 + this.field_33236 * 2 + var3 * 1);
      float var5 = (float)(this.field_33237.get() * 2 + this.field_33241 * 2 + this.field_33243 * 1);
      return var4 / var5;
   }

   public boolean 䬹쥦汌哝阢䄟() {
      return this.field_33238.isDone();
   }

   public boolean 属杭硙綋嶗汌() {
      return this.field_33240.isDone();
   }

   public void ᙽ㞈쿨鷏콗陂() {
      if (this.field_33240.isCompletedExceptionally()) {
         this.field_33240.join();
      }
   }
}
