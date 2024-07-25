package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Optional;
import java.util.Random;

public class class_545 extends class_6414 {
   private static String[] field_3271;
   public static final class_7044 field_3268 = class_6023.field_30724;
   private static final ImmutableList<class_2700> field_3269 = ImmutableList.of(
      new class_2700(0, 0, -1),
      new class_2700(-1, 0, 0),
      new class_2700(0, 0, 1),
      new class_2700(1, 0, 0),
      new class_2700(-1, 0, -1),
      new class_2700(1, 0, -1),
      new class_2700(-1, 0, 1),
      new class_2700(1, 0, 1)
   );
   private static final ImmutableList<class_2700> field_3270 = new Builder()
      .addAll(field_3269)
      .addAll(field_3269.stream().<class_2700>map(class_2700::method_12181).iterator())
      .addAll(field_3269.stream().<class_2700>map(class_2700::method_12168).iterator())
      .add(new class_2700(0, 1, 0))
      .build();

   public class_545(class_3073 var1) {
      super(var1);
      this.method_29284(this.field_32751.method_36446().method_10308(field_3268, Integer.valueOf(0)));
   }

   @Override
   public class_6910 method_10777(class_2522 var1, World var2, BlockPos var3, class_704 var4, Hand var5, class_9529 var6) {
      ItemStack var9 = var4.method_26617(var5);
      if (var5 == Hand.MAIN_HAND && !method_2639(var9) && method_2639(var4.method_26617(Hand.OFF_HAND))) {
         return class_6910.field_35521;
      } else if (method_2639(var9) && method_2636(var1)) {
         method_2634(var2, var3, var1);
         if (!var4.playerAbilities.isCreativeMode) {
            var9.method_27970(1);
         }

         return class_6910.method_31659(var2.field_33055);
      } else if (var1.<Integer>method_10313(field_3268) != 0) {
         if (!method_2640(var2)) {
            if (!var2.field_33055) {
               this.method_2641(var1, var2, var3);
            }

            return class_6910.method_31659(var2.field_33055);
         } else {
            if (!var2.field_33055) {
               class_9359 var10 = (class_9359)var4;
               if (var10.method_43259() != var2.method_29545() || !var10.method_43279().equals(var3)) {
                  var10.method_43248(var2.method_29545(), var3, 0.0F, false, true);
                  var2.method_29528(
                     (class_704)null,
                     (double)var3.method_12173() + 0.5,
                     (double)var3.method_12165() + 0.5,
                     (double)var3.method_12185() + 0.5,
                     class_463.field_2541,
                     class_562.field_3322,
                     1.0F,
                     1.0F
                  );
                  return class_6910.field_35520;
               }
            }

            return class_6910.field_35518;
         }
      } else {
         return class_6910.field_35521;
      }
   }

   private static boolean method_2639(ItemStack var0) {
      return var0.method_27960() == class_4897.field_24842;
   }

   private static boolean method_2636(class_2522 var0) {
      return var0.<Integer>method_10313(field_3268) < 4;
   }

   private static boolean method_2638(BlockPos var0, World var1) {
      class_4774 var4 = var1.method_28258(var0);
      if (var4.method_22007(class_6503.field_33094)) {
         if (!var4.method_21993()) {
            float var5 = (float)var4.method_21996();
            if (!(var5 < 2.0F)) {
               class_4774 var6 = var1.method_28258(var0.method_6100());
               return !var6.method_22007(class_6503.field_33094);
            } else {
               return false;
            }
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private void method_2641(class_2522 var1, World var2, BlockPos var3) {
      var2.method_7508(var3, false);
      boolean var6 = class_9594.field_48893.method_44315().<BlockPos>map(var3::method_6098).anyMatch(var1x -> method_2638(var1x, var2));
      boolean var7 = var6 || var2.method_28258(var3.method_6081()).method_22007(class_6503.field_33094);
      class_4294 var8 = new class_4294(this, var7);
      var2.method_29575(
         (Entity)null,
         DamageSource.method_28378(),
         var8,
         (double)var3.method_12173() + 0.5,
         (double)var3.method_12165() + 0.5,
         (double)var3.method_12185() + 0.5,
         5.0F,
         true,
         class_7298.field_37311
      );
   }

   public static boolean method_2640(World var0) {
      return var0.method_22572().method_40219();
   }

   public static void method_2634(World var0, BlockPos var1, class_2522 var2) {
      var0.method_7513(var1, var2.method_10308(field_3268, Integer.valueOf(var2.<Integer>method_10313(field_3268) + 1)), 3);
      var0.method_29528(
         (class_704)null,
         (double)var1.method_12173() + 0.5,
         (double)var1.method_12165() + 0.5,
         (double)var1.method_12185() + 0.5,
         class_463.field_2008,
         class_562.field_3322,
         1.0F,
         1.0F
      );
   }

   @Override
   public void method_29280(class_2522 var1, World var2, BlockPos var3, Random var4) {
      if (var1.<Integer>method_10313(field_3268) != 0) {
         if (var4.nextInt(100) == 0) {
            var2.method_29528(
               (class_704)null,
               (double)var3.method_12173() + 0.5,
               (double)var3.method_12165() + 0.5,
               (double)var3.method_12185() + 0.5,
               class_463.field_2893,
               class_562.field_3322,
               1.0F,
               1.0F
            );
         }

         double var7 = (double)var3.method_12173() + 0.5 + (0.5 - var4.nextDouble());
         double var9 = (double)var3.method_12165() + 1.0;
         double var11 = (double)var3.method_12185() + 0.5 + (0.5 - var4.nextDouble());
         double var13 = (double)var4.nextFloat() * 0.04;
         var2.method_43361(class_3090.field_15381, var7, var9, var11, 0.0, var13, 0.0);
      }
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_3268);
   }

   @Override
   public boolean method_10770(class_2522 var1) {
      return true;
   }

   public static int method_2637(class_2522 var0, int var1) {
      return class_9299.method_42848((float)(var0.<Integer>method_10313(field_3268) - 0) / 4.0F * (float)var1);
   }

   @Override
   public int method_10795(class_2522 var1, World var2, BlockPos var3) {
      return method_2637(var1, 15);
   }

   public static Optional<class_1343> method_2633(class_6629<?> var0, class_1449 var1, BlockPos var2) {
      Optional var5 = method_2635(var0, var1, var2, true);
      return !var5.isPresent() ? method_2635(var0, var1, var2, false) : var5;
   }

   private static Optional<class_1343> method_2635(class_6629<?> var0, class_1449 var1, BlockPos var2, boolean var3) {
      class_2921 var6 = new class_2921();
      UnmodifiableIterator var7 = field_3270.iterator();

      while (var7.hasNext()) {
         class_2700 var8 = (class_2700)var7.next();
         var6.method_13364(var2).method_13366(var8);
         class_1343 var9 = class_160.method_650(var0, var1, var6, var3);
         if (var9 != null) {
            return Optional.<class_1343>of(var9);
         }
      }

      return Optional.<class_1343>empty();
   }

   @Override
   public boolean method_10793(class_2522 var1, class_6163 var2, BlockPos var3, class_2929 var4) {
      return false;
   }
}
