package mapped;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Either;
import java.io.File;
import java.io.IOException;
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

public class Class1703 extends Class1702 {
   private static final List<Class9176> field9272 = Class9176.method34292();
   private final Class9307 field9273;
   private final Class5646 field9274;
   private final ServerWorld field9275;
   private final Thread field9276;
   private final Class195 field9277;
   private final Class320 field9278;
   public final Class1649 field9279;
   private final Class8250 field9280;
   private long field9281;
   private boolean field9282 = true;
   private boolean field9283 = true;
   private final long[] field9284 = new long[4];
   private final Class9176[] field9285 = new Class9176[4];
   private final Class1670[] field9286 = new Class1670[4];
   private Class7307 field9287;

   public Class1703(
      ServerWorld var1,
      Class1814 var2,
      DataFixer var3,
      Class8761 var4,
      Executor var5,
      Class5646 var6,
      int var7,
      boolean var8,
      Class7243 var9,
      Supplier<Class8250> var10
   ) {
      this.field9275 = var1;
      this.field9278 = new Class320(this, var1);
      this.field9274 = var6;
      this.field9276 = Thread.currentThread();
      File var13 = var2.method7992(var1.method6813());
      File var14 = new File(var13, "data");
      var14.mkdirs();
      this.field9280 = new Class8250(var14, var3);
      this.field9279 = new Class1649(var1, var2, var3, var4, var5, this.field9278, this, this.method7370(), var9, var10, var7, var8);
      this.field9277 = this.field9279.method6537();
      this.field9273 = this.field9279.method6566();
      this.method7357();
   }

   public Class195 method7348() {
      return this.field9277;
   }

   @Nullable
   private Class8641 method7354(long var1) {
      return this.field9279.method6539(var1);
   }

   public int method7355() {
      return this.field9279.method6560();
   }

   private void method7356(long var1, Class1670 var3, Class9176 var4) {
      for (int var7 = 3; var7 > 0; var7--) {
         this.field9284[var7] = this.field9284[var7 - 1];
         this.field9285[var7] = this.field9285[var7 - 1];
         this.field9286[var7] = this.field9286[var7 - 1];
      }

      this.field9284[0] = var1;
      this.field9285[0] = var4;
      this.field9286[0] = var3;
   }

   @Nullable
   @Override
   public Class1670 method7346(int var1, int var2, Class9176 var3, boolean var4) {
      if (Thread.currentThread() != this.field9276) {
         return CompletableFuture.<Class1670>supplyAsync(() -> this.method7346(var1, var2, var3, var4), this.field9278).join();
      } else {
         Class7165 var7 = this.field9275.method6820();
         var7.method22508("getChunk");
         long var8 = Class7481.method24353(var1, var2);

         for (int var10 = 0; var10 < 4; var10++) {
            if (var8 == this.field9284[var10] && var3 == this.field9285[var10]) {
               Class1670 var11 = this.field9286[var10];
               if (var11 != null || !var4) {
                  return var11;
               }
            }
         }

         var7.method22508("getChunkCacheMiss");
         CompletableFuture var12 = this.method7359(var1, var2, var3, var4);
         this.field9278.method1639(var12::isDone);
         Class1670 var13 = (Class1670)((Either)var12.join()).map(var0 -> var0, var1x -> {
            if (!var4) {
               return null;
            } else {
               throw (IllegalStateException) Util.method38516(new IllegalStateException("Chunk not there when requested: " + var1x));
            }
         });
         this.method7356(var8, var13, var3);
         return var13;
      }
   }

