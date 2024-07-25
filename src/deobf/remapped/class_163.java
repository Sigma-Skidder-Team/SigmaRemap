package remapped;

import java.util.Random;
import javax.annotation.Nullable;

public class class_163 extends class_6414 {
   private static String[] field_494;
   public static final class_7044 field_493 = class_6023.field_30759;
   public static final class_4190[] field_492 = new class_4190[]{
      class_3370.method_15536(),
      class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   public class_163(class_3073 var1) {
      super(var1);
      this.method_29284(this.field_32751.method_36446().method_10308(field_493, Integer.valueOf(1)));
   }

   @Override
   public boolean method_10793(class_2522 var1, class_6163 var2, class_1331 var3, class_2929 var4) {
      switch (var4) {
         case field_14271:
            return var1.<Integer>method_10313(field_493) < 5;
         case field_14272:
            return false;
         case field_14275:
            return false;
         default:
            return false;
      }
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return field_492[var1.<Integer>method_10313(field_493)];
   }

   @Override
   public class_4190 method_10775(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return field_492[var1.<Integer>method_10313(field_493) - 1];
   }

   @Override
   public class_4190 method_10774(class_2522 var1, class_6163 var2, class_1331 var3) {
      return field_492[var1.<Integer>method_10313(field_493)];
   }

   @Override
   public class_4190 method_10757(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return field_492[var1.<Integer>method_10313(field_493)];
   }

   @Override
   public boolean method_10768(class_2522 var1) {
      return true;
   }

   @Override
   public boolean method_10787(class_2522 var1, class_4924 var2, class_1331 var3) {
      class_2522 var6 = var2.method_28262(var3.method_6100());
      if (var6.method_8350(class_4783.field_23496) || var6.method_8350(class_4783.field_23829) || var6.method_8350(class_4783.field_23207)) {
         return false;
      } else {
         return !var6.method_8350(class_4783.field_23899) && !var6.method_8350(class_4783.field_23784)
            ? class_6414.method_29303(var6.method_8324(var2, var3.method_6100()), class_240.field_817)
               || var6.method_8360() == this && var6.<Integer>method_10313(field_493) == 8
            : true;
      }
   }

   @Override
   public class_2522 method_10763(class_2522 var1, class_240 var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      return var1.method_8309(var4, var5) ? super.method_10763(var1, var2, var3, var4, var5, var6) : class_4783.field_23184.method_29260();
   }

   @Override
   public void method_10783(class_2522 var1, class_6331 var2, class_1331 var3, Random var4) {
      if (var2.method_25266(class_2957.field_14440, var3) > 11) {
         method_29294(var1, var2, var3);
         var2.method_7508(var3, false);
      }
   }

   @Override
   public boolean method_10781(class_2522 var1, class_353 var2) {
      int var5 = var1.<Integer>method_10313(field_493);
      if (var2.method_21867().method_27960() != this.method_10803() || var5 >= 8) {
         return var5 == 1;
      } else {
         return !var2.method_1783() ? true : var2.method_21857() == class_240.field_817;
      }
   }

   @Nullable
   @Override
   public class_2522 method_29302(class_353 var1) {
      class_2522 var4 = var1.method_21862().method_28262(var1.method_21858());
      if (!var4.method_8350(this)) {
         return super.method_29302(var1);
      } else {
         int var5 = var4.<Integer>method_10313(field_493);
         return var4.method_10308(field_493, Integer.valueOf(Math.min(8, var5 + 1)));
      }
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_493);
   }
}
