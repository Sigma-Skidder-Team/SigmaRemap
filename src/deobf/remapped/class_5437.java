package remapped;

import java.util.Random;
import javax.annotation.Nullable;

public class class_5437 extends class_2830 implements class_3978, class_4582 {
   private static String[] field_27695;
   public static final class_4190 field_27694 = class_6414.method_29292(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   public class_5437(class_3073 var1) {
      super(var1);
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return field_27694;
   }

   @Override
   public boolean method_12870(class_2522 var1, class_6163 var2, class_1331 var3) {
      return var1.method_8308(var2, var3, Direction.field_817) && !var1.method_8350(class_4783.field_23215);
   }

   @Nullable
   @Override
   public class_2522 method_29302(class_353 var1) {
      class_4774 var4 = var1.method_21862().method_28258(var1.method_21858());
      return var4.method_22007(class_6503.field_33094) && var4.method_21996() == 8 ? super.method_29302(var1) : null;
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      class_2522 var9 = super.method_10763(var1, var2, var3, var4, var5, var6);
      if (!var9.method_8345()) {
         var4.method_43362().method_14011(var5, class_8532.field_43674, class_8532.field_43674.method_10711(var4));
      }

      return var9;
   }

   @Override
   public boolean method_18358(class_6163 var1, class_1331 var2, class_2522 var3, boolean var4) {
      return true;
   }

   @Override
   public boolean method_18357(World var1, Random var2, class_1331 var3, class_2522 var4) {
      return true;
   }

   @Override
   public class_4774 method_10762(class_2522 var1) {
      return class_8532.field_43674.method_17649(false);
   }

   @Override
   public void method_18359(class_6331 var1, Random var2, class_1331 var3, class_2522 var4) {
      class_2522 var7 = class_4783.field_23535.method_29260();
      class_2522 var8 = var7.method_10308(class_8993.field_46044, class_7422.field_37874);
      class_1331 var9 = var3.method_6081();
      if (var1.method_28262(var9).method_8350(class_4783.field_23900)) {
         var1.method_7513(var3, var7, 2);
         var1.method_7513(var9, var8, 2);
      }
   }

   @Override
   public boolean method_21238(class_6163 var1, class_1331 var2, class_2522 var3, class_2340 var4) {
      return false;
   }

   @Override
   public boolean method_21237(class_9379 var1, class_1331 var2, class_2522 var3, class_4774 var4) {
      return false;
   }
}
