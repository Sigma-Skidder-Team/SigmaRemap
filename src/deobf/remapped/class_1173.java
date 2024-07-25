package remapped;

import java.util.Random;
import java.util.function.Predicate;

public abstract class class_1173 extends class_4612 implements class_1869 {
   public class_1173(class_6629<? extends class_1173> var1, class_6486 var2) {
      super(var1, var2);
      this.field_29915 = 5;
   }

   @Override
   public class_562 method_37197() {
      return class_562.field_3332;
   }

   @Override
   public void method_26606() {
      this.method_26489();
      this.method_5203();
      super.method_26606();
   }

   public void method_5203() {
      float var3 = this.method_37193();
      if (var3 > 0.5F) {
         this.field_29658 += 2;
      }
   }

   @Override
   public boolean method_26869() {
      return true;
   }

   @Override
   public class_8461 method_37239() {
      return class_463.field_1986;
   }

   @Override
   public class_8461 method_37133() {
      return class_463.field_2384;
   }

   @Override
   public boolean method_37181(class_6199 var1, float var2) {
      return !this.method_37180(var1) ? super.method_37181(var1, var2) : false;
   }

   @Override
   public class_8461 method_26541(class_6199 var1) {
      return class_463.field_2091;
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_2402;
   }

   @Override
   public class_8461 method_26587(int var1) {
      return var1 <= 4 ? class_463.field_2755 : class_463.field_1963;
   }

   @Override
   public float method_21376(class_1331 var1, class_4924 var2) {
      return 0.5F - var2.method_22566(var1);
   }

   public static boolean method_5200(class_1556 var0, class_1331 var1, Random var2) {
      if (var0.method_25266(class_2957.field_14437, var1) <= var2.nextInt(32)) {
         int var5 = !var0.method_7066().method_29570() ? var0.method_22573(var1) : var0.method_22571(var1, 10);
         return var5 <= var2.nextInt(8);
      } else {
         return false;
      }
   }

   public static boolean method_5199(class_6629<? extends class_1173> var0, class_1556 var1, class_2417 var2, class_1331 var3, Random var4) {
      return var1.method_43370() != class_423.field_1790 && method_5200(var1, var3, var4) && method_26908(var0, var1, var2, var3, var4);
   }

   public static boolean method_5198(class_6629<? extends class_1173> var0, class_9379 var1, class_2417 var2, class_1331 var3, Random var4) {
      return var1.method_43370() != class_423.field_1790 && method_26908(var0, var1, var2, var3, var4);
   }

   public static class_1313 method_5201() {
      return class_5886.method_26846().method_5983(class_7331.field_37462);
   }

   @Override
   public boolean method_26482() {
      return true;
   }

   @Override
   public boolean method_26534() {
      return true;
   }

   public boolean method_5202(class_704 var1) {
      return true;
   }

   @Override
   public class_6098 method_26475(class_6098 var1) {
      if (!(var1.method_27960() instanceof class_551)) {
         return class_6098.field_31203;
      } else {
         Predicate var4 = ((class_551)var1.method_27960()).method_2653();
         class_6098 var5 = class_551.method_2656(this, var4);
         return !var5.method_28022() ? var5 : new class_6098(class_4897.field_25024);
      }
   }
}
