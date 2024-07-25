package remapped;

import javax.annotation.Nullable;

public class class_141 extends class_5521 {
   private static String[] field_409;

   public class_141(class_6629<? extends class_141> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public class_8461 method_26918() {
      super.method_26918();
      return class_463.field_1969;
   }

   @Override
   public class_8461 method_19056() {
      super.method_19056();
      return class_463.field_2742;
   }

   @Override
   public class_8461 method_26599() {
      super.method_26599();
      return class_463.field_2108;
   }

   @Nullable
   @Override
   public class_8461 method_19083() {
      return class_463.field_2164;
   }

   @Override
   public class_8461 method_26541(class_6199 var1) {
      super.method_26541(var1);
      return class_463.field_2897;
   }

   @Override
   public boolean method_24873(class_5467 var1) {
      if (var1 != this) {
         return !(var1 instanceof class_141) && !(var1 instanceof class_3551) ? false : this.method_19058() && ((class_4109)var1).method_19058();
      } else {
         return false;
      }
   }

   @Override
   public class_1899 method_8638(class_6331 var1, class_1899 var2) {
      class_6629 var5 = !(var2 instanceof class_3551) ? class_6629.field_34248 : class_6629.field_34218;
      class_4109 var6 = (class_4109)var5.method_30484(var1);
      this.method_19055(var2, var6);
      return var6;
   }
}
