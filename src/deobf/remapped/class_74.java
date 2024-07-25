package remapped;

import java.util.Random;

public class class_74 extends class_2830 implements class_3978 {
   private static String[] field_113;
   public static final class_7044 field_111 = class_6023.field_30751;
   public static final class_4190 field_110 = class_6414.method_29292(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   private final class_9060 field_112;

   public class_74(class_9060 var1, class_3073 var2) {
      super(var2);
      this.field_112 = var1;
      this.method_29284(this.field_32751.method_36446().method_10308(field_111, Integer.valueOf(0)));
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return field_110;
   }

   @Override
   public void method_10783(class_2522 var1, class_6331 var2, class_1331 var3, Random var4) {
      if (var2.method_22573(var3.method_6081()) >= 9 && var4.nextInt(7) == 0) {
         this.method_154(var2, var3, var1, var4);
      }
   }

   public void method_154(class_6331 var1, class_1331 var2, class_2522 var3, Random var4) {
      if (var3.<Integer>method_10313(field_111) != 0) {
         this.field_112.method_41607(var1, var1.method_28945().method_10189(), var2, var3, var4);
      } else {
         var1.method_7513(var2, var3.method_10317(field_111), 4);
      }
   }

   @Override
   public boolean method_18358(class_6163 var1, class_1331 var2, class_2522 var3, boolean var4) {
      return true;
   }

   @Override
   public boolean method_18357(World var1, Random var2, class_1331 var3, class_2522 var4) {
      return (double)var1.field_33033.nextFloat() < 0.45;
   }

   @Override
   public void method_18359(class_6331 var1, Random var2, class_1331 var3, class_2522 var4) {
      this.method_154(var1, var3, var4, var2);
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_111);
   }
}
