package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public class class_7335 {
   private static final EnumSet<class_3801> field_37507 = EnumSet.<class_3801>of(class_3801.field_18591, class_3801.field_18598);
   private static final EnumSet<class_3801> field_37500 = EnumSet.<class_3801>of(
      class_3801.field_18599, class_3801.field_18592, class_3801.field_18595, class_3801.field_18590
   );
   private static final class_7614 field_37511 = (var0, var1, var2, var3, var4, var5) -> {
      if (var5 instanceof class_7481 && !var5.method_27364().method_33453(var0)) {
         ((class_7481)var5).method_34030(var0);
      }

      return CompletableFuture.<Either>completedFuture(Either.left(var5));
   };
   public static final class_7335 field_37504 = method_33462("empty", (class_7335)null, -1, field_37507, class_5592.field_28386, (var0, var1, var2, var3) -> {
   });
   public static final class_7335 field_37491 = method_33457(
      "structure_starts", field_37504, 0, field_37507, class_5592.field_28386, (var0, var1, var2, var3, var4, var5, var6, var7) -> {
         if (!var7.method_27364().method_33453(var0)) {
            if (var1.method_29522().method_1601().method_25703().method_13287()) {
               var2.method_29837(var1.method_2755(), var1.method_28991(), var7, var3, var1.method_3133());
            }

            if (var7 instanceof class_7481) {
               ((class_7481)var7).method_34030(var0);
            }
         }

         return CompletableFuture.<Either>completedFuture(Either.left(var7));
      }
   );
   public static final class_7335 field_37493 = method_33462(
      "structure_references", field_37491, 8, field_37507, class_5592.field_28386, (var0, var1, var2, var3) -> {
         class_702 var6 = new class_702(var0, var2);
         var1.method_29827(var6, var0.method_28991().method_9529(var6), var3);
      }
   );
   public static final class_7335 field_37496 = method_33462(
      "biomes",
      field_37493,
      0,
      field_37507,
      class_5592.field_28386,
      (var0, var1, var2, var3) -> var1.method_29834(var0.method_2755().<class_6325>method_28813(class_8669.field_44359), var3)
   );
   public static final class_7335 field_37515 = method_33462("noise", field_37496, 8, field_37507, class_5592.field_28386, (var0, var1, var2, var3) -> {
      class_702 var6 = new class_702(var0, var2);
      var1.method_29824(var6, var0.method_28991().method_9529(var6), var3);
   });
   public static final class_7335 field_37494 = method_33462(
      "surface", field_37515, 0, field_37507, class_5592.field_28386, (var0, var1, var2, var3) -> var1.method_29814(new class_702(var0, var2), var3)
   );
   public static final class_7335 field_37498 = method_33462(
      "carvers",
      field_37494,
      0,
      field_37507,
      class_5592.field_28386,
      (var0, var1, var2, var3) -> var1.method_29829(var0.method_3133(), var0.getBiomeManager(), var3, class_6033.field_30811)
   );
   public static final class_7335 field_37492 = method_33462(
      "liquid_carvers",
      field_37498,
      0,
      field_37500,
      class_5592.field_28386,
      (var0, var1, var2, var3) -> var1.method_29829(var0.method_3133(), var0.getBiomeManager(), var3, class_6033.field_30813)
   );
   public static final class_7335 field_37499 = method_33457(
      "features", field_37492, 8, field_37500, class_5592.field_28386, (var0, var1, var2, var3, var4, var5, var6, var7) -> {
         class_7481 var10 = (class_7481)var7;
         var10.method_34033(var4);
         if (!var7.method_27364().method_33453(var0)) {
            class_2131.method_9953(var7, EnumSet.<class_3801>of(class_3801.field_18595, class_3801.field_18590, class_3801.field_18599, class_3801.field_18592));
            class_702 var11 = new class_702(var1, var6);
            var2.method_29818(var11, var1.method_28991().method_9529(var11));
            var10.method_34030(var0);
         }

         return CompletableFuture.<Either>completedFuture(Either.left(var7));
      }
   );
   public static final class_7335 field_37512 = method_33458(
      "light",
      field_37499,
      1,
      field_37500,
      class_5592.field_28386,
      (var0, var1, var2, var3, var4, var5, var6, var7) -> method_33450(var0, var4, var7),
      (var0, var1, var2, var3, var4, var5) -> method_33450(var0, var3, var5)
   );
   public static final class_7335 field_37510 = method_33462(
      "spawn", field_37512, 0, field_37500, class_5592.field_28386, (var0, var1, var2, var3) -> var1.method_29815(new class_702(var0, var2))
   );
   public static final class_7335 field_37502 = method_33462("heightmaps", field_37510, 0, field_37500, class_5592.field_28386, (var0, var1, var2, var3) -> {
   });
   public static final class_7335 field_37514 = method_33458(
      "full",
      field_37502,
      0,
      field_37500,
      class_5592.field_28385,
      (var0, var1, var2, var3, var4, var5, var6, var7) -> (CompletableFuture)var5.apply(var7),
      (var0, var1, var2, var3, var4, var5) -> (CompletableFuture)var4.apply(var5)
   );
   private static final List<class_7335> field_37516 = ImmutableList.of(
      field_37514, field_37499, field_37492, field_37491, field_37491, field_37491, field_37491, field_37491, field_37491, field_37491, field_37491
   );
   private static final IntList field_37506 = Util.<IntList>make(new IntArrayList(method_33456().size()), var0 -> {
      int var3 = 0;

      for (int var4 = method_33456().size() - 1; var4 >= 0; var4--) {
         while (var3 + 1 < field_37516.size() && var4 <= field_37516.get(var3 + 1).method_33445()) {
            var3++;
         }

         var0.add(0, var3);
      }
   });
   private final String field_37513;
   private final int field_37501;
   private final class_7335 field_37495;
   private final class_6617 field_37505;
   private final class_7614 field_37508;
   private final int field_37497;
   private final class_5592 field_37490;
   private final EnumSet<class_3801> field_37503;

   private static CompletableFuture<Either<class_5990, class_1361>> method_33450(class_7335 var0, class_2087 var1, class_5990 var2) {
      boolean var5 = method_33449(var0, var2);
      if (!var2.method_27364().method_33453(var0)) {
         ((class_7481)var2).method_34030(var0);
      }

      return var1.method_9762(var2, var5).<Either<class_5990, class_1361>>thenApply(Either::left);
   }

   private static class_7335 method_33462(String var0, class_7335 var1, int var2, EnumSet<class_3801> var3, class_5592 var4, class_1172 var5) {
      return method_33457(var0, var1, var2, var3, var4, var5);
   }

   private static class_7335 method_33457(String var0, class_7335 var1, int var2, EnumSet<class_3801> var3, class_5592 var4, class_6617 var5) {
      return method_33458(var0, var1, var2, var3, var4, var5, field_37511);
   }

   private static class_7335 method_33458(String var0, class_7335 var1, int var2, EnumSet<class_3801> var3, class_5592 var4, class_6617 var5, class_7614 var6) {
      return class_8669.<class_7335>method_39791(class_8669.field_44381, var0, new class_7335(var0, var1, var2, var3, var4, var5, var6));
   }

   public static List<class_7335> method_33456() {
      ArrayList var2 = Lists.newArrayList();

      class_7335 var3;
      for (var3 = field_37514; var3.method_33448() != var3; var3 = var3.method_33448()) {
         var2.add(var3);
      }

      var2.add(var3);
      Collections.reverse(var2);
      return var2;
   }

   private static boolean method_33449(class_7335 var0, class_5990 var1) {
      return var1.method_27364().method_33453(var0) && var1.method_27339();
   }

   public static class_7335 method_33444(int var0) {
      if (var0 < field_37516.size()) {
         return var0 >= 0 ? field_37516.get(var0) : field_37514;
      } else {
         return field_37504;
      }
   }

   public static int method_33454() {
      return field_37516.size();
   }

   public static int method_33455(class_7335 var0) {
      return field_37506.getInt(var0.method_33445());
   }

   public class_7335(String var1, class_7335 var2, int var3, EnumSet<class_3801> var4, class_5592 var5, class_6617 var6, class_7614 var7) {
      this.field_37513 = var1;
      this.field_37495 = var2 != null ? var2 : this;
      this.field_37505 = var6;
      this.field_37508 = var7;
      this.field_37497 = var3;
      this.field_37490 = var5;
      this.field_37503 = var4;
      this.field_37501 = var2 != null ? var2.method_33445() + 1 : 0;
   }

   public int method_33445() {
      return this.field_37501;
   }

   public String method_33460() {
      return this.field_37513;
   }

   public class_7335 method_33448() {
      return this.field_37495;
   }

   public CompletableFuture<Either<class_5990, class_1361>> method_33451(
      class_6331 var1,
      class_6541 var2,
      class_5799 var3,
      class_2087 var4,
      Function<class_5990, CompletableFuture<Either<class_5990, class_1361>>> var5,
      List<class_5990> var6
   ) {
      return this.field_37505.method_30431(this, var1, var2, var3, var4, var5, var6, (class_5990)var6.get(var6.size() / 2));
   }

   public CompletableFuture<Either<class_5990, class_1361>> method_33443(
      class_6331 var1, class_5799 var2, class_2087 var3, Function<class_5990, CompletableFuture<Either<class_5990, class_1361>>> var4, class_5990 var5
   ) {
      return this.field_37508.method_34534(this, var1, var2, var3, var4, var5);
   }

   public int method_33459() {
      return this.field_37497;
   }

   public class_5592 method_33446() {
      return this.field_37490;
   }

   public static class_7335 method_33461(String var0) {
      return class_8669.field_44381.method_39806(Identifier.method_21455(var0));
   }

   public EnumSet<class_3801> method_33447() {
      return this.field_37503;
   }

   public boolean method_33453(class_7335 var1) {
      return this.method_33445() >= var1.method_33445();
   }

   @Override
   public String toString() {
      return class_8669.field_44381.method_39797(this).toString();
   }
}
