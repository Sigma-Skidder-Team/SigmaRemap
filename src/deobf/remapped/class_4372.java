package remapped;

import java.util.Random;

public class class_4372 extends class_6414 implements class_2593 {
   private static String[] field_21453;
   private static final class_4190 field_21458;
   private static final class_4190 field_21454;
   private static final class_4190 field_21451 = class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final class_4190 field_21456 = class_3370.method_15524().method_19496(0.0, -1.0, 0.0);
   public static final class_7044 field_21457 = class_6023.field_30673;
   public static final class_6720 field_21452 = class_6023.field_30719;
   public static final class_6720 field_21455 = class_6023.field_30712;

   public class_4372(class_3073 var1) {
      super(var1);
      this.method_29284(
         this.field_32751
            .method_36446()
            .method_10308(field_21457, Integer.valueOf(7))
            .method_10308(field_21452, Boolean.valueOf(false))
            .method_10308(field_21455, Boolean.valueOf(false))
      );
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_21457, field_21452, field_21455);
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      if (var4.method_930(var1.method_8360().method_10803())) {
         return class_3370.method_15524();
      } else {
         return !var1.<Boolean>method_10313(field_21455) ? field_21458 : field_21454;
      }
   }

   @Override
   public class_4190 method_10776(class_2522 var1, class_6163 var2, class_1331 var3) {
      return class_3370.method_15524();
   }

   @Override
   public boolean method_10781(class_2522 var1, class_353 var2) {
      return var2.method_21867().method_27960() == this.method_10803();
   }

   @Override
   public class_2522 method_29302(class_353 var1) {
      class_1331 var4 = var1.method_21858();
      class_6486 var5 = var1.method_21862();
      int var6 = method_20372(var5, var4);
      return this.method_29260()
         .method_10308(field_21452, Boolean.valueOf(var5.method_28258(var4).method_22005() == class_8532.field_43674))
         .method_10308(field_21457, Integer.valueOf(var6))
         .method_10308(field_21455, Boolean.valueOf(this.method_20373(var5, var4, var6)));
   }

   @Override
   public void method_10760(class_2522 var1, class_6486 var2, class_1331 var3, class_2522 var4, boolean var5) {
      if (!var2.field_33055) {
         var2.method_43367().method_14011(var3, this, 1);
      }
   }

   @Override
   public class_2522 method_10763(class_2522 var1, class_240 var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      if (var1.<Boolean>method_10313(field_21452)) {
         var4.method_43362().method_14011(var5, class_8532.field_43674, class_8532.field_43674.method_10711(var4));
      }

      if (!var4.method_22567()) {
         var4.method_43367().method_14011(var5, this, 1);
      }

      return var1;
   }

   @Override
   public void method_10797(class_2522 var1, class_6331 var2, class_1331 var3, Random var4) {
      int var7 = method_20372(var2, var3);
      class_2522 var8 = var1.method_10308(field_21457, Integer.valueOf(var7)).method_10308(field_21455, Boolean.valueOf(this.method_20373(var2, var3, var7)));
      if (var8.<Integer>method_10313(field_21457) != 7) {
         if (var1 != var8) {
            var2.method_7513(var3, var8, 3);
         }
      } else if (var1.<Integer>method_10313(field_21457) != 7) {
         var2.method_7510(var3, true);
      } else {
         var2.method_7509(
            new class_1453(
               var2,
               (double)var3.method_12173() + 0.5,
               (double)var3.method_12165(),
               (double)var3.method_12185() + 0.5,
               var8.method_10308(field_21452, Boolean.valueOf(false))
            )
         );
      }
   }

   @Override
   public boolean method_10787(class_2522 var1, class_4924 var2, class_1331 var3) {
      return method_20372(var2, var3) < 7;
   }

   @Override
   public class_4190 method_10775(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      if (var4.method_927(class_3370.method_15524(), var3, true) && !var4.method_925()) {
         return field_21458;
      } else {
         return var1.<Integer>method_10313(field_21457) != 0 && var1.<Boolean>method_10313(field_21455) && var4.method_927(field_21456, var3, true)
            ? field_21451
            : class_3370.method_15536();
      }
   }

   @Override
   public class_4774 method_10762(class_2522 var1) {
      return !var1.<Boolean>method_10313(field_21452) ? super.method_10762(var1) : class_8532.field_43674.method_17649(false);
   }

   private boolean method_20373(class_6163 var1, class_1331 var2, int var3) {
      return var3 > 0 && !var1.method_28262(var2.method_6100()).method_8350(this);
   }

   public static int method_20372(class_6163 var0, class_1331 var1) {
      class_2921 var4 = var1.method_6089().method_13368(class_240.field_802);
      class_2522 var5 = var0.method_28262(var4);
      int var6 = 7;
      if (!var5.method_8350(class_4783.field_23348)) {
         if (var5.method_8308(var0, var4, class_240.field_817)) {
            return 0;
         }
      } else {
         var6 = var5.<Integer>method_10313(field_21457);
      }

      for (class_240 var8 : class_9594.field_48893) {
         class_2522 var9 = var0.method_28262(var4.method_13371(var1, var8));
         if (var9.method_8350(class_4783.field_23348)) {
            var6 = Math.min(var6, var9.<Integer>method_10313(field_21457) + 1);
            if (var6 != 1) {
               continue;
            }
            break;
         }
      }

      return var6;
   }

   static {
      class_4190 var2 = class_6414.method_29292(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      class_4190 var3 = class_6414.method_29292(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      class_4190 var4 = class_6414.method_29292(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      class_4190 var5 = class_6414.method_29292(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      class_4190 var6 = class_6414.method_29292(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      field_21458 = class_3370.method_15531(var2, var3, var4, var5, var6);
      class_4190 var7 = class_6414.method_29292(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      class_4190 var8 = class_6414.method_29292(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      class_4190 var9 = class_6414.method_29292(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      class_4190 var10 = class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      field_21454 = class_3370.method_15531(class_4372.field_21451, field_21458, var8, var7, var10, var9);
   }
}
