package remapped;

import java.util.Random;

public class class_108 extends class_6414 {
   private static String[] field_275;
   private static final class_7044 field_274 = class_6023.field_30758;

   public class_108(class_3073 var1) {
      super(var1);
      this.method_29284(this.field_32751.method_36446().method_10308(field_274, Integer.valueOf(0)));
   }

   @Override
   public void method_10758(World var1, class_2522 var2, class_9529 var3, class_5783 var4) {
      int var7 = method_332(var1, var2, var3, var4);
      Entity var8 = var4.method_26166();
      if (var8 instanceof class_9359) {
         class_9359 var9 = (class_9359)var8;
         var9.method_3209(class_6234.field_31840);
         class_8807.field_45066.method_40927(var9, var4, var3.method_33993(), var7);
      }
   }

   private static int method_332(class_9379 var0, class_2522 var1, class_9529 var2, Entity var3) {
      int var6 = method_333(var2, var2.method_33993());
      int var7 = !(var3 instanceof class_6749) ? 8 : 20;
      if (!var0.method_43367().method_14013(var2.method_43955(), var1.method_8360())) {
         method_334(var0, var1, var6, var2.method_43955(), var7);
      }

      return var6;
   }

   private static int method_333(class_9529 var0, class_1343 var1) {
      Direction var4 = var0.method_43956();
      double var5 = Math.abs(class_9299.method_42822(var1.field_7336) - 0.5);
      double var7 = Math.abs(class_9299.method_42822(var1.field_7333) - 0.5);
      double var9 = Math.abs(class_9299.method_42822(var1.field_7334) - 0.5);
      class_9249 var11 = var4.method_1029();
      double var12;
      if (var11 != class_9249.field_47216) {
         if (var11 != class_9249.field_47219) {
            var12 = Math.max(var7, var9);
         } else {
            var12 = Math.max(var5, var7);
         }
      } else {
         var12 = Math.max(var5, var9);
      }

      return Math.max(1, class_9299.method_42815(15.0 * class_9299.method_42827((0.5 - var12) / 0.5, 0.0, 1.0)));
   }

   private static void method_334(class_9379 var0, class_2522 var1, int var2, class_1331 var3, int var4) {
      var0.method_7513(var3, var1.method_10308(field_274, Integer.valueOf(var2)), 3);
      var0.method_43367().method_14011(var3, var1.method_8360(), var4);
   }

   @Override
   public void method_10797(class_2522 var1, class_6331 var2, class_1331 var3, Random var4) {
      if (var1.<Integer>method_10313(field_274) != 0) {
         var2.method_7513(var3, var1.method_10308(field_274, Integer.valueOf(0)), 3);
      }
   }

   @Override
   public int method_10766(class_2522 var1, class_6163 var2, class_1331 var3, Direction var4) {
      return var1.<Integer>method_10313(field_274);
   }

   @Override
   public boolean method_10771(class_2522 var1) {
      return true;
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_274);
   }

   @Override
   public void method_10760(class_2522 var1, World var2, class_1331 var3, class_2522 var4, boolean var5) {
      if (!var2.method_22567()
         && !var1.method_8350(var4.method_8360())
         && var1.<Integer>method_10313(field_274) > 0
         && !var2.method_43367().method_14013(var3, this)) {
         var2.method_7513(var3, var1.method_10308(field_274, Integer.valueOf(0)), 18);
      }
   }
}
