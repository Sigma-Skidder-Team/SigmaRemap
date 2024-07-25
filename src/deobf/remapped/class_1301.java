package remapped;

import java.util.Random;

public class class_1301 extends class_6414 {
   private static String[] field_7214;
   public static final class_6720 field_7215 = class_8601.field_44047;

   public class_1301(class_3073 var1) {
      super(var1);
      this.method_29284(this.method_29260().method_10308(field_7215, Boolean.valueOf(false)));
   }

   @Override
   public void method_10791(class_2522 var1, class_6486 var2, class_1331 var3, class_704 var4) {
      method_5942(var1, var2, var3);
      super.method_10791(var1, var2, var3, var4);
   }

   @Override
   public void method_29286(class_6486 var1, class_1331 var2, class_8145 var3) {
      method_5942(var1.method_28262(var2), var1, var2);
      super.method_29286(var1, var2, var3);
   }

   @Override
   public class_6910 method_10777(class_2522 var1, class_6486 var2, class_1331 var3, class_704 var4, class_2584 var5, class_9529 var6) {
      if (!var2.field_33055) {
         method_5942(var1, var2, var3);
      } else {
         method_5943(var2, var3);
      }

      class_6098 var9 = var4.method_26617(var5);
      return var9.method_27960() instanceof class_6201 && new class_353(var4, var5, var9, var6).method_1785() ? class_6910.field_35521 : class_6910.field_35520;
   }

   private static void method_5942(class_2522 var0, class_6486 var1, class_1331 var2) {
      method_5943(var1, var2);
      if (!var0.<Boolean>method_10313(field_7215)) {
         var1.method_7513(var2, var0.method_10308(field_7215, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   public boolean method_29300(class_2522 var1) {
      return var1.<Boolean>method_10313(field_7215);
   }

   @Override
   public void method_10783(class_2522 var1, class_6331 var2, class_1331 var3, Random var4) {
      if (var1.<Boolean>method_10313(field_7215)) {
         var2.method_7513(var3, var1.method_10308(field_7215, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   public void method_10765(class_2522 var1, class_6331 var2, class_1331 var3, class_6098 var4) {
      super.method_10765(var1, var2, var3, var4);
      if (class_2931.method_13423(class_3668.field_17870, var4) == 0) {
         int var7 = 1 + var2.field_33033.nextInt(5);
         this.method_29304(var2, var3, var7);
      }
   }

   @Override
   public void method_29280(class_2522 var1, class_6486 var2, class_1331 var3, Random var4) {
      if (var1.<Boolean>method_10313(field_7215)) {
         method_5943(var2, var3);
      }
   }

   private static void method_5943(class_6486 var0, class_1331 var1) {
      double var4 = 0.5625;
      Random var6 = var0.field_33033;

      for (class_240 var10 : class_240.values()) {
         class_1331 var11 = var1.method_6098(var10);
         if (!var0.method_28262(var11).method_8321(var0, var11)) {
            class_9249 var12 = var10.method_1029();
            double var13 = var12 != class_9249.field_47215 ? (double)var6.nextFloat() : 0.5 + 0.5625 * (double)var10.method_1041();
            double var15 = var12 != class_9249.field_47216 ? (double)var6.nextFloat() : 0.5 + 0.5625 * (double)var10.method_1054();
            double var17 = var12 != class_9249.field_47219 ? (double)var6.nextFloat() : 0.5 + 0.5625 * (double)var10.method_1034();
            var0.method_43361(
               class_5727.field_28937,
               (double)var1.method_12173() + var13,
               (double)var1.method_12165() + var15,
               (double)var1.method_12185() + var17,
               0.0,
               0.0,
               0.0
            );
         }
      }
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_7215);
   }
}