   @Nullable
   @Override
   public Class1674 method7343(int var1, int var2) {
      if (Thread.currentThread() == this.field9276) {
         this.field9275.method6820().method22508("getChunkNow");
         long var5 = Class7481.method24353(var1, var2);

         for (int var7 = 0; var7 < 4; var7++) {
            if (var5 == this.field9284[var7] && this.field9285[var7] == Class9176.field42145) {
               Class1670 var8 = this.field9286[var7];
               return !(var8 instanceof Class1674) ? null : (Class1674)var8;
            }
         }

         Class8641 var10 = this.method7354(var5);
         if (var10 != null) {
            Either var11 = var10.method31039(Class9176.field42145).getNow((Either<Class1670, Class7022>)null);
            if (var11 != null) {
               Class1670 var9 = (Class1670)var11.left().orElse((Class1670)null);
               if (var9 != null) {
                  this.method7356(var5, var9, Class9176.field42145);
                  if (var9 instanceof Class1674) {
                     return (Class1674)var9;
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

   private void method7357() {
      Arrays.fill(this.field9284, Class7481.field32173);
      Arrays.fill(this.field9285, null);
      Arrays.fill(this.field9286, null);
   }

   public CompletableFuture<Either<Class1670, Class7022>> method7358(int var1, int var2, Class9176 var3, boolean var4) {
      boolean var7 = Thread.currentThread() == this.field9276;
      CompletableFuture var8;
      if (!var7) {
         var8 = CompletableFuture.<CompletableFuture<Either<Class1670, Class7022>>>supplyAsync(() -> this.method7359(var1, var2, var3, var4), this.field9278)
            .<Either<Class1670, Class7022>>thenCompose(var0 -> (CompletionStage<Either<Class1670, Class7022>>)var0);
      } else {
         var8 = this.method7359(var1, var2, var3, var4);
         this.field9278.method1639(var8::isDone);
      }

      return var8;
   }

   private CompletableFuture<Either<Class1670, Class7022>> method7359(int var1, int var2, Class9176 var3, boolean var4) {
      Class7481 var7 = new Class7481(var1, var2);
      long var8 = var7.method24352();
      int var10 = 33 + Class9176.method34296(var3);
      Class8641 var11 = this.method7354(var8);
      if (var4) {
         this.field9273.method35128(Class8561.field38487, var7, var10, var7);
         if (this.method7360(var11, var10)) {
            Class7165 var12 = this.field9275.method6820();
            var12.method22503("chunkLoad");
            this.method7363();
            var11 = this.method7354(var8);
            var12.method22505();
            if (this.method7360(var11, var10)) {
               throw (IllegalStateException) Util.method38516(new IllegalStateException("No chunk holder after ticket has been added"));
            }
         }
      }

      return !this.method7360(var11, var10) ? var11.method31053(var3, this.field9279) : Class8641.field38894;
   }

   private boolean method7360(Class8641 var1, int var2) {
      return var1 == null || var1.method31057() > var2;
   }

   @Override
   public boolean method7345(int var1, int var2) {
      Class8641 var5 = this.method7354(new Class7481(var1, var2).method24352());
      int var6 = 33 + Class9176.method34296(Class9176.field42145);
      return !this.method7360(var5, var6);
   }

   @Override
   public Class1665 method7344(int var1, int var2) {
      long var5 = Class7481.method24353(var1, var2);
      Class8641 var7 = this.method7354(var5);
      if (var7 != null) {
         int var8 = field9272.size() - 1;

         while (true) {
            Class9176 var9 = field9272.get(var8);
            Optional var10 = var7.method31038(var9).getNow(Class8641.field38893).left();
            if (var10.isPresent()) {
               return (Class1665)var10.get();
            }

            if (var9 == Class9176.field42142.method34299()) {
               return null;
            }

            var8--;
         }
      } else {
         return null;
      }
   }

   public Class1655 method7386() {
      return this.field9275;
   }

   public boolean method7362() {
      return this.field9278.method1302();
   }

   private boolean method7363() {
      boolean var3 = this.field9273.method35125(this.field9279);
      boolean var4 = this.field9279.method6549();
      if (!var3 && !var4) {
         return false;
      } else {
         this.method7357();
         return true;
      }
   }

   @Override
   public boolean method7351(Entity var1) {
      long var4 = Class7481.method24353(MathHelper.method37769(var1.getPosX()) >> 4, MathHelper.method37769(var1.getPosZ()) >> 4);
      return this.method7364(var4, Class8641::method31041);
   }

   @Override
   public boolean method7352(Class7481 var1) {
      return this.method7364(var1.method24352(), Class8641::method31041);
   }

   @Override
   public boolean method7353(BlockPos var1) {
      long var4 = Class7481.method24353(var1.method8304() >> 4, var1.method8306() >> 4);
      return this.method7364(var4, Class8641::method31040);
   }

   private boolean method7364(long var1, Function<Class8641, CompletableFuture<Either<Class1674, Class7022>>> var3) {
      Class8641 var6 = this.method7354(var1);
      if (var6 != null) {
         Either<Class1674, Class7022> var7 = var3.apply(var6).getNow(Class8641.field38895);
         return var7.left().isPresent();
      } else {
         return false;
      }
   }

   public void method7365(boolean var1) {
      this.method7363();
      this.field9279.method6545(var1);
   }

   @Override
   public void close() throws IOException {
      this.method7365(true);
      this.field9277.close();
      this.field9279.close();
   }

   public void method7366(BooleanSupplier var1) {
      this.field9275.method6820().method22503("purge");
      this.field9273.method35123();
      this.method7363();
      this.field9275.method6820().method22506("chunks");
      this.method7367();
      this.field9275.method6820().method22506("unload");
      this.field9279.method6546(var1);
      this.field9275.method6820().method22505();
      this.method7357();
   }

   private void method7367() {
      long var3 = this.field9275.method6783();
      long var5 = var3 - this.field9281;
      this.field9281 = var3;
      Class6612 var7 = this.field9275.method6788();
      boolean var8 = this.field9275.method6823();
      boolean var9 = this.field9275.method6789().method17135(Class5462.field24226);
      if (!var8) {
         this.field9275.method6820().method22503("pollingChunks");
         int var10 = this.field9275.method6789().method17136(Class5462.field24235);
         boolean var11 = var7.method20033() % 400L == 0L;
         this.field9275.method6820().method22503("naturalSpawnCount");
         int var12 = this.field9273.method35138();
         Class7307 var13 = Class8170.method28415(var12, this.field9275.method6965(), this::method7368);
         this.field9287 = var13;
         this.field9275.method6820().method22505();
         List<Class8641> var14 = Lists.newArrayList(this.field9279.method6567());
         Collections.shuffle(var14);
         var14.forEach(var7x -> {
            Optional<Class1674> var10x = var7x.method31040().getNow(Class8641.field38895).left();
            if (var10x.isPresent()) {
               this.field9275.method6820().method22503("broadcast");
               var7x.method31049(var10x.get());
               this.field9275.method6820().method22505();
               Optional<Class1674> var11x = var7x.method31041().getNow(Class8641.field38895).left();
               if (var11x.isPresent()) {
                  Class1674 var12x = var11x.get();
                  Class7481 var13x = var7x.method31056();
                  if (!this.field9279.method6571(var13x)) {
                     var12x.method7092(var12x.method7093() + var5);
                     if (var9 && (this.field9282 || this.field9283) && this.field9275.method6810().method24524(var12x.method7072())) {
                        Class8170.method28417(this.field9275, var12x, var13, this.field9283, this.field9282, var11);
                     }

                     this.field9275.method6899(var12x, var10);
                  }
               }
            }
         });
         this.field9275.method6820().method22503("customSpawners");
         if (var9) {
            this.field9275.method6897(this.field9282, this.field9283);
         }

         this.field9275.method6820().method22505();
         this.field9275.method6820().method22505();
      }

      this.field9279.method6579();
   }

   private void method7368(long var1, Consumer<Class1674> var3) {
      Class8641 var6 = this.method7354(var1);
      if (var6 != null) {
         var6.method31042().getNow(Class8641.field38895).left().ifPresent(var3);
      }
   }

   @Override
   public String method7347() {
      return "ServerChunkCache: " + this.method7371();
   }

   @VisibleForTesting
   public int method7369() {
      return this.field9278.method1630();
   }

   public Class5646 method7370() {
      return this.field9274;
   }

   public int method7371() {
      return this.field9279.method6565();
   }

   public void method7372(BlockPos var1) {
      int var4 = var1.method8304() >> 4;
      int var5 = var1.method8306() >> 4;
      Class8641 var6 = this.method7354(Class7481.method24353(var4, var5));
      if (var6 != null) {
         var6.method31047(var1);
      }
   }

   @Override
   public void method7373(Class1977 var1, Class2002 var2) {
      this.field9278.execute(() -> {
         Class8641 var5 = this.method7354(var2.method8423().method24352());
         if (var5 != null) {
            var5.method31048(var1, var2.method8411());
         }
      });
   }

   public <T> void method7374(Class8561<T> var1, Class7481 var2, int var3, T var4) {
      this.field9273.method35130(var1, var2, var3, var4);
   }

   public <T> void method7375(Class8561<T> var1, Class7481 var2, int var3, T var4) {
      this.field9273.method35131(var1, var2, var3, var4);
   }

   @Override
   public void method7350(Class7481 var1, boolean var2) {
      this.field9273.method35133(var1, var2);
   }

   public void method7376(Class878 var1) {
      this.field9279.method6575(var1);
   }

   public void method7377(Entity var1) {
      this.field9279.method6578(var1);
   }

   public void method7378(Entity var1) {
      this.field9279.method6577(var1);
   }

   public void method7379(Entity var1, Packet<?> var2) {
      this.field9279.method6581(var1, var2);
   }

   public void method7380(Entity var1, Packet<?> var2) {
      this.field9279.method6580(var1, var2);
   }

   public void method7381(int var1) {
      this.field9279.method6563(var1);
   }

   @Override
   public void method7349(boolean var1, boolean var2) {
      this.field9282 = var1;
      this.field9283 = var2;
   }

   public String method7382(Class7481 var1) {
      return this.field9279.method6541(var1);
   }

   public Class8250 method7383() {
      return this.field9280;
   }

   public Class1653 method7384() {
      return this.field9279.method6583();
   }

   @Nullable
   public Class7307 method7385() {
      return this.field9287;
   }

   // $VF: synthetic method
   public static Thread method7394(Class1703 var0) {
      return var0.field9276;
   }

   // $VF: synthetic method
   public static ServerWorld method7395(Class1703 var0) {
      return var0.field9275;
   }

   // $VF: synthetic method
   public static boolean method7396(Class1703 var0) {
      return var0.method7363();
   }

   // $VF: synthetic method
   public static Class195 method7397(Class1703 var0) {
      return var0.field9277;
   }
}
