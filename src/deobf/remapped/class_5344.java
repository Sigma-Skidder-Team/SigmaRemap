package remapped;

import com.mojang.datafixers.util.Either;
import it.unimi.dsi.fastutil.shorts.ShortArraySet;
import it.unimi.dsi.fastutil.shorts.ShortSet;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReferenceArray;
import javax.annotation.Nullable;

public class class_5344 {
   private static String[] field_27248;
   public static final Either<class_5990, class_1361> field_27249 = Either.right(class_1361.field_7411);
   public static final CompletableFuture<Either<class_5990, class_1361>> field_27257 = CompletableFuture.<Either<class_5990, class_1361>>completedFuture(
      field_27249
   );
   public static final Either<class_2654, class_1361> field_27243 = Either.right(class_1361.field_7411);
   private static final CompletableFuture<Either<class_2654, class_1361>> field_27254 = CompletableFuture.<Either<class_2654, class_1361>>completedFuture(
      field_27243
   );
   private static final List<class_7335> field_27260 = class_7335.method_33456();
   private static final class_7581[] field_27245 = class_7581.values();
   private final AtomicReferenceArray<CompletableFuture<Either<class_5990, class_1361>>> field_27246 = new AtomicReferenceArray<CompletableFuture<Either<class_5990, class_1361>>>(
      field_27260.size()
   );
   private volatile CompletableFuture<Either<class_2654, class_1361>> field_27251 = field_27254;
   private volatile CompletableFuture<Either<class_2654, class_1361>> field_27258 = field_27254;
   private volatile CompletableFuture<Either<class_2654, class_1361>> field_27261 = field_27254;
   private CompletableFuture<class_5990> field_27242 = CompletableFuture.<class_5990>completedFuture((class_5990)null);
   private int field_27250;
   private int field_27239;
   private int field_27255;
   private final class_2034 field_27256;
   private boolean field_27241;
   private final ShortSet[] field_27263 = new ShortSet[16];
   private int field_27247;
   private int field_27262;
   private final class_4663 field_27252;
   private final class_4568 field_27240;
   private final class_6510 field_27253;
   private boolean field_27259;
   private boolean field_27244;

   public class_5344(class_2034 var1, int var2, class_4663 var3, class_4568 var4, class_6510 var5) {
      this.field_27256 = var1;
      this.field_27252 = var3;
      this.field_27240 = var4;
      this.field_27253 = var5;
      this.field_27250 = class_916.field_4710 + 1;
      this.field_27239 = this.field_27250;
      this.field_27255 = this.field_27250;
      this.method_24340(var2);
   }

   public CompletableFuture<Either<class_5990, class_1361>> method_24347(class_7335 var1) {
      CompletableFuture var4 = this.field_27246.get(var1.method_33445());
      return var4 != null ? var4 : field_27257;
   }

   public CompletableFuture<Either<class_5990, class_1361>> method_24338(class_7335 var1) {
      return !method_24363(this.field_27239).method_33453(var1) ? field_27257 : this.method_24347(var1);
   }

   public CompletableFuture<Either<class_2654, class_1361>> method_24350() {
      return this.field_27258;
   }

   public CompletableFuture<Either<class_2654, class_1361>> method_24353() {
      return this.field_27261;
   }

   public CompletableFuture<Either<class_2654, class_1361>> method_24361() {
      return this.field_27251;
   }

   @Nullable
   public class_2654 method_24349() {
      CompletableFuture var3 = this.method_24350();
      Either var4 = (Either)var3.getNow((Either)null);
      return var4 != null ? (class_2654)var4.left().orElse((class_2654)null) : null;
   }

   @Nullable
   public class_7335 method_24365() {
      for (int var3 = field_27260.size() - 1; var3 >= 0; var3--) {
         class_7335 var4 = field_27260.get(var3);
         CompletableFuture var5 = this.method_24347(var4);
         if (var5.getNow(field_27249).left().isPresent()) {
            return var4;
         }
      }

      return null;
   }

