package remapped;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Either;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class class_2206 extends class_3232 {
   private static final List<class_7335> field_10932 = class_7335.method_33456();
   private final class_9263 field_10943;
   private final class_6541 field_10941;
   private final class_6331 field_10944;
   private final Thread field_10935;
   private final class_2087 field_10939;
   private final class_2616 field_10942;
   public final class_916 field_10934;
   private final class_4050 field_10936;
   private long field_10940;
   private boolean field_10945 = true;
   private boolean field_10946 = true;
   private final long[] field_10933 = new long[4];
   private final class_7335[] field_10938 = new class_7335[4];
   private final class_5990[] field_10930 = new class_5990[4];
   private class_1728 field_10931;

   public class_2206(
      class_6331 var1,
      class_3676 var2,
      DataFixer var3,
      class_5799 var4,
      Executor var5,
      class_6541 var6,
      int var7,
      boolean var8,
      class_1870 var9,
      Supplier<class_4050> var10
   ) {
      this.field_10944 = var1;
      this.field_10942 = new class_2616(this, var1, null);
      this.field_10941 = var6;
      this.field_10935 = Thread.currentThread();
      File var13 = var2.method_17068(var1.method_29545());
      File var14 = new File(var13, "data");
      var14.mkdirs();
      this.field_10936 = new class_4050(var14, var3);
      this.field_10934 = new class_916(var1, var2, var3, var4, var5, this.field_10942, this, this.method_10189(), var9, var10, var7, var8);
      this.field_10939 = this.field_10934.method_4005();
      this.field_10943 = this.field_10934.method_3996();
      this.method_10198();
   }

   public class_2087 method_10175() {
      return this.field_10939;
   }

   @Nullable
   private class_5344 method_10194(long var1) {
      return this.field_10934.method_4023(var1);
   }

   public int method_10207() {
      return this.field_10934.method_3987();
   }

   private void method_10183(long var1, class_5990 var3, class_7335 var4) {
      for (int var7 = 3; var7 > 0; var7--) {
         this.field_10933[var7] = this.field_10933[var7 - 1];
         this.field_10938[var7] = this.field_10938[var7 - 1];
         this.field_10930[var7] = this.field_10930[var7 - 1];
      }

      this.field_10933[0] = var1;
      this.field_10938[0] = var4;
      this.field_10930[0] = var3;
   }

   @Nullable
   @Override
   public class_5990 method_14819(int var1, int var2, class_7335 var3, boolean var4) {
      if (Thread.currentThread() != this.field_10935) {
         return CompletableFuture.<class_5990>supplyAsync(() -> this.method_14819(var1, var2, var3, var4), this.field_10942).join();
      } else {
         class_3492 var7 = this.field_10944.method_29599();
         var7.method_16055("getChunk");
         long var8 = class_2034.method_9540(var1, var2);

         for (int var10 = 0; var10 < 4; var10++) {
            if (var8 == this.field_10933[var10] && var3 == this.field_10938[var10]) {
               class_5990 var11 = this.field_10930[var10];
               if (var11 != null || !var4) {
                  return var11;
               }
            }
         }

         var7.method_16055("getChunkCacheMiss");
         CompletableFuture var12 = this.method_10204(var1, var2, var3, var4);
         this.field_10942.method_34461(var12::isDone);
         class_5990 var13 = (class_5990)((Either)var12.join()).map(var0 -> var0, var1x -> {
            if (!var4) {
               return null;
            } else {
               throw (IllegalStateException) Util.method_44658(new IllegalStateException("Chunk not there when requested: " + var1x));
            }
         });
         this.method_10183(var8, var13, var3);
         return var13;
      }
   }

   @Nullable
   @Override
   public class_2654 method_14822(int var1, int var2) {
      if (Thread.currentThread() == this.field_10935) {
         this.field_10944.method_29599().method_16055("getChunkNow");
         long var5 = class_2034.method_9540(var1, var2);

         for (int var7 = 0; var7 < 4; var7++) {
            if (var5 == this.field_10933[var7] && this.field_10938[var7] == class_7335.field_37514) {
               class_5990 var8 = this.field_10930[var7];
               return !(var8 instanceof class_2654) ? null : (class_2654)var8;
            }
         }

         class_5344 var10 = this.method_10194(var5);
         if (var10 != null) {
            Either var11 = var10.method_24338(class_7335.field_37514).getNow((Either<class_5990, class_1361>)null);
            if (var11 != null) {
               class_5990 var9 = (class_5990)var11.left().orElse((class_5990)null);
               if (var9 != null) {
                  this.method_10183(var5, var9, class_7335.field_37514);
                  if (var9 instanceof class_2654) {
                     return (class_2654)var9;
                  }
               }

               return null;
            } else {
               return null;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private void method_10198() {
      Arrays.fill(this.field_10933, class_2034.field_10326);
      Arrays.fill(this.field_10938, null);
      Arrays.fill(this.field_10930, null);
   }

   public CompletableFuture<Either<class_5990, class_1361>> method_10187(int var1, int var2, class_7335 var3, boolean var4) {
      boolean var7 = Thread.currentThread() == this.field_10935;
      CompletableFuture var8;
      if (!var7) {
         var8 = CompletableFuture.<CompletableFuture<Either<class_5990, class_1361>>>supplyAsync(
               () -> this.method_10204(var1, var2, var3, var4), this.field_10942
            )
            .<Either<class_5990, class_1361>>thenCompose(var0 -> (CompletionStage<Either<class_5990, class_1361>>)var0);
      } else {
         var8 = this.method_10204(var1, var2, var3, var4);
         this.field_10942.method_34461(var8::isDone);
      }

      return var8;
   }

   private CompletableFuture<Either<class_5990, class_1361>> method_10204(int var1, int var2, class_7335 var3, boolean var4) {
      class_2034 var7 = new class_2034(var1, var2);
      long var8 = var7.method_9539();
      int var10 = 33 + class_7335.method_33455(var3);
      class_5344 var11 = this.method_10194(var8);
      if (var4) {
         this.field_10943.method_42699(class_5032.field_26024, var7, var10, var7);
         if (this.method_10181(var11, var10)) {
            class_3492 var12 = this.field_10944.method_29599();
            var12.startSection("chunkLoad");
            this.method_10202();
            var11 = this.method_10194(var8);
            var12.endSection();
            if (this.method_10181(var11, var10)) {
               throw (IllegalStateException) Util.method_44658(new IllegalStateException("No chunk holder after ticket has been added"));
            }
         }
      }

      return !this.method_10181(var11, var10) ? var11.method_24354(var3, this.field_10934) : class_5344.field_27257;
   }

   private boolean method_10181(class_5344 var1, int var2) {
      return var1 == null || var1.method_24367() > var2;
   }

   @Override
   public boolean method_14816(int var1, int var2) {
      class_5344 var5 = this.method_10194(new class_2034(var1, var2).method_9539());
      int var6 = 33 + class_7335.method_33455(class_7335.field_37514);
      return !this.method_10181(var5, var6);
   }

   @Override
   public class_6163 method_23025(int var1, int var2) {
      long var5 = class_2034.method_9540(var1, var2);
      class_5344 var7 = this.method_10194(var5);
      if (var7 != null) {
         int var8 = field_10932.size() - 1;

         while (true) {
            class_7335 var9 = field_10932.get(var8);
            Optional var10 = var7.method_24347(var9).getNow(class_5344.field_27249).left();
            if (var10.isPresent()) {
               return (class_6163)var10.get();
            }

            if (var9 == class_7335.field_37512.method_33448()) {
               return null;
            }

            var8--;
         }
      } else {
         return null;
      }
   }

   public World method_10205() {
      return this.field_10944;
   }

   public boolean method_10191() {
      return this.field_10942.method_34453();
   }

   private boolean method_10202() {
      boolean var3 = this.field_10943.method_42683(this.field_10934);
      boolean var4 = this.field_10934.method_3993();
      if (!var3 && !var4) {
         return false;
      } else {
         this.method_10198();
         return true;
      }
   }

   @Override
   public boolean method_14824(Entity var1) {
      long var4 = class_2034.method_9540(MathHelper.floor(var1.getPosX()) >> 4, MathHelper.floor(var1.getPosZ()) >> 4);
      return this.method_10208(var4, class_5344::method_24353);
   }

   @Override
   public boolean method_14823(class_2034 var1) {
      return this.method_10208(var1.method_9539(), class_5344::method_24353);
   }

   @Override
   public boolean method_14815(BlockPos var1) {
      long var4 = class_2034.method_9540(var1.getX() >> 4, var1.getZ() >> 4);
      return this.method_10208(var4, class_5344::method_24350);
   }

   private boolean method_10208(long var1, Function<class_5344, CompletableFuture<Either<class_2654, class_1361>>> var3) {
      class_5344 var6 = this.method_10194(var1);
      if (var6 != null) {
         Either var7 = ((CompletableFuture)var3.apply(var6)).getNow(class_5344.field_27243);
         return var7.left().isPresent();
      } else {
         return false;
      }
   }

   public void method_10197(boolean var1) {
      this.method_10202();
      this.field_10934.method_4007(var1);
   }

   @Override
   public void close() throws IOException {
      this.method_10197(true);
      this.field_10939.close();
      this.field_10934.close();
   }

   public void method_10174(BooleanSupplier var1) {
      this.field_10944.method_29599().startSection("purge");
      this.field_10943.method_42708();
      this.method_10202();
      this.field_10944.method_29599().method_16050("chunks");
      this.method_10201();
      this.field_10944.method_29599().method_16050("unload");
      this.field_10934.method_3997(var1);
      this.field_10944.method_29599().endSection();
      this.method_10198();
   }

   private void method_10201() {
      long var3 = this.field_10944.method_29546();
      long var5 = var3 - this.field_10940;
      this.field_10940 = var3;
      class_1906 var7 = this.field_10944.method_43366();
      boolean var8 = this.field_10944.method_29581();
      boolean var9 = this.field_10944.getGameRules().getBoolean(GameRules.DO_MOB_SPAWNING);
      if (!var8) {
         this.field_10944.method_29599().startSection("pollingChunks");
         int var10 = this.field_10944.getGameRules().method_1295(GameRules.RANDOM_TICK_SPEED);
         boolean var11 = var7.method_8658() % 400L == 0L;
         this.field_10944.method_29599().startSection("naturalSpawnCount");
         int var12 = this.field_10943.method_42677();
         class_1728 var13 = class_3815.method_17773(var12, this.field_10944.method_28938(), this::method_10196);
         this.field_10931 = var13;
         this.field_10944.method_29599().endSection();
         ArrayList var14 = Lists.newArrayList(this.field_10934.method_3988());
         Collections.shuffle(var14);
         var14.forEach(var7x -> {
            Optional var10x = var7x.method_24350().getNow(class_5344.field_27243).left();
            if (var10x.isPresent()) {
               this.field_10944.method_29599().startSection("broadcast");
               var7x.method_24342((class_2654)var10x.get());
               this.field_10944.method_29599().endSection();
               Optional var11x = var7x.method_24353().getNow(class_5344.field_27243).left();
               if (var11x.isPresent()) {
                  class_2654 var12x = (class_2654)var11x.get();
                  class_2034 var13x = var7x.method_24368();
                  if (!this.field_10934.method_4018(var13x)) {
                     var12x.method_27369(var12x.method_27340() + var5);
                     if (var9 && (this.field_10945 || this.field_10946) && this.field_10944.method_6673().method_9814(var12x.method_27352())) {
                        class_3815.method_17763(this.field_10944, var12x, var13, this.field_10946, this.field_10945, var11);
                     }

                     this.field_10944.method_28929(var12x, var10);
                  }
               }
            }
         });
         this.field_10944.method_29599().startSection("customSpawners");
         if (var9) {
            this.field_10944.method_28942(this.field_10945, this.field_10946);
         }

         this.field_10944.method_29599().endSection();
         this.field_10944.method_29599().endSection();
      }

      this.field_10934.method_4011();
   }

   private void method_10196(long var1, Consumer<class_2654> var3) {
      class_5344 var6 = this.method_10194(var1);
      if (var6 != null) {
         var6.method_24361().getNow(class_5344.field_27243).left().ifPresent(var3);
      }
   }

   @Override
   public String method_14814() {
      return "ServerChunkCache: " + this.method_10188();
   }

   @VisibleForTesting
   public int method_10184() {
      return this.field_10942.method_34451();
   }

   public class_6541 method_10189() {
      return this.field_10941;
   }

   public int method_10188() {
      return this.field_10934.method_3992();
   }

   public void method_10195(BlockPos var1) {
      int var4 = var1.getX() >> 4;
      int var5 = var1.getZ() >> 4;
      class_5344 var6 = this.method_10194(class_2034.method_9540(var4, var5));
      if (var6 != null) {
         var6.method_24357(var1);
      }
   }

   @Override
   public void method_23026(class_2957 var1, class_6979 var2) {
      this.field_10942.execute(() -> {
         class_5344 var5 = this.method_10194(var2.method_31917().method_9539());
         if (var5 != null) {
            var5.method_24355(var1, var2.method_31918());
         }
      });
   }

   public <T> void method_10177(class_5032<T> var1, class_2034 var2, int var3, T var4) {
      this.field_10943.method_42685(var1, var2, var3, var4);
   }

   public <T> void method_10193(class_5032<T> var1, class_2034 var2, int var3, T var4) {
      this.field_10943.method_42680(var1, var2, var3, var4);
   }

   @Override
   public void method_14817(class_2034 var1, boolean var2) {
      this.field_10943.method_42702(var1, var2);
   }

   public void method_10186(class_9359 var1) {
      this.field_10934.method_4017(var1);
   }

   public void method_10203(Entity var1) {
      this.field_10934.method_3990(var1);
   }

   public void method_10180(Entity var1) {
      this.field_10934.method_4021(var1);
   }

   public void method_10209(Entity var1, Packet<?> var2) {
      this.field_10934.method_3974(var1, var2);
   }

   public void method_10200(Entity var1, Packet<?> var2) {
      this.field_10934.method_3973(var1, var2);
   }

   public void method_10199(int var1) {
      this.field_10934.method_3977(var1);
   }

   @Override
   public void method_14821(boolean var1, boolean var2) {
      this.field_10945 = var1;
      this.field_10946 = var2;
   }

   public String method_10190(class_2034 var1) {
      return this.field_10934.method_4001(var1);
   }

   public class_4050 method_10182() {
      return this.field_10936;
   }

   public class_1489 method_10176() {
      return this.field_10934.method_4002();
   }

   @Nullable
   public class_1728 method_10185() {
      return this.field_10931;
   }
}
