package remapped;

import java.util.Random;

public class class_1653 extends class_6414 {
   private static String[] field_8591;
   public static final class_7044 field_8592 = class_6023.field_30702;
   public static final class_4190 field_8593 = class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);

   public class_1653(class_3073 var1) {
      super(var1);
      this.method_29284(this.field_32751.method_36446().method_10308(field_8592, Integer.valueOf(0)));
   }

   @Override
   public class_2522 method_10763(class_2522 var1, class_240 var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      if (var2 == class_240.field_817 && !var1.method_8309(var4, var5)) {
         var4.method_43367().method_14011(var5, this, 1);
      }

      return super.method_10763(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean method_10787(class_2522 var1, class_4924 var2, class_1331 var3) {
      class_2522 var6 = var2.method_28262(var3.method_6081());
      return !var6.method_8362().method_24499() || var6.method_8360() instanceof class_1645 || var6.method_8360() instanceof class_7804;
   }

   @Override
   public class_2522 method_29302(class_353 var1) {
      return this.method_29260().method_8309(var1.method_21862(), var1.method_21858()) ? super.method_29302(var1) : class_4783.field_23592.method_29260();
   }

   @Override
   public boolean method_10768(class_2522 var1) {
      return true;
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return field_8593;
   }

   @Override
   public void method_10797(class_2522 var1, class_6331 var2, class_1331 var3, Random var4) {
      if (!var1.method_8309(var2, var3)) {
         method_7376(var1, var2, var3);
      }
   }

   @Override
   public void method_10783(class_2522 var1, class_6331 var2, class_1331 var3, Random var4) {
      int var7 = var1.<Integer>method_10313(field_8592);
      if (!method_7377(var2, var3) && !var2.method_29569(var3.method_6081())) {
         if (var7 <= 0) {
            if (!method_7378(var2, var3)) {
               method_7376(var1, var2, var3);
            }
         } else {
            var2.method_7513(var3, var1.method_10308(field_8592, Integer.valueOf(var7 - 1)), 2);
         }
      } else if (var7 < 7) {
         var2.method_7513(var3, var1.method_10308(field_8592, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void method_29263(class_6486 var1, class_1331 var2, class_8145 var3, float var4) {
      if (!var1.field_33055
         && var1.field_33033.nextFloat() < var4 - 0.5F
         && var3 instanceof class_5834
         && (var3 instanceof class_704 || var1.method_29537().method_1285(class_291.field_1047))
         && var3.method_37086() * var3.method_37086() * var3.method_37074() > 0.512F) {
         method_7376(var1.method_28262(var2), var1, var2);
      }

      super.method_29263(var1, var2, var3, var4);
   }

   public static void method_7376(class_2522 var0, class_6486 var1, class_1331 var2) {
      var1.method_29594(var2, method_29277(var0, class_4783.field_23592.method_29260(), var1, var2));
   }

   private static boolean method_7378(class_6163 var0, class_1331 var1) {
      class_6414 var4 = var0.method_28262(var1.method_6081()).method_8360();
      return var4 instanceof class_8557 || var4 instanceof class_8138 || var4 instanceof class_8330;
   }

   private static boolean method_7377(class_4924 var0, class_1331 var1) {
      for (class_1331 var5 : class_1331.method_6076(var1.method_6104(-4, 0, -4), var1.method_6104(4, 1, 4))) {
         if (var0.method_28258(var5).method_22007(class_6503.field_33094)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_8592);
   }

   @Override
   public boolean method_10793(class_2522 var1, class_6163 var2, class_1331 var3, class_2929 var4) {
      return false;
   }
}