   @Nullable
   public class_5990 method_24351() {
      for (int var3 = field_27260.size() - 1; var3 >= 0; var3--) {
         class_7335 var4 = field_27260.get(var3);
         CompletableFuture var5 = this.method_24347(var4);
         if (!var5.isCompletedExceptionally()) {
            Optional var6 = var5.getNow(field_27249).left();
            if (var6.isPresent()) {
               return (class_5990)var6.get();
            }
         }
      }

      return null;
   }

   public CompletableFuture<class_5990> method_24343() {
      return this.field_27242;
   }

   public void method_24357(class_1331 var1) {
      class_2654 var4 = this.method_24349();
      if (var4 != null) {
         byte var5 = (byte)class_6979.method_31915(var1.method_12165());
         if (this.field_27263[var5] == null) {
            this.field_27241 = true;
            this.field_27263[var5] = new ShortArraySet();
         }

         this.field_27263[var5].add(class_6979.method_31909(var1));
      }
   }

   public void method_24355(class_2957 var1, int var2) {
      class_2654 var5 = this.method_24349();
      if (var5 != null) {
         var5.method_27361(true);
         if (var1 != class_2957.field_14437) {
            this.field_27247 |= 1 << var2 - -1;
         } else {
            this.field_27262 |= 1 << var2 - -1;
         }
      }
   }

   public void method_24342(class_2654 var1) {
      if (this.field_27241 || this.field_27262 != 0 || this.field_27247 != 0) {
         class_6486 var4 = var1.method_11997();
         int var5 = 0;

         for (int var6 = 0; var6 < this.field_27263.length; var6++) {
            var5 += this.field_27263[var6] == null ? 0 : this.field_27263[var6].size();
         }

         this.field_27244 |= var5 >= 64;
         if (this.field_27262 != 0 || this.field_27247 != 0) {
            this.method_24348(new class_4234(var1.method_27352(), this.field_27252, this.field_27262, this.field_27247, true), !this.field_27244);
            this.field_27262 = 0;
            this.field_27247 = 0;
         }

         for (int var11 = 0; var11 < this.field_27263.length; var11++) {
            ShortSet var7 = this.field_27263[var11];
            if (var7 != null) {
               class_6979 var8 = class_6979.method_31922(var1.method_27352(), var11);
               if (var7.size() != 1) {
                  class_1315 var9 = var1.method_27349()[var8.method_12165()];
                  class_4467 var10 = new class_4467(var8, var7, var9, this.field_27244);
                  this.method_24348(var10, false);
                  var10.method_20730((var2, var3) -> this.method_24341(var4, var2, var3));
               } else {
                  class_1331 var12 = var8.method_31904(var7.iterator().nextShort());
                  class_2522 var13 = var4.method_28262(var12);
                  this.method_24348(new class_4267(var12, var13), false);
                  this.method_24341(var4, var12, var13);
               }

               this.field_27263[var11] = null;
            }
         }

         this.field_27241 = false;
      }
   }

   private void method_24341(class_6486 var1, class_1331 var2, class_2522 var3) {
      if (var3.method_8360().method_10802()) {
         this.method_24359(var1, var2);
      }
   }

   private void method_24359(class_6486 var1, class_1331 var2) {
      class_3757 var5 = var1.method_28260(var2);
      if (var5 != null) {
         class_5029 var6 = var5.method_17413();
         if (var6 != null) {
            this.method_24348(var6, false);
         }
      }
   }

   private void method_24348(class_6310<?> var1, boolean var2) {
      this.field_27253.method_29664(this.field_27256, var2).forEach(var1x -> var1x.field_47794.method_4156(var1));
   }

   public CompletableFuture<Either<class_5990, class_1361>> method_24354(class_7335 var1, class_916 var2) {
      int var5 = var1.method_33445();
      CompletableFuture var6 = this.field_27246.get(var5);
      if (var6 != null) {
         Either var7 = (Either)var6.getNow((Either)null);
         if (var7 == null || var7.left().isPresent()) {
            return var6;
         }
      }

      if (!method_24363(this.field_27239).method_33453(var1)) {
         return var6 != null ? var6 : field_27257;
      } else {
         CompletableFuture var8 = var2.method_4019(this, var1);
         this.method_24364(var8);
         this.field_27246.set(var5, var8);
         return var8;
      }
   }

