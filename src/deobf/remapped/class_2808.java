package remapped;

import java.util.Random;
import javax.annotation.Nullable;

public class class_2808 extends class_380 implements class_3978 {
   private static String[] field_13781;
   public static final class_7044 field_13783 = class_6023.field_30723;
   public static final class_4190[] field_13782 = new class_4190[]{
      class_6414.method_29292(11.0, 7.0, 6.0, 15.0, 12.0, 10.0),
      class_6414.method_29292(9.0, 5.0, 5.0, 15.0, 12.0, 11.0),
      class_6414.method_29292(7.0, 3.0, 4.0, 15.0, 12.0, 12.0)
   };
   public static final class_4190[] field_13780 = new class_4190[]{
      class_6414.method_29292(1.0, 7.0, 6.0, 5.0, 12.0, 10.0),
      class_6414.method_29292(1.0, 5.0, 5.0, 7.0, 12.0, 11.0),
      class_6414.method_29292(1.0, 3.0, 4.0, 9.0, 12.0, 12.0)
   };
   public static final class_4190[] field_13779 = new class_4190[]{
      class_6414.method_29292(6.0, 7.0, 1.0, 10.0, 12.0, 5.0),
      class_6414.method_29292(5.0, 5.0, 1.0, 11.0, 12.0, 7.0),
      class_6414.method_29292(4.0, 3.0, 1.0, 12.0, 12.0, 9.0)
   };
   public static final class_4190[] field_13784 = new class_4190[]{
      class_6414.method_29292(6.0, 7.0, 11.0, 10.0, 12.0, 15.0),
      class_6414.method_29292(5.0, 5.0, 9.0, 11.0, 12.0, 15.0),
      class_6414.method_29292(4.0, 3.0, 7.0, 12.0, 12.0, 15.0)
   };

   public class_2808(class_3073 var1) {
      super(var1);
      this.method_29284(this.field_32751.method_36446().method_10308(field_1543, Direction.field_818).method_10308(field_13783, Integer.valueOf(0)));
   }

   @Override
   public boolean method_29300(class_2522 var1) {
      return var1.<Integer>method_10313(field_13783) < 2;
   }

   @Override
   public void method_10783(class_2522 var1, class_6331 var2, class_1331 var3, Random var4) {
      if (var2.field_33033.nextInt(5) == 0) {
         int var7 = var1.<Integer>method_10313(field_13783);
         if (var7 < 2) {
            var2.method_7513(var3, var1.method_10308(field_13783, Integer.valueOf(var7 + 1)), 2);
         }
      }
   }

   @Override
   public boolean method_10787(class_2522 var1, class_4924 var2, class_1331 var3) {
      class_6414 var6 = var2.method_28262(var3.method_6098(var1.<Direction>method_10313(field_1543))).method_8360();
      return var6.method_29299(class_2351.field_11736);
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      int var7 = var1.<Integer>method_10313(field_13783);
      switch ((Direction)var1.method_10313(field_1543)) {
         case field_800:
            return field_13784[var7];
         case field_818:
         default:
            return field_13779[var7];
         case field_809:
            return field_13780[var7];
         case field_804:
            return field_13782[var7];
      }
   }

   @Nullable
   @Override
   public class_2522 method_29302(class_353 var1) {
      class_2522 var4 = this.method_29260();
      World var5 = var1.method_21862();
      class_1331 var6 = var1.method_21858();

      for (Direction var10 : var1.method_1786()) {
         if (var10.method_1029().method_42629()) {
            var4 = var4.method_10308(field_1543, var10);
            if (var4.method_8309(var5, var6)) {
               return var4;
            }
         }
      }

      return null;
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      return var2 == var1.method_10313(field_1543) && !var1.method_8309(var4, var5)
         ? class_4783.field_23184.method_29260()
         : super.method_10763(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean method_18358(class_6163 var1, class_1331 var2, class_2522 var3, boolean var4) {
      return var3.<Integer>method_10313(field_13783) < 2;
   }

   @Override
   public boolean method_18357(World var1, Random var2, class_1331 var3, class_2522 var4) {
      return true;
   }

   @Override
   public void method_18359(class_6331 var1, Random var2, class_1331 var3, class_2522 var4) {
      var1.method_7513(var3, var4.method_10308(field_13783, Integer.valueOf(var4.<Integer>method_10313(field_13783) + 1)), 2);
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_1543, field_13783);
   }

   @Override
   public boolean method_10793(class_2522 var1, class_6163 var2, class_1331 var3, class_2929 var4) {
      return false;
   }
}
