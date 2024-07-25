package remapped;

import java.util.Optional;
import java.util.Random;
import javax.annotation.Nullable;

public class class_8474 extends class_4314 implements class_2593 {
   private static String[] field_43424;
   public static final class_4190 field_43425 = class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final class_6720 field_43423 = class_6023.field_30732;
   public static final class_6720 field_43427 = class_6023.field_30731;
   public static final class_6720 field_43421 = class_6023.field_30719;
   public static final class_6162 field_43419 = class_6023.field_30701;
   private static final class_4190 field_43420 = class_6414.method_29292(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private final boolean field_43426;
   private final int field_43422;

   public class_8474(boolean var1, int var2, class_3073 var3) {
      super(var3);
      this.field_43426 = var1;
      this.field_43422 = var2;
      this.method_29284(
         this.field_32751
            .method_36446()
            .method_10308(field_43423, Boolean.valueOf(true))
            .method_10308(field_43427, Boolean.valueOf(false))
            .method_10308(field_43421, Boolean.valueOf(false))
            .method_10308(field_43419, Direction.field_818)
      );
   }

   @Override
   public class_6910 method_10777(class_2522 var1, World var2, class_1331 var3, class_704 var4, class_2584 var5, class_9529 var6) {
      class_3757 var9 = var2.method_28260(var3);
      if (var9 instanceof class_557) {
         class_557 var10 = (class_557)var9;
         class_6098 var11 = var4.method_26617(var5);
         Optional var12 = var10.method_2672(var11);
         if (var12.isPresent()) {
            if (!var2.field_33055 && var10.method_2675(!var4.field_3876.field_4944 ? var11 : var11.method_27973(), ((class_5917)var12.get()).method_14546())) {
               var4.method_3209(class_6234.field_31878);
               return class_6910.field_35520;
            }

            return class_6910.field_35518;
         }
      }

      return class_6910.field_35521;
   }

   @Override
   public void method_10784(class_2522 var1, World var2, class_1331 var3, Entity var4) {
      if (!var4.method_37087() && var1.<Boolean>method_10313(field_43423) && var4 instanceof class_5834 && !class_2931.method_13407((class_5834)var4)) {
         var4.method_37181(class_6199.field_31678, (float)this.field_43422);
      }

      super.method_10784(var1, var2, var3, var4);
   }

   @Override
   public void method_10761(class_2522 var1, World var2, class_1331 var3, class_2522 var4, boolean var5) {
      if (!var1.method_8350(var4.method_8360())) {
         class_3757 var8 = var2.method_28260(var3);
         if (var8 instanceof class_557) {
            class_1573.method_7101(var2, var3, ((class_557)var8).method_2670());
         }

         super.method_10761(var1, var2, var3, var4, var5);
      }
   }

   @Nullable
   @Override
   public class_2522 method_29302(class_353 var1) {
      World var4 = var1.method_21862();
      class_1331 var5 = var1.method_21858();
      boolean var6 = var4.method_28258(var5).method_22005() == class_8532.field_43674;
      return this.method_29260()
         .method_10308(field_43421, Boolean.valueOf(var6))
         .method_10308(field_43427, Boolean.valueOf(this.method_39002(var4.method_28262(var5.method_6100()))))
         .method_10308(field_43423, Boolean.valueOf(!var6))
         .method_10308(field_43419, var1.method_21863());
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      if (var1.<Boolean>method_10313(field_43421)) {
         var4.method_43362().method_14011(var5, class_8532.field_43674, class_8532.field_43674.method_10711(var4));
      }

      return var2 != Direction.field_802
         ? super.method_10763(var1, var2, var3, var4, var5, var6)
         : var1.method_10308(field_43427, Boolean.valueOf(this.method_39002(var3)));
   }

   private boolean method_39002(class_2522 var1) {
      return var1.method_8350(class_4783.field_23429);
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return field_43425;
   }

   @Override
   public class_7537 method_10788(class_2522 var1) {
      return class_7537.field_38469;
   }

   @Override
   public void method_29280(class_2522 var1, World var2, class_1331 var3, Random var4) {
      if (var1.<Boolean>method_10313(field_43423)) {
         if (var4.nextInt(10) == 0) {
            var2.method_29527(
               (double)var3.method_12173() + 0.5,
               (double)var3.method_12165() + 0.5,
               (double)var3.method_12185() + 0.5,
               class_463.field_2740,
               class_562.field_3322,
               0.5F + var4.nextFloat(),
               var4.nextFloat() * 0.7F + 0.6F,
               false
            );
         }

         if (this.field_43426 && var4.nextInt(5) == 0) {
            for (int var7 = 0; var7 < var4.nextInt(1) + 1; var7++) {
               var2.method_43361(
                  class_3090.field_15372,
                  (double)var3.method_12173() + 0.5,
                  (double)var3.method_12165() + 0.5,
                  (double)var3.method_12185() + 0.5,
                  (double)(var4.nextFloat() / 2.0F),
                  5.0E-5,
                  (double)(var4.nextFloat() / 2.0F)
               );
            }
         }
      }
   }

   public static void method_39006(class_9379 var0, class_1331 var1, class_2522 var2) {
      if (var0.method_22567()) {
         for (int var5 = 0; var5 < 20; var5++) {
            method_39003((World)var0, var1, var2.<Boolean>method_10313(field_43427), true);
         }
      }

      class_3757 var6 = var0.method_28260(var1);
      if (var6 instanceof class_557) {
         ((class_557)var6).method_2674();
      }
   }

   @Override
   public boolean method_21237(class_9379 var1, class_1331 var2, class_2522 var3, class_4774 var4) {
      if (!var3.<Boolean>method_10313(class_6023.field_30719) && var4.method_22005() == class_8532.field_43674) {
         boolean var7 = var3.<Boolean>method_10313(field_43423);
         if (var7) {
            if (!var1.method_22567()) {
               var1.method_43359((class_704)null, var2, class_463.field_2557, class_562.field_3322, 1.0F, 1.0F);
            }

            method_39006(var1, var2, var3);
         }

         var1.method_7513(var2, var3.method_10308(field_43421, Boolean.valueOf(true)).method_10308(field_43423, Boolean.valueOf(false)), 3);
         var1.method_43362().method_14011(var2, var4.method_22005(), var4.method_22005().method_10711(var1));
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void method_10758(World var1, class_2522 var2, class_9529 var3, class_5783 var4) {
      if (!var1.field_33055 && var4.method_37264()) {
         Entity var7 = var4.method_26166();
         boolean var8 = var7 == null || var7 instanceof class_704 || var1.method_29537().method_1285(class_291.field_1047);
         if (var8 && !var2.<Boolean>method_10313(field_43423) && !var2.<Boolean>method_10313(field_43421)) {
            class_1331 var9 = var3.method_43955();
            var1.method_7513(var9, var2.method_10308(class_6023.field_30732, Boolean.valueOf(true)), 11);
         }
      }
   }

   public static void method_39003(World var0, class_1331 var1, boolean var2, boolean var3) {
      Random var6 = var0.method_43360();
      class_2427 var7 = !var2 ? class_3090.field_15333 : class_3090.field_15320;
      var0.method_29552(
         var7,
         true,
         (double)var1.method_12173() + 0.5 + var6.nextDouble() / 3.0 * (double)(!var6.nextBoolean() ? -1 : 1),
         (double)var1.method_12165() + var6.nextDouble() + var6.nextDouble(),
         (double)var1.method_12185() + 0.5 + var6.nextDouble() / 3.0 * (double)(!var6.nextBoolean() ? -1 : 1),
         0.0,
         0.07,
         0.0
      );
      if (var3) {
         var0.method_43361(
            class_3090.field_15376,
            (double)var1.method_12173() + 0.25 + var6.nextDouble() / 2.0 * (double)(!var6.nextBoolean() ? -1 : 1),
            (double)var1.method_12165() + 0.4,
            (double)var1.method_12185() + 0.25 + var6.nextDouble() / 2.0 * (double)(!var6.nextBoolean() ? -1 : 1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean method_39005(World var0, class_1331 var1) {
      for (int var4 = 1; var4 <= 5; var4++) {
         class_1331 var5 = var1.method_6101(var4);
         class_2522 var6 = var0.method_28262(var5);
         if (method_39004(var6)) {
            return true;
         }

         boolean var7 = class_3370.method_15537(field_43420, var6.method_8325(var0, var1, class_214.method_928()), class_8529.field_43655);
         if (var7) {
            class_2522 var8 = var0.method_28262(var5.method_6100());
            return method_39004(var8);
         }
      }

      return false;
   }

   public static boolean method_39004(class_2522 var0) {
      return var0.method_10307(field_43423) && var0.method_8349(class_2351.field_11774) && var0.<Boolean>method_10313(field_43423);
   }

   @Override
   public class_4774 method_10762(class_2522 var1) {
      return !var1.<Boolean>method_10313(field_43421) ? super.method_10762(var1) : class_8532.field_43674.method_17649(false);
   }

   @Override
   public class_2522 method_10785(class_2522 var1, class_6631 var2) {
      return var1.method_10308(field_43419, var2.method_30489(var1.<Direction>method_10313(field_43419)));
   }

   @Override
   public class_2522 method_10773(class_2522 var1, class_9022 var2) {
      return var1.method_8318(var2.method_41390(var1.<Direction>method_10313(field_43419)));
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_43423, field_43427, field_43421, field_43419);
   }

   @Override
   public class_3757 method_3281(class_6163 var1) {
      return new class_557();
   }

   @Override
   public boolean method_10793(class_2522 var1, class_6163 var2, class_1331 var3, class_2929 var4) {
      return false;
   }

   public static boolean method_39007(class_2522 var0) {
      return var0.method_8329(class_2351.field_11774, var0x -> var0x.method_10307(class_6023.field_30719) && var0x.method_10307(class_6023.field_30732))
         && !var0.<Boolean>method_10313(class_6023.field_30719)
         && !var0.<Boolean>method_10313(class_6023.field_30732);
   }
}
