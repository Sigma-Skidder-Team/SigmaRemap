package remapped;

import java.util.Random;

public class class_8170 extends class_2811 {
   private static String[] field_41837;

   public class_8170(class_6629<? extends class_8170> var1, class_6486 var2) {
      super(var1, var2);
   }

   public static boolean method_37471(class_6629<class_8170> var0, class_1556 var1, class_2417 var2, class_1331 var3, Random var4) {
      return method_5199(var0, var1, var2, var3, var4) && (var2 == class_2417.field_12024 || var1.method_25263(var3));
   }

   @Override
   public boolean method_12803() {
      return false;
   }

   @Override
   public class_8461 method_26918() {
      return class_463.field_2825;
   }

   @Override
   public class_8461 method_26541(class_6199 var1) {
      return class_463.field_2107;
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_2213;
   }

   @Override
   public class_8461 method_12805() {
      return class_463.field_2647;
   }

   @Override
   public boolean method_26442(class_8145 var1) {
      boolean var4 = super.method_26442(var1);
      if (var4 && this.method_26446().method_28022() && var1 instanceof class_5834) {
         float var5 = this.field_41768.method_43368(this.method_37075()).method_44283();
         ((class_5834)var1).method_26558(new class_2250(class_4054.field_19747, 140 * (int)var5));
      }

      return var4;
   }

   @Override
   public boolean method_12795() {
      return true;
   }

   @Override
   public void method_12798() {
      this.method_12791(class_6629.field_34297);
      if (!this.method_37378()) {
         this.field_41768.method_43365((class_704)null, 1041, this.method_37075(), 0);
      }
   }

   @Override
   public class_6098 method_12796() {
      return class_6098.field_31203;
   }
}
