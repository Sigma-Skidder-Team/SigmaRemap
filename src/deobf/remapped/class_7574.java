package remapped;

import java.util.Random;
import javax.annotation.Nullable;

public class class_7574 extends class_4314 {
   private static String[] field_38591;
   public static final class_6162 field_38593 = class_6023.field_30674;
   public static final class_6720 field_38592 = class_6023.field_30688;

   public class_7574(class_3073 var1) {
      super(var1);
      this.method_29284(this.field_32751.method_36446().method_10308(field_38593, Direction.field_818).method_10308(field_38592, Boolean.valueOf(false)));
   }

   @Override
   public class_6910 method_10777(class_2522 var1, World var2, class_1331 var3, class_704 var4, class_2584 var5, class_9529 var6) {
      if (!var2.field_33055) {
         class_3757 var9 = var2.method_28260(var3);
         if (var9 instanceof class_3423) {
            var4.method_3152((class_3423)var9);
            var4.method_3209(class_6234.field_31891);
            class_134.method_474(var4, true);
         }

         return class_6910.field_35518;
      } else {
         return class_6910.field_35520;
      }
   }

   @Override
   public void method_10761(class_2522 var1, World var2, class_1331 var3, class_2522 var4, boolean var5) {
      if (!var1.method_8350(var4.method_8360())) {
         class_3757 var8 = var2.method_28260(var3);
         if (var8 instanceof class_6867) {
            class_1573.method_7104(var2, var3, (class_6867)var8);
            var2.method_29523(var3, this);
         }

         super.method_10761(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public void method_10797(class_2522 var1, class_6331 var2, class_1331 var3, Random var4) {
      class_3757 var7 = var2.method_28260(var3);
      if (var7 instanceof class_3423) {
         ((class_3423)var7).method_15821();
      }
   }

   @Nullable
   @Override
   public class_3757 method_3281(class_6163 var1) {
      return new class_3423();
   }

   @Override
   public class_7537 method_10788(class_2522 var1) {
      return class_7537.field_38469;
   }

   @Override
   public void method_29257(World var1, class_1331 var2, class_2522 var3, class_5834 var4, class_6098 var5) {
      if (var5.method_28018()) {
         class_3757 var8 = var1.method_28260(var2);
         if (var8 instanceof class_3423) {
            ((class_3423)var8).method_38432(var5.method_28008());
         }
      }
   }

   @Override
   public boolean method_10770(class_2522 var1) {
      return true;
   }

   @Override
   public int method_10795(class_2522 var1, World var2, class_1331 var3) {
      return class_4088.method_18863(var2.method_28260(var3));
   }

   @Override
   public class_2522 method_10785(class_2522 var1, class_6631 var2) {
      return var1.method_10308(field_38593, var2.method_30489(var1.<Direction>method_10313(field_38593)));
   }

   @Override
   public class_2522 method_10773(class_2522 var1, class_9022 var2) {
      return var1.method_8318(var2.method_41390(var1.<Direction>method_10313(field_38593)));
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_38593, field_38592);
   }

   @Override
   public class_2522 method_29302(class_353 var1) {
      return this.method_29260().method_10308(field_38593, var1.method_1782().method_1046());
   }
}
