package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public class Class8337<S> implements Class8335 {
   private static String[] field35843;
   public final IResourceManager field35844;
   public final CompletableFuture<Class2341> field35845 = new CompletableFuture<Class2341>();
   public final CompletableFuture<List<S>> field35846;
   private final Set<Class268> field35847;
   private final int field35848;
   private int field35849;
   private int field35850;
   private final AtomicInteger field35851 = new AtomicInteger();
   private final AtomicInteger field35852 = new AtomicInteger();

   public static Class8337<Void> method29228(IResourceManager var0, List<Class268> var1, Executor var2, Executor var3, CompletableFuture<Class2341> var4) {
      return new Class8337<Void>(
         var2,
         var3,
         var0,
         var1,
         (var1x, var2x, var3x, var4x, var5) -> var3x.method777(var1x, var2x, EmptyProfiler.INSTANCE, EmptyProfiler.INSTANCE, var2, var5),
         var4
      );
   }

   public Class8337(Executor var1, Executor var2, IResourceManager var3, List<Class268> var4, Class9663<S> var5, CompletableFuture<Class2341> var6) {
      this.field35844 = var3;
      this.field35848 = var4.size();
      this.field35851.incrementAndGet();
      var6.thenRun(this.field35852::incrementAndGet);
      ArrayList var9 = Lists.newArrayList();
      CompletableFuture var10 = var6;
      this.field35847 = Sets.newHashSet(var4);

      for (Class268 var12 : var4) {
         CompletableFuture var14 = var5.method37714(new Class7123(this, var2, var12, var10), var3, var12, var2x -> {
            this.field35851.incrementAndGet();
            var1.execute(() -> {
               var2x.run();
               this.field35852.incrementAndGet();
            });
         }, var2x -> {
            this.field35849++;
            var2.execute(() -> {
               var2x.run();
               this.field35850++;
            });
         });
         var9.add(var14);
         var10 = var14;
      }

      this.field35846 = Util.<S>gather(var9);
   }

   @Override
   public CompletableFuture<Class2341> method29223() {
      return this.field35846.<Class2341>thenApply(var0 -> Class2341.field16010);
   }

   @Override
   public float method29224() {
      int var3 = this.field35848 - this.field35847.size();
      float var4 = (float)(this.field35852.get() * 2 + this.field35850 * 2 + var3 * 1);
      float var5 = (float)(this.field35851.get() * 2 + this.field35849 * 2 + this.field35848 * 1);
      return var4 / var5;
   }

   @Override
   public boolean method29225() {
      return this.field35845.isDone();
   }

   @Override
   public boolean method29226() {
      return this.field35846.isDone();
   }

   @Override
   public void method29227() {
      if (this.field35846.isCompletedExceptionally()) {
         this.field35846.join();
      }
   }

   // $VF: synthetic method
   public static Set method29235(Class8337 var0) {
      return var0.field35847;
   }
}