   private void method_24364(CompletableFuture<? extends Either<? extends class_5990, class_1361>> var1) {
      this.field_27242 = this.field_27242.<Either, class_5990>thenCombine(var1, (var0, var1x) -> (class_5990)var1x.map(var0x -> var0x, var1xx -> var0));
   }

   public class_7581 method_24360() {
      return method_24358(this.field_27239);
   }

   public class_2034 method_24368() {
      return this.field_27256;
   }

   public int method_24367() {
      return this.field_27239;
   }

   public int method_24345() {
      return this.field_27255;
   }

   private void method_24362(int var1) {
      this.field_27255 = var1;
   }

   public void method_24340(int var1) {
      this.field_27239 = var1;
   }

   public void method_24344(class_916 var1) {
      class_7335 var4 = method_24363(this.field_27250);
      class_7335 var5 = method_24363(this.field_27239);
      boolean var6 = this.field_27250 <= class_916.field_4710;
      boolean var7 = this.field_27239 <= class_916.field_4710;
      class_7581 var8 = method_24358(this.field_27250);
      class_7581 var9 = method_24358(this.field_27239);
      if (var6) {
         Either var10 = Either.right(new class_6319(this));

         for (int var11 = !var7 ? 0 : var5.method_33445() + 1; var11 <= var4.method_33445(); var11++) {
            CompletableFuture var12 = this.field_27246.get(var11);
            if (var12 == null) {
               this.field_27246.set(var11, CompletableFuture.<Either<class_5990, class_1361>>completedFuture(var10));
            } else {
               var12.complete(var10);
            }
         }
      }

      boolean var16 = var8.method_34447(class_7581.field_38630);
      boolean var17 = var9.method_34447(class_7581.field_38630);
      this.field_27259 |= var17;
      if (!var16 && var17) {
         this.field_27251 = var1.method_3978(this);
         this.method_24364(this.field_27251);
      }

      if (var16 && !var17) {
         CompletableFuture var18 = this.field_27251;
         this.field_27251 = field_27254;
         this.method_24364(var18.thenApply(var1x -> var1x.ifLeft(var1::method_4024)));
      }

      boolean var19 = var8.method_34447(class_7581.field_38632);
      boolean var13 = var9.method_34447(class_7581.field_38632);
      if (!var19 && var13) {
         this.field_27258 = var1.method_4000(this);
         this.method_24364(this.field_27258);
      }

      if (var19 && !var13) {
         this.field_27258.complete(field_27243);
         this.field_27258 = field_27254;
      }

      boolean var14 = var8.method_34447(class_7581.field_38627);
      boolean var15 = var9.method_34447(class_7581.field_38627);
      if (!var14 && var15) {
         if (this.field_27261 != field_27254) {
            throw (IllegalStateException) Util.method_44658(new IllegalStateException());
         }

         this.field_27261 = var1.method_3989(this.field_27256);
         this.method_24364(this.field_27261);
      }

      if (var14 && !var15) {
         this.field_27261.complete(field_27243);
         this.field_27261 = field_27254;
      }

      this.field_27240.method_21208(this.field_27256, this::method_24345, this.field_27239, this::method_24362);
      this.field_27250 = this.field_27239;
   }

   public static class_7335 method_24363(int var0) {
      return var0 >= 33 ? class_7335.method_33444(var0 - 33) : class_7335.field_37514;
   }

   public static class_7581 method_24358(int var0) {
      return field_27245[class_9299.method_42829(33 - var0 + 1, 0, field_27245.length - 1)];
   }

   public boolean method_24352() {
      return this.field_27259;
   }

   public void method_24366() {
      this.field_27259 = method_24358(this.field_27239).method_34447(class_7581.field_38630);
   }

   public void method_24356(class_2711 var1) {
      for (int var4 = 0; var4 < this.field_27246.length(); var4++) {
         CompletableFuture var5 = this.field_27246.get(var4);
         if (var5 != null) {
            Optional var6 = var5.getNow(field_27249).left();
            if (var6.isPresent() && var6.get() instanceof class_7481) {
               this.field_27246.set(var4, CompletableFuture.<Either<class_5990, class_1361>>completedFuture(Either.left(var1)));
            }
         }
      }

      this.method_24364(CompletableFuture.completedFuture(Either.left(var1.method_12212())));
   }
}
